package com.dofazer.cafe.customview

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

class NoSwipePager(context: Context, attrs: AttributeSet) : ViewPager(context, attrs) {
    init {
        setPagingEnabled(false)
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return super.isEnabled() && super.onTouchEvent(ev)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return super.isEnabled() && super.onInterceptTouchEvent(ev)
    }

    private fun setPagingEnabled(enabled: Boolean){
        super.setEnabled(enabled)
    }

}