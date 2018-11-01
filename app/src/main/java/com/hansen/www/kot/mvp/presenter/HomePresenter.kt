package com.hansen.www.kot.mvp.presenter

import com.hansen.www.kot.base.BasePresenter
import com.hansen.www.kot.mvp.contract.HomeContract
import kotlin.math.log

/**
 * 创建者 by ${HanSir} on 2018/11/1.
 * 版权所有  WELLTRANS.
 * 说明
 */
class HomePresenter : BasePresenter<HomeContract.View>(),HomeContract.Presenter{
    override fun requestHomeData(num: Int) {
    log(2.0,2.0)
    }

    override fun loadMoreData() {
        log(3.0,2.0)
    }
}