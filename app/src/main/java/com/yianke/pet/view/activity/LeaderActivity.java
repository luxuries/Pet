package com.yianke.pet.view.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yianke.pet.R;
import com.yianke.pet.config.Config;
import com.yianke.pet.utils.StatusBarUtils;
import com.zhy.autolayout.AutoLinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LeaderActivity extends AppCompatActivity
{

    @BindView(R.id.leader_img)
    ViewPager mLeaderImg;
    @BindView(R.id.leader_circle)
    AutoLinearLayout mLeaderCircle;
    @BindView(R.id.leader_red)
    ImageView mLeaderRed;

    //引导页具体的图片
    private List<View> mViewList;
    private View mView;
    private int left;//左边间距
    private int mImgIndex = 0;
    private ValueAnimator animator;

    public static LeaderActivity instance = null;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setWindowStatusBarColor(this, R.color.colorWhite);
        setContentView(R.layout.activity_leader);
        ButterKnife.bind(this);
        instance = this;
        init();
    }

    //初始化控件
    private void init()
    {
        initCircles();
        mLeaderImg.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {
                float leftMargin = left * (position + positionOffset);
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) mLeaderRed.getLayoutParams();
                params.leftMargin = Math.round(leftMargin);
                mLeaderRed.setLayoutParams(params);
            }

            @Override
            public void onPageSelected(int position)
            {
                switch (position)
                {
                    case 0:
                        startAnimation(0);
                        break;
                    case 1:
                        startAnimation(1);
                        break;
                    case 2:
                        startAnimation(2);
                        break;
                    case 3:
                        startAnimation(3);
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
        mLeaderImg.setAdapter(new LeaderAdapter());
        startAnimation(0);
    }

    //初始化引导页指示器
    private void initCircles()
    {
        mViewList = new ArrayList<>();
        for (int i = 0; i < 4; i++)
        {
            mView = LayoutInflater.from(this).inflate(R.layout.item_leader_viewpager, null);
            TextView top = (TextView) mView.findViewById(R.id.leader_top);
            TextView second = (TextView) mView.findViewById(R.id.leader_second);
            top.setText(Config.LEADER_TOP[i]);
            second.setText(Config.LEADER_SECONG[i]);
            mViewList.add(mView);
        }

        mLeaderRed.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
        {
            @Override
            public void onGlobalLayout()
            {
                left = mLeaderCircle.getChildAt(1).getLeft() - mLeaderCircle.getChildAt(0).getLeft();
            }
        });

    }

    /**
     * 开始
     *
     * @param position
     */
    private void startAnimation(final int position)
    {
        final ImageView simple = (ImageView) mViewList.get(position).findViewById(R.id.leader_img);
        animator = ValueAnimator.ofFloat(0, 1.0f);
        animator.setInterpolator(new LinearInterpolator());
        animator.setRepeatCount(-1);
        animator.setDuration(50);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
        {
            @Override
            public void onAnimationUpdate(ValueAnimator animation)
            {

            }
        });
        animator.addListener(new AnimatorListenerAdapter()
        {
            @Override
            public void onAnimationRepeat(Animator animation)
            {
                super.onAnimationRepeat(animation);
                switch (position)
                {
                    case 0:
                        simple.setImageResource(Config.IMG_ONE[mImgIndex]);
                        if (mImgIndex == Config.IMG_ONE.length - 1)
                        {
                            mImgIndex = 0;
                            animator.end();
                        }
                        break;
                    case 1:
                        simple.setImageResource(Config.IMG_TWO[mImgIndex]);
                        if (mImgIndex == Config.IMG_TWO.length - 1)
                        {
                            mImgIndex = 0;
                            animator.end();
                        }
                        break;
                    case 2:
                        simple.setImageResource(Config.IMG_THREE[mImgIndex]);
                        if (mImgIndex == Config.IMG_THREE.length - 1)
                        {
                            mImgIndex = 0;
                            animator.end();
                        }
                        break;
                    case 3:
                        simple.setImageResource(Config.IMG_FOUR[mImgIndex]);
                        if (mImgIndex == Config.IMG_FOUR.length - 1)
                        {
                            mImgIndex = 0;
                            animator.end();
                        }
                        break;
                    default:
                        break;
                }
                mImgIndex++;
            }
        });
        animator.start();
    }


    //点击事件监听
    @OnClick({R.id.leader_register, R.id.leader_login})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.leader_register:
                startActivity(new Intent(instance, RegisterActivity.class));
                finish();
                break;
            case R.id.leader_login:
                startActivity(new Intent(LeaderActivity.this, LoginActivity.class));
                finish();
                break;
            default:
                break;
        }
    }


    //ViewPager适配器
    private class LeaderAdapter extends PagerAdapter
    {
        @Override
        public int getCount()
        {
            return 4;
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


}
