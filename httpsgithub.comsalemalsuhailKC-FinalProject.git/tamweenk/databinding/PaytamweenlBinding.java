// Generated by view binder compiler. Do not edit!
package com.tamweenk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tamweenk.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PaytamweenlBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button3;

  @NonNull
  public final EditText editTextTextMultiLine3;

  @NonNull
  public final EditText editTextTextPersonName10;

  @NonNull
  public final EditText editTextTextPersonName3;

  @NonNull
  public final EditText editTextTextPersonName6;

  @NonNull
  public final EditText editTextTextPersonName7;

  @NonNull
  public final EditText editTextTextPersonName8;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  private PaytamweenlBinding(@NonNull ConstraintLayout rootView, @NonNull Button button3,
      @NonNull EditText editTextTextMultiLine3, @NonNull EditText editTextTextPersonName10,
      @NonNull EditText editTextTextPersonName3, @NonNull EditText editTextTextPersonName6,
      @NonNull EditText editTextTextPersonName7, @NonNull EditText editTextTextPersonName8,
      @NonNull TextView textView5, @NonNull TextView textView6) {
    this.rootView = rootView;
    this.button3 = button3;
    this.editTextTextMultiLine3 = editTextTextMultiLine3;
    this.editTextTextPersonName10 = editTextTextPersonName10;
    this.editTextTextPersonName3 = editTextTextPersonName3;
    this.editTextTextPersonName6 = editTextTextPersonName6;
    this.editTextTextPersonName7 = editTextTextPersonName7;
    this.editTextTextPersonName8 = editTextTextPersonName8;
    this.textView5 = textView5;
    this.textView6 = textView6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PaytamweenlBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PaytamweenlBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.paytamweenl, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PaytamweenlBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.editTextTextMultiLine3;
      EditText editTextTextMultiLine3 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextMultiLine3 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName10;
      EditText editTextTextPersonName10 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName10 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName3;
      EditText editTextTextPersonName3 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName3 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName6;
      EditText editTextTextPersonName6 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName6 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName7;
      EditText editTextTextPersonName7 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName7 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName8;
      EditText editTextTextPersonName8 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName8 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      return new PaytamweenlBinding((ConstraintLayout) rootView, button3, editTextTextMultiLine3,
          editTextTextPersonName10, editTextTextPersonName3, editTextTextPersonName6,
          editTextTextPersonName7, editTextTextPersonName8, textView5, textView6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}