package com.example.guiexperiment;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvHello;
    Button btnFont, btnColor;

    float currentSize = 24f;
    int colorIndex = 0;

    int[] colors = {
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW,
            Color.CYAN,
            Color.MAGENTA,
            Color.WHITE
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHello = findViewById(R.id.tvHello);
        btnFont = findViewById(R.id.btnFont);
        btnColor = findViewById(R.id.btnColor);

        // Change Font Size
        btnFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentSize += 4f;
                if (currentSize > 60f) {
                    currentSize = 24f; // Reset size
                }
                tvHello.setTextSize(currentSize);
            }
        });

        // Change Color
        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorIndex++;
                if (colorIndex >= colors.length) {
                    colorIndex = 0;
                }
                tvHello.setTextColor(colors[colorIndex]);
            }
        });
    }
}
