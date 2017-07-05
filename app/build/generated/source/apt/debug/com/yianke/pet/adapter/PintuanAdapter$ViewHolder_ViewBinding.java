// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yianke.pet.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PintuanAdapter$ViewHolder_ViewBinding<T extends PintuanAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public PintuanAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.mItemImg = Utils.findRequiredViewAsType(source, R.id.item_img, "field 'mItemImg'", ImageView.class);
    target.mItemDescript = Utils.findRequiredViewAsType(source, R.id.item_descript, "field 'mItemDescript'", TextView.class);
    target.mItemMutchOne = Utils.findRequiredViewAsType(source, R.id.item_mutchOne, "field 'mItemMutchOne'", TextView.class);
    target.mItemMutchTwo = Utils.findRequiredViewAsType(source, R.id.item_mutchTwo, "field 'mItemMutchTwo'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mItemImg = null;
    target.mItemDescript = null;
    target.mItemMutchOne = null;
    target.mItemMutchTwo = null;

    this.target = null;
  }
}
