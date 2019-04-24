package com.example.kotlin001.view

import org.intellij.lang.annotations.JdkConstants

/**
 *Create by HanN on 2019/4/23
 *注释: 多布局条目类型
 *  T 类型  position 位置
 */
interface MultipleType<in T> {
    fun getLayoutId(item: T,position: Int) : Int
}