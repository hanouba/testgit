package com.example.kotlin001.api

import com.example.kotlin001.mvp.model.HomeBean
import com.example.kotlin001.mvp.model.LoginBean
import com.example.kotlin001.mvp.model.TestBean
import com.example.kotlin001.mvp.model.VideListBean
import io.reactivex.Observable
import retrofit2.http.*

/**
 *Create by HanN on 2019/4/24
 *注释:
 */
interface ApiService {
    /**
     * 首页数据
     */
    @GET("v2/feed?")
    fun getFistHomeData(@Query("num") num: Int) : Observable<HomeBean>

    /**
     * 根据nextPageUrl 请求下一页数据
     */
    @GET
    fun getMoreHomeData(@Url url: String) : Observable<HomeBean>

    /**
     * 根据item id获取相关视频
     */
    @GET("v4/video/related?")
    fun getRelatedData(@Query("id") id: Long): Observable<HomeBean.Issue>
    /*登录*/
    @POST("user/login?")
    fun login(@Query("username")name: String,@Query("password")pwd: String,@Query("mac")mac: String):Observable<LoginBean>
    /*获取资源树*/
    @POST("resource/listPage?")
    fun getVideoTree(@Query("pageNumber")pageNumber: String,@Query("pageSize")pageSize: String,@Query("")name: String):Observable<TestBean>
}