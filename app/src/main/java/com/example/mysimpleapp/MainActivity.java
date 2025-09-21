
package com.example.mysimpleapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private boolean isDay = true;
    private ImageView background;
    private Button toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = findViewById(R.id.background);
        toggleButton = findViewById(R.id.toggleButton);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isDay) {
                    background.setImageResource(R.drawable.night);
                    toggleButton.setText("Switch to Day");
                } else {
                    background.setImageResource(R.drawable.day);
                    toggleButton.setText("Switch to Night");
                }
                isDay = !isDay;
            }
        });
    }
}
    