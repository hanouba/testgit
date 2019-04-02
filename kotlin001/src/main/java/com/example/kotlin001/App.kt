package com.example.kotlin001

import android.app.Application
import android.content.Context
import kotlin.properties.Delegates

/**
 *Create by HanN on 2019/4/2
 *注释:
 */
class App : Application() {
    companion object {
        var context : Context by Delegates.notNull()
        private set
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext

    }
}