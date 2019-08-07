package com.example.intentview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import java.net.URI;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button red, inet, implicit, explicit, cal, record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        implicit = (Button) findViewById(R.id.btnAlarm);
        implicit.setOnClickListener(this);
        explicit = (Button) findViewById(R.id.btn_weather);
        explicit.setOnClickListener(this);
        cal = (Button) findViewById(R.id.btn_call);
        cal.setOnClickListener(this);
        inet = (Button) findViewById(R.id.btnInet);
        inet.setOnClickListener(this);
        red = (Button) findViewById(R.id.btn_Red);
        red.setOnClickListener(this);
        red = (Button) findViewById(R.id.btnRecord);
        red.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_weather:
                Intent explicit = new Intent(MainActivity.this, Weather.class);
                startActivity(explicit);
                break;
            case R.id.btn_call:
                String number = "083100701027";
                Intent dialNumber = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + number));
                startActivity(dialNumber);
                break;
            case R.id.btn_Red:
                Intent red = new Intent(MainActivity.this, Relative.class);
                startActivity(red);
                break;
            case R.id.btnInet:
                Intent inet = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(inet);
                break;
            case R.id.btnAlarm:
                Intent i = new Intent(AlarmClock.ACTION_SET_ALARM);
                i.putExtra(AlarmClock.EXTRA_MESSAGE, "Set alarm");
                i.putExtra(AlarmClock.EXTRA_HOUR, 10);
                i.putExtra(AlarmClock.EXTRA_MINUTES, 1);
                i.putExtra(AlarmClock.EXTRA_DAYS, Calendar.THURSDAY);
                startActivity(i);
                break;
            case R.id.btnRecord:
                int ACTIVITY_RECORD_SOUND = 0;
                Intent rec = new Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION);
                startActivityForResult(rec, ACTIVITY_RECORD_SOUND);
        }
    }
}
