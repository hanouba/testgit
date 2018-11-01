package www.hansen.com.kot.ui.fragment

import www.hansen.com.kot.R
import www.hansen.com.kot.base.BaseFragment
import www.hansen.com.kot.mvp.contract.HomeContract
import www.hansen.com.kot.mvp.moudle.bean.HomeBean

/**
 * 创建者 by ${HanSir} on 2018/11/1.
 * 版权所有  WELLTRANS.
 * 说明
 */
class HomeFragment : BaseFragment(),HomeContract.View{
    override fun showLoading() {

    }

    override fun dismissLoading() {

    }

    override fun setHomeData(homeBean: HomeBean) {

    }

    override fun setMoreData(itemList: ArrayList<HomeBean.Issue.Item>) {

    }

    override fun showError(msg: String, errorCode: Int) {

    }

    override fun initView() {

    }

    override fun lazyLoad() {

    }

    override fun getLayoutId(): Int = R.layout.fragment_home
}