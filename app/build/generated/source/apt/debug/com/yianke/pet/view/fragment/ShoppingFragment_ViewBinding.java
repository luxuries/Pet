// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.view.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yianke.pet.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShoppingFragment_ViewBinding<T extends ShoppingFragment> implements Unbinder {
  protected T target;

  @UiThread
  public ShoppingFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mShopMain = Utils.findRequiredViewAsType(source, R.id.shop_main, "field 'mShopMain'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mShopMain = null;

    this.target = null;
  }
}
