package com.example.victorgates.naturatelafinal;

/**
 * Created by logonrm on 17/07/2017.
 */

public class Machine {

    private int codigo;
    private String descricao;
    private String endereco;
    private String periodo;



    public Machine(String descricao, String endereco,String periodo) {

        this.descricao = descricao;
        this.endereco = endereco;
        this.periodo = periodo;
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return descricao + " " + endereco;
    }
}
