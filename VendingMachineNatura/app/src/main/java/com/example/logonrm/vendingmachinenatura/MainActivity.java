package com.example.logonrm.vendingmachinenatura;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends
        Activity {

    String value;
    String[] produtosNatura = {"Perfume", "Creme", "Desodorante", "Batom", "Shampoo"};

    private ArrayAdapter<Machine> adpMachine;
    private List<Machine> machines = new ArrayList<Machine>();

    private ArrayAdapter<Produto> adpProduto;
    private List<Produto> produtos = new ArrayList<Produto>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiate a ListView
        ListView listView = (ListView) findViewById(R.id.listView);
        // set the adapter to fill the data in ListView
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), produtosNatura);
        listView.setAdapter(customAdapter);
    }

    /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void carregarProduto() {

        String urlTXT = "http://vendingmachinenatura.appspot.com/api/1/produto/produto.json";

        JsonArrayRequest req = new JsonArrayRequest(urlTXT,
                new RequestProduto(adpProduto),
                new RequestError());
        RequestQueue q = Volley.newRequestQueue(this);
        q.add(req);

    }

    private void carregarMachine(int idProduto) {

        String urlTXT =
                "http://fipeapi.appspot.com/api/1/carros/veiculos/" + idProduto + ".json";

        JsonArrayRequest req = new JsonArrayRequest(urlTXT,
                new RequestMachine(adpMachine),
                new RequestError());
        RequestQueue q = Volley.newRequestQueue(this);
        q.add(req);

    }


    public void selecionarDia(View view) {
        Intent intent = new Intent(getApplicationContext(), SelecionarDiaPeriodo.class);
        startActivity(intent);
    }
}
