package com.example.kotlin001.ui.adapter

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater.from
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.blankj.utilcode.util.LogUtils
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.example.kotlin001.R
import com.example.kotlin001.mvp.model.HomeBean
import com.example.kotlin001.mvp.model.TestBean
import com.example.kotlin001.mvp.model.VideListBean
import com.example.kotlin001.view.CommonAdapter

import com.example.kotlin001.view.ViewHolder
import kotlinx.android.synthetic.main.item_video_list.view.*
import retrofit2.http.POST
import java.util.ArrayList

/**
 *Create by HanN on 2019/5/6
 *注释:
 */
class Video2ListAdapter(context: Context, var data: ArrayList<TestBean.RowsBeanX.RowsBean>,layout: Int): CommonAdapter<TestBean.RowsBeanX.RowsBean>(context,data,layout) {
    override fun bindData(holder: ViewHolder, data: TestBean.RowsBeanX.RowsBean, position: Int) {

        holder.setText(R.id.tv_video_name, data.name!!)
    }

    override fun getItemCount(): Int {
        LogUtils.d("Video2ListAdapter",data.size)
        return data.size
    }

}