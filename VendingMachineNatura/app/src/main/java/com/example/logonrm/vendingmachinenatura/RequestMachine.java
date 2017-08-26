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

public class RequestMachine implements Response.Listener<JSONArray> {

    private ArrayAdapter<Machine> adpMachine;

    public RequestMachine(ArrayAdapter<Machine> adpMachine){
        this.adpMachine = adpMachine;
    }


    @Override
    public void onResponse(JSONArray response) {

        for (int i = 0; i < response.length(); i++) {
            try {

                JSONObject obj = response.getJSONObject(i);
                adpMachine.add(new Machine(obj.getInt("codigo"),
                        obj.getString("descricao"),
                        obj.getString("endereco")));

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

        Log.i("Natura", response.toString());
    }
}
