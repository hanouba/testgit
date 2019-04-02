package com.example.kotlin001.mvp

import com.flyco.tablayout.listener.CustomTabEntity

/**
 *Create by HanN on 2019/4/2
 *注释: 自定义 tab 实现 customentity 或 标签信息
 */
class TabEntity(var title: String,private var iconsSelected: Int,private var iconsUnSelected:Int) : CustomTabEntity{
    override fun getTabUnselectedIcon(): Int {
        return iconsUnSelected
    }

    override fun getTabSelectedIcon(): Int {
       return iconsSelected
    }

    override fun getTabTitle(): String {
        return title
    }
}