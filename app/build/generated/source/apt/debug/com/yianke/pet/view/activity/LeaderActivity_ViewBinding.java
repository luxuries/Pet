// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yianke.pet.R;
import com.zhy.autolayout.AutoLinearLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LeaderActivity_ViewBinding<T extends LeaderActivity> implements Unbinder {
  protected T target;

  private View view2131558553;

  private View view2131558554;

  @UiThread
  public LeaderActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mLeaderImg = Utils.findRequiredViewAsType(source, R.id.leader_img, "field 'mLeaderImg'", ViewPager.class);
    target.mLeaderCircle = Utils.findRequiredViewAsType(source, R.id.leader_circle, "field 'mLeaderCircle'", AutoLinearLayout.class);
    target.mLeaderRed = Utils.findRequiredViewAsType(source, R.id.leader_red, "field 'mLeaderRed'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.leader_register, "method 'onViewClicked'");
    view2131558553 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.leader_login, "method 'onViewClicked'");
    view2131558554 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mLeaderImg = null;
    target.mLeaderCircle = null;
    target.mLeaderRed = null;

    view2131558553.setOnClickListener(null);
    view2131558553 = null;
    view2131558554.setOnClickListener(null);
    view2131558554 = null;

    this.target = null;
  }
}
