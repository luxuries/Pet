package com.yianke.pet.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yianke.pet.R;
import com.yianke.pet.view.child.DTFragment;
import com.yianke.pet.view.child.JXFragment;
import com.yianke.pet.view.child.PDFragment;
import com.zhy.autolayout.AutoFrameLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 作者：${赵若位} on 2017/6/3 23:06
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class HomeFragment extends BaseFragment
{
    @BindView(R.id.camera)
    ImageView mCamera;
    @BindView(R.id.dic_one)
    TextView mDicOne;
    @BindView(R.id.dic_two)
    TextView mDicTwo;
    @BindView(R.id.dic_three)
    TextView mDicThree;
    @BindView(R.id.home_main)
    ViewPager mHomeMain;
    Unbinder unbinder;

    private JXFragment mJXFragment = new JXFragment();
    private DTFragment mDTFragment = new DTFragment();
    private PDFragment mPDFragment = new PDFragment();

    private HomeAdapter mAdapter;



    @Override
    public int getResource()
    {
        return R.layout.fragment_home;
    }

    @Override
    public void init(View view)
    {
        ButterKnife.bind(this, view);
        mAdapter = new HomeAdapter(getChildFragmentManager());
        mHomeMain.setOffscreenPageLimit(1);
        mHomeMain.setAdapter(mAdapter);
        mHomeMain.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {

            }

            @Override
            public void onPageSelected(int position)
            {
                resetBackground();
                switch (position)
                {
                    case 0:
                        mDicOne.setBackgroundResource(R.color.colorWhite);
                        mCamera.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        mDicTwo.setBackgroundResource(R.color.colorWhite);
                        mCamera.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        mDicThree.setBackgroundResource(R.color.colorWhite);
                        mCamera.setVisibility(View.GONE);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state)
            {

            }
        });
    }

    @Override
    public void loadingDatas()
    {
    }

    @Override
    public void startdestroy()
    {
        unbinder.unbind();
        mAdapter = null;
        mJXFragment = null;
        mPDFragment = null;
        mDTFragment = null;
    }


    @OnClick({R.id.home_one, R.id.home_two, R.id.home_three})
    public void onViewClicked(View view)
    {
        resetBackground();
        switch (view.getId())
        {
            case R.id.home_one:
                mDicOne.setBackgroundResource(R.color.colorWhite);
                mHomeMain.setCurrentItem(0);
                mCamera.setVisibility(View.VISIBLE);
                break;
            case R.id.home_two:
                mDicTwo.setBackgroundResource(R.color.colorWhite);
                mHomeMain.setCurrentItem(1);
                mCamera.setVisibility(View.VISIBLE);
                break;
            case R.id.home_three:
                mDicThree.setBackgroundResource(R.color.colorWhite);
                mHomeMain.setCurrentItem(2);
                mCamera.setVisibility(View.GONE);
                break;
            default:
                break;
        }
    }



    //重置指示器颜色
    private void resetBackground()
    {
        mDicOne.setBackgroundResource(R.color.colorPet);
        mDicThree.setBackgroundResource(R.color.colorPet);
        mDicTwo.setBackgroundResource(R.color.colorPet);
    }


    private class HomeAdapter extends FragmentPagerAdapter
    {
        private List<Fragment> mList;

        public HomeAdapter(FragmentManager fm)
        {
            super(fm);
            mList = new ArrayList<>();
            mList.add(mJXFragment);
            mList.add(mDTFragment);
            mList.add(mPDFragment);
        }

        @Override
        public Fragment getItem(int position)
        {
            return mList.get(position);
        }

        @Override
        public int getCount()
        {
            return mList == null?0:mList.size();
        }
    }

}
