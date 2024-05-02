// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ecomflexi.softwarelabbd.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PinBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView band;

  @NonNull
  public final Button login;

  @NonNull
  public final RelativeLayout mainlayout;

  @NonNull
  public final TextInputEditText passwordpin;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final LinearLayout top;

  @NonNull
  public final TextInputLayout txtPassword;

  private PinBinding(@NonNull RelativeLayout rootView, @NonNull TextView band,
      @NonNull Button login, @NonNull RelativeLayout mainlayout,
      @NonNull TextInputEditText passwordpin, @NonNull TextView textView4,
      @NonNull TextView textView6, @NonNull LinearLayout top,
      @NonNull TextInputLayout txtPassword) {
    this.rootView = rootView;
    this.band = band;
    this.login = login;
    this.mainlayout = mainlayout;
    this.passwordpin = passwordpin;
    this.textView4 = textView4;
    this.textView6 = textView6;
    this.top = top;
    this.txtPassword = txtPassword;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PinBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PinBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.pin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PinBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.band;
      TextView band = ViewBindings.findChildViewById(rootView, id);
      if (band == null) {
        break missingId;
      }

      id = R.id.login;
      Button login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      RelativeLayout mainlayout = (RelativeLayout) rootView;

      id = R.id.passwordpin;
      TextInputEditText passwordpin = ViewBindings.findChildViewById(rootView, id);
      if (passwordpin == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.top;
      LinearLayout top = ViewBindings.findChildViewById(rootView, id);
      if (top == null) {
        break missingId;
      }

      id = R.id.txtPassword;
      TextInputLayout txtPassword = ViewBindings.findChildViewById(rootView, id);
      if (txtPassword == null) {
        break missingId;
      }

      return new PinBinding((RelativeLayout) rootView, band, login, mainlayout, passwordpin,
          textView4, textView6, top, txtPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
