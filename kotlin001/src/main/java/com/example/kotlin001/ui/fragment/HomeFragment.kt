package com.example.kotlin001.ui.fragment

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.blankj.utilcode.util.ToastUtils
import com.example.kotlin001.R
import com.example.kotlin001.base.BaseFragment
import com.example.kotlin001.mvp.contract.HomeContract
import com.example.kotlin001.mvp.model.HomeBean
import com.example.kotlin001.mvp.presenter.HomePresenter
import com.example.kotlin001.net.ErrorStatus
import com.example.kotlin001.ui.activity.SearchActivity
import com.example.kotlin001.ui.adapter.HomeAdapter
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

    private var mHomeAdapter : HomeAdapter? = null
    private var  loadingMore = false



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


    /**
     * 设置首页数据
     */
    override fun setHomeData(homeBean: HomeBean) {
            mLayoutStatusView?.showContent()
        Log.d("homeBean",""+homeBean)

        mHomeAdapter = activity?.let { HomeAdapter(it,homeBean.issueList[0].itemList) }
        //设置banner大小
        mHomeAdapter?.setBannerSize(homeBean.issueList[0].count)
        mRecyclerView.adapter = mHomeAdapter
        mRecyclerView.layoutManager = linerlayoutManager
        mRecyclerView.itemAnimator = DefaultItemAnimator()
    }

    override fun setMoreData(itemList: ArrayList<HomeBean.Issue.Item>) {
        loadingMore = false
        mHomeAdapter?.addItemData(itemList)
    }

    override fun showError(msg: String, errorCode: Int) {
        ToastUtils.showShort(msg)
        if (errorCode == ErrorStatus.NETWORK_ERROR) {
            mLayoutStatusView?.showNoNetwork()
        }else {
            mLayoutStatusView?.showError()
        }
    }

    override fun showLoading() {
        if (!isRefresh) {
            isRefresh = false
            mLayoutStatusView?.showLoading()
        }
    }

    override fun dismissLoading() {
        mRefreshLayout.finishRefresh()
    }

    override fun getLayoutId(): Int {
       return R.layout.fragment_home
    }

    override fun lazyLoad() {
        mHomePresenter.requestHomeData(num)
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
                val currentVisibilityItemPosition = linerlayoutManager.findFirstVisibleItemPosition()
                if (currentVisibilityItemPosition == 0) {
                    //设置背景透明
                    toolbar.setBackgroundColor(resources.getColor(R.color.color_translucent))
                    iv_search.setImageResource(R.mipmap.ic_action_search_white)
                    tv_header_title.text = ""
                } else {
                    if (mHomeAdapter?.mData!!.size > 1) {
                        toolbar.setBackgroundColor(resources.getColor(R.color.color_title_bg))
                        iv_search.setImageResource(R.mipmap.ic_action_search_black)
                        val itemList = mHomeAdapter!!.mData
                        val item = itemList[currentVisibilityItemPosition + mHomeAdapter!!.bannerItemSize - 1]
                        if (item.type == "textHeader") {
                            tv_header_title.text = item.data?.text
                        }else {
                            tv_header_title.text = simpleDateFormat.format(item.data?.date)
                        }
                    }
                }
            }

            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    val childCount = mRecyclerView.childCount
                    val itemCount = mRecyclerView.layoutManager?.itemCount
                    val firstVisibleItem = (mRecyclerView.layoutManager as LinearLayoutManager).findFirstVisibleItemPosition()
                    if (firstVisibleItem + childCount == itemCount) {
                        if (!loadingMore) {
                            loadingMore = true
                            mHomePresenter.loadMoreData()
                        }
                    }
                }
            }
        })

        iv_search.setOnClickListener{ openSearchActivity() }

    }

    private fun openSearchActivity() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val options = activity?.let { ActivityOptionsCompat.makeSceneTransitionAnimation(it,iv_search,iv_search.transitionName) }
            startActivity(Intent(activity, SearchActivity::class.java),options?.toBundle())
        }else{
            startActivity(Intent(activity,SearchActivity::class.java))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mHomePresenter.detachView()
    }
}