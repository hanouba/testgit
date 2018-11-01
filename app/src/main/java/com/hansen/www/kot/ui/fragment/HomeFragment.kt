package com.hansen.www.kot.ui.fragment

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager

import com.hansen.www.kot.base.BaseFragment
import com.hansen.www.kot.mvp.contract.HomeContract
import com.hansen.www.kot.mvp.moudle.bean.HomeBean
import com.hansen.www.kot.mvp.presenter.HomePresenter
import java.text.SimpleDateFormat
import java.util.*

/**
 * 创建者 by ${HanSir} on 2018/11/1.
 * 版权所有  WELLTRANS.
 * 说明
 */
class HomeFragment : BaseFragment(),HomeContract.View{

    private val mPresenter by lazy { HomePresenter() }

    private var mTitle: String? = null

    private var num: Int = 1

//    private var mHomeAdapter: HomeAdapter? = null

    private var loadingMore = false

    private var isRefresh = false
//    private var mMaterialHeader: MaterialHeader? = null


    companion object {
        fun getInstance(title: String): HomeFragment {
            val fragment = HomeFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }
    private val linearLayoutManager by lazy {
        LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
    }


    private val simpleDateFormat by lazy {
        SimpleDateFormat("- MMM. dd, 'Brunch' -", Locale.ENGLISH)
    }

    override fun getLayoutId(): Int = R.layout.fragment_home
    override fun showLoading() {

    }

    override fun dismissLoading() {

    }

    override fun setHomeData(homeBean: HomeBean) {

    }

    override fun setMoreData(itemList: ArrayList<HomeBean.Issue.Item>) {

    }

    override fun showError(msg: String, errorCode: Int) {

    }

    override fun initView() {

    }

    override fun lazyLoad() {

    }


}