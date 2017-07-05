// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.adapter.shop;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yianke.pet.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShopAdapter$ShopChildAdapter$ShopChildViewHolder_ViewBinding<T extends ShopAdapter.ShopChildAdapter.ShopChildViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public ShopAdapter$ShopChildAdapter$ShopChildViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.mChildImage = Utils.findRequiredViewAsType(source, R.id.item_child_image, "field 'mChildImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mChildImage = null;

    this.target = null;
  }
}
