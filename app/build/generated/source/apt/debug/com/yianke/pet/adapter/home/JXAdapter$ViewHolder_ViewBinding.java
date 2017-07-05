// Generated code from Butter Knife. Do not modify!
package com.yianke.pet.adapter.home;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.yianke.pet.R;
import com.yianke.pet.utils.CacheImageView;
import com.zhy.autolayout.AutoLinearLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class JXAdapter$ViewHolder_ViewBinding<T extends JXAdapter.ViewHolder> implements Unbinder {
  protected T target;

  @UiThread
  public JXAdapter$ViewHolder_ViewBinding(T target, View source) {
    this.target = target;

    target.mUserHeaderImg = Utils.findRequiredViewAsType(source, R.id.user_headerImg, "field 'mUserHeaderImg'", SimpleDraweeView.class);
    target.mUserName = Utils.findRequiredViewAsType(source, R.id.user_name, "field 'mUserName'", TextView.class);
    target.mUserAir = Utils.findRequiredViewAsType(source, R.id.user_air, "field 'mUserAir'", TextView.class);
    target.mUserPetImg = Utils.findRequiredViewAsType(source, R.id.user_pet_img, "field 'mUserPetImg'", SimpleDraweeView.class);
    target.mUserPetName = Utils.findRequiredViewAsType(source, R.id.user_pet_name, "field 'mUserPetName'", TextView.class);
    target.mUserPetType = Utils.findRequiredViewAsType(source, R.id.user_pet_type, "field 'mUserPetType'", TextView.class);
    target.mUserPetFooter = Utils.findRequiredViewAsType(source, R.id.user_pet_footer, "field 'mUserPetFooter'", ImageView.class);
    target.mUserPet = Utils.findRequiredViewAsType(source, R.id.user_pet, "field 'mUserPet'", AutoLinearLayout.class);
    target.mItemImg = Utils.findRequiredViewAsType(source, R.id.item_img, "field 'mItemImg'", CacheImageView.class);
    target.mItemDescript = Utils.findRequiredViewAsType(source, R.id.item_descript, "field 'mItemDescript'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mUserHeaderImg = null;
    target.mUserName = null;
    target.mUserAir = null;
    target.mUserPetImg = null;
    target.mUserPetName = null;
    target.mUserPetType = null;
    target.mUserPetFooter = null;
    target.mUserPet = null;
    target.mItemImg = null;
    target.mItemDescript = null;

    this.target = null;
  }
}
