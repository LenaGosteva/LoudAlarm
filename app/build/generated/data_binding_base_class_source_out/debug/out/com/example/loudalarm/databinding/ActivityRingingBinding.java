// Generated by view binder compiler. Do not edit!
package com.example.loudalarm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.loudalarm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRingingBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout layoutWithOut;

  @NonNull
  public final View line0;

  @NonNull
  public final View line2;

  @NonNull
  public final TextView messageOfAlarm;

  @NonNull
  public final Button offAlarm;

  @NonNull
  public final TextClock text;

  private ActivityRingingBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout layoutWithOut, @NonNull View line0, @NonNull View line2,
      @NonNull TextView messageOfAlarm, @NonNull Button offAlarm, @NonNull TextClock text) {
    this.rootView = rootView;
    this.layoutWithOut = layoutWithOut;
    this.line0 = line0;
    this.line2 = line2;
    this.messageOfAlarm = messageOfAlarm;
    this.offAlarm = offAlarm;
    this.text = text;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRingingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRingingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ringing, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRingingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.layout_with_out;
      LinearLayout layoutWithOut = ViewBindings.findChildViewById(rootView, id);
      if (layoutWithOut == null) {
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

      id = R.id.message_of_alarm;
      TextView messageOfAlarm = ViewBindings.findChildViewById(rootView, id);
      if (messageOfAlarm == null) {
        break missingId;
      }

      id = R.id.offAlarm;
      Button offAlarm = ViewBindings.findChildViewById(rootView, id);
      if (offAlarm == null) {
        break missingId;
      }

      id = R.id.text;
      TextClock text = ViewBindings.findChildViewById(rootView, id);
      if (text == null) {
        break missingId;
      }

      return new ActivityRingingBinding((LinearLayout) rootView, layoutWithOut, line0, line2,
          messageOfAlarm, offAlarm, text);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
