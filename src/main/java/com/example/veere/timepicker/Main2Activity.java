package com.example.veere.timepicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        new Timer() .schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(Main2Activity.this,MainActivity.class));
            }
        },5000);
    }
}
