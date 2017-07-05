package com.yianke.pet.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yianke.pet.R;
import com.yianke.pet.view.child.DongmanFragment;
import com.yianke.pet.view.child.GuanfangFRagment;
import com.yianke.pet.view.child.TuiJianFragment;
import com.yianke.pet.view.child.XuetangFragment;
import com.yianke.pet.view.child.YaowenFragment;
import com.yianke.pet.view.child.ZazhiFragment;

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

public class MsgFragment extends BaseFragment
{
    @BindView(R.id.msg_ViewPager)
    ViewPager mMsgViewPager;
    Unbinder unbinder;
    @BindView(R.id.msg_line1)
    TextView mMsgLine1;
    @BindView(R.id.msg_line2)
    TextView mMsgLine2;
    @BindView(R.id.msg_line3)
    TextView mMsgLine3;
    @BindView(R.id.msg_line4)
    TextView mMsgLine4;
    @BindView(R.id.msg_line5)
    TextView mMsgLine5;
    @BindView(R.id.msg_line6)
    TextView mMsgLine6;
    Unbinder unbinder1;
    @BindView(R.id.msg_text1)
    TextView mMsgText1;
    @BindView(R.id.msg_text2)
    TextView mMsgText2;
    @BindView(R.id.msg_text3)
    TextView mMsgText3;
    @BindView(R.id.msg_text4)
    TextView mMsgText4;
    @BindView(R.id.msg_text5)
    TextView mMsgText5;
    @BindView(R.id.msg_text6)
    TextView mMsgText6;
    Unbinder unbinder2;


    @Override
    public int getResource()
    {
        return R.layout.fragment_msg;
    }

    @Override
    public void init(View view)
    {
        ButterKnife.bind(this, view);
    }

    @Override
    public void loadingDatas()
    {
        mMsgText1.setTextSize(52f);
        mMsgLine1.setBackgroundResource(R.color.colorWhite);
        mMsgViewPager.setOffscreenPageLimit(1);
        mMsgViewPager.setAdapter(new MsgViewPagerAdapter(getChildFragmentManager()));
        mMsgViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {

            }

            @Override
            public void onPageSelected(int position)
            {
                resetTitle();
                switch (position)
                {
                    case 0:
                        mMsgLine1.setBackgroundResource(R.color.colorWhite);
                        break;
                    case 1:
                        mMsgLine2.setBackgroundResource(R.color.colorWhite);
                        break;
                    case 2:
                        mMsgLine3.setBackgroundResource(R.color.colorWhite);
                        break;
                    case 3:
                        mMsgLine4.setBackgroundResource(R.color.colorWhite);
                        break;
                    case 4:
                        mMsgLine5.setBackgroundResource(R.color.colorWhite);
                        break;
                    case 5:
                        mMsgLine6.setBackgroundResource(R.color.colorWhite);
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
    public void startdestroy()
    {
        unbinder.unbind();
    }



    @OnClick({R.id.msg_title1, R.id.msg_title2, R.id.msg_title3, R.id.msg_title4, R.id.msg_title5, R.id.msg_title6})
    public void onViewClicked(View view)
    {
        resetTitle();
        switch (view.getId())
        {
            case R.id.msg_title1:
                mMsgViewPager.setCurrentItem(0);
                mMsgLine1.setBackgroundResource(R.color.colorWhite);
                break;
            case R.id.msg_title2:
                mMsgViewPager.setCurrentItem(1);
                mMsgLine2.setBackgroundResource(R.color.colorWhite);
                break;
            case R.id.msg_title3:
                mMsgViewPager.setCurrentItem(2);
                mMsgLine3.setBackgroundResource(R.color.colorWhite);
                break;
            case R.id.msg_title4:
                mMsgViewPager.setCurrentItem(3);
                mMsgLine4.setBackgroundResource(R.color.colorWhite);
                break;
            case R.id.msg_title5:
                mMsgViewPager.setCurrentItem(4);
                mMsgLine5.setBackgroundResource(R.color.colorWhite);
                break;
            case R.id.msg_title6:
                mMsgViewPager.setCurrentItem(5);
                mMsgLine6.setBackgroundResource(R.color.colorWhite);
                break;
            default:
                break;
        }
    }

    private void resetTitle()
    {
        mMsgLine1.setBackgroundResource(R.color.colorPet);
        mMsgLine2.setBackgroundResource(R.color.colorPet);
        mMsgLine3.setBackgroundResource(R.color.colorPet);
        mMsgLine4.setBackgroundResource(R.color.colorPet);
        mMsgLine5.setBackgroundResource(R.color.colorPet);
        mMsgLine6.setBackgroundResource(R.color.colorPet);

    }



    private class MsgViewPagerAdapter extends FragmentPagerAdapter
    {
        private List<Fragment> mList;

        public MsgViewPagerAdapter(FragmentManager fm)
        {
            super(fm);
            mList = new ArrayList<>();
            mList.add(new TuiJianFragment());
            mList.add(new YaowenFragment());
            mList.add(new DongmanFragment());
            mList.add(new ZazhiFragment());
            mList.add(new XuetangFragment());
            mList.add(new GuanfangFRagment());
        }

        @Override
        public Fragment getItem(int position)
        {
            return mList.get(position);
        }

        @Override
        public int getCount()
        {
            return mList == null ? 0 : mList.size();
        }
    }


}
