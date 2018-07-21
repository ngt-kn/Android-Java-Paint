package com.ngtkn.drawingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Drawing drawing = new Drawing(this);
        CustomTextView customTextView = new CustomTextView(this, null);
        setContentView(customTextView);


    }
}
