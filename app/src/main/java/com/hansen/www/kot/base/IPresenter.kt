package com.hansen.www.kot.base

/**
 * 创建者 by ${HanSir} on 2018/11/1.
 * 版权所有  WELLTRANS.
 * 说明
 */
interface IPresenter<in V:IBaseView> {
    fun attachView(mRootView: V)

    fun detachView()
}