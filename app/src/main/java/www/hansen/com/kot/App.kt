package www.hansen.com.kot

import android.app.Application
import android.content.Context
import android.hardware.display.DisplayManager
import com.jakewharton.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso
import okhttp3.OkHttpClient
import kotlin.properties.Delegates

/**
 * 创建者 by ${HanSir} on 2018/10/29.
 * 版权所有  WELLTRANS.
 * 说明
 */
class App : Application() {
    var context : Context by Delegates.notNull()
     private set


    override fun onCreate() {
        super.onCreate()
        context = applicationContext

    }


//    Picasso.setSingletonInstance(picasso)
}