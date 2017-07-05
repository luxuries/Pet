package com.yianke.pet.view.child;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;
import com.yianke.pet.R;
import com.yianke.pet.adapter.home.JXAdapter;
import com.yianke.pet.model.home.JXModel;
import com.yianke.pet.utils.BaseHandler;
import com.yianke.pet.view.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 作者：${赵若位} on 2017/6/6 10:20
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class JXFragment extends BaseFragment
{
    @BindView(R.id.jx_main)
    ListView mJxMain;
    Unbinder mUnbinder;

    private JXAdapter mAdapter;
    private List<JXModel> mJxList;

    private ViewPager mJxBanner;
    private ImageView mJxOne;
    private ImageView mJxTwo;
    private ImageView mJxThree;
    private ImageView mJxFour;
    private ImageView mJxFive;

    //******************************轮播窗口*************************************//
    private int[] images =
            {
                    R.drawable.jx_header_1,
                    R.drawable.jx_header_2,
                    R.drawable.jx_header_3,
                    R.drawable.jx_header_4,
                    R.drawable.jx_header_5,
            };
    private List<ImageView> mList;
    private BaseHandler<JXFragment> mHandler = new BaseHandler<JXFragment>(this)
    {
        @Override
        public void handleMessage(Message msg)
        {
            super.handleMessage(msg);
            resetDic();
            switch (msg.what % images.length)
            {
                case 0:
                    mJxOne.setBackgroundResource(R.drawable.shape_jx_circle_white);
                    mJxBanner.setCurrentItem(0);
                    break;
                case 1:
                    mJxTwo.setBackgroundResource(R.drawable.shape_jx_circle_white);
                    mJxBanner.setCurrentItem(1);
                    break;
                case 2:
                    mJxThree.setBackgroundResource(R.drawable.shape_jx_circle_white);
                    mJxBanner.setCurrentItem(2);
                    break;
                case 3:
                    mJxFour.setBackgroundResource(R.drawable.shape_jx_circle_white);
                    mJxBanner.setCurrentItem(3);
                    break;
                case 4:
                    mJxFive.setBackgroundResource(R.drawable.shape_jx_circle_white);
                    mJxBanner.setCurrentItem(4);
                    break;
                default:
                    break;
            }
        }
    };
    private boolean isStart = false;
    //*******************************************************************//


    @Override
    public int getResource()
    {
        return R.layout.fragment_jx;
    }

    @Override
    public void init(View view)
    {
        ButterKnife.bind(this, view);
    }

    @Override
    public void loadingDatas()
    {
        mJxList = new ArrayList<>();
        mJxList.add(new JXModel());
        mJxList.add(new JXModel());
        mJxList.add(new JXModel());
        mJxList.add(new JXModel());
        mJxList.add(new JXModel());
        mJxList.add(new JXModel());
        mJxList.add(new JXModel());
        mAdapter = new JXAdapter(getActivity(),mJxList);
        mJxMain.setAdapter(mAdapter);



        View header = LayoutInflater.from(getActivity()).inflate(R.layout.header_jx, null);
        mJxMain.addHeaderView(header);

        mJxBanner = (ViewPager) header.findViewById(R.id.header_banner);
        mJxOne = (ImageView) header.findViewById(R.id.dic_1);
        mJxTwo = (ImageView) header.findViewById(R.id.dic_2);
        mJxThree = (ImageView) header.findViewById(R.id.dic_3);
        mJxFour = (ImageView) header.findViewById(R.id.dic_4);
        mJxFive = (ImageView) header.findViewById(R.id.dic_5);

        mList = new ArrayList<>();
        ImageView mView;
        for (int i = 0; i < images.length; i++)
        {
            mView = new ImageView(getActivity());
            Picasso.with(getActivity()).load(images[i]).resize(621, 238).into(mView);
            mList.add(mView);
        }

        mJxBanner.setAdapter(new BannerAdapter());
        isStart = true;
        startBanner();
    }

    @Override
    public void startdestroy()
    {
        mUnbinder.unbind();
        mAdapter = null;
        mList = null;
        mHandler = null;
    }


    /**
     * 重置指示器
     */
    private void resetDic()
    {
        mJxOne.setBackgroundResource(R.drawable.shape_jx_circle_c);
        mJxTwo.setBackgroundResource(R.drawable.shape_jx_circle_c);
        mJxThree.setBackgroundResource(R.drawable.shape_jx_circle_c);
        mJxFour.setBackgroundResource(R.drawable.shape_jx_circle_c);
        mJxFive.setBackgroundResource(R.drawable.shape_jx_circle_c);
    }

    private void startBanner()
    {
        new Thread()
        {
            @Override
            public void run()
            {
                super.run();
                int position = 0;
                while (isStart)
                {
                    mHandler.sendEmptyMessage(position++);
                    try
                    {
                        Thread.sleep(5000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }


    /**
     * 图片Banner滚动播放器
     */
    private class BannerAdapter extends PagerAdapter
    {

        @Override
        public int getCount()
        {
            return images.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object)
        {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object)
        {
            container.removeView((View) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position)
        {
            container.addView(mList.get(position));
            return mList.get(position);
        }
    }

    @Override
    public void onPause()
    {
        super.onPause();
        isStart = false;
    }


    @Override
    public void onResume()
    {
        super.onResume();
        isStart = true;
    }
}

