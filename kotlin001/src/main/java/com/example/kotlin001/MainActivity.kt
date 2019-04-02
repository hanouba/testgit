package com.example.kotlin001

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.widget.Toast
import com.example.kotlin001.base.BaseActivity
import com.example.kotlin001.mvp.TabEntity
import com.flyco.tablayout.listener.CustomTabEntity
import com.flyco.tablayout.listener.OnTabSelectListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : BaseActivity() {
    private var mIndex = 0

    private val mTitles = arrayOf("每日精选","发现","热门","我的")
    private val mIconsSelectIds = intArrayOf(R.mipmap.ic_home_selected, R.mipmap.ic_discovery_selected, R.mipmap.ic_hot_selected, R.mipmap.ic_mine_selected)
    private val mIconsUnSelectIds= intArrayOf(R.mipmap.ic_home_normal, R.mipmap.ic_discovery_normal, R.mipmap.ic_hot_normal, R.mipmap.ic_mine_normal)

    //将标签状态存储
    private val  mTabEntities = ArrayList<CustomTabEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState != null) {
            mIndex = savedInstanceState.getInt("currTabIndex")
        }
        initTab()
        tab_layout.currentTab = mIndex
        //切换fragment
        switchFragment(mIndex)
    }

    private fun switchFragment(mIndex: Int) {

    }

    private fun initTab() {
        //闭区间  .. 是开区间  12345  1234
        //闭区间的for循环 给 mTabEntities 赋值
        (0 until mTitles.size).mapTo(mTabEntities) { TabEntity(mTitles[it],mIconsSelectIds[it],mIconsUnSelectIds[it])}
        tab_layout.setTabData(mTabEntities)
        tab_layout.setOnTabSelectListener(object :OnTabSelectListener {
            override fun onTabSelect(position: Int) {
                switchFragment(position)

            }

            override fun onTabReselect(position: Int) {
                log(2.0,1.0)
                Log.d("inittab","onTabReselect")
            }

        })
    }


    override fun startLoad() {

    }

    override fun initView() {

    }

    override fun initData() {

    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }


    //返回
    private var mTimeTag : Long = 0

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (System.currentTimeMillis().minus(mTimeTag) <= 2000) {
                finish()
            }else{
                 mTimeTag = System.currentTimeMillis()
                Toast.makeText(this,"再按一次退出",Toast.LENGTH_LONG).show()

            }
            return  true
        }
        return super.onKeyDown(keyCode, event)
    }

}
