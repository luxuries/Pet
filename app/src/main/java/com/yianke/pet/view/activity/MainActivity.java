package com.yianke.pet.view.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.yianke.pet.R;
import com.yianke.pet.utils.StatusBarUtils;
import com.yianke.pet.view.fragment.HomeFragment;
import com.yianke.pet.view.fragment.MineFragment;
import com.yianke.pet.view.fragment.MsgFragment;
import com.yianke.pet.view.fragment.ServiceFragment;
import com.yianke.pet.view.fragment.ShoppingFragment;
import com.zhy.autolayout.AutoFrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
{

    @BindView(R.id.main_fragment)
    AutoFrameLayout mMainFragment;
    @BindView(R.id.img_home)
    ImageView mImgHome;
    @BindView(R.id.tv_home)
    TextView mTvHome;
    @BindView(R.id.img_house)
    ImageView mImgHouse;
    @BindView(R.id.tv_house)
    TextView mTvHouse;
    @BindView(R.id.img_buy)
    ImageView mImgBuy;
    @BindView(R.id.tv_buy)
    TextView mTvBuy;
    @BindView(R.id.img_service)
    ImageView mImgService;
    @BindView(R.id.tv_service)
    TextView mTvService;
    @BindView(R.id.img_mine)
    ImageView mImgMine;
    @BindView(R.id.tv_mine)
    TextView mTvMine;


    //主页面五个Fragment
    private HomeFragment mHomeFragment;
    private MsgFragment mMsgFragment;
    private ShoppingFragment mShoppingFragment;
    private ServiceFragment mServiceFragment;
    private MineFragment mMineFragment;
    private FragmentManager fm;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setWindowStatusBarColor(this,R.color.colorPet);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        fm = getSupportFragmentManager();
        init();
    }

    private void init()
    {
        showFragment(0);
        mImgHome.setBackgroundResource(R.drawable.ic_show_press);
        mTvHome.setTextColor(getResources().getColor(R.color.colorPet));
    }


    @OnClick({R.id.parent_home, R.id.parent_house, R.id.parent_buy, R.id.parent_service, R.id.parent_mine})
    public void onViewClicked(View view)
    {
        reSetBackground();
        switch (view.getId())
        {
            case R.id.parent_home:
                showFragment(0);
                mImgHome.setBackgroundResource(R.drawable.ic_show_press);
                mTvHome.setTextColor(getResources().getColor(R.color.colorPet));
                break;
            case R.id.parent_house:
                showFragment(1);
                mImgHouse.setBackgroundResource(R.drawable.ic_news_press);
                mTvHouse.setTextColor(getResources().getColor(R.color.colorPet));
                break;
            case R.id.parent_buy:
                showFragment(2);
                mImgBuy.setBackgroundResource(R.drawable.ic_bottom_share_press);
                mTvBuy.setTextColor(getResources().getColor(R.color.colorPet));
                break;
            case R.id.parent_service:
                showFragment(3);
                mImgService.setBackgroundResource(R.drawable.ic_service_press);
                mTvService.setTextColor(getResources().getColor(R.color.colorPet));
                break;
            case R.id.parent_mine:
                showFragment(4);
                mImgMine.setBackgroundResource(R.drawable.ic_me_press);
                mTvMine.setTextColor(getResources().getColor(R.color.colorPet));
                break;
            default:
                break;
        }
    }

    private void showFragment(int position)
    {
        FragmentTransaction ft = fm.beginTransaction();
        hideFragment(ft);
        switch (position)
        {
            case 0:
                if (mHomeFragment != null)
                {
                    ft.show(mHomeFragment);
                }else
                {
                    mHomeFragment = new HomeFragment();
                    ft.add(R.id.main_fragment, mHomeFragment);
                }
                break;
            case 1:
                if (mMsgFragment != null)
                {
                    ft.show(mMsgFragment);
                }else
                {
                    mMsgFragment = new MsgFragment();
                    ft.add(R.id.main_fragment, mMsgFragment);
                }
                break;
            case 2:
                if (mShoppingFragment != null)
                {
                    ft.show(mShoppingFragment);
                }else
                {
                    mShoppingFragment = new ShoppingFragment();
                    ft.add(R.id.main_fragment, mShoppingFragment);
                }
                break;
            case 3:
                if (mServiceFragment != null)
                {
                    ft.show(mServiceFragment);
                }else
                {
                    mServiceFragment = new ServiceFragment();
                    ft.add(R.id.main_fragment, mServiceFragment);
                }
                break;
            case 4:
                if (mMineFragment != null)
                {
                    ft.show(mMineFragment);
                }else
                {
                    mMineFragment = new MineFragment();
                    ft.add(R.id.main_fragment, mMineFragment);
                }
                break;
            default:
                break;
        }
        ft.commit();
    }

    private void hideFragment(FragmentTransaction ft)
    {
        if (mHomeFragment != null)
        {
            ft.hide(mHomeFragment);
        }
        if (mMsgFragment != null)
        {
            ft.hide(mMsgFragment);
        }
        if (mShoppingFragment != null)
        {
            ft.hide(mShoppingFragment);
        }
        if (mServiceFragment != null)
        {
            ft.hide(mServiceFragment);
        }
        if (mMineFragment != null)
        {
            ft.hide(mMineFragment);
        }
    }


    //    重置底部Button的背景和字体颜色
    private void reSetBackground()
    {
        mImgHome.setBackgroundResource(R.drawable.ic_show);
        mTvHome.setTextColor(getResources().getColor(R.color.color9));

        mImgHouse.setBackgroundResource(R.drawable.ic_news);
        mTvHouse.setTextColor(getResources().getColor(R.color.color9));

        mImgBuy.setBackgroundResource(R.drawable.ic_bottom_share);
        mTvBuy.setTextColor(getResources().getColor(R.color.color9));

        mImgService.setBackgroundResource(R.drawable.ic_service);
        mTvService.setTextColor(getResources().getColor(R.color.color9));

        mImgMine.setBackgroundResource(R.drawable.ic_me);
        mTvMine.setTextColor(getResources().getColor(R.color.color9));
    }
}
