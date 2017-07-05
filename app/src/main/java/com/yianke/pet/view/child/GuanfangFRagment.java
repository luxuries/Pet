package com.yianke.pet.view.child;

import android.view.View;
import android.widget.ListView;

import com.yianke.pet.R;
import com.yianke.pet.adapter.msg.MsgChildAdapter;
import com.yianke.pet.model.msg.MsgChildModel;
import com.yianke.pet.view.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 作者：赵若位
 * 时间：2017/6/19 19:34
 * 功能：
 */

public class GuanfangFRagment extends BaseFragment
{
    @BindView(R.id.guanfang_lists)
    ListView mGuanList;
    private Unbinder mUnbinder;


    private List<MsgChildModel> mList;
    private MsgChildAdapter mAdapter;

    @Override
    public int getResource()
    {
        return R.layout.fragment_guanfang;
    }

    @Override
    public void init(View view)
    {
        mUnbinder = ButterKnife.bind(this, view);
        mList = new ArrayList<>();
        mList.add(new MsgChildModel("北京缉私犬基地将举办“国际禁毒日”宣传活动",false,false,"有宠小记者",499,R.drawable.guanfang1));
        mList.add(new MsgChildModel("有宠福利购第八期来了，这次是个大手笔",false,false,"有宠小记者",15000,R.drawable.guanfang2));
        mList.add(new MsgChildModel("这家最美宠物店，连鹿晗都要亲自做饭给店里员工吃！",false,false,"有宠小记者",49900,R.drawable.guanfang3));
        mList.add(new MsgChildModel("【有宠推新品】“有宠蛋蛋”便携铲屎神器！",false,false,"有宠小记者",18000,R.drawable.guanfang4));
        mList.add(new MsgChildModel("搞事情！有宠宠物生活会馆进驻广州禺万达~",true,false,"有宠小记者",17000,R.drawable.guanfang5));
        mList.add(new MsgChildModel("有宠生而不凡 缔造互联网+宠物新模式",false,false,"有宠小记者",6419,R.drawable.guanfang6));
        mList.add(new MsgChildModel("带上你的爱宠，来一场说走就走的免费泡泡浴吧！",false,false,"有宠小记者",46000,R.drawable.guanfang7));
        mList.add(new MsgChildModel("有宠代表中国赴德出席2017FMBB比利时牧羊犬世界锦...",true,false,"刀斥",21000,R.drawable.guanfang8));
        mList.add(new MsgChildModel("《有宠YOURPET》杂志封面背后的故事",false,false,"有宠小记者",7819,R.drawable.guanfang9));
        mList.add(new MsgChildModel("温暖母亲节，虫虫现身担任拥抱大使~",false,false,"有宠小记者",4259,R.drawable.guanfang10));
        mList.add(new MsgChildModel("高雄街头掀起虫虫旋风，大人小孩都疯狂！",true,false,"有宠小记者",5259,R.drawable.guanfang11));
        mList.add(new MsgChildModel("有宠福利，逃脱游戏登场",true,false,"有宠小记者",5800,R.drawable.guanfang12));

        mGuanList.setAdapter(mAdapter = new MsgChildAdapter(mList, getActivity()));
    }

    @Override
    public void loadingDatas()
    {

    }

    @Override
    public void startdestroy()
    {
        mUnbinder.unbind();
    }
}
