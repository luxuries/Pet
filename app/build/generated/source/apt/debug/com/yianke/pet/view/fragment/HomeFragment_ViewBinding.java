// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yianke.pet.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeFragment_ViewBinding<T extends HomeFragment> implements Unbinder {
  protected T target;

  private View view2131558622;

  private View view2131558624;

  private View view2131558626;

  @UiThread
  public HomeFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mCamera = Utils.findRequiredViewAsType(source, R.id.camera, "field 'mCamera'", ImageView.class);
    target.mDicOne = Utils.findRequiredViewAsType(source, R.id.dic_one, "field 'mDicOne'", TextView.class);
    target.mDicTwo = Utils.findRequiredViewAsType(source, R.id.dic_two, "field 'mDicTwo'", TextView.class);
    target.mDicThree = Utils.findRequiredViewAsType(source, R.id.dic_three, "field 'mDicThree'", TextView.class);
    target.mHomeMain = Utils.findRequiredViewAsType(source, R.id.home_main, "field 'mHomeMain'", ViewPager.class);
    view = Utils.findRequiredView(source, R.id.home_one, "method 'onViewClicked'");
    view2131558622 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.home_two, "method 'onViewClicked'");
    view2131558624 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.home_three, "method 'onViewClicked'");
    view2131558626 = view;
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

    target.mCamera = null;
    target.mDicOne = null;
    target.mDicTwo = null;
    target.mDicThree = null;
    target.mHomeMain = null;

    view2131558622.setOnClickListener(null);
    view2131558622 = null;
    view2131558624.setOnClickListener(null);
    view2131558624 = null;
    view2131558626.setOnClickListener(null);
    view2131558626 = null;

    this.target = null;
  }
}
