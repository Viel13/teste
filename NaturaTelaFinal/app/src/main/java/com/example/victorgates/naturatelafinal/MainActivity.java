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

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private ListView txtProds;
    private TextView txtDate;
    private TextView txtHora;
    private TextView txzLocal;
    private TextView txtEndereco;
    private Produto prod;
    private Machine mac;
    private Button btCompra;
    private Compra compr;
    private List<Produto> prods;
    private ArrayAdapter<Produto> adpProds;
    private Calendar cal;
    private TextView textProd;
    private TextView txtTotal;
    private double Total;
    Locale local = new Locale("pt", "BR");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prods = new ArrayList<Produto>();
        txtTotal = (TextView) findViewById(R.id.txtTotal);
        textProd = (TextView) findViewById(R.id.textoProd);
        txtProds = (ListView) findViewById(R.id.txtProduto);
        txtDate = (TextView) findViewById(R.id.txtData);
        txtHora = (TextView) findViewById(R.id.txtHora);
        txzLocal = (TextView) findViewById(R.id.txtLocal);
        txtEndereco = (TextView) findViewById(R.id.txtEndereco);
        btCompra = (Button) findViewById(R.id.btnConfirmar);
        adpProds = new ArrayAdapter<Produto>(this,android.R.layout.simple_list_item_1,prods);
        txtProds.setAdapter(adpProds);
carregaData();
        carregarProd();
        carregarMachine();





    }




        private void carregarProd(){

            try {

                JSONArray prods = new JSONArray(ServerProduto.request());

                for (int i = 0; i < prods.length(); i++) {

                    JSONObject PROD = prods.getJSONObject(i);

                    this.adpProds.add(new Produto(PROD.getInt("cod"), PROD.getString("prod"), PROD.getDouble("valor")));
            this.Total = PROD.getDouble("valor") + Total;

                }
                txtTotal.setText("R$ " + Double.toString(Total));
            } catch (JSONException e) {

                e.printStackTrace();

            }

        }

    private void carregarMachine(){

        try {



                JSONObject Machine = new JSONObject(ServerMachine.request());
            mac = new Machine(Machine.getString("desc"), Machine.getString("endereco"), Machine.getString("periodo"));

            txtHora.setText(mac.getPeriodo());
            txzLocal.setText(mac.getDescricao());
            txtEndereco.setText(mac.getEndereco());





        } catch (JSONException e) {

            e.printStackTrace();

        }

    }

 private void carregaData()   {



     try {
         JSONObject  comprz = new JSONObject(ServerCompra.request());
         String mydate = comprz.getString("data");
        DateFormat dfI = new SimpleDateFormat("dd/MM/yyyy", local);
            DateFormat dfO = new SimpleDateFormat("dd/MM/yyyy", local);
          cal = Calendar.getInstance();
         cal.setTime(dfI.parse(mydate));
         compr = new Compra(cal);
         txtDate.setText(mydate);
     } catch (JSONException e) {
         e.printStackTrace();
     } catch (ParseException e) {
         e.printStackTrace();
     }





 }

}




