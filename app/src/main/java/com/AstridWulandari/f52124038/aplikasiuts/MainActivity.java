package com.AstridWulandari.f52124038.aplikasiuts;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etCari;
    ImageButton btnCari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCari = findViewById(R.id.etCari);
        btnCari = findViewById(R.id.btnCari);

        btnCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lagu = etCari.getText().toString();

                Toast.makeText(
                        MainActivity.this,
                        "Mencari: " + lagu,
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}