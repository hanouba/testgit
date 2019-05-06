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
class VideoListAdapter(context: Context, var data: List<TestBean.RowsBeanX.RowsBean>): Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val infalte  = from(parent.context).inflate(R.layout.item_video_list,null)
        return VideoHolder(infalte)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(viewHolder:  RecyclerView.ViewHolder, posttion: Int) {
        if (viewHolder is VideoHolder) {
            viewHolder.bind(data[posttion].name)
        }
    }



    class VideoHolder(itemView: View):  RecyclerView.ViewHolder(itemView) {
        fun bind(data:String? ) {
            itemView.tv_video_name.text = data
        }
    }

}