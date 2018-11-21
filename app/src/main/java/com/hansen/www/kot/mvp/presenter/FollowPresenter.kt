package com.hansen.www.kot.mvp.presenter

import com.hansen.www.kot.base.BasePresenter
import com.hansen.www.kot.mvp.contract.FollowContract
import com.hansen.www.kot.mvp.contract.HomeContract
import com.hansen.www.kot.mvp.moudle.HomeModel
import com.hansen.www.kot.mvp.moudle.bean.FollowModel
import com.hansen.www.kot.mvp.moudle.bean.HomeBean
import com.hansen.www.kot.net.exception.ExceptionHandle
import io.reactivex.internal.util.ExceptionHelper
import kotlin.math.log

/**
 * 创建者 by ${HanSir} on 2018/11/1.
 * 版权所有  WELLTRANS.
 * 说明
 */
class FollowPresenter : BasePresenter<FollowContract.View>(),FollowContract.Presenter{


    private val followModel by lazy { FollowModel() }
    private var nextPageUrl:String?=null     //加载首页的Banner 数据+一页数据合并后，nextPageUrl没 add

    override fun requestFollowList() {
        checkViewAttached()
        mRootView?.showLoading()
        val disposable = followModel.requestFollowList()
                .subscribe({issue -> mRootView?.apply {
                    dismissLoading()
                    nextPageUrl = issue.nextPageUrl
                    setFollowInfo(issue)
                }
                },{throwable ->
                    mRootView?.apply {
                        showError(ExceptionHandle.handleException(throwable),ExceptionHandle.errorCode)
                    }
                })
    }

    override fun loadMoreData() {
        val disposable = nextPageUrl?.let {
            followModel.loadMoreData(it)
                    .subscribe({issue ->
                        mRootView?.apply {
                            nextPageUrl = issue.nextPageUrl
                            setFollowInfo(issue)
                        }
                    },{t ->
                        mRootView?.apply {
                            showError(ExceptionHandle.handleException(t),ExceptionHandle.errorCode)
                        }
                    })
        }
        if (disposable != null) {
            addSubscription(disposable)
        }
    }


}