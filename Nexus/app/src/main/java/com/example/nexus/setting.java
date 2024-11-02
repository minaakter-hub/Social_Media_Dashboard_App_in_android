package com.example.nexus;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class setting extends AppCompatActivity {
  TextView account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_settings);
        account =findViewById(R.id.account);


        account.setOnClickListener(view -> {
            // Navigate to SettingsActivity when settings icon is clicked
            Intent intent = new Intent(setting.this, account.class);
            startActivity(intent);
        });
    }
}
