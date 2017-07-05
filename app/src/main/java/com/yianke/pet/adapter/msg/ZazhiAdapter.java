package com.yianke.pet.adapter.msg;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeController;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.squareup.picasso.Picasso;
import com.yianke.pet.R;
import com.yianke.pet.model.msg.ZazhiModel;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：赵若位
 * 时间：2017/6/20 09:44
 * 功能：
 */


public class ZazhiAdapter extends RecyclerView.Adapter<ZazhiAdapter.ViewHolder>
{
    private List<ZazhiModel> mList;
    private Context mContext;


    public ZazhiAdapter(List<ZazhiModel> list, Context context)
    {
        mList = list;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int position)
    {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_msg_zazhi, null);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Picasso.with(mContext).load(mList.get(position).getImage()).resize(116,155).centerCrop().into(holder.mItemView);
        holder.mItemName.setText(mList.get(position).getNames());
        holder.mItemTimes.setText(mList.get(position).getTimes());
    }

    @Override
    public int getItemCount()
    {
        return mList == null ? 0 : mList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.item_parents)
        AutoLinearLayout mItemParents;
        @BindView(R.id.item_image)
        SimpleDraweeView mItemView;
        @BindView(R.id.item_name)
        TextView mItemName;
        @BindView(R.id.item_times)
        TextView mItemTimes;

        public ViewHolder(View itemView)
        {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}

