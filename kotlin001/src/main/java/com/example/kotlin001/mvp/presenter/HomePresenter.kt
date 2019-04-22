package com.example.kotlin001.mvp.presenter

import com.example.kotlin001.base.BasePresenter
import com.example.kotlin001.mvp.contract.HomeContract

/**
 * Create by HanN on 2019/4/15
 * 注释:
 */
class HomePresenter:BasePresenter<HomeContract.View>(),HomeContract.Presenter{
    override fun requestHomeData(num: Int) {

    }

    override fun loadMoreData() {

    }

}
