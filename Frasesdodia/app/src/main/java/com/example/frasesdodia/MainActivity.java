package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fraseDoDia(View view){
        String[] frases = new String[5];
        frases[0] = "Levanta, sacode a poeira, dá a volta por cima.";
        frases[1] = "Respire fundo e fique atento às surpresas deliciosas que a vida preparou para você!";
        frases[2] = "Nem todos os dias são bons, mas há algo bom em cada dia.";
        frases[3] = "Respeite sua mente e trate seu corpo com carinho.";
        frases[4] = "Um passo de cada vez. Até meio passo serve. Siga firme, não há motivo para ter pressa.";
        Random rand = new Random();
        int index = rand.nextInt(frases.length);
        TextView texto = findViewById(R.id.texto);
        texto.setText(frases[index]);


    }

}