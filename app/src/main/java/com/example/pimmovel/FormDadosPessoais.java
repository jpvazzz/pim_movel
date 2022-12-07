package com.example.pimmovel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormDadosPessoais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_dados_pessoais);

        getSupportActionBar().hide();
    }
}