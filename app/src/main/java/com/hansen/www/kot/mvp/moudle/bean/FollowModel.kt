package com.hansen.www.kot.mvp.moudle.bean

import com.hansen.www.kot.net.RetrofitManager
import com.hansen.www.kot.rx.SchedulerUtils
import io.reactivex.Observable

/**
 * 创建者 by ${HanSir} on 2018/11/21.
 * 版权所有  WELLTRANS.
 * 说明
 */
class FollowModel {
    /**
     * 获取关注信息
     */
    fun requestFollowList(): Observable<HomeBean.Issue> {

        return RetrofitManager.service.getFollowInfo()
                .compose(SchedulerUtils.ioToMain())
    }

    /**
     * 加载更多
     */
    fun loadMoreData(url:String):Observable<HomeBean.Issue>{
        return RetrofitManager.service.getIssueData(url)
                .compose(SchedulerUtils.ioToMain())
    }

}