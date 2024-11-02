package com.example.nexus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton navHome, navSearch, navFavorites, navProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ImageButtons
        navHome = findViewById(R.id.nav_home);
        navSearch = findViewById(R.id.nav_search);
        navFavorites = findViewById(R.id.nav_favorites);
        navProfile = findViewById(R.id.nav_profile);

        // Set click listeners for each button
        navHome.setOnClickListener(view -> {
            // Code to load Home fragment or activity
            // Example: loadFragment(new HomeFragment());
        });

        navSearch.setOnClickListener(view -> {
            // Code to load Search fragment or activity
        });

        navFavorites.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,schedulepage.class);
            startActivity(intent);
        });

        navProfile.setOnClickListener(view -> {
            // Navigate to SettingsActivity when settings icon is clicked
            Intent intent = new Intent(MainActivity.this,setting.class);
            startActivity(intent);
        });
    }

    // Optional: Helper method to load fragments, if needed
    // private void loadFragment(Fragment fragment) {
    //     getSupportFragmentManager().beginTransaction()
    //             .replace(R.id.fragment_container, fragment)
    //             .commit();
    // }
}
