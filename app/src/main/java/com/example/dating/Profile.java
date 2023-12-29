package com.example.dating;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button birthDate = findViewById(R.id.birthDate);
        DatePicker datePicker = findViewById(R.id.datePicker);
        EditText firstName = findViewById(R.id.editText5);
        EditText LastName = findViewById(R.id.editText6);
        ImageView personImage = findViewById(R.id.imageView3);

        birthDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePicker.setVisibility(View.VISIBLE);
                firstName.setVisibility(View.GONE);
                LastName.setVisibility(View.GONE);
                birthDate.setVisibility(View.GONE);
                personImage.setVisibility(View.GONE);
            }
        });
    }
}