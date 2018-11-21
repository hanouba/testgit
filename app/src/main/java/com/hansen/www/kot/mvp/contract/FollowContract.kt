package com.hansen.www.kot.mvp.contract

import com.hansen.www.kot.base.IBaseView
import com.hansen.www.kot.base.IPresenter
import com.hansen.www.kot.mvp.moudle.bean.HomeBean

/**
 * 创建者 by ${HanSir} on 2018/11/1.
 * 版权所有  WELLTRANS.
 * 说明     FollowContract
 */
interface FollowContract {
    interface View : IBaseView {

        /**
         * 设置第一次请求的数据
         */
        fun setFollowInfo(iuuer: HomeBean.Issue)


        /**
         * 显示错误信息
         */
        fun showError(msg: String,errorCode:Int)


    }

    interface Presenter : IPresenter<View> {

        /**
         * 获取首页精选数据
         */
        fun requestFollowList()

        /**
         * 加载更多数据
         */
        fun loadMoreData()


    }
}