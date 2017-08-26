package com.example.logonrm.vendingmachinenatura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelecionarDiaPeriodo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecionar_dia_periodo);
    }

    public void Confirmar(View view) {
        Intent intent = new Intent(getApplicationContext(), FinalizarCompra.class);
        startActivity(intent);
    }


}
