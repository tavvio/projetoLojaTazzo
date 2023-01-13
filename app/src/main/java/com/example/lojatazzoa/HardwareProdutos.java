package com.example.lojatazzoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HardwareProdutos extends AppCompatActivity {

    private CardView crdVoltarHardware;
    private Button btnfinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware_produtos);

        crdVoltarHardware = findViewById(R.id.crdVoltarHardware);
        btnfinalizar = findViewById(R.id.btnFinalizarCompraHardware);

        crdVoltarHardware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarlaa = new Intent(HardwareProdutos.this, Menu.class);
                startActivity(voltarlaa);
            }
        });

        btnfinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irFinalizar = new Intent(HardwareProdutos.this, FinalizarCompra.class);
                startActivity(irFinalizar);
            }
        });
    }
}