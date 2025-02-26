// Generated by view binder compiler. Do not edit!
package com.example.notes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.notes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActiviyBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CheckBox checkboxcomplete;

  @NonNull
  public final TextView contentTextView;

  @NonNull
  public final ImageView deleteBtn;

  @NonNull
  public final TextView titleText;

  @NonNull
  public final ImageView updateBtn;

  private ActiviyBinding(@NonNull CardView rootView, @NonNull CheckBox checkboxcomplete,
      @NonNull TextView contentTextView, @NonNull ImageView deleteBtn, @NonNull TextView titleText,
      @NonNull ImageView updateBtn) {
    this.rootView = rootView;
    this.checkboxcomplete = checkboxcomplete;
    this.contentTextView = contentTextView;
    this.deleteBtn = deleteBtn;
    this.titleText = titleText;
    this.updateBtn = updateBtn;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActiviyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActiviyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.activiy, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActiviyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checkboxcomplete;
      CheckBox checkboxcomplete = ViewBindings.findChildViewById(rootView, id);
      if (checkboxcomplete == null) {
        break missingId;
      }

      id = R.id.contentTextView;
      TextView contentTextView = ViewBindings.findChildViewById(rootView, id);
      if (contentTextView == null) {
        break missingId;
      }

      id = R.id.deleteBtn;
      ImageView deleteBtn = ViewBindings.findChildViewById(rootView, id);
      if (deleteBtn == null) {
        break missingId;
      }

      id = R.id.titleText;
      TextView titleText = ViewBindings.findChildViewById(rootView, id);
      if (titleText == null) {
        break missingId;
      }

      id = R.id.updateBtn;
      ImageView updateBtn = ViewBindings.findChildViewById(rootView, id);
      if (updateBtn == null) {
        break missingId;
      }

      return new ActiviyBinding((CardView) rootView, checkboxcomplete, contentTextView, deleteBtn,
          titleText, updateBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
