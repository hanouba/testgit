package com.example.kotlin001

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.util.Log
import android.view.KeyEvent
import android.widget.Toast
import com.example.kotlin001.base.BaseActivity
import com.example.kotlin001.mvp.TabEntity
import com.flyco.tablayout.listener.CustomTabEntity
import com.flyco.tablayout.listener.OnTabSelectListener
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition
import kotlin.math.log

class MainActivity : BaseActivity() {
    private var mIndex = 0

    private val mTitles = arrayOf("每日精选", "发现", "热门", "我的")
    private val mIconsSelectIds = intArrayOf(R.mipmap.ic_home_selected, R.mipmap.ic_discovery_selected, R.mipmap.ic_hot_selected, R.mipmap.ic_mine_selected)
    private val mIconsUnSelectIds = intArrayOf(R.mipmap.ic_home_normal, R.mipmap.ic_discovery_normal, R.mipmap.ic_hot_normal, R.mipmap.ic_mine_normal)

    //将标签状态存储
    private val mTabEntities = ArrayList<CustomTabEntity>()
    private var mHomeFragment: HomeFragment? = null;

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

    private fun switchFragment(position: Int) {
        //为啥是val
        val beginTransaction = supportFragmentManager.beginTransaction()
        hindfragmnet(beginTransaction)

        when (position) {
            0     // postion是0
            -> mHomeFragment?.let {
                beginTransaction.show(it)   //显示homefragment
            } ?: HomeFragment.getInstance(mTitles[position]).let {
                //title赋值
                mHomeFragment = it  // 这是担心it不是homefragme吗
                beginTransaction.add(R.id.fl_container, it, "home")  // 将homefragment显示在fragment上
            }
            1 //发现
            -> mHomeFragment?.let {
                beginTransaction.show(it)
            } ?: HomeFragment.getInstance(mTitles[position]).let {
                mHomeFragment = it
                beginTransaction.add(R.id.fl_container, it, "discover")
            }
            2 //热门
            -> mHomeFragment?.let {
                beginTransaction.show(it)
            } ?: HomeFragment.getInstance(mTitles[position]).let {
                mHomeFragment = it
                beginTransaction.add(R.id.fl_container, it, "hot")
            }
            3
            -> mHomeFragment?.let {
                beginTransaction.show(it)
            } ?: HomeFragment.getInstance(mTitles[position]).let {
                mHomeFragment = it
                beginTransaction.add(R.id.fl_container, it, "mine")
            }
            else
            -> {

            }

        }
        mIndex = position
        tab_layout.currentTab = mIndex
        beginTransaction.commitAllowingStateLoss()

    }

    private fun hindfragmnet(transaction: FragmentTransaction) {
        mHomeFragment?.let { transaction.hide(it) }
    }

    private fun initTab() {
        //闭区间  .. 是开区间  12345  1234
        //闭区间的for循环 给 mTabEntities 赋值
        (0 until mTitles.size).mapTo(mTabEntities) { TabEntity(mTitles[it], mIconsSelectIds[it], mIconsUnSelectIds[it]) }
        tab_layout.setTabData(mTabEntities)
        tab_layout.setOnTabSelectListener(object : OnTabSelectListener {
            override fun onTabSelect(position: Int) {
                switchFragment(position)

            }

            override fun onTabReselect(position: Int) {
                log(2.0, 1.0)
                Log.d("inittab", "onTabReselect")
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


    @SuppressLint("MissingSuperCall")
    override fun onSaveInstanceState(outState: Bundle) {
        if (tab_layout != null) {
            outState.putInt("currTabIndex", mIndex)
        }
    }

    //返回
    private var mTimeTag: Long = 0

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (System.currentTimeMillis().minus(mTimeTag) <= 2000) {
                finish()
            } else {
                mTimeTag = System.currentTimeMillis()
                Toast.makeText(this, "再按一次退出", Toast.LENGTH_LONG).show()

            }
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

}
