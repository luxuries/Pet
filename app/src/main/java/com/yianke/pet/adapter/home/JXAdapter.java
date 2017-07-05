package com.yianke.pet.adapter.home;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;
import com.yianke.pet.R;
import com.yianke.pet.model.home.JXModel;
import com.yianke.pet.utils.CacheImageView;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.utils.AutoUtils;


import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：${赵若位} on 2017/6/6 11:41
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class JXAdapter extends BaseAdapter
{
    private Context mContext;
    private List<JXModel> mList;
    private Object mTag;

    public JXAdapter(Context context, List<JXModel> list)
    {
        mContext = context;
        mList = list;
        mTag = new Object();
    }

    @Override
    public int getCount()
    {
        return mList == null?0:mList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder = null;
        if (convertView == null)
        {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_home_jx, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
            AutoUtils.autoSize(convertView);
        } else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.mUserHeaderImg.setImageURI(Uri.parse("res://.../" + mList.get(position).getHeaderImg()));//头像
        holder.mUserPetImg.setImageURI(Uri.parse("res://.../" + mList.get(position).getUserImg()));//宠物头像



//        holder.mItemImg.setImageURI(Uri.parse("res://.../" + mList.get(position).getMainImg()));
        Picasso.with(mContext).load(mList.get(position).getMainImg()).resize(320,290).tag(mTag).centerCrop().into(holder.mItemImg);


        holder.mUserName.setText(mList.get(position).getUserName());
        holder.mUserPetName.setText(mList.get(position).getPetName());
        holder.mUserPetType.setText(mList.get(position).getPetType());

        return convertView;
    }

    static class ViewHolder
    {
        @BindView(R.id.user_headerImg)
        SimpleDraweeView mUserHeaderImg;
        @BindView(R.id.user_name)
        TextView mUserName;
        @BindView(R.id.user_air)
        TextView mUserAir;
        @BindView(R.id.user_pet_img)
        SimpleDraweeView mUserPetImg;
        @BindView(R.id.user_pet_name)
        TextView mUserPetName;
        @BindView(R.id.user_pet_type)
        TextView mUserPetType;
        @BindView(R.id.user_pet_footer)
        ImageView mUserPetFooter;
        @BindView(R.id.user_pet)
        AutoLinearLayout mUserPet;
        @BindView(R.id.item_img)
        CacheImageView mItemImg;
        @BindView(R.id.item_descript)
        TextView mItemDescript;

        ViewHolder(View view)
        {
            ButterKnife.bind(this, view);
        }
    }
}
