package com.jams.emergencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button WitnessButton = (Button) findViewById(R.id.CaptureButton);
        WitnessButton.setOnClickListener(v -> {
            // Perform action on click
            Intent activityChangeIntent = new Intent(MainActivity.this, WitnessActivity.class);

            MainActivity.this.startActivity(activityChangeIntent);
        });
    }
}