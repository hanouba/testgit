package com.example.kotlin001.mvp.model

import com.example.kotlin001.net.RetrofitManager
import com.hazz.kotlinmvp.rx.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 *Create by HanN on 2019/4/24
 *注释:
 */
class LoginModel {

    /**
     * 获取首页数据
     */
    fun login(name: String,pwd: String,mac: String): Observable<LoginBean> {
        return RetrofitManager.service.login(name,pwd,mac)
                .compose(SchedulerUtils.ioToMain())
    }


}