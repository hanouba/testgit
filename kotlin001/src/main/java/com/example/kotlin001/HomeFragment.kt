package com.example.kotlin001

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.kotlin001.base.BaseFragment
import com.example.kotlin001.mvp.contract.HomeContract
import java.text.SimpleDateFormat
import java.util.*

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

//不明白啥意思
private val linerlayoutManager by lazy {
    LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false)
}
    // 定义日期格式吧
    private val simpleDateFormat by lazy {
        SimpleDateFormat("- MMM. dd, 'Brunch' -", Locale.ENGLISH)
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