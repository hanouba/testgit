package com.example.kotlin001.ui.adapter

import android.content.Context
import android.widget.BaseAdapter
import cn.bingoogolapple.bgabanner.BGABanner
import com.example.kotlin001.R
import com.example.kotlin001.mvp.model.HomeBean
import com.example.kotlin001.view.CommonAdapter
import com.example.kotlin001.view.ViewHolder
import io.reactivex.Observable
import io.reactivex.Observer
import java.util.*

/**
 *Create by HanN on 2019/4/15
 *注释:
 */
class HomeAdapter(context: Context, data: ArrayList<HomeBean.Issue.Item>) : CommonAdapter<HomeBean.Issue.Item>(context, data, -1) {

    var bannerItemSize = 0

    companion object {
        private const val ITEM_TYPE_BANNER = 1
        private const val ITEM_TYPE_TEXT_HEADER = 2
        private const val ITEM_TYPE_CONTENT = 3
    }

    /**
     * 设置bannersize
     */
    fun setBannerSize(count: Int) {
        bannerItemSize = count
    }

    /**
     * 添加更多数据
     */
    fun addItemData(itemList: ArrayList<HomeBean.Issue.Item>) {
        this.mData.addAll(itemList)
        notifyDataSetChanged()
    }

//    获取item的类型
    override fun getItemViewType(position: Int): Int {

        return when {
            position == 0 ->
                ITEM_TYPE_BANNER
            mData[position + bannerItemSize - 1].type == "textHeader" ->
                ITEM_TYPE_TEXT_HEADER
            else ->
                ITEM_TYPE_CONTENT
        }
    }

    /**
     * 得到 RecyclerView item 数量 ( banner 作为一个item)
     */
    override fun getItemCount(): Int {
        return when {
            mData.size > bannerItemSize -> mData.size -bannerItemSize + 1
            mData.isEmpty() -> 0
            else -> 1
        }
    }


    /**
     * 绑定布局
     */
    override fun bindData(holder: ViewHolder, data: HomeBean.Issue.Item, position: Int) {
        when (getItemViewType(position)) {
            ITEM_TYPE_BANNER -> {
                //这句话应该是是 从mdata 中获取bannerItemSize数量的数据 放在arraylist中 就是banner的数据
                val  bannerItemData: ArrayList<HomeBean.Issue.Item> = mData.take(bannerItemSize).toCollection(ArrayList())
                val bannerFeedList = ArrayList<String>()
                val bannerTitleList = ArrayList<String>()

                //从banner数据中单独把每个banner的img 和 titl取出来
                Observable.fromIterable(bannerItemData)
                        .subscribe{
                            list ->
                            bannerFeedList.add(list.data?.cover?.feed?: "")
                            bannerTitleList.add(list.data?.title?:"")
                        }


                with(holder) {
                    getView<BGABanner>(R.id.banner).run {

                    }
                }

            }
        }
    }
}