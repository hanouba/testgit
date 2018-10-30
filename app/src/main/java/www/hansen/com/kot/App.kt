package www.hansen.com.kot

import android.app.Application
import com.jakewharton.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso
import okhttp3.OkHttpClient

/**
 * 创建者 by ${HanSir} on 2018/10/29.
 * 版权所有  WELLTRANS.
 * 说明
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
    }

    val client = OkHttpClient();
    val picasso = Picasso.Builder(this)
            .downloader(OkHttp3Downloader(client))
            .build()
    Picasso.setSingletonInstance(picasso)
}