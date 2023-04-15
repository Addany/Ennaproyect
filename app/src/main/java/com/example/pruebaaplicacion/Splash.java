package com.example.pruebaaplicacion;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        //lLAMAMOS AL VIDEOVIEW POR MEDIO DE SU ID//
        VideoView videoView = findViewById(R.id.videoView);
        //UBICAMOS LA CARPETA EN DONDE SE ENCUENTRA EL VIDEO CON EL NOMBRE DEL VIDEO
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.splash);
        //ASIGNAMOS A LA VIZUALICACION DEL VIDEO CON DELAY PARA QUE INICIE UN ACTIVTY
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(Splash.this,MainActivity.class));
                        finish();
                    }
                },500);
            }
        });
        //SE MANDA EL VIDEO A INICIAR
        videoView.start();

    }
}