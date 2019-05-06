package com.example.kotlin001.mvp.contract

import com.example.kotlin001.base.IBasePresenter
import com.example.kotlin001.base.IBaseView
import com.example.kotlin001.mvp.model.HomeBean

/**
 *Create by HanN on 2019/4/8
 *注释:登录
 */
interface LoginContract {
    interface View : IBaseView {
        fun toMainActivity();
    }

    interface Presenter : IBasePresenter<View> {

        /**
         *
         */
        fun login(name: String,pwd: String,mac: String)


    }
}