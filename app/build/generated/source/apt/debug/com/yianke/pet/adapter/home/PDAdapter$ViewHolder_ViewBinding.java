// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.adapter.home;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.yianke.pet.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PDAdapter$ViewHolder_ViewBinding<T extends PDAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public PDAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.mItemImg = Utils.findRequiredViewAsType(source, R.id.item_img, "field 'mItemImg'", RecyclerView.class);
    target.mItemUserName = Utils.findRequiredViewAsType(source, R.id.user_name, "field 'mItemUserName'", TextView.class);
    target.mItemDescript = Utils.findRequiredViewAsType(source, R.id.item_descript, "field 'mItemDescript'", TextView.class);
    target.mItemHeader = Utils.findRequiredViewAsType(source, R.id.user_headerImg, "field 'mItemHeader'", SimpleDraweeView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mItemImg = null;
    target.mItemUserName = null;
    target.mItemDescript = null;
    target.mItemHeader = null;

    this.target = null;
  }
}
