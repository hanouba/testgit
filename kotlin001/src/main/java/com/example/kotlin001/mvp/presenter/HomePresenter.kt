package com.example.kotlin001.mvp.presenter

import com.example.kotlin001.base.BasePresenter
import com.example.kotlin001.mvp.contract.HomeContract
import com.example.kotlin001.mvp.model.HomeBean
import com.example.kotlin001.mvp.model.HomeModel
import com.example.kotlin001.net.ExceptionHandle
import io.reactivex.internal.util.ExceptionHelper

/**
 * Create by HanN on 2019/4/15
 * 注释:
 */
class HomePresenter : BasePresenter<HomeContract.View>(), HomeContract.Presenter {


    //声明数据类型 首页 banner
    private var bannerHomeBean: HomeBean? = null
    //声明下一页的url
    private var nextPageUrl: String? = null
    //网络请求 声明网络请求对象
    private val homeModel: HomeModel by lazy {
        HomeModel()
    }


    override fun requestHomeData(num: Int) {
        //先检查是否绑定view
        checkViewAttached()
        mRootView?.showLoading()
        val disposable = homeModel.requestHomeData(num)
                .flatMap({ homeBean ->
                    //过滤banner2 中的数据
                    //得到bannerItemList
                    val bannerItemList = homeBean.issueList[0].itemList

                    //判断list 根据type类型 条件过滤数据
                    bannerItemList.filter { item ->
                        item.type == "banner2" || item.type == "horizontalScrollCard"
                    }.forEach { item ->
                        bannerItemList.remove(item)
                    }
                    //第一页的数据 就是banner数据
                    bannerHomeBean = homeBean

                    //请求下页数据
                    homeModel.loadMoreData(homeBean.nextPageUrl)
                })
                .subscribe({ homeBean ->
                    mRootView?.apply {
                        dismissLoading()
                        nextPageUrl = homeBean.nextPageUrl
                        //过滤
                        val newBannerItemList = homeBean.issueList[0].itemList

                        newBannerItemList.filter { item ->
                            item.type == "banner2" || item.type == "horizontalScrollCard"
                        }.forEach { item ->
                            //移除 item
                            newBannerItemList.remove(item)

                        }

                        bannerHomeBean!!.issueList[0].count = bannerHomeBean!!.issueList[0].itemList.size
                        bannerHomeBean?.issueList!![0].itemList.addAll(newBannerItemList)
                        setHomeData(bannerHomeBean!!)
                    }
                }, { t ->
                    mRootView?.apply {
                        dismissLoading()
                        showError(ExceptionHandle.handleException(t), ExceptionHandle.errorCode)

                    }
                })
        addDisposable(disposable)


    }

    override fun loadMoreData() {

    }

}
