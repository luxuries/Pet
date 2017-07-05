// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.adapter.msg;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yianke.pet.R;
import com.yianke.pet.utils.CacheImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MsgChildAdapter$ViewHolder_ViewBinding<T extends MsgChildAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public MsgChildAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.mItemImage = Utils.findRequiredViewAsType(source, R.id.item_image, "field 'mItemImage'", CacheImageView.class);
    target.mItemTitle = Utils.findRequiredViewAsType(source, R.id.item_title, "field 'mItemTitle'", TextView.class);
    target.mItemZhiding = Utils.findRequiredViewAsType(source, R.id.item_zhiding, "field 'mItemZhiding'", TextView.class);
    target.mItemJingxuan = Utils.findRequiredViewAsType(source, R.id.item_jingxuan, "field 'mItemJingxuan'", TextView.class);
    target.mItemAuthor = Utils.findRequiredViewAsType(source, R.id.item_author, "field 'mItemAuthor'", TextView.class);
    target.mItemWatch = Utils.findRequiredViewAsType(source, R.id.item_watch, "field 'mItemWatch'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mItemImage = null;
    target.mItemTitle = null;
    target.mItemZhiding = null;
    target.mItemJingxuan = null;
    target.mItemAuthor = null;
    target.mItemWatch = null;

    this.target = null;
  }
}
