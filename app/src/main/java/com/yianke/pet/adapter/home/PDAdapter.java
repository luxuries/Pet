package com.yianke.pet.adapter.home;

import android.content.Context;
import android.net.Uri;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.squareup.picasso.Picasso;
import com.yianke.pet.R;
import com.yianke.pet.model.home.DTModel;
import com.yianke.pet.utils.CacheImageView;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：${赵若位} on 2017/6/6 20:47
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class PDAdapter extends BaseAdapter
{
    private Context mContext;
    private List<DTModel> mList;

    public PDAdapter(Context context, List<DTModel> list)
    {
        mContext = context;
        mList = list;
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_home_pd, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
            AutoUtils.autoSize(convertView);
        } else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.mItemHeader.setImageURI(Uri.parse("res://.../" + mList.get(position).getUserHeader()));
        holder.mItemDescript.setText(mList.get(position).getUserDescript());
        holder.mItemUserName.setText(mList.get(position).getUserName());


        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        holder.mItemImg.setLayoutManager(manager);
        ViewGroup.LayoutParams params = holder.mItemImg.getLayoutParams();
        params.height = getScreenWidth();
        holder.mItemImg.setLayoutParams(params);
        holder.mItemImg.setAdapter(new ChildAdapter(mList.get(position).getUserImages()));
        holder.mItemImg.setNestedScrollingEnabled(false);
        return convertView;
    }

    static class ViewHolder
    {
        @BindView(R.id.item_img)
        RecyclerView mItemImg;
        @BindView(R.id.user_name)
        TextView mItemUserName;
        @BindView(R.id.item_descript)
        TextView mItemDescript;
        @BindView(R.id.user_headerImg)
        SimpleDraweeView mItemHeader;


        ViewHolder(View view)
        {
            ButterKnife.bind(this, view);
        }
    }


    /**
     * 子类图片适配器
     */
    public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder>
    {
        int child = 0;
        private int[] images;

        public ChildAdapter(int[] images)
        {
            this.images = images;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            ViewHolder holder = null;
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_dt_images, parent, false);
            AutoUtils.autoSize(view);
            holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position)
        {

            ViewGroup.LayoutParams params = holder.mView.getLayoutParams();
            child = (getScreenWidth() / 3) - 70 / 3;
            params.height = child;
            params.width = child;
            holder.mView.setLayoutParams(params);
            Picasso.with(mContext).load(images[position]).resize(160, 120).centerCrop().into(holder.mView);
        }

        @Override
        public int getItemCount()
        {
            return images.length;
        }

        public class ViewHolder extends RecyclerView.ViewHolder
        {
            @BindView(R.id.item_images)
            ImageView mView;

            public ViewHolder(View itemView)
            {
                super(itemView);
                ButterKnife.bind(this, itemView);
            }
        }

    }

    private int getScreenWidth()
    {
        WindowManager wm = (WindowManager) mContext
                .getSystemService(Context.WINDOW_SERVICE);

        return wm.getDefaultDisplay().getWidth();
    }
}
