package com.example.logonrm.vendingmachinenatura;

import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;

public class RequestError implements Response.ErrorListener{

    @Override
    public void onErrorResponse(VolleyError error) {

        Log.e("Natura", "Erro: " + error.getMessage());

    }


}
