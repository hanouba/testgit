package com.example.kotlin001.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater.from
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.blankj.utilcode.util.LogUtils
import com.example.kotlin001.R
import com.example.kotlin001.mvp.model.TestBean


/**
 *Create by HanN on 2019/5/6
 *注释:
 */
class VideoListAdapter(context: Context, var data: List<TestBean.RowsBeanX.RowsBean>): Adapter<RecyclerView.ViewHolder>() {

    private var itemClickListener: IKotlinItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val infalte  = from(parent.context).inflate(com.example.kotlin001.R.layout.item_video_list,null)
        return VideoHolder(infalte)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(viewHolder:  RecyclerView.ViewHolder, posttion: Int) {
        if (viewHolder is VideoHolder) {
            viewHolder.tv.text = data[posttion].name

            viewHolder.tv.setOnClickListener {
                LogUtils.d("被点击了")
                itemClickListener!!.onItemClickListener(posttion)
             }
        }
    }



   inner class VideoHolder(itemView: View):  RecyclerView.ViewHolder(itemView) {
       var tv: TextView = itemView.findViewById(R.id.tv_video_name)
    }

    // 提供set方法
    fun setOnKotlinItemClickListener(itemClickListener: IKotlinItemClickListener) {
        this.itemClickListener = itemClickListener
    }

    //自定义接口
    interface IKotlinItemClickListener {
        fun onItemClickListener(position: Int)
    }


}