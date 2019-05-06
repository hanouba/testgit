package com.example.kotlin001.mvp.presenter

import com.blankj.utilcode.util.LogUtils
import com.example.kotlin001.api.UrlConstant
import com.example.kotlin001.base.BasePresenter
import com.example.kotlin001.mvp.contract.HomeContract
import com.example.kotlin001.mvp.contract.LoginContract
import com.example.kotlin001.mvp.model.HomeBean
import com.example.kotlin001.mvp.model.HomeModel
import com.example.kotlin001.mvp.model.LoginModel
import com.example.kotlin001.net.ExceptionHandle
import io.reactivex.functions.Function
import io.reactivex.internal.util.ExceptionHelper
import kotlin.math.log

/**
 * Create by HanN on 2019/4/15
 * 注释:
 */
class LoginPresenter : BasePresenter<LoginContract.View>(), LoginContract.Presenter {

    private val loginModel: LoginModel by lazy {
        LoginModel()
    }

    override fun login(name: String, pwd: String,mac: String) {
        checkViewAttached()
        mRootView?.showLoading()
        val disposable = loginModel.login(name,pwd,mac)

                .subscribe({ loginbean->
                    mRootView?.apply {
                        dismissLoading()
                        LogUtils.e("请求成功"+loginbean.toString())
                        if (loginbean.code == 0) {
                            val authToken = loginbean.rows.token.tokenType + " " + loginbean.rows.token.accessToken
                        UrlConstant.TOKEN = authToken;
                        UrlConstant.USER_ID = loginbean.rows.userId
                            mRootView?.toMainActivity()
                        }
                    }
                }, {t ->
                    mRootView?.apply {
                        dismissLoading()
                        LogUtils.e("请求错误")
                    }
                })
        addDisposable(disposable)
    }


}
