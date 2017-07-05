// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.adapter.shop;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yianke.pet.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShopAdapter$ViewHolder_ViewBinding<T extends ShopAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public ShopAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.mItemTitle = Utils.findRequiredViewAsType(source, R.id.item_title, "field 'mItemTitle'", TextView.class);
    target.mItemImages = Utils.findRequiredViewAsType(source, R.id.item_images, "field 'mItemImages'", ImageView.class);
    target.mImage1 = Utils.findRequiredViewAsType(source, R.id.image1, "field 'mImage1'", ImageView.class);
    target.mImage2 = Utils.findRequiredViewAsType(source, R.id.image2, "field 'mImage2'", ImageView.class);
    target.mImage3 = Utils.findRequiredViewAsType(source, R.id.image3, "field 'mImage3'", ImageView.class);
    target.mImage4 = Utils.findRequiredViewAsType(source, R.id.image4, "field 'mImage4'", ImageView.class);
    target.mImage5 = Utils.findRequiredViewAsType(source, R.id.image5, "field 'mImage5'", ImageView.class);
    target.mImage6 = Utils.findRequiredViewAsType(source, R.id.image6, "field 'mImage6'", ImageView.class);
    target.mImage7 = Utils.findRequiredViewAsType(source, R.id.image7, "field 'mImage7'", ImageView.class);
    target.mImage8 = Utils.findRequiredViewAsType(source, R.id.image8, "field 'mImage8'", ImageView.class);
    target.mImage9 = Utils.findRequiredViewAsType(source, R.id.image9, "field 'mImage9'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mItemTitle = null;
    target.mItemImages = null;
    target.mImage1 = null;
    target.mImage2 = null;
    target.mImage3 = null;
    target.mImage4 = null;
    target.mImage5 = null;
    target.mImage6 = null;
    target.mImage7 = null;
    target.mImage8 = null;
    target.mImage9 = null;

    this.target = null;
  }
}
