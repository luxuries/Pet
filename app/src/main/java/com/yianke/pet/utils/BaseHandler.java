package com.yianke.pet.utils;

import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

/**
 * 作者：${赵若位} on 2017/6/11 22:45
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class BaseHandler<T> extends Handler
{
    public WeakReference<T> mReference;

    public BaseHandler(T t)
    {
        if (mReference == null)
        {
            mReference = new WeakReference<T>(t);
        }
    }


    @Override
    public void handleMessage(Message msg)
    {
        T t = mReference.get();
        if (t == null)
        {
            return;
        }
    }
}
