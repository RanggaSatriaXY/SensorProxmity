package com.example.rangga;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnproses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnproses = findViewById(R.id.btn_proses);
        btnproses.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, DataActivity.class);
            startActivity(i);
        });
    }
}