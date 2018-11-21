package com.hansen.www.kot.ui.fragment

import android.os.Bundle
import com.hansen.www.kot.R
import com.hansen.www.kot.base.BaseFragment
import com.hansen.www.kot.mvp.contract.FollowContract
import com.hansen.www.kot.mvp.moudle.bean.HomeBean
import com.hansen.www.kot.mvp.presenter.FollowPresenter
import com.hansen.www.kot.net.exception.ErrorStatus
import com.hansen.www.kot.showToast
import kotlinx.android.synthetic.main.layout_recyclerview.*
import kotlin.reflect.KProperty

/**
 * 创建者 by ${HanSir} on 2018/11/20.
 * 版权所有  WELLTRANS.
 * 说明
 */
class FollowFragment:BaseFragment(),FollowContract.View {
    private var mTitle: String? = null
    private var itemList = ArrayList<HomeBean.Issue.Item>()
    private val mPresenter by lazy { FollowPresenter() }
    private var loaddingMore = false

    init {
        mPresenter.attachView(this)
    }
    companion object {
        fun getInstance(title: String): FollowFragment {
            val fragment = FollowFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }
    override fun dismissLoading() {
        multipleStatusView.showContent()
    }

    override fun setFollowInfo(iuuer: HomeBean.Issue) {
        loaddingMore = false
        itemList = iuuer.itemList
    }

    override fun showError(msg: String, errorCode: Int) {
        showToast(msg)
        if (errorCode == ErrorStatus.NETWORK_ERROR) {
            multipleStatusView.showNoNetwork()
        }else{
            multipleStatusView.showError()
        }
    }

    override fun showLoading() {
        multipleStatusView.showLoading()
    }

    override fun initView() {

    }

    override fun getLayoutId(): Int = R.layout.layout_recyclerview

    override fun lazyLoad() {
        mPresenter.requestFollowList()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}


