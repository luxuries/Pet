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

public class JXFragment_ViewBinding<T extends JXFragment> implements Unbinder {
  protected T target;

  @UiThread
  public JXFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mJxMain = Utils.findRequiredViewAsType(source, R.id.jx_main, "field 'mJxMain'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mJxMain = null;

    this.target = null;
  }
}
