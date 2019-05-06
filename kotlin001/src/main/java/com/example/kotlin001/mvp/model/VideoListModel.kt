package com.example.kotlin001.mvp.model

import com.example.kotlin001.net.RetrofitManager
import com.hazz.kotlinmvp.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 *Create by HanN on 2019/4/24
 *注释:
 */
class VideoListModel {

    /**
     * 获取第一层视频资源
     */
    fun getVideoTree(pageNum: String,pageSize: String,name: String): Observable<TestBean> {
        return RetrofitManager.service.getVideoTree(pageNum,pageSize,name)
                .compose(SchedulerUtils.ioToMain())
    }


}