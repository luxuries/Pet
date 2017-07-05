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

public class DTFragment_ViewBinding<T extends DTFragment> implements Unbinder {
  protected T target;

  @UiThread
  public DTFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mDtMain = Utils.findRequiredViewAsType(source, R.id.dt_main, "field 'mDtMain'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mDtMain = null;

    this.target = null;
  }
}
