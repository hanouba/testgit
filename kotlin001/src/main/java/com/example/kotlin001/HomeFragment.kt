package com.example.kotlin001

import android.os.Bundle
import com.example.kotlin001.base.BaseFragment
import com.example.kotlin001.mvp.contract.HomeContract

/**
 *Create by HanN on 2019/4/2
 *注释:
 */
class HomeFragment : BaseFragment(),HomeContract.View{
    private var mTitle: String? = ""
    //
    companion object {
        fun  getInstance(title: String) : HomeFragment {
            val fragment = HomeFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title;
            return fragment
        }
    }


    override fun setHomeData() {

    }

    override fun setMoreData(itemList: ArrayList<String>) {

    }

    override fun showError(msg: String, errorCode: Int) {

    }

    override fun showLoading() {

    }

    override fun dismissLoading() {

    }

    override fun getLayoutId(): Int {
       return  R.layout.fragment_home
    }

    override fun lazyLoad() {

    }

    override fun initView() {

    }
}