package com.example.lojatazzoa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class CadastroUsuario extends AppCompatActivity {

    private EditText edtNome, edtEmail, edtSenha1, edtSenha2;
    private Button btnCadastrar, btnVoltar;
    private Switch switchCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        edtNome = findViewById(R.id.edtNomeUsu);
        edtEmail = findViewById(R.id.edtEmailUsu);
        edtSenha1 = findViewById(R.id.edtSenha1);
        edtSenha2 = findViewById(R.id.edtSenha2);
        switchCadastro = findViewById(R.id.switchCadastroAlerta);

    }

    public void cadastrarUsuario(View view){
        String nome, email, senha1, senha2;
        nome = edtNome.getText().toString();
        email = edtEmail.getText().toString();
        senha1 = edtSenha1.getText().toString();
        senha2 = edtSenha2.getText().toString();

        if(nome.equals("") || email.equals("") || senha1.equals("") || senha2.equals("")){
            Toast.makeText(getBaseContext(), "Por favor, preencha todos os campos corretamente.", Toast.LENGTH_SHORT).show();
        } else {
            if(edtSenha1.getText().toString().equals(edtSenha2.getText().toString())){
                if(switchCadastro.isChecked() == true){
                    AlertDialog.Builder alertaCadastro =  new AlertDialog.Builder(CadastroUsuario.this);
                    alertaCadastro.setTitle("Cadastro concluído");
                    alertaCadastro.setMessage("Cadastro realizado com sucesso!" + "\nDados do Usuário:" + "\nNome: " + nome + "\nEmail: " + email + "\nSenha: " + senha1);
                    alertaCadastro.setNeutralButton("OK", null);
                    alertaCadastro.show();
                } else {
                    Toast.makeText(getBaseContext(), "Cadastro realizado com sucesso!" + "\nDados do Usuário:" + "\nNome: " + nome + "\nEmail: " + email + "\nSenha: " + senha1, Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(getBaseContext(), "As senhas não coincidem.", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void voltarCadastro(View view){
        Intent voltarC = new Intent(CadastroUsuario.this, MainActivity.class);
        startActivity(voltarC);

    }
}