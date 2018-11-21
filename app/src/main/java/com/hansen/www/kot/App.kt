package com.hansen.www.kot

import android.app.Application
import android.content.Context
import com.hazz.kotlinmvp.utils.DisplayManager

import kotlin.properties.Delegates

/**
 * 创建者 by ${HanSir} on 2018/10/29.
 * 版权所有  WELLTRANS.
 * 说明
 */
class App : Application() {
    companion object {
        var context: Context by Delegates.notNull()
            private set
    }



    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        DisplayManager.init(this)
    }


//    Picasso.setSingletonInstance(picasso)
}