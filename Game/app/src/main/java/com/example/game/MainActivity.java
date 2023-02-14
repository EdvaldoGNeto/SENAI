package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedra(View view){
        Random random = new Random();
        int index = random.nextInt(3);
        TextView resultado = findViewById(R.id.resultado);
        ImageView padrao = findViewById(R.id.padrao);
        if (index == 1){
            resultado.setText("Empate!");
            padrao.setImageResource(R.drawable.pedra);
        }
        else if(index == 2){
            resultado.setText("Ganhou!");
            padrao.setImageResource(R.drawable.tesoura);
        }
            else{
            resultado.setText("Perdeu!");
            padrao.setImageResource(R.drawable.papel);
        }
    }

    public void tesoura(View view){
        Random random = new Random();
        int index = random.nextInt(3);
        TextView resultado = findViewById(R.id.resultado);
        ImageView padrao = findViewById(R.id.padrao);
        if (index == 1){
            resultado.setText("Perdeu!");
            padrao.setImageResource(R.drawable.pedra);
        }
        else if(index == 2){
            resultado.setText("Empate!");
            padrao.setImageResource(R.drawable.tesoura);
        }
        else{
            resultado.setText("Ganhou!");
            padrao.setImageResource(R.drawable.papel);
        }
    }

    public void papel(View view){
        Random random = new Random();
        int index = random.nextInt(3);
        TextView resultado = findViewById(R.id.resultado);
        ImageView padrao = findViewById(R.id.padrao);
        if (index == 1){
            resultado.setText("Ganhou!");
            padrao.setImageResource(R.drawable.pedra);
        }
        else if(index == 2){
            resultado.setText("Perdeu!");
            padrao.setImageResource(R.drawable.tesoura);
        }
        else{
            resultado.setText("Empate!");
            padrao.setImageResource(R.drawable.papel);
        }
    }

}