package com.example.colorfullshadowbutton

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.support.annotation.RequiresApi
import android.util.AttributeSet
import android.widget.Button

class ColorfulShadowButton : Button {
    constructor(context: Context?) : super(context) {
        init()

    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        getAttributes(attrs)
        init()

    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        getAttributes(attrs)
        init()

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(
        context,
        attrs,
        defStyleAttr,
        defStyleRes
    ) {
        getAttributes(attrs)
        init()

    }

    private fun getAttributes(attrs: AttributeSet) {
        with(context.obtainStyledAttributes(attrs, R.styleable.ColorfulShadowButton)) {

        }

    }

    private fun init() {

    }


}