package com.example.victorgates.naturatelafinal;

import java.util.Calendar;

/**
  * Created by Victor Gates on 8/26/2017.
 */

public class Compra  {

    private Produto prod;
    private Machine machine;
    private Calendar dataCompra;

    public Compra( Calendar dataCompra) {

        this.dataCompra = dataCompra;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Calendar getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Calendar dataCompra) {
        this.dataCompra = dataCompra;
    }



}
