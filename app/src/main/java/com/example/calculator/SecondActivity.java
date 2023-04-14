package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();

        if(arguments!=null){
            int first = arguments.getInt("first");
            int second = arguments.getInt("second");
            int result = first + second;
            if(result < 0 && second < 0){
                String txt = first + " + (" + second + ") = (" + result + ")";
                textView.setText(txt);
            }else if(second < 0){
                String txt = first + " + (" + second + ") = " + result;
                textView.setText(txt);
            } else if(result < 0){
                String txt = first + " + " + second + " = (" + result + ")";
                textView.setText(txt);
            } else {
            String txt = first + " + " + second + " = " + result;
            textView.setText(txt);}
        }
        setContentView(R.layout.activity_second);
        setContentView(textView);
    }
}