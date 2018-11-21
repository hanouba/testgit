package com.hansen.www.kot.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import com.hansen.www.kot.R

import com.hansen.www.kot.base.BaseFragment
import com.hansen.www.kot.mvp.contract.CategoryDetailContract
import com.hansen.www.kot.mvp.contract.HomeContract
import com.hansen.www.kot.mvp.moudle.bean.HomeBean
import com.hansen.www.kot.mvp.presenter.HomePresenter
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

/**
 * 创建者 by ${HanSir} on 2018/11/1.
 * 版权所有  WELLTRANS.
 * 说明
 */
class CatagerFragment : BaseFragment(),CategoryDetailContract.View{
    override fun showLoading() {
    }

    override fun dismissLoading() {
    }

    override fun setCateDetailList(itemList: ArrayList<HomeBean.Issue.Item>) {
    }

    override fun showError(errorMsg: String) {

    }

    private val mTabList = ArrayList<String>()
    private val mFragments = ArrayList<Fragment>()


    private var mTitle: String? = null





    companion object {
        fun getInstance(title: String): CatagerFragment {
            val fragment = CatagerFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }


    override fun getLayoutId(): Int = R.layout.fragment_catager



    override fun initView() {

        
    }

    override fun lazyLoad() {

    }


}