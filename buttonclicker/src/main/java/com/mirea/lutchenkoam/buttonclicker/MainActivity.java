package com.mirea.lutchenkoam.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox ckBx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        ckBx = findViewById(R.id.checkBoxStudent);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Мой номер в списке №16");
                ckBx.setChecked(true);
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }

    public void onMyButtonClick(View view){
        //Выводим сообщение
        Toast.makeText(this, "Еще один способ!", Toast.LENGTH_SHORT).show();

        tv.setText("Это не я сделал");
        ckBx.setChecked(false);
    }
}