package com.example.lcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void qualMelhor(View view){
        TextInputEditText alcool = findViewById(R.id.alcool);
        TextInputEditText gasolina = findViewById(R.id.gasolina);
        TextView resultado = findViewById(R.id.resultado);
        String alcool1 = alcool.getText().toString();
        String gasolina1 = gasolina.getText().toString();
            if (alcool1.equals("") || gasolina1.equals("")){
                resultado.setText("Digite um valor nos dois campos.");
            }
            else{
                Double precoal = Double.parseDouble(alcool1);
                Double pregaso = Double.parseDouble(gasolina1);
                Double percent = (precoal / pregaso);
                if (percent >= 0.7){
                    resultado.setText("Gasolina é melhor que álcool.");
                }
                else{
                    resultado.setText("Alcool é melhor que gasolina.");
                }
            }

    }

}