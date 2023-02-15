package com.example.vzlomshik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ActivityGame extends AppCompatActivity implements View.OnClickListener{
    ImageView Up1;
    ImageView Up2;
    ImageView Up3;
    ImageView Up4;
    ImageView Down1;
    ImageView Down2;
    ImageView Down3;
    ImageView Down4;
    ImageView yacheika1;
    ImageView yacheika2;
    ImageView yacheika3;
    ImageView yacheika4;
    ImageView close;
    ImageView imgmoves;
    ImageView inPlace;
    ImageView right;

    private int a1, a2, a3, a4;
    private int n1 = 0, n2 = 0, n3 = 0, n4 = 0;
    private int moves = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Up1 = findViewById(R.id.imageUp1);
        Up2 = findViewById(R.id.imageUp2);
        Up3 = findViewById(R.id.imageUp3);
        Up4 = findViewById(R.id.imageUp4);

        Down1 = findViewById(R.id.imageDown1);
        Down2 = findViewById(R.id.imageDown2);
        Down3 = findViewById(R.id.imageDown3);
        Down4 = findViewById(R.id.imageDown4);

        yacheika1 = findViewById(R.id.imageView);
        yacheika2 = findViewById(R.id.imageView3);
        yacheika3 = findViewById(R.id.imageView4);
        yacheika4 = findViewById(R.id.imageView5);

        close = findViewById(R.id.imageView17);

        imgmoves = findViewById(R.id.imageView8);
        inPlace = findViewById(R.id.imageInPlace);
        right = findViewById(R.id.imageRight);


        Up1.setOnClickListener(this);
        Up2.setOnClickListener(this);
        Up3.setOnClickListener(this);
        Up4.setOnClickListener(this);

        Down1.setOnClickListener(this);
        Down2.setOnClickListener(this);
        Down3.setOnClickListener(this);
        Down4.setOnClickListener(this);

        close.setOnClickListener(this);



        createNewDigits();
        showDigits();
    }

    private void showDigits() {
        switch (n1){
            case 0: yacheika1.setImageResource(R.drawable.ic_num1); break;
            case 1: yacheika1.setImageResource(R.drawable.ic_num2); break;
            case 2: yacheika1.setImageResource(R.drawable.ic_num3); break;
            case 3: yacheika1.setImageResource(R.drawable.ic_num4); break;
            case 4: yacheika1.setImageResource(R.drawable.ic_num5); break;
            case 5: yacheika1.setImageResource(R.drawable.ic_num6); break;
            case 6: yacheika1.setImageResource(R.drawable.ic_num7); break;
            case 7: yacheika1.setImageResource(R.drawable.ic_num8); break;
            case 8: yacheika1.setImageResource(R.drawable.ic_num9); break;
            case 9: yacheika1.setImageResource(R.drawable.ic_num10); break;
        }

        switch (n2){
            case 0: yacheika2.setImageResource(R.drawable.ic_num1); break;
            case 1: yacheika2.setImageResource(R.drawable.ic_num2); break;
            case 2: yacheika2.setImageResource(R.drawable.ic_num3); break;
            case 3: yacheika2.setImageResource(R.drawable.ic_num4); break;
            case 4: yacheika2.setImageResource(R.drawable.ic_num5); break;
            case 5: yacheika2.setImageResource(R.drawable.ic_num6); break;
            case 6: yacheika2.setImageResource(R.drawable.ic_num7); break;
            case 7: yacheika2.setImageResource(R.drawable.ic_num8); break;
            case 8: yacheika2.setImageResource(R.drawable.ic_num9); break;
            case 9: yacheika2.setImageResource(R.drawable.ic_num10); break;
        }

        switch (n3){
            case 0: yacheika3.setImageResource(R.drawable.ic_num1); break;
            case 1: yacheika3.setImageResource(R.drawable.ic_num2); break;
            case 2: yacheika3.setImageResource(R.drawable.ic_num3); break;
            case 3: yacheika3.setImageResource(R.drawable.ic_num4); break;
            case 4: yacheika3.setImageResource(R.drawable.ic_num5); break;
            case 5: yacheika3.setImageResource(R.drawable.ic_num6); break;
            case 6: yacheika3.setImageResource(R.drawable.ic_num7); break;
            case 7: yacheika3.setImageResource(R.drawable.ic_num8); break;
            case 8: yacheika3.setImageResource(R.drawable.ic_num9); break;
            case 9: yacheika3.setImageResource(R.drawable.ic_num10); break;
        }

        switch (n4){
            case 0: yacheika4.setImageResource(R.drawable.ic_num1); break;
            case 1: yacheika4.setImageResource(R.drawable.ic_num2); break;
            case 2: yacheika4.setImageResource(R.drawable.ic_num3); break;
            case 3: yacheika4.setImageResource(R.drawable.ic_num4); break;
            case 4: yacheika4.setImageResource(R.drawable.ic_num5); break;
            case 5: yacheika4.setImageResource(R.drawable.ic_num6); break;
            case 6: yacheika4.setImageResource(R.drawable.ic_num7); break;
            case 7: yacheika4.setImageResource(R.drawable.ic_num8); break;
            case 8: yacheika4.setImageResource(R.drawable.ic_num9); break;
            case 9: yacheika4.setImageResource(R.drawable.ic_num10); break;
        }
    }

    private void createNewDigits() {
        a1 = (int) ( Math.random() * 10 );
        a2 = (int) ( Math.random() * 10 );
        a3 = (int) ( Math.random() * 10 );
        a4 = (int) ( Math.random() * 10 );
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageUp1:
                n1 = n1 == 9 ? 0 : n1 + 1;
                break;
            case R.id.imageUp2:
                n2 = n2 == 9 ? 0 : n2 + 1;
                break;
            case R.id.imageUp3:
                n3 = n3 == 9 ? 0 : n3 + 1;
                break;
            case R.id.imageUp4:
                n4 = n4 == 9 ? 0 : n4 + 1;
                break;
            case R.id.imageDown1:
                n1 = n1 == 0 ? 9 : n1 - 1;
                break;
            case R.id.imageDown2:
                n2 = n2 == 0 ? 9 : n2 - 1;
                break;
            case R.id.imageDown3:
                n3 = n3 == 0 ? 9 : n3 - 1;
                break;
            case R.id.imageDown4:
                n4 = n4 == 0 ? 9 : n4 - 1;
                break;
            case R.id.imageView17:
                checkDigits();
                break;
        }
        showDigits();
    }

    private void checkDigits() {
        moves--;
        switch (moves){
            case 0: imgmoves.setImageResource(R.drawable.ic_num1); break;
            case 1: imgmoves.setImageResource(R.drawable.ic_num2); break;
            case 2: imgmoves.setImageResource(R.drawable.ic_num3); break;
            case 3: imgmoves.setImageResource(R.drawable.ic_num4); break;
            case 4: imgmoves.setImageResource(R.drawable.ic_num5); break;
            case 5: imgmoves.setImageResource(R.drawable.ic_num6); break;
            case 6: imgmoves.setImageResource(R.drawable.ic_num7); break;
            case 7: imgmoves.setImageResource(R.drawable.ic_num8); break;
            case 8: imgmoves.setImageResource(R.drawable.ic_num9); break;
            case 9: imgmoves.setImageResource(R.drawable.ic_num10); break;
        }

        if(n1 == a1 && n2 == a2 && n3 == a3 && n4 == a4){
            Intent intentWin = new Intent(ActivityGame.this, Activity_Win.class);
            startActivity(intentWin);
            finish();
        }
        if(moves == 0){
            showLost();
        }
        int r = 0;
        if (n1 == a1) r++;
        if (n2 == a2) r++;
        if (n3 == a3) r++;
        if (n4 == a4) r++;

        switch (r){
            case 0: right.setImageResource(R.drawable.ic_num1); break;
            case 1: right.setImageResource(R.drawable.ic_num2); break;
            case 2: right.setImageResource(R.drawable.ic_num3); break;
            case 3: right.setImageResource(R.drawable.ic_num4); break;
            case 4: right.setImageResource(R.drawable.ic_num5); break;
            case 5: right.setImageResource(R.drawable.ic_num6); break;
            case 6: right.setImageResource(R.drawable.ic_num7); break;
            case 7: right.setImageResource(R.drawable.ic_num8); break;
            case 8: right.setImageResource(R.drawable.ic_num9); break;
            case 9: right.setImageResource(R.drawable.ic_num10); break;
        }
        int d = 0;

        int b1 = n1;
        int b2 = n2;
        int b3 = n3;
        int b4 = n4;

        if      (a1 == b1) { d++; b1 = -1; }
        else if (a1 == b2) { d++; b2 = -1; }
        else if (a1 == b3) { d++; b3 = -1; }
        else if (a1 == b4) { d++; b4 = -1; }

        if      (a2 == b1) { d++; b1 = -1; }
        else if (a2 == b2) { d++; b2 = -1; }
        else if (a2 == b3) { d++; b3 = -1; }
        else if (a2 == b4) { d++; b4 = -1; }

        if      (a3 == b1) { d++; b1 = -1; }
        else if (a3 == b2) { d++; b2 = -1; }
        else if (a3 == b3) { d++; b3 = -1; }
        else if (a3 == b4) { d++; b4 = -1; }

        if      (a4 == b1) { d++; b1 = -1; }
        else if (a4 == b2) { d++; b2 = -1; }
        else if (a4 == b3) { d++; b3 = -1; }
        else if (a4 == b4) { d++; b4 = -1; }

        switch (d){
            case 0: inPlace.setImageResource(R.drawable.ic_num1); break;
            case 1: inPlace.setImageResource(R.drawable.ic_num2); break;
            case 2: inPlace.setImageResource(R.drawable.ic_num3); break;
            case 3: inPlace.setImageResource(R.drawable.ic_num4); break;
            case 4: inPlace.setImageResource(R.drawable.ic_num5); break;
            case 5: inPlace.setImageResource(R.drawable.ic_num6); break;
            case 6: inPlace.setImageResource(R.drawable.ic_num7); break;
            case 7: inPlace.setImageResource(R.drawable.ic_num8); break;
            case 8: inPlace.setImageResource(R.drawable.ic_num9); break;
            case 9: inPlace.setImageResource(R.drawable.ic_num10); break;
        }
    }

    private void showLost() {
        Intent intentLost = new Intent(ActivityGame.this,ActivityLost.class);
        startActivity(intentLost);
        finish();

    }
}