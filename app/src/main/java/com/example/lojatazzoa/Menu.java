package com.example.lojatazzoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    private CardView crdPeri, crdHard, crdSobr, crdSair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        crdPeri = findViewById(R.id.crdPeri);
        crdHard = findViewById(R.id.crdHard);
        crdSobr = findViewById(R.id.crdSobr);
        crdSair = findViewById(R.id.crdSair);
    }

    public void sairPagina(View view){
        Intent sair = new Intent(Menu.this, MainActivity.class);
        startActivity(sair);

    }

    public void entraPerifericos(View view){
        Intent peri = new Intent(Menu.this, Perifericos.class);
        startActivity(peri);
    }

    public void entraHardware (View view){
        Intent hard = new Intent(Menu.this, HardwareProdutos.class);
        startActivity(hard);
    }
    public void entraSobre(View view){
        Intent sobr = new Intent(Menu.this, Sobre.class);
        startActivity(sobr);
    }
}