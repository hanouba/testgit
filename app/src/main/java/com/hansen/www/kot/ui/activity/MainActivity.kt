package com.hansen.www.kot.ui.activity

import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import com.flyco.tablayout.listener.CustomTabEntity
import com.flyco.tablayout.listener.OnTabSelectListener
import kotlinx.android.synthetic.main.activity_main.*
import com.hansen.www.kot.R
import com.hansen.www.kot.base.BaseActivity
import com.hansen.www.kot.mvp.moudle.bean.TabEntity
import com.hansen.www.kot.ui.fragment.DiscoveryFragment
import com.hansen.www.kot.ui.fragment.HomeFragment
import com.hansen.www.kot.ui.fragment.HotFragment
import com.hansen.www.kot.ui.fragment.MineFragment

class MainActivity : BaseActivity() {
  private  val mTitles  = arrayOf("每日精选", "发现", "热门", "我的")
  private var mIndex = 0
  //选中的图标
  private val mIconsSelectIds  = intArrayOf(R.mipmap.ic_github, R.mipmap.ic_launcher, R.mipmap.ic_github, R.mipmap.ic_github)
  //未选择的图标
  private val mIconsUnSelectIds  = intArrayOf(R.mipmap.ic_github, R.mipmap.ic_launcher, R.mipmap.ic_github, R.mipmap.ic_github)
  //标签
  private val mTabEntities = ArrayList<CustomTabEntity>()


  private var mHomeFragment: HomeFragment? = null
  private var mDiscoveryFragment: DiscoveryFragment? = null
  private var mHotFragment: HotFragment? = null
  private var mMineFragment: MineFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
      if (savedInstanceState != null) {
        mIndex = savedInstanceState.getInt("currTabIndex")
      }
        super.onCreate(savedInstanceState)
      initTab()
     tab_layout.currentTab = mIndex
      switchFragment(mIndex)
    }

  override fun layoutId(): Int {
    return R.layout.activity_main
  }

  private fun switchFragment(position: Int) {
    val transaction = supportFragmentManager.beginTransaction()
    hideFragments(transaction)
    when (position) {
      0 // 首页
      -> mHomeFragment?.let {
        transaction.show(it)
      } ?: HomeFragment.getInstance(mTitles[position]).let {
        mHomeFragment = it
        transaction.add(R.id.fl_container, it, "home")
      }
      1  //发现
      -> mDiscoveryFragment?.let {
        transaction.show(it)
      } ?: DiscoveryFragment.getInstance(mTitles[position]).let {
        mDiscoveryFragment = it
        transaction.add(R.id.fl_container, it, "discovery") }
      2  //热门
      -> mHotFragment?.let {
        transaction.show(it)
      } ?: HotFragment.getInstance(mTitles[position]).let {
        mHotFragment = it
        transaction.add(R.id.fl_container, it, "hot") }
      3 //我的
      -> mMineFragment?.let {
        transaction.show(it)
      } ?: MineFragment.getInstance(mTitles[position]).let {
        mMineFragment = it
        transaction.add(R.id.fl_container, it, "mine") }

      else -> {

      }
    }

    mIndex = position
    tab_layout.currentTab = mIndex
    transaction.commitAllowingStateLoss()
  }

  /**
   * 隐藏所有的Fragment
   * @param transaction transaction
   */
  private fun hideFragments(transaction: FragmentTransaction) {
    mHomeFragment?.let { transaction.hide(it) }
    mDiscoveryFragment?.let { transaction.hide(it) }
    mHotFragment?.let { transaction.hide(it) }
    mMineFragment?.let { transaction.hide(it) }
  }

  private fun initTab() {
    (0 until mTitles.size).mapTo(mTabEntities) { TabEntity(mTitles[it], mIconsSelectIds[it], mIconsUnSelectIds[it]) }
    tab_layout.setTabData(mTabEntities)
    tab_layout.setOnTabSelectListener(object : OnTabSelectListener {
      override fun onTabSelect(position: Int) {
        //切换Fragment
        switchFragment(position)
      }
      override fun onTabReselect(position: Int) {
      }
    })
  }


  override fun initData() {

    }

    override fun initView() {

    }

    override fun start() {

    }










}
