package com.example.digitalhousegroceryapp;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private TextInputEditText editTextSenha;
    private TextInputEditText editTextConfirmarSenha;
    private TextInputEditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        FloatingActionButton fab = findViewById(R.id.fab_register);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botaoClicado(view);
            }
        });

        editTextEmail = findViewById(R.id.edit_text_email);
        editTextSenha = findViewById(R.id.edit_text_senha);
        editTextConfirmarSenha = findViewById(R.id.edit_text_confirmarSenha);
    }

    public void botaoClicado(View view) {

        editTextEmail.setError(null);
        editTextSenha.setError(null);
        editTextConfirmarSenha.setError(null);

        if (editTextEmail.getText().toString().equals("")){

            editTextEmail.setError("Digite um email");



        } if (!editTextSenha.getText().toString().equals(editTextConfirmarSenha.getText().toString())) {
            editTextConfirmarSenha.setError("Senhas diferentes");
        }

        else {
            Snackbar.make(view, "Usuário cadastrado com sucesso", Snackbar.LENGTH_INDEFINITE)
                    .setAction("OK", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    }).setActionTextColor(getResources().getColor(R.color.verde)).show();

        }
    }


}
