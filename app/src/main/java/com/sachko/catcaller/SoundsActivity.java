package com.sachko.catcaller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SoundsActivity extends AppCompatActivity {

    Button btnBack;
    Button btnSound1;
    Button btnSound2;
    Button btnSound3;
    Button btnSound4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sounds);
        final Intent i = new Intent(getBaseContext(), MainActivity.class);
        btnBack = findViewById(R.id.btnBack);
        btnSound1 = findViewById(R.id.btnSound1);
        btnSound2 = findViewById(R.id.btnSound2);
        btnSound3 = findViewById(R.id.btnSound3);
        btnSound4 = findViewById(R.id.btnSound4);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });
        btnSound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("sounds", "1");
                Toast toast = Toast.makeText(getApplicationContext(), "Sound 1 Selected!", Toast.LENGTH_LONG);
                toast.show();

            }
        });
        btnSound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("sounds", "2");
                Toast toast = Toast.makeText(getApplicationContext(), "Sound 2 Selected!", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        btnSound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("sounds", "3");
                Toast toast = Toast.makeText(getApplicationContext(), "Sound 3 Selected!", Toast.LENGTH_LONG);
                toast.show();
            }
        });
        btnSound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("sounds", "4");
                Toast toast = Toast.makeText(getApplicationContext(), "Sound 4 Selected!", Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }

}

