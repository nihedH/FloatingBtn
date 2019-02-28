package com.example.nihedhamed.flotbtn;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CustomAmountView extends RelativeLayout {
    private TextView amount;

    public CustomAmountView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        isInEditMode();
        View rootView = inflate(context, R.layout.options_btn, this);
        amount = rootView.findViewById(R.id.amount);
    }

    public void changeTextAmount1() {
        amount.setText("1");
    }

    public void changeTextAmount3() {
        amount.setText("3");
    }

    public void changeTextAmount5() {
        amount.setText("5");
    }

    public void changeTextAmount10() {
        amount.setText("10");
    }

}

