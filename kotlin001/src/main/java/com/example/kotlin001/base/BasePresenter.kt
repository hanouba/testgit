package com.example.kotlin001.base

import android.support.v4.app.NavUtils
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import java.lang.RuntimeException

/**
 * Create by HanN on 2019/4/15
 * 注释:
 */
class BasePresenter<T : IBaseView> : IBasePresenter<T> {

    var mRootView: T? = null
        private set       //怎么理解啊

    private var compositDisposable = CompositeDisposable()


    override fun attachView(mRootView: T) {
        this.mRootView = mRootView
    }

    override fun detachView() {
        mRootView = null

        //保证 activity销毁时取消所有的订阅
        if (compositDisposable.isDisposed) {
            compositDisposable.clear()
        }
    }

//
    /*判断界面是否加载*/
    private val isViewAttached : Boolean
        get() = mRootView != null


    /*检查界面是否加载*/

    fun checkViewAttached() {
        if (!isViewAttached) throw  MvpViewNotAttacheException()
    }

    /*添加订阅*/

    fun addDisposable(disposable: Disposable) {
        compositDisposable.add(disposable)
    }
    /**
     * 抛个异常
     */
    private class MvpViewNotAttacheException internal constructor() : RuntimeException("Please call IPresenter.attachView(IBaseView) before\" + \" requesting data to the IPresenter")
}
