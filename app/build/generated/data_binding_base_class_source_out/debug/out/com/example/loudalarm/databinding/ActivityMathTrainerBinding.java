// Generated by view binder compiler. Do not edit!
package com.example.loudalarm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityMathTrainerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout layout;

  @NonNull
  public final View line0;

  @NonNull
  public final View line2;

  @NonNull
  public final LinearLayout list;

  @NonNull
  public final Button next;

  @NonNull
  public final TextView problem;

  @NonNull
  public final TextView text;

  @NonNull
  public final TextView text1;

  @NonNull
  public final TextView text2;

  @NonNull
  public final TextView title;

  private ActivityMathTrainerBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout layout,
      @NonNull View line0, @NonNull View line2, @NonNull LinearLayout list, @NonNull Button next,
      @NonNull TextView problem, @NonNull TextView text, @NonNull TextView text1,
      @NonNull TextView text2, @NonNull TextView title) {
    this.rootView = rootView;
    this.layout = layout;
    this.line0 = line0;
    this.line2 = line2;
    this.list = list;
    this.next = next;
    this.problem = problem;
    this.text = text;
    this.text1 = text1;
    this.text2 = text2;
    this.title = title;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMathTrainerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMathTrainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_math_trainer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMathTrainerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.layout;
      LinearLayout layout = ViewBindings.findChildViewById(rootView, id);
      if (layout == null) {
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

      LinearLayout list = (LinearLayout) rootView;

      id = R.id.next;
      Button next = ViewBindings.findChildViewById(rootView, id);
      if (next == null) {
        break missingId;
      }

      id = R.id.problem;
      TextView problem = ViewBindings.findChildViewById(rootView, id);
      if (problem == null) {
        break missingId;
      }

      id = R.id.text;
      TextView text = ViewBindings.findChildViewById(rootView, id);
      if (text == null) {
        break missingId;
      }

      id = R.id.text1;
      TextView text1 = ViewBindings.findChildViewById(rootView, id);
      if (text1 == null) {
        break missingId;
      }

      id = R.id.text2;
      TextView text2 = ViewBindings.findChildViewById(rootView, id);
      if (text2 == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ActivityMathTrainerBinding((LinearLayout) rootView, layout, line0, line2, list,
          next, problem, text, text1, text2, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
