package com.company;
public class Carro {

    private int quantidade = 0;

    public int getQuantidade() {
        return quantidade;
    }

    public int inserirPessoa(int x){

        quantidade = quantidade + x;
        return quantidade;
    }

    public int removerPessoa(int r){

        quantidade = (quantidade - r);
        return quantidade;
    }
}
