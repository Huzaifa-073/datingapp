package com.example.dating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        textView = findViewById(R.id.profile_name);
        imageView = findViewById(R.id.profile_image);

        String name = getIntent().getStringExtra("NAME_KEY");
        int imageResourceId = getIntent().getIntExtra("IMAGE_KEY", 0);
        textView.setText(name);

        if (imageResourceId != 0) {
            imageView.setImageResource(imageResourceId);
        }


    }
}