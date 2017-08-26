package com.example.logonrm.vendingmachinenatura;

/**
 * Created by logonrm on 17/07/2017.
 */

public class Machine {

    private int codigo;
    private String descricao;
    private String endereco;

    public Machine(int codigo, String descricao, String endereco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return descricao + " " + endereco;
    }
}
