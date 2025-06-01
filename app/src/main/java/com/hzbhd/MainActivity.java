package com.hzbhd;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private String[] steeringModes;
    private TextView valueTextView;

    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valueTextView = findViewById(R.id.power_steering_value);
        steeringModes = getResources().getStringArray(R.array.steering_modes);

        ImageView btnLeft = findViewById(R.id.power_steering_left_button);
        ImageView btnRight = findViewById(R.id.power_steering_right_button);
        btnLeft.setOnClickListener(v -> {
            currentIndex = (currentIndex - 1 + steeringModes.length) % steeringModes.length;
            updateText();
            sendToMcu(steeringModes[currentIndex]);
        });

        btnRight.setOnClickListener(v -> {
            currentIndex = (currentIndex + 1) % steeringModes.length;
            updateText();
            sendToMcu(steeringModes[currentIndex]);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    private void sendToMcu(String mode) {
        // Aquí envías la selección al MCU via AIDL
        Log.d("MCU", "Enviando modo: " + mode);
        // Ejemplo: mcuService.setSteeringMode(mode);
    }

    private void updateText() {
        valueTextView.setText(steeringModes[currentIndex]);
    }
}