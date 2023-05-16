package com.example.btmview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class cart2_Activity extends AppCompatActivity {
CheckBox c1;
TextView t1,t2;
EditText t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart2);

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        CheckBox cb=(CheckBox) findViewById(R.id.c1);
        cb.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb.isChecked()){
                    t1.setTextColor(Color.parseColor("#A4C3FF"));
                    t2.setTextColor(Color.parseColor("#A4C3FF"));
                    t3.setTextColor(Color.parseColor("#A4C3FF"));
                }else{
                    t1.setTextColor(Color.parseColor("#000000"));
                    t2.setTextColor(Color.parseColor("#000000"));
                    t3.setTextColor(Color.parseColor("#000000"));
                }

            }
        }) ;
    }
}