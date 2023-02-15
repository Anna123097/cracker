package com.example.vzlomshik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_Win extends AppCompatActivity implements View.OnClickListener{
    ImageView btnExit;
    ImageView btnAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        btnExit = findViewById(R.id.imageView9);
        btnAgain = findViewById(R.id.imageView7);

        btnAgain.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView9:
                finish();
                break;
            case R.id.imageView7:
                Intent intent = new Intent(Activity_Win.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}