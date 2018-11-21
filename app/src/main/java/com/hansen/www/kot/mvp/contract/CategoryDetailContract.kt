package com.hansen.www.kot.mvp.contract

import com.hansen.www.kot.base.IBaseView
import com.hansen.www.kot.base.IPresenter
import com.hansen.www.kot.mvp.moudle.bean.HomeBean

/**
 * 创建者 by ${HanSir} on 2018/11/20.
 * 版权所有  WELLTRANS.
 * 说明
 */
interface CategoryDetailContract {
    interface View: IBaseView {
        /**
         *  设置列表数据
         */
        fun setCateDetailList(itemList:ArrayList<HomeBean.Issue.Item>)

        fun showError(errorMsg:String)




    }

    interface Presenter: IPresenter<View> {

        fun getCategoryDetailList(id:Long)

        fun loadMoreData()
    }
}