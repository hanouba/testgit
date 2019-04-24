package com.example.kotlin001.view

import android.support.v7.widget.RecyclerView
import android.util.SparseArray
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 *Create by HanN on 2019/4/15
 *注释:
 */
class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    //用于缓存已找的界面
    private var mViews : SparseArray<View>? = null
    init {
        mViews =SparseArray()
    }

    //T这个t类似java中的返回类型
    fun <T: View> getView(viewId: Int):T {
        var view: View? = mViews?.get(viewId)
        //使用缓存的方式减少findviewbyid的次数
        if (view == null) {
            view = itemView.findViewById(viewId)
            mViews?.put(viewId,view)
        }
        return view as T
    }

    fun <T: ViewGroup> getViewGroup(viewId: Int):T {
        var view: View? = mViews?.get(viewId)
        if (view == null) {
            view = itemView.findViewById(viewId)
            mViews?.put(viewId,view)
        }
        return view as T
    }

//    通用功能进行设置 设置文本 设备条目点击事件 设置图片
    fun setText(viewId: Int,text: CharSequence): ViewHolder {
        val view = getView<TextView>(viewId)
        view.text = "" + text
    //希望可有链式调用
        return this
    }

    fun setHintText(viewId: Int,text: CharSequence) : ViewHolder {
        val view = getView<TextView>(viewId)
        view.hint = "" + text
        return this
    }

    /**
     *设置本地图片
     */
    fun setImageResource(viewId: Int,resId: Int) : ViewHolder {
        val imageView = getView<ImageView>(viewId)
        imageView.setImageResource(resId)
        return this
    }


    abstract class HolderImageLoader(val path: String) {
        /**
         * 需要去复写这个加载方法
         *
         */
        abstract fun loadImage(iv:ImageView,path: String)
    }

    /**
     *
     * 加载图片资源路径
     *
     */
    fun setImagePath(viewId: Int,imageLoader: HolderImageLoader): ViewHolder {
        val iv = getView<ImageView>(viewId)
        imageLoader.loadImage(iv,imageLoader.path)
        return this
    }


    /**
     * 设置view 的 visibility
     */
    fun setViewVisibility(viewId: Int,visibility: Int): ViewHolder {
        getView<View>(viewId).visibility = visibility
        return  this
    }

    /**
     * 设置条目的点击事件
     */
    fun  setItemOnClickListener(listener: View.OnClickListener) {
        itemView.setOnClickListener(listener)
    }

    /**
     * 设置条目的长按事件
     *
     */
    fun setOnItemLongClickListener(listener: View.OnLongClickListener) {
        itemView.setOnLongClickListener(listener)

    }

}