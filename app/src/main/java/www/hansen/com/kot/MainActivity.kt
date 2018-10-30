package www.hansen.com.kot

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URI

class MainActivity : AppCompatActivity() {
    companion object {
        val GITHUT_URL = "https://github.com/wuapnjie/PoiShuhui-Kotlin"
    }

    val nameList: ArrayList<String> = arrayListOf("大一", "大二", "大三")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        fab.setOnClickListener { jumpToMain() }

    }

    private fun jumpToMain() {
        val url = Uri.parse(GITHUT_URL)
        val intent = Intent(Intent.ACTION_VIEW, url)
        startActivity(intent)
    }
}
