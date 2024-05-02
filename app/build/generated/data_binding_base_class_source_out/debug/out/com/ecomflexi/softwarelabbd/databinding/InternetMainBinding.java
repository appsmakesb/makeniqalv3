// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ecomflexi.softwarelabbd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class InternetMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ListView atachview;

  @NonNull
  public final TextView emptyListView;

  @NonNull
  public final EditText numbers;

  @NonNull
  public final TextView pr;

  @NonNull
  public final ImageButton search;

  @NonNull
  public final RelativeLayout tyi;

  private InternetMainBinding(@NonNull RelativeLayout rootView, @NonNull ListView atachview,
      @NonNull TextView emptyListView, @NonNull EditText numbers, @NonNull TextView pr,
      @NonNull ImageButton search, @NonNull RelativeLayout tyi) {
    this.rootView = rootView;
    this.atachview = atachview;
    this.emptyListView = emptyListView;
    this.numbers = numbers;
    this.pr = pr;
    this.search = search;
    this.tyi = tyi;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static InternetMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static InternetMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.internet_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static InternetMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.atachview;
      ListView atachview = ViewBindings.findChildViewById(rootView, id);
      if (atachview == null) {
        break missingId;
      }

      id = R.id.empty_list_view;
      TextView emptyListView = ViewBindings.findChildViewById(rootView, id);
      if (emptyListView == null) {
        break missingId;
      }

      id = R.id.numbers;
      EditText numbers = ViewBindings.findChildViewById(rootView, id);
      if (numbers == null) {
        break missingId;
      }

      id = R.id.pr;
      TextView pr = ViewBindings.findChildViewById(rootView, id);
      if (pr == null) {
        break missingId;
      }

      id = R.id.search;
      ImageButton search = ViewBindings.findChildViewById(rootView, id);
      if (search == null) {
        break missingId;
      }

      id = R.id.tyi;
      RelativeLayout tyi = ViewBindings.findChildViewById(rootView, id);
      if (tyi == null) {
        break missingId;
      }

      return new InternetMainBinding((RelativeLayout) rootView, atachview, emptyListView, numbers,
          pr, search, tyi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}