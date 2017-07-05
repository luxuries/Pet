package com.yianke.pet.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;
import com.yianke.pet.R;
import com.yianke.pet.model.shop.Pintuan;
import com.yianke.pet.utils.CacheImageView;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by new4 on 2017/6/5.
 */

public class PintuanAdapter extends RecyclerView.Adapter<PintuanAdapter.ViewHolder>
{

    private List<Pintuan> mList;
    private Context mContext;

    public PintuanAdapter(List<Pintuan> list, Context context)
    {
        mList = list;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        ViewHolder holder = null;
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_pintuan, parent, false);
        holder = new ViewHolder(view);
        AutoUtils.autoSize(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
//        holder.mItemImg.setImageURI(Uri.parse("res://.../" + mList.get(position).getImageId()));

        Picasso.with(mContext).load(mList.get(position).getImageId()).resize(400,400).centerCrop().into(holder.mItemImg);

        holder.mItemDescript.setText(mList.get(position).getDescript());
        holder.mItemMutchOne.setText("￥" + mList.get(position).getMutch_one());
        holder.mItemMutchTwo.setText("￥" + mList.get(position).getMutch_two());
    }

    @Override
    public int getItemCount()
    {
        return mList == null ? 0 : mList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.item_img)
        ImageView mItemImg;
        @BindView(R.id.item_descript)
        TextView mItemDescript;
        @BindView(R.id.item_mutchOne)
        TextView mItemMutchOne;
        @BindView(R.id.item_mutchTwo)
        TextView mItemMutchTwo;

        public ViewHolder(View itemView)
        {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
