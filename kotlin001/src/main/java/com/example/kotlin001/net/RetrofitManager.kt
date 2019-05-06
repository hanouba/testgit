package com.example.kotlin001.net

import com.example.kotlin001.App
import com.example.kotlin001.api.ApiService
import com.example.kotlin001.api.UrlConstant
import com.example.kotlin001.utils.NetworkUtil
import com.example.kotlin001.utils.Preference
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

/**
 *Create by HanN on 2019/4/24
 *注释:  单例模式就用object
 */
object RetrofitManager {
    val service: ApiService by lazy (LazyThreadSafetyMode.SYNCHRONIZED){
        getRetrofit().create(ApiService::class.java)
    }

    private var token:String by Preference("token",UrlConstant.TOKEN)

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(UrlConstant.BASE_URL)
                .client(getOkHttpClient())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }


    private fun getOkHttpClient(): OkHttpClient {
        //log拦截器 打印所有的log
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        //设置请求过滤的水平 body,basic.headers
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        //设置请求缓存的大小位置
        val cacheFile = File(App.context.cacheDir,"cache")
        val cache = Cache(cacheFile,1024 * 1024 * 50 )//缓存大小50m

        return OkHttpClient.Builder()
//                .addInterceptor(addQueryParameterInterceptor())
                .addInterceptor(addHeaderInterceptor()) //token过滤
              .addInterceptor(addCacheInterceptor())
                .addInterceptor(httpLoggingInterceptor)
                .cache(cache)
                .connectTimeout(10L,TimeUnit.SECONDS)
                .readTimeout(10L,TimeUnit.SECONDS)
                .writeTimeout(10L,TimeUnit.SECONDS)
                .build()


    }

    /**
     * 设置公共参数
     */
    private fun addQueryParameterInterceptor(): Interceptor {
        return Interceptor {chain ->
            val originalRequest = chain.request()
            val request: Request
            val modifieUrl = originalRequest.url().newBuilder()
                    .addQueryParameter("udid","d2807c895f0348a180148c9dfa6f2feeac0781b5")
                    .addQueryParameter("deviceModel", "android")
                    .build()
            request = originalRequest.newBuilder().url(modifieUrl).build()
            chain.proceed(request)
        }
    }

    /**
     * *
     * 设置头
     */
    private fun  addHeaderInterceptor(): Interceptor {
        return  Interceptor { chain ->
            val originalRequest = chain.request()
            val requestBuilder = originalRequest.newBuilder()
                    .header("Authorization",UrlConstant.TOKEN)
                    .method(originalRequest.method(),originalRequest.body())
            val request = requestBuilder.build()
            chain.proceed(request)
        }
    }


    /**
     * 设置缓存
     */
    private fun addCacheInterceptor(): Interceptor {
        return Interceptor { chain ->
            var request = chain.request()
            if (!NetworkUtil.isNetworkAvailable(App.context)) {
                request = request.newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)
                        .build()
            }
            val response = chain.proceed(request)
            if (NetworkUtil.isNetworkAvailable(App.context)) {
                val maxAge = 0
                // 有网络时 设置缓存超时时间0个小时 ,意思就是不读取缓存数据,只对get有用,post没有缓冲
                response.newBuilder()
                        .header("Cache-Control", "public, max-age=" + maxAge)
                        .removeHeader("Retrofit")// 清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
                        .build()
            } else {
                // 无网络时，设置超时为4周  只对get有用,post没有缓冲
                val maxStale = 60 * 60 * 24 * 28
                response.newBuilder()
                        .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                        .removeHeader("nyn")
                        .build()
            }
            response
        }
    }
}


