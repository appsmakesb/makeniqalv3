// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ecomflexi.softwarelabbd.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PasswordBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView band;

  @NonNull
  public final TextView cba;

  @NonNull
  public final TextInputEditText conpass;

  @NonNull
  public final CircleImageView hm;

  @NonNull
  public final LinearLayout mainlayout;

  @NonNull
  public final TextInputEditText newpass;

  @NonNull
  public final TextInputEditText oldpass;

  @NonNull
  public final Button reg;

  @NonNull
  public final ScrollView scrollview;

  @NonNull
  public final TextInputLayout txtPassword;

  @NonNull
  public final RelativeLayout uitop;

  private PasswordBinding(@NonNull LinearLayout rootView, @NonNull TextView band,
      @NonNull TextView cba, @NonNull TextInputEditText conpass, @NonNull CircleImageView hm,
      @NonNull LinearLayout mainlayout, @NonNull TextInputEditText newpass,
      @NonNull TextInputEditText oldpass, @NonNull Button reg, @NonNull ScrollView scrollview,
      @NonNull TextInputLayout txtPassword, @NonNull RelativeLayout uitop) {
    this.rootView = rootView;
    this.band = band;
    this.cba = cba;
    this.conpass = conpass;
    this.hm = hm;
    this.mainlayout = mainlayout;
    this.newpass = newpass;
    this.oldpass = oldpass;
    this.reg = reg;
    this.scrollview = scrollview;
    this.txtPassword = txtPassword;
    this.uitop = uitop;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.band;
      TextView band = ViewBindings.findChildViewById(rootView, id);
      if (band == null) {
        break missingId;
      }

      id = R.id.cba;
      TextView cba = ViewBindings.findChildViewById(rootView, id);
      if (cba == null) {
        break missingId;
      }

      id = R.id.conpass;
      TextInputEditText conpass = ViewBindings.findChildViewById(rootView, id);
      if (conpass == null) {
        break missingId;
      }

      id = R.id.hm;
      CircleImageView hm = ViewBindings.findChildViewById(rootView, id);
      if (hm == null) {
        break missingId;
      }

      LinearLayout mainlayout = (LinearLayout) rootView;

      id = R.id.newpass;
      TextInputEditText newpass = ViewBindings.findChildViewById(rootView, id);
      if (newpass == null) {
        break missingId;
      }

      id = R.id.oldpass;
      TextInputEditText oldpass = ViewBindings.findChildViewById(rootView, id);
      if (oldpass == null) {
        break missingId;
      }

      id = R.id.reg;
      Button reg = ViewBindings.findChildViewById(rootView, id);
      if (reg == null) {
        break missingId;
      }

      id = R.id.scrollview;
      ScrollView scrollview = ViewBindings.findChildViewById(rootView, id);
      if (scrollview == null) {
        break missingId;
      }

      id = R.id.txtPassword;
      TextInputLayout txtPassword = ViewBindings.findChildViewById(rootView, id);
      if (txtPassword == null) {
        break missingId;
      }

      id = R.id.uitop;
      RelativeLayout uitop = ViewBindings.findChildViewById(rootView, id);
      if (uitop == null) {
        break missingId;
      }

      return new PasswordBinding((LinearLayout) rootView, band, cba, conpass, hm, mainlayout,
          newpass, oldpass, reg, scrollview, txtPassword, uitop);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
