// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.view.child;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yianke.pet.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PDFragment_ViewBinding<T extends PDFragment> implements Unbinder {
  protected T target;

  @UiThread
  public PDFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mPdMain = Utils.findRequiredViewAsType(source, R.id.pd_main, "field 'mPdMain'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mPdMain = null;

    this.target = null;
  }
}
