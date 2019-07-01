package com.example.kotlin001.ui.fragment

import com.blankj.utilcode.util.ToastUtils
import com.example.kotlin001.R
import com.example.kotlin001.api.UrlConstant
import com.example.kotlin001.base.BaseFragment
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.fragment_next_videolist.*
import kotlinx.android.synthetic.main.fragment_next_videolist.view.*

/**
 *Create by HanN on 2019/5/9
 *注释:
 */
class NextVideoListFragment : BaseFragment() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_next_videolist
    }

    override fun lazyLoad() {
    }

    override fun initView() {

        var video_id = arguments?.getString(UrlConstant.VIDEO_RESID)
        bt_id.text = video_id
    }
}