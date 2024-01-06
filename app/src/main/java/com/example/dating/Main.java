package com.example.dating;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Main extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    FrameLayout frameLayout;
    Home homeFragment = new Home();
    Messages messageFragment = new Messages();
    Likes likeFragment = new Likes();
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        frameLayout = findViewById(R.id.frameLayout);
        navigationView = findViewById(R.id.navBar);
        navigationView.setOnItemSelectedListener(this);
        navigationView.setSelectedItemId(R.id.main);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.main) {
            getSupportFragmentManager().beginTransaction().replace(frameLayout.getId(), homeFragment).commit();
            return true;
        } else if (id == R.id.like) {
            getSupportFragmentManager().beginTransaction().replace(frameLayout.getId(), likeFragment).commit();
            return true;
        } else if (id == R.id.message) {
            getSupportFragmentManager().beginTransaction().replace(frameLayout.getId(), messageFragment).commit();
            return true;
        }

        return false;
    }

}
