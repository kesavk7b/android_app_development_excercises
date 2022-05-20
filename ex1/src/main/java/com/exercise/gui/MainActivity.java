package com.exercise.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ch = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.textview1);
        Button changeFont = findViewById(R.id.change_font);
        Button changeColor = findViewById(R.id.change_color);
        int fontSize = 30;
        changeFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ch){
                    case 1:
                        text.setTextSize(fontSize);
                        break;
                    case 2:
                        text.setTextSize(fontSize + 50);
                        break;
                }
                ch++;
                if (ch == 3)  ch = 1;
            }
        });
        changeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch){
                    case 1:
                        text.setTextColor(getResources().getColor(R.color.red));
                        break;
                    case 2:
                        text.setTextColor(getResources().getColor(R.color.green));
                        break;
                }
                ch++;
                if(ch == 3)
                    ch = 1;
            }
        });
    }
}