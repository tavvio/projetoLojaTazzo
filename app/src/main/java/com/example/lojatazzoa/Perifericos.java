package com.example.lojatazzoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Perifericos extends AppCompatActivity {

    private CheckBox ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9;
    private CardView crdVoltarPeri;
    private Button btnFinalizaar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perifericos);

        crdVoltarPeri = findViewById(R.id.crdVoltarPeri);
        btnFinalizaar = findViewById(R.id.btnFinalizarCompraPerifericos);

        btnFinalizaar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irfinali = new Intent(Perifericos.this, FinalizarCompra.class);
                startActivity(irfinali);
            }
        });
    }
    public void voltarPeri(View view){
        Intent voltarPeri = new Intent(Perifericos.this, Menu.class);
        startActivity(voltarPeri);

    }

}