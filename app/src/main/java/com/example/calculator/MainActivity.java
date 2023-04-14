package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {

        EditText firstinput = findViewById(R.id.firstinput);
        EditText secondinput = findViewById(R.id.secondinput);

        int first = Integer.parseInt(firstinput.getText().toString());
        int second = Integer.parseInt(secondinput.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("first", first);
        intent.putExtra("second", second);
        startActivity(intent);
    }
}