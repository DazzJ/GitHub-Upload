package com.example.citiestimes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = findViewById(R.id.button2);
        final TextClock textClock1 = findViewById(R.id.Clock1);
        final TextClock textClock2 = findViewById(R.id.Clock2);
        final TextClock textClock3 = findViewById(R.id.Clock3);
        final TextClock textClock4 = findViewById(R.id.Clock4);
        final TextClock textClock5 = findViewById(R.id.Clock5);


        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                textClock1.setFormat12Hour("HH:mm:ss");
                textClock2.setFormat12Hour("HH:mm:ss");
              textClock3.setFormat12Hour("HH:mm:ss");
                textClock4.setFormat12Hour("HH:mm:ss");
                textClock5.setFormat12Hour("HH:mm:ss");
            }
        });
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                textClock1.setFormat12Hour("h:mm:ss a");
                textClock2.setFormat12Hour("h:mm:ss a");
                textClock3.setFormat12Hour("h:mm:ss a");
                textClock4.setFormat12Hour("h:mm:ss a");
                textClock5.setFormat12Hour("h:mm:ss a");
            }
        });
    }

}

