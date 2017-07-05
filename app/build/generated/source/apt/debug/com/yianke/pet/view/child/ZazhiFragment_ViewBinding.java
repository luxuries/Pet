// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.view.child;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yianke.pet.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ZazhiFragment_ViewBinding<T extends ZazhiFragment> implements Unbinder {
  protected T target;

  @UiThread
  public ZazhiFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mZhaziRecycler = Utils.findRequiredViewAsType(source, R.id.zhazi_recycler, "field 'mZhaziRecycler'", RecyclerView.class);
    target.mZazhiViewPager = Utils.findRequiredViewAsType(source, R.id.zazhi_viewPager, "field 'mZazhiViewPager'", ViewPager.class);
    target.mInidc1 = Utils.findRequiredViewAsType(source, R.id.inidc1, "field 'mInidc1'", ImageView.class);
    target.mInidc2 = Utils.findRequiredViewAsType(source, R.id.inidc2, "field 'mInidc2'", ImageView.class);
    target.mInidc3 = Utils.findRequiredViewAsType(source, R.id.inidc3, "field 'mInidc3'", ImageView.class);
    target.mInidc4 = Utils.findRequiredViewAsType(source, R.id.inidc4, "field 'mInidc4'", ImageView.class);
    target.mInidc5 = Utils.findRequiredViewAsType(source, R.id.inidc5, "field 'mInidc5'", ImageView.class);
    target.mTitles = Utils.findRequiredViewAsType(source, R.id.titles, "field 'mTitles'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mZhaziRecycler = null;
    target.mZazhiViewPager = null;
    target.mInidc1 = null;
    target.mInidc2 = null;
    target.mInidc3 = null;
    target.mInidc4 = null;
    target.mInidc5 = null;
    target.mTitles = null;

    this.target = null;
  }
}
