// Generated by view binder compiler. Do not edit!
package com.example.loudalarm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.loudalarm.R;
import com.example.loudalarm.View.ActionButton;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageButton cancel;

  @NonNull
  public final CircleImageView iconOfProfile;

  @NonNull
  public final TextView nameOfProfile;

  @NonNull
  public final ActionButton outAuth;

  private ActivityProfileBinding(@NonNull FrameLayout rootView, @NonNull ImageButton cancel,
      @NonNull CircleImageView iconOfProfile, @NonNull TextView nameOfProfile,
      @NonNull ActionButton outAuth) {
    this.rootView = rootView;
    this.cancel = cancel;
    this.iconOfProfile = iconOfProfile;
    this.nameOfProfile = nameOfProfile;
    this.outAuth = outAuth;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel;
      ImageButton cancel = ViewBindings.findChildViewById(rootView, id);
      if (cancel == null) {
        break missingId;
      }

      id = R.id.icon_of_profile;
      CircleImageView iconOfProfile = ViewBindings.findChildViewById(rootView, id);
      if (iconOfProfile == null) {
        break missingId;
      }

      id = R.id.name_of_profile;
      TextView nameOfProfile = ViewBindings.findChildViewById(rootView, id);
      if (nameOfProfile == null) {
        break missingId;
      }

      id = R.id.outAuth;
      ActionButton outAuth = ViewBindings.findChildViewById(rootView, id);
      if (outAuth == null) {
        break missingId;
      }

      return new ActivityProfileBinding((FrameLayout) rootView, cancel, iconOfProfile,
          nameOfProfile, outAuth);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
