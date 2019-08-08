package com.example.intentview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Relative extends AppCompatActivity implements View.OnClickListener {
    Button Reli,Susi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        Reli = (Button) findViewById(R.id.btnLanjut);
        Reli.setOnClickListener(this);
        Susi = (Button) findViewById(R.id.btnDirect);
        Susi.setOnClickListener(this);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLanjut:
                Intent lanjut = new Intent(Relative.this, LoginActivity.class);
                startActivity(lanjut);
                break;

            case R.id.btnDirect:
                Intent direct = new Intent(Relative.this, DirectActivity.class);
                startActivity(direct);
                break;
        }
    }


}
