package com.example.dating;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Iam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iam);

        CardView woman = findViewById(R.id.woman);
        CardView man = findViewById(R.id.man);

        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                woman.setBackgroundColor(Color.parseColor("#E94057"));
                man.setBackgroundColor(Color.WHITE);
            }
        });

        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                woman.setBackgroundColor(Color.WHITE);
                man.setBackgroundColor(Color.parseColor("#E94057"));
            }
        });
    }
}