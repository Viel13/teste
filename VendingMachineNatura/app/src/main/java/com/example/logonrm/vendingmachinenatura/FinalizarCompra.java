package com.example.logonrm.vendingmachinenatura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FinalizarCompra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_compra);
    }

    public void ConfirmarCompra(View view) {
        Intent intent = new Intent(getApplicationContext(), ProdutoSelecionado.class);
        startActivity(intent);
    }
}
