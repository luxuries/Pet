// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.adapter.msg;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.yianke.pet.R;
import com.zhy.autolayout.AutoLinearLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ZazhiAdapter$ViewHolder_ViewBinding<T extends ZazhiAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public ZazhiAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.mItemParents = Utils.findRequiredViewAsType(source, R.id.item_parents, "field 'mItemParents'", AutoLinearLayout.class);
    target.mItemView = Utils.findRequiredViewAsType(source, R.id.item_image, "field 'mItemView'", SimpleDraweeView.class);
    target.mItemName = Utils.findRequiredViewAsType(source, R.id.item_name, "field 'mItemName'", TextView.class);
    target.mItemTimes = Utils.findRequiredViewAsType(source, R.id.item_times, "field 'mItemTimes'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mItemParents = null;
    target.mItemView = null;
    target.mItemName = null;
    target.mItemTimes = null;

    this.target = null;
  }
}
