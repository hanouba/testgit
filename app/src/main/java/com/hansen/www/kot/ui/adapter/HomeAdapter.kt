package com.hansen.www.kot.ui.adapter

import android.app.Activity
import android.content.Context
import cn.bingoogolapple.bgabanner.BGABanner
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.hansen.www.kot.R
import com.hansen.www.kot.mvp.moudle.bean.HomeBean
import com.hansen.www.kot.view.recycleview.ViewHolder
import com.hansen.www.kot.view.recycleview.adapter.CommonAdapter
import io.reactivex.Observable

/**
 * 创建者 by ${HanSir} on 2018/11/5.
 * 版权所有  WELLTRANS.
 * 说明
 */
class HomeAdapter(context: Context,data: ArrayList<HomeBean.Issue.Item>)
    : CommonAdapter<HomeBean.Issue.Item>(context,data,-1) {

    // banner 作为 RecyclerView 的第一项
    var bannerItemSize = 0

    companion object {

        private const val ITEM_TYPE_BANNER = 1    //Banner 类型
        private const val ITEM_TYPE_TEXT_HEADER = 2   //textHeader
        private const val ITEM_TYPE_CONTENT = 3    //item
    }

    /**
     * 设置 Banner 大小
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

    /**
     * 得到 Item 的类型
     */
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
     *  得到 RecyclerView Item 数量（Banner 作为一个 item）
     */
    override fun getItemCount(): Int {
        return when {
            mData.size > bannerItemSize -> mData.size - bannerItemSize + 1
            mData.isEmpty() -> 0
            else -> 1
        }
    }

    /**
     * 绑定布局
     */
    override fun bindData(holder: ViewHolder, data: HomeBean.Issue.Item, position: Int) {

        when (getItemViewType(position)) {
        //Banner
            ITEM_TYPE_BANNER -> {
                val bannerItemData: ArrayList<HomeBean.Issue.Item> = mData.take(bannerItemSize).toCollection(ArrayList())
                val bannerFeedList = ArrayList<String>()
                val bannerTitleList = ArrayList<String>()
                //取出banner 显示的 img 和 Title
                Observable.fromIterable(bannerItemData)
                        .subscribe { list ->
                            bannerFeedList.add(list.data?.cover?.feed ?: "")
                            bannerTitleList.add(list.data?.title ?: "")
                        }

                //设置 banner
                with(holder) {
                    getView<BGABanner>(R.id.banner).run {
                        setAutoPlayAble(bannerFeedList.size > 1)
                        setData(bannerFeedList, bannerTitleList)
                        setAdapter { banner, _, feedImageUrl, position ->
                            GlideApp.with(mContext)
                                    .load(feedImageUrl)
                                    .transition(DrawableTransitionOptions().crossFade())
                                    .placeholder(R.drawable.placeholder_banner)
                                    .into(banner.getItemImageView(position))


                        }

                    }
                }
                //没有使用到的参数在 kotlin 中用"_"代替
                holder.getView<BGABanner>(R.id.banner).setDelegate { _, imageView, _, i ->

                    goToVideoPlayer(mContext as Activity, imageView, bannerItemData[i])

                }
            }
        //TextHeader
            ITEM_TYPE_TEXT_HEADER -> {
                holder.setText(R.id.tvHeader, mData[position + bannerItemSize - 1].data?.text ?: "")
            }

        //content
            ITEM_TYPE_CONTENT -> {
                setVideoItem(holder, mData[position + bannerItemSize - 1])
            }


        }
    }
}

}