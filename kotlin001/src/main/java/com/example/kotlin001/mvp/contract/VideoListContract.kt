package com.example.kotlin001.mvp.contract

import com.example.kotlin001.base.IBasePresenter
import com.example.kotlin001.base.IBaseView
import com.example.kotlin001.mvp.model.HomeBean
import com.example.kotlin001.mvp.model.TestBean
import com.example.kotlin001.mvp.model.VideListBean

/**
 *Create by HanN on 2019/4/8
 *注释:视频资源
 */
interface VideoListContract {
    interface View : IBaseView {
        fun setVideoList(videoListData: TestBean)
    }

    interface Presenter : IBasePresenter<View> {

        /**
         *
         */
        fun getFirstVideoList(pageNum: String,pageSize: String,name: String)


    }
}