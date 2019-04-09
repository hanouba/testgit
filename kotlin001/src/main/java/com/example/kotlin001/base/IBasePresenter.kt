package com.example.kotlin001.base

/**
 *Create by HanN on 2019/4/8
 *注释: 为什么要把ibaseView放进去
 */
interface IBasePresenter<in V:IBaseView> {
    fun attachView(mRootView: V)
    fun detachView()
}