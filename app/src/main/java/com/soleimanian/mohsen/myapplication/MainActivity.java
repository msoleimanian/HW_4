package com.soleimanian.mohsen.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/digital display tfb.ttf");
        textView1 = (TextView) findViewById(R.id.text1);
        textView2 =(TextView) findViewById(R.id.text2);
        textView3 =(TextView) findViewById(R.id.text3);
        textView4 =(TextView) findViewById(R.id.text4);
        textView5 =(TextView) findViewById(R.id.text5);
        textView6 =(TextView) findViewById(R.id.text6);
        textView7 =(TextView) findViewById(R.id.text7);

        textView1.setTypeface(typeface);
        textView2.setTypeface(typeface);
        textView3.setTypeface(typeface);
        textView4.setTypeface(typeface);
        textView5.setTypeface(typeface);
        textView6.setTypeface(typeface);
        textView7.setTypeface(typeface);

    }}
