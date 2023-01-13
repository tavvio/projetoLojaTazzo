package com.example.lojatazzoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText edtNomeUsuario, edtSenhaUsuario;
    private Button btnLoginLogin, btnVoltarLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtNomeUsuario = findViewById(R.id.edtLoginUsuario);
        edtSenhaUsuario = findViewById(R.id.edtSenhaUsuario);
        btnLoginLogin = findViewById(R.id.btnLogin);
        btnVoltarLogin = findViewById(R.id.btnVoltarLogin);
    }

    public void logar (View view){
        String usuario, senhausuario;
        usuario = edtNomeUsuario.getText().toString();
        senhausuario = edtSenhaUsuario.getText().toString();

        if(usuario.equals("usuario") && senhausuario.equals("senha")){
            Toast.makeText(getBaseContext(), "Login efetuado com sucesso!" + "\nUsuário: " + usuario, Toast.LENGTH_LONG).show();
            Intent iniciar = new Intent(Login.this, Menu.class);
            startActivity(iniciar);

        } else {
            Toast.makeText(getBaseContext(), "Usuário e/ou senha incorretos! Por favor, verifique seus dados.", Toast.LENGTH_SHORT).show();
        }

    }

    public void voltarParaInicio(View view){
        Intent voltainico = new Intent(Login.this, MainActivity.class);
        startActivity(voltainico);
    }
}