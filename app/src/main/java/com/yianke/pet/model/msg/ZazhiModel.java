package com.yianke.pet.model.msg;

/**
 * 作者：赵若位
 * 时间：2017/6/20 09:47
 * 功能：
 */


public class ZazhiModel
{

    private int image;
    private String names;
    private String times;

    public ZazhiModel(int image, String names, String times)
    {
        this.image = image;
        this.names = names;
        this.times = times;
    }

    public int getImage()
    {
        return image;
    }

    public void setImage(int image)
    {
        this.image = image;
    }

    public String getNames()
    {
        return names;
    }

    public void setNames(String names)
    {
        this.names = names;
    }

    public String getTimes()
    {
        return times;
    }

    public void setTimes(String times)
    {
        this.times = times;
    }
}
