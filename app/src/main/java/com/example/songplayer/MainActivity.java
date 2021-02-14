package com.example.songplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.android_trailer);

        Button playbutton = (Button)findViewById(R.id.Play_button);

        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Play",Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });

        Button pausebutton = (Button)findViewById(R.id.Pause_button);

        pausebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Pause",Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });
    }
}
