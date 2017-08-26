package com.example.logonrm.vendingmachinenatura;

import android.util.Log;
import android.widget.ArrayAdapter;

import com.android.volley.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by logonrm on 17/07/2017.
 */

public class RequestProduto implements Response.Listener<JSONArray> {

    private ArrayAdapter<Produto> adpProduto;

    public RequestProduto(ArrayAdapter<Produto> adpProduto){
        this.adpProduto = adpProduto;
    }


    @Override
    public void onResponse(JSONArray response) {

        for (int i = 0; i < response.length(); i++) {
            try {

                JSONObject obj = response.getJSONObject(i);
                adpProduto.add(new Produto(obj.getInt("codigo"),
                                           obj.getString("descricao"),
                                           obj.getDouble("valor")));

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        Log.i("Natura", response.toString());
    }
}
