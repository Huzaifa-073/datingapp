package com.example.dating;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Passions extends AppCompatActivity implements View.OnClickListener {

    CardView cv1, cv2, cv3, cv4, cv5, cv6, cv7, cv8, cv9, cv10;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passions);

        ImageView back = findViewById(R.id.back);
        Button next = findViewById(R.id.next);
        constraintLayout = findViewById(R.id.constraint);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);

        cv1 = findViewById(R.id.cv);
        cv2 = findViewById(R.id.cv2);
        cv3 = findViewById(R.id.cardView3);
        cv4 = findViewById(R.id.cardView4);
        cv5 = findViewById(R.id.cardView5);
        cv6 = findViewById(R.id.cardView6);
        cv7 = findViewById(R.id.cardView7);
        cv8 = findViewById(R.id.cardView8);
        cv9 = findViewById(R.id.cardView9);
        cv10 = findViewById(R.id.cardView10);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);

        cv1.setOnClickListener(this);
        cv2.setOnClickListener(this);
        cv3.setOnClickListener(this);
        cv4.setOnClickListener(this);
        cv5.setOnClickListener(this);
        cv6.setOnClickListener(this);
        cv7.setOnClickListener(this);
        cv8.setOnClickListener(this);
        cv9.setOnClickListener(this);
        cv10.setOnClickListener(this);

        constraintLayout.setOnClickListener(this);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Iam.class);
                startActivity(intent);
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {
        int item = view.getId();
        if (item == R.id.cv || item == R.id.btn1) {
            changeColor(cv1, btn1, R.drawable.mycamera2);
        } else if (item == R.id.cv2 || item == R.id.btn2) {
            changeColor(cv2, btn2, R.drawable.shopping2);
        } else if (item == R.id.cardView3 || item == R.id.btn3) {
            changeColor(cv3, btn3, R.drawable.my_voice2);
        } else if (item == R.id.cardView4 || item == R.id.btn4) {
            changeColor(cv4, btn4, R.drawable.my_tennis2);
        } else if (item == R.id.cardView5 || item == R.id.btn5) {
            changeColor(cv5, btn5, R.drawable.my_run2);
        } else if (item == R.id.cardView6 || item == R.id.btn6) {
            changeColor(cv6, btn6, R.drawable.my_art2);
        } else if (item == R.id.cardView7 || item == R.id.btn7) {
            changeColor(cv7, btn7, R.drawable.my_paragliding2);
        } else if (item == R.id.cardView8 || item == R.id.btn8) {
            changeColor(cv8, btn8, R.drawable.my_music2);
        } else if (item == R.id.cardView9 || item == R.id.btn9) {
            changeColor(cv9, btn9, R.drawable.my_games2);
        } else if (item == R.id.cardView10 || item == R.id.btn10) {
            changeColor(cv10, btn10, R.drawable.my_hiking2);
        } else if (item == R.id.constraint) {
            changeColorTwo(cv1, btn1, R.drawable.mycamera);
            changeColorTwo(cv2, btn2, R.drawable.shopping);
            changeColorTwo(cv3, btn3, R.drawable.my_voice);
            changeColorTwo(cv4, btn4, R.drawable.my_tennis);
            changeColorTwo(cv5, btn5, R.drawable.run);
            changeColorTwo(cv6, btn6, R.drawable.my_art);
            changeColorTwo(cv7, btn7, R.drawable.my_paragliding);
            changeColorTwo(cv8, btn8, R.drawable.my_music);
            changeColorTwo(cv9, btn9, R.drawable.my_games);
            changeColorTwo(cv10, btn10, R.drawable.my_hiking);
        }
    }

    public void changeColor ( CardView cv,  Button btn, int drawableId ) {
        cv.setBackgroundColor(Color.parseColor("#E94057"));
        btn.setBackgroundColor(Color.parseColor("#E94057"));
        btn.setCompoundDrawablesWithIntrinsicBounds(drawableId, 0, 0, 0);
        btn.setTextColor(Color.WHITE);
    }

    public void changeColorTwo(CardView cv, Button btn, int drawableId) {
        cv.setBackgroundColor(ContextCompat.getColor(this, android.R.color.white));
        btn.setBackgroundColor(ContextCompat.getColor(this, android.R.color.white));
        btn.setCompoundDrawablesWithIntrinsicBounds(drawableId, 0, 0, 0);
        btn.setTextColor(Color.BLACK);
    }
}