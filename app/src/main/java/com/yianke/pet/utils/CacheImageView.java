package com.yianke.pet.utils;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * 作者：${赵若位} on 2017/6/24 21:34
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class CacheImageView extends android.support.v7.widget.AppCompatImageView
{

    public CacheImageView(Context context)
    {
        super(context);
    }

    public CacheImageView(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
    }

    public CacheImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setImageDrawable(null);
    }
}
