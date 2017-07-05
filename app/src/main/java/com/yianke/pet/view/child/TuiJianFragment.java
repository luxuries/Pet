package com.yianke.pet.view.child;

import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;
import com.yianke.pet.R;
import com.yianke.pet.adapter.msg.MsgChildAdapter;
import com.yianke.pet.model.msg.MsgChildModel;
import com.yianke.pet.utils.BaseHandler;
import com.yianke.pet.utils.CacheImageView;
import com.yianke.pet.view.fragment.BaseFragment;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 作者：赵若位
 * 时间：2017-6-19 14：03
 * 功能：资讯页面-推荐
 */

public class TuiJianFragment extends BaseFragment
{


    @BindView(R.id.tuijian_lists)
    ListView mTuijianLists;
    Unbinder unbinder;


    private MsgChildAdapter mAdapter;
    private List<MsgChildModel> mList;


    //****************************Banner***************************//
    private List<View> mViewList;
    private View mView;


    private int[] images =//banner图片
            {
                    R.drawable.banner_tuijian1,
                    R.drawable.banner_tuijian2,
                    R.drawable.banner_tuijian3,
                    R.drawable.banner_tuijian4,
                    R.drawable.banner_tuijian5
            };
    private String[] titles =
            {
                    "有宠福利购第八期来了，这次是个大手笔",
                    "世界献血日，宠物用血为何这么难",
                    "有宠福布斯：探秘名画中的狗，哪些狗是画家...",
                    "宠事儿：宅男网红养成记",
                    "名撕其实：你走过狗屎运吗？"
            };

    //指示器
    private ImageView mIndic1;
    private ImageView mIndic2;
    private ImageView mIndic3;
    private ImageView mIndic4;
    private ImageView mIndic5;
    private ViewPager mBanner;

    private BaseHandler<TuiJianFragment> mHandler = new BaseHandler<TuiJianFragment>(this)
    {
        @Override
        public void handleMessage(Message msg)
        {
            super.handleMessage(msg);
            mBanner.setCurrentItem(msg.what % images.length);
            Log.e("info", "+++++++++++++轮播开启！！！！++++++++++++++++>");
        }
    };
    private boolean isBanner = false;//是否开启轮播图片
    //*******************************************************//


    @Override
    public int getResource()
    {
        return R.layout.fragment_tuijian;
    }

    @Override
    public void init(View view)
    {
        ButterKnife.bind(this, view);
        mList = new ArrayList<>();
        mList.add(new MsgChildModel("世界献血日，宠物用血为何这么难", true, true, "刀斥", 22000, R.drawable.tuijian1));
        mList.add(new MsgChildModel("牧羊犬眼部问题", false, false, "娜酷子", 1199, R.drawable.tuijian2));
        mList.add(new MsgChildModel("夜里鬼哭狼嚎的猫，可不止发情这么简单", false, false, "哦四姑", 2298, R.drawable.tuijian3));
        mList.add(new MsgChildModel("三款“板凳”狗，挑选你中意的腊肠犬", false, false, "娜酷子", 1839, R.drawable.tuijian4));
        mList.add(new MsgChildModel("有宠探访实录父亲节特辑：揭秘“种公犬”背后的故事", true, false, "阿汤", 7599, R.drawable.tuijian5));
        mList.add(new MsgChildModel("有宠三句半：东航又一金毛在托运中惨死", false, false, "阿汤", 32000, R.drawable.tuijian6));
        mList.add(new MsgChildModel("猫咪下巴变黑怎么办？", false, false, "娜酷子", 9678, R.drawable.tuijian7));
        mList.add(new MsgChildModel("猫形积木，吸猫新方式", false, false, "蒂娜", 11000, R.drawable.tuijian8));
        mList.add(new MsgChildModel("喵星人打哈欠只是因为困了吗？", false, false, "娜酷子", 9119, R.drawable.tuijian9));
        mList.add(new MsgChildModel("犬激光治疗，缓解炎症和疼痛的首选", false, false, "哦四姑", 3259, R.drawable.tuijian10));
        mList.add(new MsgChildModel("到底是什么引起的呕吐呢？", false, false, "来份豆沙包", 13000, R.drawable.tuijian11));
        mList.add(new MsgChildModel("动物咖啡馆再添新成员，猫头鹰味的可以“尝尝”", false, false, "小灰灰", 5959, R.drawable.tuijian12));
        mList.add(new MsgChildModel("这个世界能不能对我好一点？别让我这么尴尬？", false, false, "云宁", 7879, R.drawable.tuijian13));
        mList.add(new MsgChildModel("挺可爱的小金毛，却长了一张忧国忧民的脸......", false, false, "苗仔", 16000, R.drawable.tuijian14));
        mList.add(new MsgChildModel("自从隔壁开了炸鸡店 哈士奇有了很大的转变", false, false, "苗仔", 18000, R.drawable.tuijian15));
        mList.add(new MsgChildModel("印度女用乳房喂牛吃奶 非洲小孩在全身；涂抹粪便", false, false, "蒂娜", 12000, R.drawable.tuijian16));
        mList.add(new MsgChildModel("来京旅游的亲戚趁主人不在把老猫扔了", false, false, "云宁", 12000, R.drawable.tuijian17));
        mList.add(new MsgChildModel("托运之痛：回家的旅程，竟是一场血淋林的惊魂记", true, true, "欢喜", 87000, R.drawable.tuijian18));
        mTuijianLists.setAdapter(mAdapter = new MsgChildAdapter(mList, getActivity()));
    }

    @Override
    public void loadingDatas()
    {
        //加载ListView顶部banner以及搜索框
        View header = LayoutInflater.from(getActivity()).inflate(R.layout.header_msg_tuijian, null);
        mTuijianLists.addHeaderView(header);
        mViewList = new ArrayList<>();

        mIndic1 = (ImageView) header.findViewById(R.id.indic1);
        mIndic2 = (ImageView) header.findViewById(R.id.indic2);
        mIndic3 = (ImageView) header.findViewById(R.id.indic3);
        mIndic4 = (ImageView) header.findViewById(R.id.indic4);
        mIndic5 = (ImageView) header.findViewById(R.id.indic5);


        //banner装配数据
        for (int i = 0; i < 5; i++)
        {
            mView = LayoutInflater.from(getActivity()).inflate(R.layout.item_msg_tuijian_banner, null);
            ImageView mBannerImage = (ImageView) mView.findViewById(R.id.banner_image);
            TextView mBannerTitle = (TextView) mView.findViewById(R.id.banner_titles);

            Picasso.with(getActivity()).load(images[i]).resize(400,205).into(mBannerImage);
            mBannerTitle.setText(titles[i]);
            mViewList.add(mView);
        }

        mBanner = (ViewPager) header.findViewById(R.id.banner_ViewPager);
        mBanner.setAdapter(new HeaderViewPager());

        mBanner.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
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
                        mIndic1.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                        break;
                    case 1:
                        mIndic2.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                        break;
                    case 2:
                        mIndic3.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                        break;
                    case 3:
                        mIndic4.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                        break;
                    case 4:
                        mIndic5.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
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

    //开启图片轮播
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
                        Thread.sleep(3000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }


    //banner适配器
    private class HeaderViewPager extends PagerAdapter
    {

        @Override
        public int getCount()
        {
            return 5;
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


    @Override
    public void startdestroy()
    {
        unbinder.unbind();
    }


    private void resetIndic()
    {
        mIndic1.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
        mIndic2.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
        mIndic3.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
        mIndic4.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
        mIndic5.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
    }


}
