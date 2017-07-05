package com.yianke.pet.view.fragment;

import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;
import com.yianke.pet.R;
import com.yianke.pet.adapter.PintuanAdapter;
import com.yianke.pet.adapter.shop.ShopAdapter;
import com.yianke.pet.model.shop.Pintuan;
import com.yianke.pet.model.shop.ShopModel;
import com.yianke.pet.utils.BaseHandler;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 作者：${赵若位} on 2017/6/3 23:06
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class ShoppingFragment extends BaseFragment
{

    @BindView(R.id.shop_main)
    ListView mShopMain;
    //轮播指示器
    ImageView mIndic1;
    ImageView mIndic2;
    ImageView mIndic3;
    ImageView mIndic4;
    ImageView mIndic5;


    private Unbinder mUnbinder;

    private View header;

    private ShopAdapter mAdapter;
    private List<ShopModel> mList;


    private int[] images =
            {
                    R.drawable.banner_shop1,
                    R.drawable.banner_shop2,
                    R.drawable.banner_shop3,
                    R.drawable.banner_shop4,
                    R.drawable.banner_shop5
            };
    private List<ImageView> mViewList;
    private boolean isStart = false;
    private ViewPager mHeaderBanner;
    private BaseHandler<ShoppingFragment> mHandler = new BaseHandler<ShoppingFragment>(this)
    {
        @Override
        public void handleMessage(Message msg)
        {
            super.handleMessage(msg);
            resetIndic();
            switch (msg.what)
            {
                case 0:
                    mIndic1.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                    mHeaderBanner.setCurrentItem(0);
                    break;
                case 1:
                    mIndic2.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                    mHeaderBanner.setCurrentItem(1);
                    break;
                case 2:
                    mIndic3.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                    mHeaderBanner.setCurrentItem(2);
                    break;
                case 3:
                    mIndic4.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                    mHeaderBanner.setCurrentItem(3);
                    break;
                case 4:
                    mIndic5.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_ff);
                    mHeaderBanner.setCurrentItem(4);
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    public int getResource()
    {
        return R.layout.fragment_shopping;
    }

    @Override
    public void init(View view)
    {
        mUnbinder = ButterKnife.bind(this, view);
        initHeader();
        mShopMain.addHeaderView(header);
        mList = new ArrayList<>();
        mList.add(new ShopModel("主粮零食", R.drawable.shop_parent1, new int[]{R.drawable.shop_child1, R.drawable.shop_child2, R.drawable.shop_child3, R.drawable.shop_child4,
                R.drawable.shop_child5, R.drawable.shop_child6, R.drawable.shop_child7, R.drawable.shop_child8, R.drawable.shop_child9}));

        mList.add(new ShopModel("医疗保健", R.drawable.shop_parent2, new int[]{R.drawable.shop_child10, R.drawable.shop_child11, 0, R.drawable.shop_child12, R.drawable.shop_child13, 0,
                R.drawable.shop_child14, 0, R.drawable.shop_child15}));

        mList.add(new ShopModel("玩具用品", R.drawable.shop_parent3, new int[]{R.drawable.shop_child16, R.drawable.shop_child17, R.drawable.shop_child18, R.drawable.shop_child19,
                R.drawable.shop_child20, R.drawable.shop_child21, R.drawable.shop_child22, R.drawable.shop_child23, R.drawable.shop_child24}));


        mAdapter = new ShopAdapter(getActivity(), mList);
        mShopMain.setAdapter(mAdapter);
        initFooter();
    }

    private void initFooter()
    {
        View footer = LayoutInflater.from(getActivity()).inflate(R.layout.item_shopping_footer, null);
        AutoUtils.autoSize(footer);
        mShopMain.addFooterView(footer);
    }

    /**
     * 初始化顶部
     */
    private void initHeader()
    {
        List<Pintuan> mList = new ArrayList<>();
        mList.add(new Pintuan(R.drawable.pintuan_one, "【天然健康膳\n食狗粮，提升...", 39.9, 99));
        mList.add(new Pintuan(R.drawable.pintuan_two, "【适合搭配\n各类猫砂使用...", 29, 62));
        mList.add(new Pintuan(R.drawable.pintuan_three, "【温和配方,\n消炎止痒，抗...", 25, 40));
        mList.add(new Pintuan(R.drawable.pintuan_four, "【精致牛肉肉\n粒，美味有营...", 9.9, 35));
        mList.add(new Pintuan(R.drawable.pintuan_five, "【营养护理系\n列零食，美毛...", 19.9, 39));
        mList.add(new Pintuan(R.drawable.pintuan_six, "【买即送罐\n头】贵族鸸鹋...", 59, 125));
        mList.add(new Pintuan(R.drawable.pintuan_seven, "派地奥 盒装乳\n胶犬用玩具 宠...", 15.9, 35));
        mList.add(new Pintuan(R.drawable.pintuan_eight, "【满99送大礼\n包】 大宠爱 体...", 219, 438));
        mList.add(new Pintuan(R.drawable.pintuan_nine, "柏可心 猫薄荷\n猫零食 天然4...", 6.9, 19));

        header = LayoutInflater.from(getActivity()).inflate(R.layout.header_shopping, null);
        RecyclerView mHeaderMain = (RecyclerView) header.findViewById(R.id.header_recycler);
        mHeaderBanner = (ViewPager) header.findViewById(R.id.header_banner);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        mHeaderMain.setLayoutManager(manager);
        mHeaderMain.setAdapter(new PintuanAdapter(mList, getActivity()));
        mHeaderMain.setNestedScrollingEnabled(false);

        mIndic1 = (ImageView) header.findViewById(R.id.indic1);
        mIndic2 = (ImageView) header.findViewById(R.id.indic2);
        mIndic3 = (ImageView) header.findViewById(R.id.indic3);
        mIndic4 = (ImageView) header.findViewById(R.id.indic4);
        mIndic5 = (ImageView) header.findViewById(R.id.indic5);

        mViewList = new ArrayList<>();
        for (int i = 0; i < images.length; i++)
        {

            ImageView mView = new ImageView(getActivity());
            Picasso.with(getActivity()).load(images[i]).resize(621, 237).centerCrop().into(mView);
            mViewList.add(mView);
        }
        mHeaderBanner.setAdapter(new BannerAdapter());

        mHeaderBanner.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
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
        isStart = true;
        startBanner();
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

    //重置指示器背景
    private void resetIndic()
    {
        mIndic1.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
        mIndic2.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
        mIndic3.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
        mIndic4.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
        mIndic5.setBackgroundResource(R.drawable.shape_msg_tuijian_circle_f4);
    }

    @Override
    public void loadingDatas()
    {

    }

    @Override
    public void startdestroy()
    {
        mUnbinder.unbind();
        mAdapter = null;
        mList = null;
    }


    //顶部轮播适配器
    private class BannerAdapter extends PagerAdapter
    {

        @Override
        public int getCount()
        {
            return mViewList == null ? 0 : mViewList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object)
        {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position)
        {
            container.addView(mViewList.get(position));
            return mViewList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object)
        {
            container.removeView((View) object);
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
