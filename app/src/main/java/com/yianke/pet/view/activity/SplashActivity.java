package com.yianke.pet.view.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.yianke.pet.R;
import com.yianke.pet.config.Config;
import com.yianke.pet.utils.StatusBarUtils;

import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity
{

    private Handler mHandler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            super.handleMessage(msg);
            startActivity(new Intent(SplashActivity.this, LeaderActivity.class));
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setWindowStatusBarColor(this, R.color.colorWhite);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        init();
    }

    private void init()
    {
        mHandler.sendEmptyMessageDelayed(Config.SUCCESS_INT, 1500);
    }
}
