package com.example.pimmovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormDadosPessoais extends AppCompatActivity {

    private TextView textNomeUsuario,textEmailUsuario;
    private Button bt_deslogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_dados_pessoais);

        getSupportActionBar().hide();

        iniciarComponentes();

        bt_deslogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FormDadosPessoais.this,FormLogin.class);
                startActivity(intent);
                finish();

            }
        });

    }

    private void iniciarComponentes(){

    textNomeUsuario = findViewById(R.id.textNomeUsuario);
    textEmailUsuario = findViewById(R.id.textEmailUsuario);
    bt_deslogar = findViewById(R.id.bt_deslogar);
    }
}