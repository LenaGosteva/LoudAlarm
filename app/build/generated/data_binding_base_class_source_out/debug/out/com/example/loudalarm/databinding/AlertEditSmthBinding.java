// Generated by view binder compiler. Do not edit!
package com.example.loudalarm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.loudalarm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AlertEditSmthBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonNot;

  @NonNull
  public final Button buttonOk;

  @NonNull
  public final EditText editText;

  @NonNull
  public final LinearLayout layoutOkNot;

  @NonNull
  public final LinearLayout linearEdit;

  @NonNull
  public final TextView title;

  private AlertEditSmthBinding(@NonNull LinearLayout rootView, @NonNull Button buttonNot,
      @NonNull Button buttonOk, @NonNull EditText editText, @NonNull LinearLayout layoutOkNot,
      @NonNull LinearLayout linearEdit, @NonNull TextView title) {
    this.rootView = rootView;
    this.buttonNot = buttonNot;
    this.buttonOk = buttonOk;
    this.editText = editText;
    this.layoutOkNot = layoutOkNot;
    this.linearEdit = linearEdit;
    this.title = title;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AlertEditSmthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AlertEditSmthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.alert_edit_smth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AlertEditSmthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_not;
      Button buttonNot = ViewBindings.findChildViewById(rootView, id);
      if (buttonNot == null) {
        break missingId;
      }

      id = R.id.button_ok;
      Button buttonOk = ViewBindings.findChildViewById(rootView, id);
      if (buttonOk == null) {
        break missingId;
      }

      id = R.id.edit_text;
      EditText editText = ViewBindings.findChildViewById(rootView, id);
      if (editText == null) {
        break missingId;
      }

      id = R.id.layout_ok_not;
      LinearLayout layoutOkNot = ViewBindings.findChildViewById(rootView, id);
      if (layoutOkNot == null) {
        break missingId;
      }

      id = R.id.linear_edit;
      LinearLayout linearEdit = ViewBindings.findChildViewById(rootView, id);
      if (linearEdit == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new AlertEditSmthBinding((LinearLayout) rootView, buttonNot, buttonOk, editText,
          layoutOkNot, linearEdit, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
