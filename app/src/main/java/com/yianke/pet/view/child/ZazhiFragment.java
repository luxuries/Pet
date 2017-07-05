package com.yianke.pet.view.child;

import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;
import com.yianke.pet.R;
import com.yianke.pet.adapter.msg.ZazhiAdapter;
import com.yianke.pet.model.msg.ZazhiModel;
import com.yianke.pet.utils.BaseHandler;
import com.yianke.pet.view.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 作者：赵若位
 * 时间：2017/6/19 19:34
 * 功能：资讯---杂志页面
 */

public class ZazhiFragment extends BaseFragment
{
    @BindView(R.id.zhazi_recycler)
    RecyclerView mZhaziRecycler;
    @BindView(R.id.zazhi_viewPager)
    ViewPager mZazhiViewPager;
    @BindView(R.id.inidc1)
    ImageView mInidc1;
    @BindView(R.id.inidc2)
    ImageView mInidc2;
    @BindView(R.id.inidc3)
    ImageView mInidc3;
    @BindView(R.id.inidc4)
    ImageView mInidc4;
    @BindView(R.id.inidc5)
    ImageView mInidc5;
    @BindView(R.id.titles)
    TextView mTitles;
    Unbinder unbinder;

    private List<ZazhiModel> mList;
    private ZazhiAdapter mAdapter;


    //*************************轮播滚动******************************//
    private int[] images =
            {
                    R.drawable.banner_zazhi1,
                    R.drawable.banner_zazhi2,
                    R.drawable.banner_zazhi3,
                    R.drawable.banner_zazhi4,
                    R.drawable.banner_zazhi5
            };
    private String[] titles =
            {
                    "封面故事--《家·猫·果实》",
                    "专题巨献--《帝苑猫说》",
                    "封面故事--《戏痞士与惊魂鸟》",
                    "活着--《生存游戏》",
                    "专题巨献--《猎场》"
            };
    private List<View> mViewList;
    private boolean isBanner = false;
    private BaseHandler<ZazhiFragment> mHandler = new BaseHandler<ZazhiFragment>(this)
    {
        @Override
        public void handleMessage(Message msg)
        {
            super.handleMessage(msg);
            mZazhiViewPager.setCurrentItem(msg.what % images.length);
        }
    };

    //*******************************************************//


    @Override
    public int getResource()
    {
        return R.layout.fragment_zhazi;
    }

    @Override
    public void init(View view)
    {
        unbinder = ButterKnife.bind(this, view);
        mList = new ArrayList<>();

        mList.add(new ZazhiModel(R.drawable.zazhi1, "第12期", "May.2017"));
        mList.add(new ZazhiModel(R.drawable.zazhi2, "第11期", "Apr.2017"));
        mList.add(new ZazhiModel(R.drawable.zazhi3, "第10期", "Mar.2017"));
        mList.add(new ZazhiModel(R.drawable.zazhi4, "第9期", "Feb.2017"));
        mList.add(new ZazhiModel(R.drawable.zazhi5, "第8期", "Jan.2017"));
        mList.add(new ZazhiModel(R.drawable.zazhi6, "第7期", "Dec.2016"));
        mList.add(new ZazhiModel(R.drawable.zazhi7, "第6期", "Nov.2016"));
        mList.add(new ZazhiModel(R.drawable.zazhi8, "第5期", "Oct.2016"));
        mList.add(new ZazhiModel(R.drawable.zazhi9, "第4期", "Sep.2016"));
        mList.add(new ZazhiModel(R.drawable.zazhi10, "第3期", "Aug.2016"));
        mList.add(new ZazhiModel(R.drawable.zazhi11, "第2期", "Jul.2016"));
        mList.add(new ZazhiModel(R.drawable.zazhi12, "第1期", "Jun.2016"));

        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mZhaziRecycler.setNestedScrollingEnabled(false);
        mZhaziRecycler.setLayoutManager(manager);
        mZhaziRecycler.setAdapter(mAdapter = new ZazhiAdapter(mList, getActivity()));

    }


    @Override
    public void loadingDatas()
    {
        mViewList = new ArrayList<>();
        for (int i = 0; i < images.length; i++)
        {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.header_msg_zazhi, null);
            ImageView simple = (ImageView) view.findViewById(R.id.item_images);
            TextView title = (TextView) view.findViewById(R.id.item_titles);
            Picasso.with(getActivity()).load(images[i]).resize(414,233).centerCrop().into(simple);
            title.setText(titles[i]);
            mViewList.add(view);
        }

        mZazhiViewPager.setAdapter(new ZazhiBanner());
        mZazhiViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {

            }

            @Override
            public void onPageSelected(int position)
            {
                resetIndic();
                switch (position)
                {
                    case 0:
                        mInidc1.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                        break;
                    case 1:
                        mInidc2.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                        break;
                    case 2:
                        mInidc3.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                        break;
                    case 3:
                        mInidc4.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                        break;
                    case 4:
                        mInidc5.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
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
        isBanner = true;
        startBanner();
    }

    private void resetIndic()
    {
        mInidc1.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
        mInidc2.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
        mInidc3.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
        mInidc4.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
        mInidc5.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
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
                while (isBanner)
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

    @Override
    public void onResume()
    {
        super.onResume();
        isBanner = true;
    }

    @Override
    public void onPause()
    {
        super.onPause();
        isBanner = false;
    }

    @Override
    public void startdestroy()
    {
        unbinder.unbind();
    }


    private class ZazhiBanner extends PagerAdapter
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
            container.addView(mViewList.get(position));

            return mViewList.get(position);
        }
    }
}
