package com.example.kotlin001.view

import java.text.FieldPosition

/**
 *Create by HanN on 2019/4/23
 *注释:
 */
interface OnItemLongClickListener {
    fun onItemLongClick(obj: Any?,position: Int): Boolean
}