package com.example.kotlin001.mvp.contract

import com.example.kotlin001.base.IBasePresenter
import com.example.kotlin001.base.IBaseView
import com.example.kotlin001.mvp.model.HomeBean

/**
 *Create by HanN on 2019/4/8
 *注释:
 */
interface HomeContract {
    interface View : IBaseView {
        //第一次请求数据
        fun setHomeData(homeBean: HomeBean)
        //刷新
        fun setMoreData(itemList:ArrayList<HomeBean.Issue.Item>)
        //显示错误信息
        fun  showError(msg: String , errorCode: Int)
    }

    interface Presenter : IBasePresenter<View> {

        /**
         * 获取首页精选数据
         */
        fun requestHomeData(num: Int)

        /**
         * 加载更多数据
         */
        fun loadMoreData()


    }
}