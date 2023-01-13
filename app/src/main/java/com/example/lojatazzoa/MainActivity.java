package com.example.lojatazzoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin, btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        btnCadastro = findViewById(R.id.btnCadastro);

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrecadastro = new Intent(MainActivity.this, CadastroUsuario.class);
                startActivity(abrecadastro);
            }
        });
    }
    public void abrirLogin(View view){
        Intent abretelalogin = new Intent(MainActivity.this, Login.class);
        startActivity(abretelalogin);

    }

}