package com.example.kotlin001.mvp.contract

import com.example.kotlin001.base.IBaseView

/**
 *Create by HanN on 2019/4/8
 *注释:
 */
interface HomeContract {
    interface View : IBaseView {
        //第一次请求数据
        fun setHomeData()
        //刷新
        fun setMoreData(itemList:ArrayList<String>)
        //显示错误信息
        fun  showError(msg: String , errorCode: Int)
    }
}