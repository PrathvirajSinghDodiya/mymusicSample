package com.example.mymusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private MediaPlayer mediaPlayer,mediaPlayer1;
     private ImageButton imageButton1,imageButton2,imageButton3,imageButton4,imageButton5;
     String songs[] = {"bird","vivegam"};
     int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton1 = findViewById(R.id.imageButton);
        imageButton2 = findViewById(R.id.imageButton2);
        imageButton3 = findViewById(R.id.imageButton3);
        imageButton4 = findViewById(R.id.imageButton4);
        imageButton5 = findViewById(R.id.imageButton5);
        mediaPlayer = MediaPlayer.create(this,R.raw.bird);
        mediaPlayer1 = MediaPlayer.create(this,R.raw.vivegam);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Toast.makeText(MainActivity.this, "playing", Toast.LENGTH_SHORT).show();
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "pause", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
                mediaPlayer1.pause();
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mediaPlayer.isPlaying()){
                    mediaPlayer.start();
                    Toast.makeText(MainActivity.this, "set on loop", Toast.LENGTH_SHORT).show();
                    mediaPlayer.setLooping(true);
                }
                else if(!mediaPlayer1.isPlaying()){
                    mediaPlayer1.start();
                    Toast.makeText(MainActivity.this, "set on loop", Toast.LENGTH_SHORT).show();
                    mediaPlayer1.setLooping(true);
                }
            }
        });
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mediaPlayer.start();
                if(mediaPlayer1.isPlaying()){

                    mediaPlayer1.pause();


                }
            }
        });
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                mediaPlayer1.start();
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();


                }

            }
        });
    }
}