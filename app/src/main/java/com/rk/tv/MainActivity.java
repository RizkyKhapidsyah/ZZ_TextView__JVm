package com.rk.tv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView TV_TextView_IDJAVA = findViewById(R.id.TV_TextView_IDXML);
        TV_TextView_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TV_TextView_IDJAVA.setText("Kamu Menekan TextView!");
            }
        });
    }
}
