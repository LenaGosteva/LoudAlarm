// Generated by view binder compiler. Do not edit!
package com.example.loudalarm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.loudalarm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Switch OnOff;

  @NonNull
  public final LinearLayout allInfo;

  @NonNull
  public final LinearLayout checked;

  @NonNull
  public final TextView days;

  @NonNull
  public final LinearLayout itemContainer;

  @NonNull
  public final LinearLayout switchLayout;

  @NonNull
  public final LinearLayout textInfo;

  @NonNull
  public final TextView textM;

  @NonNull
  public final TextView time;

  private ItemBinding(@NonNull LinearLayout rootView, @NonNull Switch OnOff,
      @NonNull LinearLayout allInfo, @NonNull LinearLayout checked, @NonNull TextView days,
      @NonNull LinearLayout itemContainer, @NonNull LinearLayout switchLayout,
      @NonNull LinearLayout textInfo, @NonNull TextView textM, @NonNull TextView time) {
    this.rootView = rootView;
    this.OnOff = OnOff;
    this.allInfo = allInfo;
    this.checked = checked;
    this.days = days;
    this.itemContainer = itemContainer;
    this.switchLayout = switchLayout;
    this.textInfo = textInfo;
    this.textM = textM;
    this.time = time;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.OnOff;
      Switch OnOff = ViewBindings.findChildViewById(rootView, id);
      if (OnOff == null) {
        break missingId;
      }

      id = R.id.all_info;
      LinearLayout allInfo = ViewBindings.findChildViewById(rootView, id);
      if (allInfo == null) {
        break missingId;
      }

      id = R.id.checked;
      LinearLayout checked = ViewBindings.findChildViewById(rootView, id);
      if (checked == null) {
        break missingId;
      }

      id = R.id.days;
      TextView days = ViewBindings.findChildViewById(rootView, id);
      if (days == null) {
        break missingId;
      }

      LinearLayout itemContainer = (LinearLayout) rootView;

      id = R.id.switch_layout;
      LinearLayout switchLayout = ViewBindings.findChildViewById(rootView, id);
      if (switchLayout == null) {
        break missingId;
      }

      id = R.id.text_info;
      LinearLayout textInfo = ViewBindings.findChildViewById(rootView, id);
      if (textInfo == null) {
        break missingId;
      }

      id = R.id.textM;
      TextView textM = ViewBindings.findChildViewById(rootView, id);
      if (textM == null) {
        break missingId;
      }

      id = R.id.time;
      TextView time = ViewBindings.findChildViewById(rootView, id);
      if (time == null) {
        break missingId;
      }

      return new ItemBinding((LinearLayout) rootView, OnOff, allInfo, checked, days, itemContainer,
          switchLayout, textInfo, textM, time);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
