// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.adapter.home;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yianke.pet.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PDAdapter$ChildAdapter$ViewHolder_ViewBinding<T extends PDAdapter.ChildAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public PDAdapter$ChildAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.mView = Utils.findRequiredViewAsType(source, R.id.item_images, "field 'mView'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mView = null;

    this.target = null;
  }
}
