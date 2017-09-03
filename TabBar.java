package com.dell.wangyouwei20170903;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * 姓名：王有为
 * 时间：2017/9/3.
 */

public class TabBar extends LinearLayout {
    public TabBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.ToBar);

    }
}
