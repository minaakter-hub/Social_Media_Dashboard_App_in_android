package com.example.nexus;

import android.content.Intent;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Set up the button click event
        Button getStartedButton = findViewById(R.id.getStartedButton);
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start a new activity when button is clicked
                Intent intent = new Intent(Welcome.this, login.class);
                startActivity(intent);
            }
        });

        // Set up the radial gradient for the "SOCIAL NEXUS" text
        TextView titleText = findViewById(R.id.titleText);

        // Apply the gradient after the layout is ready
        titleText.post(() -> {
            // Define a radial gradient with violet shades
            RadialGradient radialGradient = new RadialGradient(
                    titleText.getWidth() / 2f,
                    titleText.getHeight() / 2f,
                    titleText.getWidth() / 2f,
                    new int[]{
                            Color.parseColor("#9400D3"), // Dark Violet
                            Color.parseColor("#8A2BE2"), // Blue Violet
                            Color.parseColor("#BA55D3")  // Medium Orchid
                    },
                    null,
                    Shader.TileMode.CLAMP
            );

            // Set the shader on the text's paint
            titleText.getPaint().setShader(radialGradient);
        });
    }
}
