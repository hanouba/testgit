package www.hansen.com.kot.ui.activity

import android.os.Bundle
import com.flyco.tablayout.listener.CustomTabEntity
import www.hansen.com.kot.R
import www.hansen.com.kot.base.BaseActivity
import www.hansen.com.kot.ui.fragment.HomeFragment

class MainActivity : BaseActivity() {
  private  val mTitles: ArrayList<String> = arrayListOf("每日精选", "发现", "热门", "我的")
  private var mIndex = 0
  //选中的图标
  private val mIconsSelectIds  = intArrayOf(R.mipmap.ic_github, R.mipmap.ic_launcher, R.mipmap.ic_github, R.mipmap.ic_github)
  //未选择的图标
  private val mIconsUnSelectIds  = intArrayOf(R.mipmap.ic_github, R.mipmap.ic_launcher, R.mipmap.ic_github, R.mipmap.ic_github)
  //标签
  private val mTabEntities = ArrayList<CustomTabEntity>()


  private var mHomeFragment: HomeFragment? = null
  private var mDiscoveryFragment: HomeFragment? = null
  private var mHotFragment: HomeFragment? = null
  private var mMineFragment: HomeFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
      if (savedInstanceState != null) {
        mIndex = savedInstanceState.getInt("currentTabIndex")
      }
        super.onCreate(savedInstanceState)

      initTab()

    }

  private fun initTab() {

  }


  override fun initData() {

    }

    override fun initView() {

    }

    override fun start() {

    }

    override fun layoutId(): Int {

        return R.layout.activity_main
    }








}
