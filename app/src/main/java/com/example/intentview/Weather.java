package com.example.intentview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Weather extends AppCompatActivity implements View.OnClickListener {
    Button weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        weather = (Button) findViewById(R.id.btnNext);
        weather.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnNext:
                Intent weather = new Intent(Weather.this, Relative.class);
                startActivity(weather);
                break;
        }
    }
}

