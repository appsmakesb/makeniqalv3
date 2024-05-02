// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ecomflexi.softwarelabbd.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentContactListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final RecyclerView contactRecyclerView;

  @NonNull
  public final AutoCompleteTextView etSearch;

  @NonNull
  public final ImageButton go;

  @NonNull
  public final MaterialCardView searchBar;

  @NonNull
  public final LinearLayout searchLayout;

  @NonNull
  public final SearchView searchView;

  private FragmentContactListBinding(@NonNull LinearLayout rootView, @NonNull AppBarLayout appbar,
      @NonNull RecyclerView contactRecyclerView, @NonNull AutoCompleteTextView etSearch,
      @NonNull ImageButton go, @NonNull MaterialCardView searchBar,
      @NonNull LinearLayout searchLayout, @NonNull SearchView searchView) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.contactRecyclerView = contactRecyclerView;
    this.etSearch = etSearch;
    this.go = go;
    this.searchBar = searchBar;
    this.searchLayout = searchLayout;
    this.searchView = searchView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentContactListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentContactListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_contact_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentContactListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      AppBarLayout appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.contact_recycler_view;
      RecyclerView contactRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (contactRecyclerView == null) {
        break missingId;
      }

      id = R.id.et_search;
      AutoCompleteTextView etSearch = ViewBindings.findChildViewById(rootView, id);
      if (etSearch == null) {
        break missingId;
      }

      id = R.id.go;
      ImageButton go = ViewBindings.findChildViewById(rootView, id);
      if (go == null) {
        break missingId;
      }

      id = R.id.search_bar;
      MaterialCardView searchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchBar == null) {
        break missingId;
      }

      id = R.id.search_layout;
      LinearLayout searchLayout = ViewBindings.findChildViewById(rootView, id);
      if (searchLayout == null) {
        break missingId;
      }

      id = R.id.searchView;
      SearchView searchView = ViewBindings.findChildViewById(rootView, id);
      if (searchView == null) {
        break missingId;
      }

      return new FragmentContactListBinding((LinearLayout) rootView, appbar, contactRecyclerView,
          etSearch, go, searchBar, searchLayout, searchView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}