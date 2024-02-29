package com.mirea.LutchenkoAM.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myTextView = (TextView) findViewById(R.id.textView1);
        myTextView.setText("New text in MIREA");

        Button button = findViewById(R.id.button1);
        button.setText("MireaButton");

        CheckBox checkBox = findViewById(R.id.checkBoxStudent);
        checkBox.setChecked(true);

    }
}