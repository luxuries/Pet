package com.yianke.pet.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.yianke.pet.R;
import com.yianke.pet.utils.StatusBarUtils;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MissActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setWindowStatusBarColor(this, R.color.colorPet);
        setContentView(R.layout.activity_miss);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.top_back, R.id.miss_btn})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.top_back:
                finish();
                break;
            case R.id.miss_btn:
                finish();
                Toast.makeText(LoginActivity.instance, "重置密码成功", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }
}
