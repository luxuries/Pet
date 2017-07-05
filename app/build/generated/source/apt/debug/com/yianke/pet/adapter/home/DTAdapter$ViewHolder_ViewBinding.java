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

public class DTAdapter$ViewHolder_ViewBinding<T extends DTAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public DTAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.mUserHeader = Utils.findRequiredViewAsType(source, R.id.user_headerImg, "field 'mUserHeader'", SimpleDraweeView.class);
    target.mItemDescript = Utils.findRequiredViewAsType(source, R.id.item_descript, "field 'mItemDescript'", TextView.class);
    target.mItemUserName = Utils.findRequiredViewAsType(source, R.id.user_name, "field 'mItemUserName'", TextView.class);
    target.mItemImg = Utils.findRequiredViewAsType(source, R.id.item_img, "field 'mItemImg'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mUserHeader = null;
    target.mItemDescript = null;
    target.mItemUserName = null;
    target.mItemImg = null;

    this.target = null;
  }
}
