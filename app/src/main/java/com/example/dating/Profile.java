package com.example.dating;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.google.android.material.textfield.TextInputLayout;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button birthDate = findViewById(R.id.birthDate);
        Button confirmation = findViewById(R.id.button4);
        DatePicker datePicker = findViewById(R.id.datePicker);
        EditText firstName = findViewById(R.id.editText5);
        TextInputLayout editText1 = findViewById(R.id.editTexts);
        TextInputLayout editText2 = findViewById(R.id.editTexts1);
        EditText LastName = findViewById(R.id.editText6);
        ImageView personImage = findViewById(R.id.imageView3);
        RelativeLayout relativeLayout = findViewById(R.id.relative);

        birthDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePicker.setVisibility(View.VISIBLE);
                firstName.setVisibility(View.INVISIBLE);
                LastName.setVisibility(View.INVISIBLE);
                birthDate.setVisibility(View.INVISIBLE);
                personImage.setVisibility(View.INVISIBLE);
                editText1.setVisibility(View.INVISIBLE);
                editText2.setVisibility(View.INVISIBLE);
            }
        });

        confirmation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Iam.class);
                startActivity(intent);
                finish();
            }
        });

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePicker.setVisibility(View.INVISIBLE);
                datePicker.setVisibility(View.INVISIBLE);
                firstName.setVisibility(View.VISIBLE);
                LastName.setVisibility(View.VISIBLE);
                birthDate.setVisibility(View.VISIBLE);
                personImage.setVisibility(View.VISIBLE);
                editText1.setVisibility(View.VISIBLE);
                editText2.setVisibility(View.VISIBLE);
            }
        });
    }
}