package com.example.lojatazzoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class Sobre extends AppCompatActivity {

    private Button btnVoltarSobre, btnplay;
    private SeekBar posicao;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        btnVoltarSobre = findViewById(R.id.btnVoltarSobre);
        btnplay = findViewById(R.id.btnplay);
        posicao = findViewById(R.id.posicao);
        mp = MediaPlayer.create(this, R.raw.music);

        btnVoltarSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vol = new Intent(Sobre.this, Menu.class);
                startActivity(vol);
            }
        });

    }

    public void playMusica (View view){
        if(!mp.isPlaying()){
            mp.start();
            btnplay.setBackgroundResource(R.drawable.pause);

        } else {
            mp.pause();
            btnplay.setBackgroundResource(R.drawable.play);
        }

    }
}