package com.example.vzlomshik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView btnPlay;
    ImageView btnRules;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.imageBtnPlay);
        btnRules = findViewById(R.id.imageBtnRules);

        btnPlay.setOnClickListener(this);
        btnRules.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageBtnPlay:
                Intent intentplay = new Intent(MainActivity.this, ActivityGame.class);
                startActivity(intentplay);
                finish();
                break;
            case R.id.imageBtnRules:
                Intent intentrules = new Intent(MainActivity.this, ActivityRules.class);
                startActivity(intentrules);
                finish();
                break;
        }
    }
}