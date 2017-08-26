package com.example.logonrm.vendingmachinenatura;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by logonrm on 17/07/2017.
 */

public class Produto {

    private int codigo;
    private String descricao;
    private double valor;
    private List<Machine> machines;

    public Produto(int codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto(int codigo, String descricao, double valor, List<Machine> machines) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.machines = machines;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Machine> getMachines() { return machines; }

    public void setMachines(List<Machine> machines) { this.machines = machines; }

    @Override
    public String toString() {
        return descricao + " " + valor;
    }

    public List<Machine> machines() {
        return machines;
    }
}
