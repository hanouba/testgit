package com.hansen.www.kot.view.recycleview

import android.content.ClipData
import java.text.ParsePosition

/**
 * 创建者 by ${HanSir} on 2018/11/5.
 * 版权所有  WELLTRANS.
 * 说明     多条目布局类型
 */
interface MultipleType<in T> {
    fun  getLayoutId(item: T,position: Int): Int
}