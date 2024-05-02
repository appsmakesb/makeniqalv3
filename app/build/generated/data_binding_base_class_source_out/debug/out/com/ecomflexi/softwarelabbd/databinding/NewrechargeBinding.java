// Generated by view binder compiler. Do not edit!
package com.ecomflexi.softwarelabbd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ecomflexi.softwarelabbd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NewrechargeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Spinner am;

  @NonNull
  public final EditText amount;

  @NonNull
  public final ImageButton bank;

  @NonNull
  public final ImageButton bill;

  @NonNull
  public final ImageButton bkash;

  @NonNull
  public final LinearLayout btnSpeakContainer;

  @NonNull
  public final Button cont;

  @NonNull
  public final LinearLayout displayactivityLinearLayout1;

  @NonNull
  public final LinearLayout hd;

  @NonNull
  public final LinearLayout hdt;

  @NonNull
  public final LinearLayout hdtm;

  @NonNull
  public final LinearLayout hdtr;

  @NonNull
  public final LinearLayout hdtru;

  @NonNull
  public final HorizontalScrollView horizontalScrollView;

  @NonNull
  public final ImageButton more;

  @NonNull
  public final ImageButton nogad;

  @NonNull
  public final EditText number;

  @NonNull
  public final EditText pin;

  @NonNull
  public final RadioButton postpaid;

  @NonNull
  public final RadioButton prepaid;

  @NonNull
  public final ImageButton rocket;

  @NonNull
  public final ImageButton sms;

  @NonNull
  public final Button sub;

  @NonNull
  public final LinearLayout top;

  @NonNull
  public final RelativeLayout toptop;

  @NonNull
  public final RadioGroup typep;

  @NonNull
  public final ImageButton wBt1;

  @NonNull
  public final ImageButton wBt4;

  private NewrechargeBinding(@NonNull RelativeLayout rootView, @NonNull Spinner am,
      @NonNull EditText amount, @NonNull ImageButton bank, @NonNull ImageButton bill,
      @NonNull ImageButton bkash, @NonNull LinearLayout btnSpeakContainer, @NonNull Button cont,
      @NonNull LinearLayout displayactivityLinearLayout1, @NonNull LinearLayout hd,
      @NonNull LinearLayout hdt, @NonNull LinearLayout hdtm, @NonNull LinearLayout hdtr,
      @NonNull LinearLayout hdtru, @NonNull HorizontalScrollView horizontalScrollView,
      @NonNull ImageButton more, @NonNull ImageButton nogad, @NonNull EditText number,
      @NonNull EditText pin, @NonNull RadioButton postpaid, @NonNull RadioButton prepaid,
      @NonNull ImageButton rocket, @NonNull ImageButton sms, @NonNull Button sub,
      @NonNull LinearLayout top, @NonNull RelativeLayout toptop, @NonNull RadioGroup typep,
      @NonNull ImageButton wBt1, @NonNull ImageButton wBt4) {
    this.rootView = rootView;
    this.am = am;
    this.amount = amount;
    this.bank = bank;
    this.bill = bill;
    this.bkash = bkash;
    this.btnSpeakContainer = btnSpeakContainer;
    this.cont = cont;
    this.displayactivityLinearLayout1 = displayactivityLinearLayout1;
    this.hd = hd;
    this.hdt = hdt;
    this.hdtm = hdtm;
    this.hdtr = hdtr;
    this.hdtru = hdtru;
    this.horizontalScrollView = horizontalScrollView;
    this.more = more;
    this.nogad = nogad;
    this.number = number;
    this.pin = pin;
    this.postpaid = postpaid;
    this.prepaid = prepaid;
    this.rocket = rocket;
    this.sms = sms;
    this.sub = sub;
    this.top = top;
    this.toptop = toptop;
    this.typep = typep;
    this.wBt1 = wBt1;
    this.wBt4 = wBt4;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NewrechargeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NewrechargeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.newrecharge, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NewrechargeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.am;
      Spinner am = ViewBindings.findChildViewById(rootView, id);
      if (am == null) {
        break missingId;
      }

      id = R.id.amount;
      EditText amount = ViewBindings.findChildViewById(rootView, id);
      if (amount == null) {
        break missingId;
      }

      id = R.id.bank;
      ImageButton bank = ViewBindings.findChildViewById(rootView, id);
      if (bank == null) {
        break missingId;
      }

      id = R.id.bill;
      ImageButton bill = ViewBindings.findChildViewById(rootView, id);
      if (bill == null) {
        break missingId;
      }

      id = R.id.bkash;
      ImageButton bkash = ViewBindings.findChildViewById(rootView, id);
      if (bkash == null) {
        break missingId;
      }

      id = R.id.btnSpeakContainer;
      LinearLayout btnSpeakContainer = ViewBindings.findChildViewById(rootView, id);
      if (btnSpeakContainer == null) {
        break missingId;
      }

      id = R.id.cont;
      Button cont = ViewBindings.findChildViewById(rootView, id);
      if (cont == null) {
        break missingId;
      }

      id = R.id.displayactivityLinearLayout1;
      LinearLayout displayactivityLinearLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (displayactivityLinearLayout1 == null) {
        break missingId;
      }

      id = R.id.hd;
      LinearLayout hd = ViewBindings.findChildViewById(rootView, id);
      if (hd == null) {
        break missingId;
      }

      id = R.id.hdt;
      LinearLayout hdt = ViewBindings.findChildViewById(rootView, id);
      if (hdt == null) {
        break missingId;
      }

      id = R.id.hdtm;
      LinearLayout hdtm = ViewBindings.findChildViewById(rootView, id);
      if (hdtm == null) {
        break missingId;
      }

      id = R.id.hdtr;
      LinearLayout hdtr = ViewBindings.findChildViewById(rootView, id);
      if (hdtr == null) {
        break missingId;
      }

      id = R.id.hdtru;
      LinearLayout hdtru = ViewBindings.findChildViewById(rootView, id);
      if (hdtru == null) {
        break missingId;
      }

      id = R.id.horizontalScrollView;
      HorizontalScrollView horizontalScrollView = ViewBindings.findChildViewById(rootView, id);
      if (horizontalScrollView == null) {
        break missingId;
      }

      id = R.id.more;
      ImageButton more = ViewBindings.findChildViewById(rootView, id);
      if (more == null) {
        break missingId;
      }

      id = R.id.nogad;
      ImageButton nogad = ViewBindings.findChildViewById(rootView, id);
      if (nogad == null) {
        break missingId;
      }

      id = R.id.number;
      EditText number = ViewBindings.findChildViewById(rootView, id);
      if (number == null) {
        break missingId;
      }

      id = R.id.pin;
      EditText pin = ViewBindings.findChildViewById(rootView, id);
      if (pin == null) {
        break missingId;
      }

      id = R.id.postpaid;
      RadioButton postpaid = ViewBindings.findChildViewById(rootView, id);
      if (postpaid == null) {
        break missingId;
      }

      id = R.id.prepaid;
      RadioButton prepaid = ViewBindings.findChildViewById(rootView, id);
      if (prepaid == null) {
        break missingId;
      }

      id = R.id.rocket;
      ImageButton rocket = ViewBindings.findChildViewById(rootView, id);
      if (rocket == null) {
        break missingId;
      }

      id = R.id.sms;
      ImageButton sms = ViewBindings.findChildViewById(rootView, id);
      if (sms == null) {
        break missingId;
      }

      id = R.id.sub;
      Button sub = ViewBindings.findChildViewById(rootView, id);
      if (sub == null) {
        break missingId;
      }

      id = R.id.top;
      LinearLayout top = ViewBindings.findChildViewById(rootView, id);
      if (top == null) {
        break missingId;
      }

      RelativeLayout toptop = (RelativeLayout) rootView;

      id = R.id.typep;
      RadioGroup typep = ViewBindings.findChildViewById(rootView, id);
      if (typep == null) {
        break missingId;
      }

      id = R.id.w_bt1;
      ImageButton wBt1 = ViewBindings.findChildViewById(rootView, id);
      if (wBt1 == null) {
        break missingId;
      }

      id = R.id.w_bt4;
      ImageButton wBt4 = ViewBindings.findChildViewById(rootView, id);
      if (wBt4 == null) {
        break missingId;
      }

      return new NewrechargeBinding((RelativeLayout) rootView, am, amount, bank, bill, bkash,
          btnSpeakContainer, cont, displayactivityLinearLayout1, hd, hdt, hdtm, hdtr, hdtru,
          horizontalScrollView, more, nogad, number, pin, postpaid, prepaid, rocket, sms, sub, top,
          toptop, typep, wBt1, wBt4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}