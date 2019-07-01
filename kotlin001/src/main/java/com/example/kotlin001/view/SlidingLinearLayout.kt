package com.example.kotlin001.view

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.LinearLayout

/**
 * Create by HanN on 2019/5/9
 * 注释:
 */
class SlidingLinearLayout(context: Context, attrs: AttributeSet)// TODO Auto-generated constructor stub
    : LinearLayout(context, attrs) {
    private var lastMotionX = -1f

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        // TODO Auto-generated method stub
        // return super.onInterceptTouchEvent(ev);
        if (ev.action == MotionEvent.ACTION_DOWN) {
            this.lastMotionX = ev.rawX.toInt().toFloat()
        }

        return super.onInterceptTouchEvent(ev)

    }
}
