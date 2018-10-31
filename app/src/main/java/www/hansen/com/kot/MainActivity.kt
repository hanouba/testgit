package www.hansen.com.kot

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*
import www.hansen.com.kot.R.id.fab
import www.hansen.com.kot.base.BaseActivity
import java.net.URI

class MainActivity : BaseActivity() {
  private  val mTitles: ArrayList<String> = arrayListOf("每日精选", "发现", "热门", "我的")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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
