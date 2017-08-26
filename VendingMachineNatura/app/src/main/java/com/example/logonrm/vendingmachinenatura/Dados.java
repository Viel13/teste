package com.example.logonrm.vendingmachinenatura;

/**
 * Created by logonrm on 17/07/2017.
 */

public class Dados {

    public static String requestProduto() {

        String json = "[{\"codigo\":\"001\", \"descricao\":\"Batom rosa\", \"valor\":12.00},\n" +
                       "{\"codigo\":\"002\", \"descricao\":\"Blush laranja\", \"valor\":22.00},\n" +
                       "{\"codigo\":\"003\", \"descricao\":\"Gloss vermelho\", \"valor\":14.00},\n" +
                       "{\"codigo\":\"004\", \"descricao\":\"Pó compacto\", \"valor\":35.00}]";

        return json;
    }


    public static String requestMachine() {

        String json = "[{\"codigo\":\"001\", \"descricao\":\"Estação Sé\", \"endereco\":\"Praça da Sé, s/n - Sé\"},\n" +
                "{\"codigo\":\"002\", \"descricao\":\"Estação República\", \"endereco\":\"Praça da República, 299 - República\"},\n" +
                "{\"codigo\":\"003\", \"descricao\":\"Estação Luz\", \"endereco\":\"Av. Prestes Maia, 925 - Santa Ifigênia\"},\n" +
                "{\"codigo\":\"004\", \"descricao\":\"Estação Pinheiros\", \"endereco\":\"Rua Capri, 145 - Pinheiros\"},\n" +
                "{\"codigo\":\"005\", \"descricao\":\"Estação Consolação\", \"endereco\":\"Av. Paulista, 2163 - Cerqueira César\"},\n" +
                "{\"codigo\":\"006\", \"descricao\":\"Estação Barra Funda\", \"endereco\":\"Rua Bento Teobaldo Ferraz, 119 - Barra Funda\"}]";

        return json;

    }

    public static String requestMachineProduto() {

        String json = "[{\"codigoProduto\":001, \"codigoProduto\":001, \"descricao\":\"Estação Sé\", \"endereco\":\"Praça da Sé, s/n - Sé\"},\n" +
                       "{\"codigoProduto\":002, \"codigoProduto\":002, \"descricao\":\"Estação República\", \"endereco\":\"Praça da República, 299 - República\"},\n" +
                       "{\"codigoProduto\":003, \"codigoProduto\":003, \"descricao\":\"Estação Luz\", \"endereco\":\"Av. Prestes Maia, 925 - Santa Ifigênia\"},\n" +
                       "{\"codigoProduto\":004, \"codigoProduto\":004, \"descricao\":\"Estação Pinheiros\", \"endereco\":\"Rua Capri, 145 - Pinheiros\"},\n" +
                       "{\"codigoProduto\":005, \"codigoProduto\":005, \"descricao\":\"Estação Consolação\", \"endereco\":\"Av. Paulista, 2163 - Cerqueira César\"},\n" +
                       "{\"codigoProduto\":006, \"codigoProduto\":006, \"descricao\":\"Estação Barra Funda\", \"endereco\":\"Rua Bento Teobaldo Ferraz, 119 - Barra Funda\"}]";

        return json;

    }
}
