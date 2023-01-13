package com.example.lojatazzoa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FinalizarCompra extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Integer[] numerodeprodutos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private Spinner sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp10, sp11, sp12, sp13, sp14, sp15, sp16, sp17, sp18;
    private CheckBox ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9, ch10, ch11, ch12, ch13, ch14, ch15, ch16, ch17, ch18;
    private Button comprar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_compra);

        comprar = findViewById(R.id.btnAquiFinalizarCompra);

        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);
        ch5 = findViewById(R.id.ch5);
        ch6 = findViewById(R.id.ch6);
        ch7 = findViewById(R.id.ch7);
        ch8 = findViewById(R.id.ch8);
        ch9 = findViewById(R.id.ch9);
        ch10 = findViewById(R.id.ch10);
        ch11 = findViewById(R.id.ch11);
        ch12 = findViewById(R.id.ch12);
        ch13 = findViewById(R.id.ch13);
        ch14 = findViewById(R.id.ch14);
        ch15 = findViewById(R.id.ch15);
        ch16 = findViewById(R.id.ch16);
        ch17 = findViewById(R.id.ch17);
        ch18 = findViewById(R.id.ch18);

        sp1 = (Spinner) findViewById(R.id.sp1);
        sp2 = (Spinner) findViewById(R.id.sp2);
        sp3 = (Spinner) findViewById(R.id.sp3);
        sp4 = (Spinner) findViewById(R.id.sp4);
        sp5 = (Spinner) findViewById(R.id.sp5);
        sp6 = (Spinner) findViewById(R.id.sp6);
        sp7 = (Spinner) findViewById(R.id.sp7);
        sp8 = (Spinner) findViewById(R.id.sp8);
        sp9 = (Spinner) findViewById(R.id.sp9);
        sp10 = (Spinner) findViewById(R.id.sp10);
        sp11 = (Spinner) findViewById(R.id.sp11);
        sp12 = (Spinner) findViewById(R.id.sp12);
        sp13 = (Spinner) findViewById(R.id.sp13);
        sp14 = (Spinner) findViewById(R.id.sp14);
        sp15 = (Spinner) findViewById(R.id.sp15);
        sp16 = (Spinner) findViewById(R.id.sp16);
        sp17 = (Spinner) findViewById(R.id.sp17);
        sp18 = (Spinner) findViewById(R.id.sp18);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.sp1,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter1);
        sp1.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.sp2,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp2.setAdapter(adapter2);
        sp2.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.sp3,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp3.setAdapter(adapter3);
        sp3.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.sp4,android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp4.setAdapter(adapter4);
        sp4.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,R.array.sp5,android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp5.setAdapter(adapter5);
        sp5.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,R.array.sp6,android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp6.setAdapter(adapter6);
        sp6.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this,R.array.sp7,android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp7.setAdapter(adapter7);
        sp7.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this,R.array.sp8,android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp8.setAdapter(adapter8);
        sp8.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(this,R.array.sp9,android.R.layout.simple_spinner_item);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp9.setAdapter(adapter9);
        sp9.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter10 = ArrayAdapter.createFromResource(this,R.array.sp10,android.R.layout.simple_spinner_item);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp10.setAdapter(adapter10);
        sp10.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter11 = ArrayAdapter.createFromResource(this,R.array.sp11,android.R.layout.simple_spinner_item);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp11.setAdapter(adapter11);
        sp11.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter12 = ArrayAdapter.createFromResource(this,R.array.sp12,android.R.layout.simple_spinner_item);
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp12.setAdapter(adapter12);
        sp12.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter13 = ArrayAdapter.createFromResource(this,R.array.sp13,android.R.layout.simple_spinner_item);
        adapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp13.setAdapter(adapter13);
        sp13.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter14 = ArrayAdapter.createFromResource(this,R.array.sp14,android.R.layout.simple_spinner_item);
        adapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp14.setAdapter(adapter14);
        sp14.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter15 = ArrayAdapter.createFromResource(this,R.array.sp15,android.R.layout.simple_spinner_item);
        adapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp15.setAdapter(adapter15);
        sp15.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter16 = ArrayAdapter.createFromResource(this,R.array.sp16,android.R.layout.simple_spinner_item);
        adapter16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp16.setAdapter(adapter16);
        sp16.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter17 = ArrayAdapter.createFromResource(this,R.array.sp17,android.R.layout.simple_spinner_item);
        adapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp17.setAdapter(adapter17);
        sp17.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter18 = ArrayAdapter.createFromResource(this,R.array.sp18,android.R.layout.simple_spinner_item);
        adapter18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp18.setAdapter(adapter18);
        sp18.setOnItemSelectedListener(this);


        comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double valorTotal = 0.0, v1 = 0.0, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18;

                String p1 = "Fone Eifieder";
                String p2 = "Fone Fortrek";
                String p3 = "Fone CoreSound";
                String p4 = "Teclado HP";
                String p5 = "Teclado XZone";
                String p6 = "Teclado Redragon";
                String p7 = "Mouse Puma";
                String p8 = "Mouse Tesla";
                String p9 = "Mouse Tiger";
                String p10 = "Fonte Corsair";
                String p11 = "Fonte 400W";
                String p12 = "Fonte 600W";
                String p13 = "GTX 3060";
                String p14 = "GTX 3090";
                String p15 = "GTX 3050";
                String p16 = "Gabinete Blue";
                String p17 = "Gabinete Sharkoon";
                String p18 = "Gabinete Escritório";

                if(!ch1.isChecked() && !ch2.isChecked() && !ch3.isChecked() && !ch4.isChecked() && !ch5.isChecked() && !ch6.isChecked() && !ch7.isChecked() && !ch8.isChecked() && !ch9.isChecked() && !ch10.isChecked() && !ch11.isChecked() && !ch12.isChecked() && !ch13.isChecked() && !ch14.isChecked() && !ch15.isChecked() && !ch16.isChecked() && !ch17.isChecked() && !ch18.isChecked()){
                    Toast.makeText(getBaseContext(), "Nenhum produto selecionado.", Toast.LENGTH_LONG).show();
                } else {
                    if(ch1.isChecked()){
                        v1 = 299.90 * numerodeprodutos[sp1.getSelectedItemPosition()];
                        valorTotal += v1;
                    }
                    if(ch2.isChecked()){
                        v2 = 499.90 * numerodeprodutos[sp2.getSelectedItemPosition()];
                        valorTotal += v2;
                    }
                    if(ch3.isChecked()){
                        v3 = 169.90 * numerodeprodutos[sp3.getSelectedItemPosition()];
                        valorTotal += v3;
                    }
                    if(ch4.isChecked()){
                        v4 = 199.90 * numerodeprodutos[sp4.getSelectedItemPosition()];
                        valorTotal += v4;
                    }
                    if(ch5.isChecked()){
                        v5 = 492.70 * numerodeprodutos[sp5.getSelectedItemPosition()];
                        valorTotal += v5;
                    }
                    if(ch6.isChecked()){
                        v6 = 765.90 * numerodeprodutos[sp6.getSelectedItemPosition()];
                        valorTotal += v6;
                    }
                    if(ch7.isChecked()){
                        v7 = 309.90 * numerodeprodutos[sp7.getSelectedItemPosition()];
                        valorTotal += v7;
                    }
                    if(ch8.isChecked()){
                        v8 = 459.90 * numerodeprodutos[sp8.getSelectedItemPosition()];
                        valorTotal += v8;
                    }
                    if(ch9.isChecked()){
                        v9 = 99.90 * numerodeprodutos[sp9.getSelectedItemPosition()];
                        valorTotal += v9;
                    }
                    if(ch10.isChecked()){
                        v10 = 599.90 * numerodeprodutos[sp10.getSelectedItemPosition()];
                        valorTotal += v10;
                    }
                    if(ch11.isChecked()){
                        v11 = 489.90 * numerodeprodutos[sp11.getSelectedItemPosition()];
                        valorTotal += v11;
                    }
                    if(ch12.isChecked()){
                        v12 = 562.60 * numerodeprodutos[sp12.getSelectedItemPosition()];
                        valorTotal += v12;
                    }
                    if(ch13.isChecked()){
                        v13 = 4999.90 * numerodeprodutos[sp13.getSelectedItemPosition()];
                        valorTotal += v13;
                    }
                    if(ch14.isChecked()){
                        v14 = 17999.90 * numerodeprodutos[sp14.getSelectedItemPosition()];
                        valorTotal += v14;
                    }
                    if(ch15.isChecked()){
                        v15 = 3599.90 * numerodeprodutos[sp15.getSelectedItemPosition()];
                        valorTotal += v15;
                    }
                    if(ch16.isChecked()){
                        v16 = 1099.90 * numerodeprodutos[sp16.getSelectedItemPosition()];
                        valorTotal += v16;
                    }
                    if(ch17.isChecked()){
                        v17 = 2473.20 * numerodeprodutos[sp17.getSelectedItemPosition()];
                        valorTotal += v17;
                    }
                    if(ch18.isChecked()){
                        v18 = 129.90 * numerodeprodutos[sp18.getSelectedItemPosition()];
                        valorTotal += v18;
                    }
                }

                AlertDialog.Builder comprafinal = new AlertDialog.Builder(FinalizarCompra.this);
                comprafinal.setTitle("Compra Efetuada com Sucesso");
                comprafinal.setMessage("\nTOTAL: " + valorTotal);
                comprafinal.setNeutralButton("OK", null);
                comprafinal.show();

            }
        });

    }


    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}