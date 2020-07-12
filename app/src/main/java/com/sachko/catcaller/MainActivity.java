package com.sachko.catcaller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button btnCall;
    Button btnChooseSounds;
    Button btnStop;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStop = findViewById(R.id.btnStop);
        btnCall = findViewById(R.id.btnCall);
        btnChooseSounds = findViewById(R.id.btnChooseSounds);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String receivedDataFromSounds;
                try {
                    receivedDataFromSounds = Objects.requireNonNull(getIntent().getExtras()).getString("sounds", "4");
                } catch (NullPointerException e) {
                    receivedDataFromSounds = "4";
                }
                switch (receivedDataFromSounds) {
                    case "1":
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound1);
                        break;
                    case "2":
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound2);
                        break;
                    case "3":
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound3);
                        break;
                    default:
                        mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sound4);
                        break;
                }

                mediaPlayer.start();
            }
        });
        btnChooseSounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), SoundsActivity.class);
                startActivity(intent);
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    mediaPlayer.stop();
                } catch (Exception ignored){

                }

            }
        });
    }
}
