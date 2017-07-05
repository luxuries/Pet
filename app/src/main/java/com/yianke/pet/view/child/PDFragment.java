package com.yianke.pet.view.child;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.yianke.pet.R;
import com.yianke.pet.adapter.home.PDAdapter;
import com.yianke.pet.model.home.DTModel;
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

public class PDFragment extends BaseFragment
{
    @BindView(R.id.pd_main)
    ListView mPdMain;
    private Unbinder mUnbinder;

    private PDAdapter mAdapter;
    private int[] images =
            {
                    R.drawable.pd_1,
                    R.drawable.pd_2,
                    R.drawable.pd_3,
                    R.drawable.pd_4,
                    R.drawable.pd_5,
                    R.drawable.pd_6,
                    R.drawable.pd_7,
                    R.drawable.pd_8,
                    R.drawable.pd_9,
            };
    private List<DTModel> mList;


    @Override
    public int getResource()
    {
        return R.layout.fragment_pd;
    }

    @Override
    public void init(View view)
    {
        ButterKnife.bind(this, view);
        mList = new ArrayList<>();
        mList.add(new DTModel(R.drawable.jx_header,"Summer麻麻","#双子座萌宠#幺幺3岁了！对，3岁了。\\nsummer接回家的时候也就三个多月，我并不知道\\nsummer具体是哪一天，只知道是6月份，那么就跟麻麻",images));
        mList.add(new DTModel(R.drawable.jx_header,"Summer麻麻","#双子座萌宠#幺幺3岁了！对，3岁了。\\nsummer接回家的时候也就三个多月，我并不知道\\nsummer具体是哪一天，只知道是6月份，那么就跟麻麻",images));
        mList.add(new DTModel(R.drawable.jx_header,"Summer麻麻","#双子座萌宠#幺幺3岁了！对，3岁了。\\nsummer接回家的时候也就三个多月，我并不知道\\nsummer具体是哪一天，只知道是6月份，那么就跟麻麻",images));
        mList.add(new DTModel(R.drawable.jx_header,"Summer麻麻","#双子座萌宠#幺幺3岁了！对，3岁了。\\nsummer接回家的时候也就三个多月，我并不知道\\nsummer具体是哪一天，只知道是6月份，那么就跟麻麻",images));
        mList.add(new DTModel(R.drawable.jx_header,"Summer麻麻","#双子座萌宠#幺幺3岁了！对，3岁了。\\nsummer接回家的时候也就三个多月，我并不知道\\nsummer具体是哪一天，只知道是6月份，那么就跟麻麻",images));
        mList.add(new DTModel(R.drawable.jx_header,"Summer麻麻","#双子座萌宠#幺幺3岁了！对，3岁了。\\nsummer接回家的时候也就三个多月，我并不知道\\nsummer具体是哪一天，只知道是6月份，那么就跟麻麻",images));
        mPdMain.setAdapter(mAdapter = new PDAdapter(getActivity(),mList));
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
    }


}
