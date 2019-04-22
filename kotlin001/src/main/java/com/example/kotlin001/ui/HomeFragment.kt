package com.example.kotlin001.ui

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.kotlin001.R
import com.example.kotlin001.base.BaseFragment
import com.example.kotlin001.mvp.contract.HomeContract
import com.example.kotlin001.mvp.presenter.HomePresenter
import com.scwang.smartrefresh.header.MaterialHeader
import kotlinx.android.synthetic.main.fragment_home.*
import java.text.SimpleDateFormat
import java.util.*

/**
 *Create by HanN on 2019/4/2
 *注释:
 */
class HomeFragment : BaseFragment(),HomeContract.View{
    private var mTitle: String? = ""

    /*加载homepresenter*/   //只有get方法 没有set方法
    private val mHomePresenter by lazy { HomePresenter() }
    /*是否刷新*/
    private var isRefresh = false
    /*请求界面页码*/
    private var num : Int= 1
    /*声明 加载头部对象*/
    private var mMaterialHeader : MaterialHeader? = null


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
       return R.layout.fragment_home
    }

    override fun lazyLoad() {

    }

    override fun initView() {
        mHomePresenter.attachView(this)

        mRefreshLayout.setEnableHeaderTranslationContent(true)
        mRefreshLayout.setOnRefreshListener {
             isRefresh  = true
            mHomePresenter.requestHomeData(num)
        }

        /*初始化赋值 */
        mMaterialHeader = mRefreshLayout.refreshHeader as MaterialHeader?
        /*拉开下拉刷新区域=块*/
        mMaterialHeader?.setShowBezierWave(true)

        mRefreshLayout.setPrimaryColorsId(R.color.color_light_black, R.color.color_title_bg)

       /*刷新监听 OnScrollListener*/
        mRecyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

            }

            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
            }
        })

    }
}