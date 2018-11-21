package com.hansen.www.kot.ui.adapter

import android.content.Context
import com.hansen.www.kot.R
import com.hansen.www.kot.mvp.moudle.bean.HomeBean
import com.hansen.www.kot.view.recycleview.MultipleType
import com.hansen.www.kot.view.recycleview.ViewHolder
import com.hansen.www.kot.view.recycleview.adapter.CommonAdapter

/**
 * 创建者 by ${HanSir} on 2018/11/21.
 * 版权所有  WELLTRANS.
 * 说明
 */
class FollowAdapter(context: Context,dataList: ArrayList<HomeBean.Issue.Item>)
    : CommonAdapter<HomeBean.Issue.Item>(context,dataList,object: MultipleType<HomeBean.Issue.Item> {
    override fun getLayoutId(item: HomeBean.Issue.Item, position: Int): Int {
        return when {
            item.type == "videoCollectionWithBrief" ->
                    R.layout.item_home_header
            else ->
                throw IllegalAccessException("Api 解析出错了，出现其他类型")
        }
    }

}){
    override fun bindData(holder: ViewHolder, data: HomeBean.Issue.Item, position: Int) {

    }
}