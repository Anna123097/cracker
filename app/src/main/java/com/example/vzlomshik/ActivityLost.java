package com.example.vzlomshik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ActivityLost extends AppCompatActivity implements View.OnClickListener{
    ImageView btnExit;
    ImageView btnAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost);

        btnExit = findViewById(R.id.imageView10);
        btnAgain = findViewById(R.id.imageView11);

        btnAgain.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView10:
                finish();
                break;
            case R.id.imageView11:
                Intent intent2 = new Intent(ActivityLost.this, MainActivity.class);
                startActivity(intent2);
                break;
        }
    }
}