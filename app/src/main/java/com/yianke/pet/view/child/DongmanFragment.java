package com.yianke.pet.view.child;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.yianke.pet.R;
import com.yianke.pet.adapter.msg.MsgChildAdapter;
import com.yianke.pet.model.msg.MsgChildModel;
import com.yianke.pet.view.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/6/19 19:33
 * 功能：资讯页面-动漫
 */

public class DongmanFragment extends BaseFragment
{
    @BindView(R.id.dongman_lists)
    ListView mDongmanLists;

    private List<MsgChildModel> mList;
    private MsgChildAdapter mAdapter;

    @Override
    public int getResource()
    {
        return R.layout.fragment_dongman;
    }

    @Override
    public void init(View view)
    {
        ButterKnife.bind(this, view);
        mList = new ArrayList<>();
        mList.add(new MsgChildModel("《瑞兽》父亲节--特别篇","果脯儿",4256,R.drawable.dongman1));
        mList.add(new MsgChildModel("瑞兽--救命恩猫（下）","宋霸霸 小铁&毛大侠 暖气仔",9999,R.drawable.dongman2));
        mList.add(new MsgChildModel("瑞兽--救命恩猫（上）","宋霸霸 小铁&果脯儿 军统小队长",13000,R.drawable.dongman3));
        mList.add(new MsgChildModel("瑞兽--猫落平阳被犬欺（下）",true,false,"宋霸霸 小铁&果脯儿 军统小队长",17000,R.drawable.dongman4));
        mList.add(new MsgChildModel("瑞兽--高清福利图",true,false,"果脯儿&军统小队长",29000,R.drawable.dongman5));
        mList.add(new MsgChildModel("樱花苹果派","大贝贝",619,R.drawable.dongman6));
        mList.add(new MsgChildModel("家有萌喵--奥利奥的故事（一）","兔子猫",1657,R.drawable.dongman7));
        mList.add(new MsgChildModel("徐芝麻--番外2","原作冬瓜茶仙人&画手嘤嘤嘤因",1518,R.drawable.dongman8));
        mList.add(new MsgChildModel("影子猫--技巧，规则与天赋","牧羊阿卡",1679,R.drawable.dongman9));
        mList.add(new MsgChildModel("抖抖村--另一个世界","DDM大王",2103,R.drawable.dongman10));

        mDongmanLists.setAdapter(mAdapter = new MsgChildAdapter(mList, getActivity()));
    }

    @Override
    public void loadingDatas()
    {

    }

    @Override
    public void startdestroy()
    {

    }

}
