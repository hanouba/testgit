package com.example.kotlin001.mvp.presenter

import com.blankj.utilcode.util.LogUtils
import com.example.kotlin001.api.UrlConstant
import com.example.kotlin001.base.BasePresenter
import com.example.kotlin001.mvp.contract.HomeContract
import com.example.kotlin001.mvp.contract.LoginContract
import com.example.kotlin001.mvp.contract.VideoListContract
import com.example.kotlin001.mvp.model.HomeBean
import com.example.kotlin001.mvp.model.HomeModel
import com.example.kotlin001.mvp.model.LoginModel
import com.example.kotlin001.mvp.model.VideoListModel
import com.example.kotlin001.net.ExceptionHandle
import io.reactivex.functions.Function
import io.reactivex.internal.util.ExceptionHelper
import kotlin.math.log

/**
 * Create by HanN on 2019/4/15
 * 注释:
 */
class VideoListPresenter : BasePresenter<VideoListContract.View>(), VideoListContract.Presenter {

    private val videoListModel: VideoListModel by lazy {
        VideoListModel()
    }

    override fun getFirstVideoList(pageNum: String, pageSize: String, name: String) {
        checkViewAttached()
        mRootView?.showLoading()
        val disposable = videoListModel.getVideoTree(pageNum,pageSize,name)
                .subscribe({ videoList->
                    mRootView?.apply {
                        dismissLoading()
                        if (videoList.code == 0) {
                            setVideoList(videoList)
                        }
                        LogUtils.e("请求成功"+videoList.toString())

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
