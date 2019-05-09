package com.example.kotlin001.ui.fragment

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.blankj.utilcode.util.LogUtils
import com.blankj.utilcode.util.ToastUtils
import com.example.kotlin001.R
import com.example.kotlin001.base.BaseFragment
import com.example.kotlin001.mvp.contract.VideoListContract
import com.example.kotlin001.mvp.model.TestBean
import com.example.kotlin001.mvp.presenter.VideoListPresenter
import com.example.kotlin001.ui.adapter.VideoListAdapter
import kotlinx.android.synthetic.main.fragment_video_list.*

/**
 *Create by HanN on 2019/5/6
 *注释:
 */
class VideoListFragment : BaseFragment(),VideoListContract.View {



    private var mTitle: String? = ""


    val mVideolistPresnet by lazy {
        VideoListPresenter()
    }

    private var videoAdapter : VideoListAdapter? = null;


    companion object {
        fun  getInstance(title: String) : VideoListFragment {
            val fragment = VideoListFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title;
            return fragment
        }
    }

    override fun showLoading() {
        mLayoutStatusView?.showLoading()
    }

    override fun dismissLoading() {

    }

    override fun getLayoutId(): Int {
    return R.layout.fragment_video_list
    }

    override fun lazyLoad() {
        mVideolistPresnet.getFirstVideoList("1","20","")
    }

    override fun initView() {
        mVideolistPresnet.attachView(this)

        rcy_video_left.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false)


    }


    override fun setVideoList(videoListData: TestBean) {
        var rows = videoListData.rows?.rows
        LogUtils.d("Video2ListAdapter-",rows?.size)
        videoAdapter = VideoListAdapter(context!!,rows!!)
        rcy_video_left.adapter = videoAdapter
        videoAdapter!!.setOnKotlinItemClickListener(object : VideoListAdapter.IKotlinItemClickListener {
            override fun onItemClickListener(position: Int) {
                ToastUtils.showShort("被搭建")
            }

        })
    }


}