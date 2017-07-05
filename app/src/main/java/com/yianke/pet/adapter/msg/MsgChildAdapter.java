package com.yianke.pet.adapter.msg;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;
import com.yianke.pet.R;
import com.yianke.pet.model.msg.MsgChildModel;
import com.yianke.pet.utils.CacheImageView;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by wei on 2017/6/18.
 */

public class MsgChildAdapter extends BaseAdapter
{
    private List<MsgChildModel> mList;
    private Context mContext;

    public MsgChildAdapter(List<MsgChildModel> list, Context context)
    {
        mList = list;
        mContext = context;
    }

    @Override
    public int getCount()
    {
        return mList == null ? 0 : mList.size();
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_msg_child, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
            AutoUtils.autoSize(convertView);
        } else
        {
            holder = (ViewHolder) convertView.getTag();
        }


        Picasso.with(mContext).load(mList.get(position).getResourceId()).resize(100,74).centerCrop().into(holder.mItemImage);

        holder.mItemTitle.setText(mList.get(position).getTitle());
        //是否置顶
        if (mList.get(position).isZhiding())
        {
            holder.mItemZhiding.setVisibility(View.VISIBLE);
        } else
        {
            holder.mItemZhiding.setVisibility(View.GONE);
        }
        //是否精选
        if (mList.get(position).isJingxuan())
        {
            holder.mItemJingxuan.setVisibility(View.VISIBLE);
        } else
        {
            holder.mItemJingxuan.setVisibility(View.GONE);
        }

        //作者
        holder.mItemAuthor.setText(mList.get(position).getAuthor());
        //关注度
        if (mList.get(position).getStars() >= 10000)
        {
            String s = String.valueOf(mList.get(position).getStars() / 10000);
            holder.mItemWatch.setText(s + "万");
        } else
        {
            holder.mItemWatch.setText(mList.get(position).getStars() + "");
        }
        return convertView;
    }


    class ViewHolder
    {
        @BindView(R.id.item_image)
        CacheImageView mItemImage;
        @BindView(R.id.item_title)
        TextView mItemTitle;
        @BindView(R.id.item_zhiding)
        TextView mItemZhiding;
        @BindView(R.id.item_jingxuan)
        TextView mItemJingxuan;
        @BindView(R.id.item_author)
        TextView mItemAuthor;
        @BindView(R.id.item_watch)
        TextView mItemWatch;

        ViewHolder(View view)
        {
            ButterKnife.bind(this, view);
        }
    }
}
