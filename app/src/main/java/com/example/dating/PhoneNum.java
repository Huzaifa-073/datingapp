package com.example.dating;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.hbb20.CountryCodePicker;

public class PhoneNum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_num);

        final CountryCodePicker countryCodePicker = findViewById(R.id.countryCodePicker);
        final EditText editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        Button submitButton = findViewById(R.id.submitButton);

//        submitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String selectedCountryCode = countryCodePicker.getSelectedCountryCode();
//                String phoneNumber = editTextPhoneNumber.getText().toString().trim();
//
//                if (phoneNumber.isEmpty()) {
//                    Toast.makeText(PhoneNum.this, "Please enter a phone number", Toast.LENGTH_SHORT).show();
//                } else {
//                    // Use selectedCountryCode and phoneNumber as needed
//                    String completePhoneNumber = "+" + selectedCountryCode + phoneNumber;
//                    Toast.makeText(PhoneNum.this, "Complete Phone Number: " + completePhoneNumber, Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Code.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
