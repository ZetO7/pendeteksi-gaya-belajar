// Generated by view binder compiler. Do not edit!
package com.putri.aplikasipendeteksigayabesar.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.putri.aplikasipendeteksigayabesar.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityResultDataBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton floatingActionButton2;

  @NonNull
  public final ListView listView;

  @NonNull
  public final TextView textView;

  private ActivityResultDataBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton floatingActionButton2, @NonNull ListView listView,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.floatingActionButton2 = floatingActionButton2;
    this.listView = listView;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResultDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResultDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_result_data, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResultDataBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.floatingActionButton2;
      FloatingActionButton floatingActionButton2 = ViewBindings.findChildViewById(rootView, id);
      if (floatingActionButton2 == null) {
        break missingId;
      }

      id = R.id.list_view;
      ListView listView = ViewBindings.findChildViewById(rootView, id);
      if (listView == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityResultDataBinding((ConstraintLayout) rootView, floatingActionButton2,
          listView, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
