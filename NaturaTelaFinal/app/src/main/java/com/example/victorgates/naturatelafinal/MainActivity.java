package com.example.victorgates.naturatelafinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView txtProds;
    private TextView txtDate;
    private TextView txtHora;
    private TextView txzLocal;
    private TextView txtEndereco;
    private Produto prod;
    private Machine mac;
    private Button btCompra;

    private List<Produto> prods;
    private ArrayAdapter<Produto> adpProds;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prods = new ArrayList<Produto>();
        txtProds = (ListView) findViewById(R.id.txtProduto);
        txtDate = (TextView) findViewById(R.id.txtData);
        txtHora = (TextView) findViewById(R.id.txtHora);
        txzLocal = (TextView) findViewById(R.id.txtLocal);
        txtEndereco = (TextView) findViewById(R.id.txtEndereco);
        btCompra = (Button) findViewById(R.id.btnConfirmar);
        adpProds = new ArrayAdapter<Produto>(this,android.R.layout.simple_list_item_1,prods);
        txtProds.setAdapter(adpProds);



    carregarMachine();

    }




        private void carregarProd(){

            try {

                JSONArray prods = new JSONArray(ServerProduto.request());

                for (int i = 0; i < prods.length(); i++) {

                    JSONObject PROD = prods.getJSONObject(i);

                    this.adpProds.add(new Produto(PROD.getInt("cod"), PROD.getString("prod"), PROD.getDouble("valor")));

                }

            } catch (JSONException e) {

                e.printStackTrace();

            }

        }

    private void carregarMachine(){

        try {


    String json = getString(R.string.jsonMachine);
                JSONObject Machine = new JSONObject(json);

                mac = new Machine(Machine.getString("desc"), Machine.getString("endereco"), Machine.getString("periodo"));

            txzLocal.setText(mac.getDescricao());
            txtEndereco.setText(mac.getEndereco());
             txtHora.setText(mac.getPeriodo());

        } catch (JSONException e) {

            e.printStackTrace();

        }

    }


    }

