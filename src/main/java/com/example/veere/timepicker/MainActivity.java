package com.example.veere.timepicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    TimePicker tp1;
    String format;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textView);
        tp1 = findViewById(R.id.tp);
        Calendar cal= Calendar.getInstance();
        int hour=cal.get(Calendar.HOUR_OF_DAY);
        int min=cal.get(Calendar.MINUTE);
        showt(hour,min);
    }

    private void showt(int hour,int min) {
        if(hour==0)
        {
            hour=hour+12;
            format="PM";
        }
        else if(hour==12)
        {
            format="PM";
        }
        else if (hour>12)
        {
            hour=hour-12;
            format="PM";
        }
        else
        {
            format="AM";
        }
        txt.setText(new StringBuilder().append(hour).append("i").append(min).append(format));
    }

    public void display(View view) {
        int hour=tp1.getHour();
        int min=tp1.getMinute();
        showt(hour,min);
    }
}
