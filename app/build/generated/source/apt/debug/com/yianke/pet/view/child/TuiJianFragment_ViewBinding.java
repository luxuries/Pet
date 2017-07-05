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

public class TuiJianFragment_ViewBinding<T extends TuiJianFragment> implements Unbinder {
  protected T target;

  @UiThread
  public TuiJianFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mTuijianLists = Utils.findRequiredViewAsType(source, R.id.tuijian_lists, "field 'mTuijianLists'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mTuijianLists = null;

    this.target = null;
  }
}
