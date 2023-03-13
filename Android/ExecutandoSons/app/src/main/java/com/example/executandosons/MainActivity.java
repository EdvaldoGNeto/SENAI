package com.example.executandosons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
//    private ImageView play, pause, stop;
    private MediaPlayer mediaPlayer;
    private SeekBar seekBar;
    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teste);
        mediaPlayer.start();
//        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teste);
//        play = findViewById(R.id.play);
//        stop = findViewById(R.id.stop);
//        pause = findViewById(R.id.pause);

        inicializarSb();
    }


    private void inicializarSb(){
        seekBar = findViewById(R.id.seekBar);

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        int volumeMax = audioManager.getStreamMaxVolume(audioManager.STREAM_MUSIC);
        int volumeAtual = audioManager.getStreamVolume(audioManager.STREAM_MUSIC);

        seekBar.setMax(volumeMax);
        seekBar.setProgress(volumeAtual);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, AudioManager.FLAG_SHOW_UI);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void play(View view) {
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teste);
            } else {
                mediaPlayer.start();
            }
        }
    }


    public void pause1(View view){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }

    public void stop(View view){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teste);
        }
    }
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.play:
//                if(mediaPlayer != null){
//                    if (mediaPlayer.isPlaying()){
//                        mediaPlayer.stop();
//                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teste);
//                    }
//                }else {
//                    mediaPlayer.start();
//                }
//                break;
//            case R.id.pause:
//                if (mediaPlayer.isPlaying()){
//                    mediaPlayer.pause();
//                }
//
//                break;
//            case R.id.stop:
//                if (mediaPlayer.isPlaying()){
//                    mediaPlayer.stop();
//                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teste);
//                }
//                break;
//        }
//
//    }
}