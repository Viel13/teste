package com.example.logonrm.vendingmachinenatura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProdutoSelecionado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto_selecionado);
    }

    public void anterior(View view) {
        Intent intent = new Intent(getApplicationContext(), SelecionarDiaPeriodo.class);
        startActivity(intent);
    }

    public void finalizar(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
