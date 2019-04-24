package com.example.kotlin001.view

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView

/**
 *Create by HanN on 2019/4/15
 *注释: 统用adapter
 */
abstract class CommonAdapter<T>(var mContext: Context,var mData: ArrayList<T>,var mLayout: Int): RecyclerView.Adapter<ViewHolder>() {


    protected var mInflate: LayoutInflater? = null
    protected var mTypeSupport: MultipleType<T>? = null

    protected var mItemClickListener: OnItemClickListener? = null
    protected var mItemLongClickListener: OnItemLongClickListener? = null

    init {

        mInflate = LayoutInflater.from(mContext)
    }

    //需要多布局
    constructor(context: Context,data: ArrayList<T>,typeSupport: MultipleType<T>) : this(context,data,-1) {
        this.mTypeSupport = typeSupport
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       if (mTypeSupport != null) {
           mLayout = viewType
       }

        val view = mInflate?.inflate(mLayout,parent,false)
        return ViewHolder(view!!)
    }

    //多布局
    override fun getItemViewType(position: Int): Int {

        return mTypeSupport?.getLayoutId(mData[position],position)?: super.getItemViewType(position)
    }


    override fun getItemCount(): Int {
      return mData.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        bindData(holder,mData[position],position)

        //条目点击事件
        mItemClickListener?.let {
            holder.itemView.setOnClickListener { mItemClickListener!!.onItemClick(mData[position], position) }
        }

        mItemLongClickListener?.let {
            holder.itemView.setOnLongClickListener{ mItemLongClickListener!! .onItemLongClick(mData[position],position)}
        }

    }


    protected abstract fun bindData(holder: ViewHolder,data: T,position: Int)



    fun  setOnItemClickListener(itemClickListener: OnItemClickListener) {
        this.mItemClickListener = itemClickListener
    }

    fun  setOnItemLongClickListener(itemLongClickListener: OnItemLongClickListener) {
        this.mItemLongClickListener = itemLongClickListener
    }
}