package com.yianke.pet;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.zhy.autolayout.config.AutoLayoutConifg;

public class MyApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        ImagePipelineConfig config = ImagePipelineConfig.newBuilder(this)
                .setDownsampleEnabled(true)
                .build();

        Fresco.initialize(this,config);
        AutoLayoutConifg.getInstance().useDeviceSize();
    }
}
