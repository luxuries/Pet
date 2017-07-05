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

public class GuanfangFRagment_ViewBinding<T extends GuanfangFRagment> implements Unbinder {
  protected T target;

  @UiThread
  public GuanfangFRagment_ViewBinding(T target, View source) {
    this.target = target;

    target.mGuanList = Utils.findRequiredViewAsType(source, R.id.guanfang_lists, "field 'mGuanList'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mGuanList = null;

    this.target = null;
  }
}
