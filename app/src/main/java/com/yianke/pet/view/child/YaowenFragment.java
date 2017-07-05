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
 * 时间：2017/6/19 14:07
 * 功能：资讯页面-要闻
 */
public class YaowenFragment extends BaseFragment
{
    @BindView(R.id.yaowen_list)
    ListView mYaowenList;
    private MsgChildAdapter mAdapter;


    private List<MsgChildModel> mList;


    @Override
    public int getResource()
    {
        return R.layout.fragment_yaowen;
    }

    @Override
    public void init(View view)
    {
        ButterKnife.bind(this, view);
        mList = new ArrayList<>();
        mList.add(new MsgChildModel("又当爹又当妈的动物奶爸，怎么这么迷人",false,false,"蒂娜",4191,R.drawable.yaowen1));
        mList.add(new MsgChildModel("金毛每天早上叼着钱为主人买早餐",false,false,"苗仔",5178,R.drawable.yaowen2));
        mList.add(new MsgChildModel("又来一个情敌，真烦！它有我好看吗？！",false,false,"云宁",4679,R.drawable.yaowen3));
        mList.add(new MsgChildModel("大金毛与奶奶相依为伴，成为田间最靓丽的风景线",false,false,"金毛总动员",8209,R.drawable.yaowen4));
        mList.add(new MsgChildModel("这只狗狗拥有独特的表情 大家看见它都会非常高兴",false,false,"苗仔",5038,R.drawable.yaowen5));
        mList.add(new MsgChildModel("前途无量的警犬，却偏偏走了另一种狗生",false,false,"小灰灰",4238,R.drawable.yaowen6));
        mList.add(new MsgChildModel("法斗犬秒变贴心小棉袄 为睡觉中的主人盖被子",false,false,"苗仔",14000,R.drawable.yaowen7));
        mList.add(new MsgChildModel("主人离家一年 再次回来后狗狗的举动像个个孩子",false,false,"苗仔",6939,R.drawable.yaowen8));
        mList.add(new MsgChildModel("主人患病期间金毛离家出走，家人找回后反而更加疼爱",false,false,"金毛总动员",8579,R.drawable.yaowen9));
        mList.add(new MsgChildModel("世界上竟然还有长相这么怪异的稀有动物！",false,false,"蒂娜",5039,R.drawable.yaowen10));

        mYaowenList.setAdapter(mAdapter = new MsgChildAdapter(mList, getActivity()));
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
