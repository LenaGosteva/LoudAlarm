// Generated by view binder compiler. Do not edit!
package com.example.loudalarm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.loudalarm.R;
import com.example.loudalarm.View.InputField;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRegistrationBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final Button buttonEnter;

  @NonNull
  public final InputField inputEmail;

  @NonNull
  public final InputField inputName;

  @NonNull
  public final InputField inputPassword;

  @NonNull
  public final View line0;

  @NonNull
  public final View line2;

  private FragmentRegistrationBinding(@NonNull NestedScrollView rootView,
      @NonNull Button buttonEnter, @NonNull InputField inputEmail, @NonNull InputField inputName,
      @NonNull InputField inputPassword, @NonNull View line0, @NonNull View line2) {
    this.rootView = rootView;
    this.buttonEnter = buttonEnter;
    this.inputEmail = inputEmail;
    this.inputName = inputName;
    this.inputPassword = inputPassword;
    this.line0 = line0;
    this.line2 = line2;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_registration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRegistrationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_enter;
      Button buttonEnter = ViewBindings.findChildViewById(rootView, id);
      if (buttonEnter == null) {
        break missingId;
      }

      id = R.id.input_email;
      InputField inputEmail = ViewBindings.findChildViewById(rootView, id);
      if (inputEmail == null) {
        break missingId;
      }

      id = R.id.input_name;
      InputField inputName = ViewBindings.findChildViewById(rootView, id);
      if (inputName == null) {
        break missingId;
      }

      id = R.id.input_password;
      InputField inputPassword = ViewBindings.findChildViewById(rootView, id);
      if (inputPassword == null) {
        break missingId;
      }

      id = R.id.line0;
      View line0 = ViewBindings.findChildViewById(rootView, id);
      if (line0 == null) {
        break missingId;
      }

      id = R.id.line2;
      View line2 = ViewBindings.findChildViewById(rootView, id);
      if (line2 == null) {
        break missingId;
      }

      return new FragmentRegistrationBinding((NestedScrollView) rootView, buttonEnter, inputEmail,
          inputName, inputPassword, line0, line2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
