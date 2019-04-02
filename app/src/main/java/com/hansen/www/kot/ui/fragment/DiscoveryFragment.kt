package com.hansen.www.kot.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment

import com.hansen.www.kot.R

import com.hansen.www.kot.base.BaseFragment

import com.hansen.www.kot.ui.adapter.BaseFragmentAdapter
import com.hansen.www.kot.view.TabLayoutHelper

import kotlinx.android.synthetic.main.fragment_discover.*

import kotlin.collections.ArrayList

/**
 * 创建者 by ${HanSir} on 2018/11/1.
 * 版权所有  WELLTRANS.
 * 说明
 */
class DiscoveryFragment : BaseFragment(){
    private val mTabList = ArrayList<String>()
    private val mFragments = ArrayList<Fragment>()


    private var mTitle: String? = null





    companion object {
        fun getInstance(title: String): DiscoveryFragment {
            val fragment = DiscoveryFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }


    override fun getLayoutId(): Int = R.layout.fragment_discover



    override fun initView() {
        tv_header_title.setText(mTitle)
        //设置tab名称
        mTabList.add("关注")
        mTabList.add("分类")
        mFragments.add(FollowFragment.getInstance("关注"))
        mFragments.add(CatagerFragment.getInstance("分类"))
        mViewPager.adapter = BaseFragmentAdapter(childFragmentManager,mFragments,mTabList)
        myTablayout.setupWithViewPager(mViewPager)
        TabLayoutHelper.setUpIndicatorWidth(myTablayout)
    }

    override fun lazyLoad() {

    }


}