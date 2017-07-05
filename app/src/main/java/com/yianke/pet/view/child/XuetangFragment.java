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
import butterknife.Unbinder;

/**
 * 作者：赵若位
 * 时间：2017/6/19 19:34
 * 功能：
 */

public class XuetangFragment extends BaseFragment
{
    @BindView(R.id.xuetang_lists)
    ListView mXuetangLists;
    Unbinder unbinder;


    private MsgChildAdapter mAdapter;
    private List<MsgChildModel> mList;

    @Override
    public int getResource()
    {
        return R.layout.fragment_xuetang;
    }

    @Override
    public void init(View view)
    {
        unbinder = ButterKnife.bind(this, view);
        mList = new ArrayList<>();
        mList.add(new MsgChildModel("拉布拉多和金毛的区别",false,false,"刀斥",52000,R.drawable.xuetang1));
        mList.add(new MsgChildModel("不要再咬我的袜子",false,false,"娜酷子",1000,R.drawable.xuetang2));
        mList.add(new MsgChildModel("子宫蓄脓+膀胱结石=小宝的痛苦",false,false,"派美特长青宠物医院",1000,R.drawable.xuetang3));
        mList.add(new MsgChildModel("炎炎夏日，狂洗澡&剃光狗狗的毛就对了？",false,false,"哦四姑",10000,R.drawable.xuetang4));
        mList.add(new MsgChildModel("市面疫苗种类那么多，我们该怎么选择？",false,false,"来份豆沙包",2658,R.drawable.xuetang5));
        mList.add(new MsgChildModel("喜欢偷吃的喵星人",false,false,"来份豆沙包",2019,R.drawable.xuetang6));
        mList.add(new MsgChildModel("与犬疫苗接种相关的常见问题",false,false,"娜酷子",2398,R.drawable.xuetang7));
        mList.add(new MsgChildModel("母犬的假孕",false,false,"来份豆沙包",2419,R.drawable.xuetang8));
        mList.add(new MsgChildModel("你的兔子有脚炎吗？",false,false,"刀斥",1339,R.drawable.xuetang9));
        mList.add(new MsgChildModel("因肾衰竭而呕吐，抽搐的TA，在这里恢复了健康",false,false,"芭比唐堂",2179,R.drawable.xuetang10));
        mList.add(new MsgChildModel("犬猫胰腺炎",false,false,"来份豆沙包",959,R.drawable.xuetang11));
        mList.add(new MsgChildModel("夏天要格外小心体表寄生虫病！",false,false,"来份豆沙包",1719,R.drawable.xuetang12));

        mXuetangLists.setAdapter(mAdapter = new MsgChildAdapter(mList,getActivity()));
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
