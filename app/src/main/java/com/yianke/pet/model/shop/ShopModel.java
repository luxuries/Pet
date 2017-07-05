package com.yianke.pet.model.shop;

import android.view.View;

import java.util.List;

/**
 * 作者：${赵若位} on 2017/6/7 13:54
 * 邮箱：1070138445@qq.com
 * 功能：
 */

public class ShopModel
{
    private String titles;
    private int image;
    private int[] images;

    public ShopModel(String titles, int image, int[] images)
    {
        this.titles = titles;
        this.image = image;
        this.images = images;
    }


    public String getTitles()
    {
        return titles;
    }

    public void setTitles(String titles)
    {
        this.titles = titles;
    }

    public int getImage()
    {
        return image;
    }

    public void setImage(int image)
    {
        this.image = image;
    }

    public int[] getImages()
    {
        return images;
    }

    public void setImages(int[] images)
    {
        this.images = images;
    }
}
