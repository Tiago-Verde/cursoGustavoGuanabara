package com.company;
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String m, String C, float P){ // este é o metodo construtor
        this.tampar();
        this.cor = C;
        this.setModelo(m);
        this.setPonta(P);
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void Status(){
        System.out.println("Sobra a caneta: ");
        System.out.println("Modelo " +this.getModelo());
        System.out.println("Ponta " +this.getPonta());
        System.out.println("Cor " +this.cor);
        System.out.println("Tampada? " +this.tampada);

    }


}
