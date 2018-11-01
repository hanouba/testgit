package com.hansen.www.kot.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewParent

/**
 * 创建者 by ${HanSir} on 2018/10/30.
 * 版权所有  WELLTRANS.
 * 说明
 */
abstract class ItmeBinder<T : Any,VH : RecyclerView.ViewHolder> {
    var itemClickListener:((item : T,position: Int) -> Unit)? = null
    lateinit var adapter: AnotherAdapter
    abstract fun createViewHolder(inflater: LayoutInflater,parent: ViewParent): VH
    abstract fun bindViewHolder(holder: VH,item: T)
    fun clickWith(listener: (item: T,position: Int)->Unit) = apply { itemClickListener = listener }
}