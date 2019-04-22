package com.example.kotlin001.view

import android.support.v7.widget.RecyclerView
import android.util.SparseArray
import android.view.View
import android.view.ViewGroup
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

    fun setText(viewId: Int,text: CharSequence): ViewHolder {
        val view = getView<TextView>(viewId)

        return
    }


}