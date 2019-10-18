package com.example.anull;

import android.view.View;
import android.widget.TextView;

public class ClickEvent implements View.OnClickListener {
    private TextView mTestView;

    public ClickEvent(TextView textView){
        mTestView = textView;
    }

    @Override
    public void onClick(View v) {
        mTestView.setText("you click the button, guy!");
    }
}
