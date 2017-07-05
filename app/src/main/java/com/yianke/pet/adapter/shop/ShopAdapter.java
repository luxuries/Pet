package com.yianke.pet.adapter.shop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.yianke.pet.R;
import com.yianke.pet.model.shop.ShopModel;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：${赵若位} on 2017/6/7 11:12
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class ShopAdapter extends BaseAdapter
{
    private Context mContext;
    private List<ShopModel> mList;
    private LinearLayout.LayoutParams left;
    private LinearLayout.LayoutParams right;
    private int width;


    public ShopAdapter(Context context, List<ShopModel> list)
    {
        mContext = context;
        mList = list;
        width = getScreenWidth();
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_shopping, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
            AutoUtils.autoSize(convertView);
        } else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.mItemTitle.setText(mList.get(position).getTitles());
        Picasso.with(mContext).load(mList.get(position).getImage()).resize(621, 186).centerCrop().into(holder.mItemImages);

        if (position == 0)
        {
            Picasso.with(mContext).load(mList.get(position).getImages()[0]).fit().into(holder.mImage1);
            Picasso.with(mContext).load(mList.get(position).getImages()[1]).fit().into(holder.mImage2);
            Picasso.with(mContext).load(mList.get(position).getImages()[2]).fit().into(holder.mImage3);
            Picasso.with(mContext).load(mList.get(position).getImages()[3]).fit().into(holder.mImage4);
            Picasso.with(mContext).load(mList.get(position).getImages()[4]).fit().into(holder.mImage5);
            Picasso.with(mContext).load(mList.get(position).getImages()[5]).fit().into(holder.mImage6);
            Picasso.with(mContext).load(mList.get(position).getImages()[6]).fit().into(holder.mImage7);
            Picasso.with(mContext).load(mList.get(position).getImages()[7]).fit().centerCrop().into(holder.mImage8);
            Picasso.with(mContext).load(mList.get(position).getImages()[8]).fit().centerCrop().into(holder.mImage9);
            left = new LinearLayout.LayoutParams(width/2, width/4);
            right = new LinearLayout.LayoutParams(width/4, width/4);
            holder.mImage1.setLayoutParams(left);
            holder.mImage2.setLayoutParams(right);
            holder.mImage3.setLayoutParams(right);
            holder.mImage4.setLayoutParams(left);
            holder.mImage5.setLayoutParams(right);
            holder.mImage6.setLayoutParams(right);

        } else if (position == 1)
        {

            Picasso.with(mContext).load(mList.get(position).getImages()[0]).fit().into(holder.mImage1);
            Picasso.with(mContext).load(mList.get(position).getImages()[1]).fit().into(holder.mImage2);
            Picasso.with(mContext).load(mList.get(position).getImages()[3]).fit().into(holder.mImage4);
            Picasso.with(mContext).load(mList.get(position).getImages()[4]).fit().into(holder.mImage5);
            Picasso.with(mContext).load(mList.get(position).getImages()[6]).fit().into(holder.mImage7);
            Picasso.with(mContext).load(mList.get(position).getImages()[8]).fit().into(holder.mImage9);

            holder.mImage3.setVisibility(View.GONE);
            holder.mImage6.setVisibility(View.GONE);
            holder.mImage8.setVisibility(View.GONE);

            left = new LinearLayout.LayoutParams(width/2, width/4, 1);
            right = new LinearLayout.LayoutParams(width/2, width/4, 1);
            holder.mImage1.setLayoutParams(left);
            holder.mImage2.setLayoutParams(right);
            holder.mImage4.setLayoutParams(left);
            holder.mImage5.setLayoutParams(right);

        } else if (position == 2)
        {
            Picasso.with(mContext).load(mList.get(position).getImages()[0]).resize(480,480).centerInside().into(holder.mImage1);
            Picasso.with(mContext).load(mList.get(position).getImages()[1]).resize(480,480).centerInside().into(holder.mImage2);
            Picasso.with(mContext).load(mList.get(position).getImages()[2]).resize(480,480).centerInside().into(holder.mImage3);
            Picasso.with(mContext).load(mList.get(position).getImages()[3]).into(holder.mImage4);
            Picasso.with(mContext).load(mList.get(position).getImages()[4]).into(holder.mImage5);
            Picasso.with(mContext).load(mList.get(position).getImages()[5]).into(holder.mImage6);
            Picasso.with(mContext).load(mList.get(position).getImages()[6]).fit().into(holder.mImage7);
            Picasso.with(mContext).load(mList.get(position).getImages()[7]).fit().into(holder.mImage8);
            Picasso.with(mContext).load(mList.get(position).getImages()[8]).fit().into(holder.mImage9);

            left = new LinearLayout.LayoutParams(width/3, width/3, 1);
            right = new LinearLayout.LayoutParams(width/3, width/3, 1);
            holder.mImage1.setLayoutParams(left);
            holder.mImage2.setLayoutParams(right);
            holder.mImage3.setLayoutParams(right);

            holder.mImage4.setLayoutParams(left);
            holder.mImage5.setLayoutParams(right);
            holder.mImage6.setLayoutParams(right);
        }
        return convertView;
    }


    class ViewHolder
    {
        @BindView(R.id.item_title)
        TextView mItemTitle;
        @BindView(R.id.item_images)
        ImageView mItemImages;
        @BindView(R.id.image1)
        ImageView mImage1;
        @BindView(R.id.image2)
        ImageView mImage2;
        @BindView(R.id.image3)
        ImageView mImage3;
        @BindView(R.id.image4)
        ImageView mImage4;
        @BindView(R.id.image5)
        ImageView mImage5;
        @BindView(R.id.image6)
        ImageView mImage6;
        @BindView(R.id.image7)
        ImageView mImage7;
        @BindView(R.id.image8)
        ImageView mImage8;
        @BindView(R.id.image9)
        ImageView mImage9;

        ViewHolder(View view)
        {
            ButterKnife.bind(this, view);
        }
    }

    /**
     * 获取屏幕宽度
     */
    private int getScreenWidth()
    {
        WindowManager wm = (WindowManager) mContext
                .getSystemService(Context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        return width;
    }
}
