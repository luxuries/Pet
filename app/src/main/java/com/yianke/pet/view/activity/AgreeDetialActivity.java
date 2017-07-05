package com.yianke.pet.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

import com.yianke.pet.R;
import com.yianke.pet.utils.StatusBarUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AgreeDetialActivity extends AppCompatActivity
{

    @BindView(R.id.top_text)
    TextView mTopText;
    @BindView(R.id.agree_web)
    WebView mAgreeWeb;

    private String url_agree = "http://www.yc.cn/app/info/agreement.html?petVer=390&petPlat=1&packetId=2000";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setWindowStatusBarColor(this, R.color.colorPet);
        setContentView(R.layout.activity_agree_detial);
        ButterKnife.bind(this);
        init();
    }

    private void init()
    {
        mTopText.setText("有宠用户服务协议");
        mAgreeWeb.loadUrl(url_agree);
    }

    @OnClick(R.id.top_back)
    public void onViewClicked()
    {
        finish();
    }
}
