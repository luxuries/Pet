package com.yianke.pet.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.yianke.pet.R;
import com.yianke.pet.utils.StatusBarUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 设置宠物信息
 */
public class PetMsgActivity extends AppCompatActivity
{

    @BindView(R.id.top_text)
    TextView mTopText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setWindowStatusBarColor(this, R.color.colorPet);
        setContentView(R.layout.activity_pet_msg);
        ButterKnife.bind(this);
        init();
    }

    private void init()
    {
        mTopText.setText("添加宠物");
    }


    @OnClick({R.id.top_back, R.id.msg_long, R.id.msg_save})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.top_back:
                finish();
                break;
            case R.id.msg_long:
                startActivity(new Intent(PetMsgActivity.this,MainActivity.class));
                finish();
                break;
            case R.id.msg_save:
                startActivity(new Intent(PetMsgActivity.this,MainActivity.class));
                finish();
                break;
            default:
                break;
        }
    }
}
