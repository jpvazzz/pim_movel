package com.example.pimmovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pimmovel.dao.UsuarioDAO;
import com.example.pimmovel.model.Usuario;
import com.google.android.material.snackbar.Snackbar;

public class FormLogin extends AppCompatActivity {

    private Button button_tela_dadospessoais;
    private EditText edit_email,edit_senha;
    String[] mensagens = {"Prencha todos os campos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();

        iniciarComponentes();

        button_tela_dadospessoais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = edit_email.getText().toString();
                String senha = edit_senha.getText().toString();

                if (email.isEmpty() || senha.isEmpty()) {
                    Snackbar snackbar = Snackbar.make(view, mensagens[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }else{

                    AutenticarUsuario();



                }



            }
        });



    }

    private void AutenticarUsuario(){
        String email = edit_email.getText().toString();
        String senha = edit_senha.getText().toString();

        Usuario usu = new UsuarioDAO().selecionaUsuario(email, senha);
        if(usu != null);
        Intent intent = new Intent(FormLogin.this,FormDadosPessoais.class);
        startActivity(intent);

    }

        private void iniciarComponentes(){
            button_tela_dadospessoais = findViewById(R.id.bt_entrar);
            edit_email = findViewById(R.id.edit_email);
            edit_senha = findViewById(R.id.edit_eye);



    }
}