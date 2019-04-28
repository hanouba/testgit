package com.example.kotlin001.api

import com.example.kotlin001.mvp.model.HomeBean
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

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

}