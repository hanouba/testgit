package www.hansen.com.kot

import android.app.Fragment
import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.view.*
import www.hansen.com.kot.adapter.AnotherAdapter
import www.hansen.com.kot.domain.Cover

/**
 * 创建者 by ${HanSir} on 2018/10/29.
 * 版权所有  WELLTRANS.
 * 说明
 */
class HomeFragment : Fragment() {
    companion object {
        val AIM_URL = "https://news-at.zhihu.com/api/4/news/latest"
    }
    var mData = ArrayList<Cover>()
    lateinit var coverList  : RecyclerView
    lateinit var homeRefresh : SwipeRefreshLayout
    lateinit var adapter : AnotherAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //是否在activity 里面保留fragment 的实例
        retainInstance = true;
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view)
    }

    private fun initView(view: View) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
      homeRefresh =  view.homeRefresh
        coverList = view.homeList

    }
}