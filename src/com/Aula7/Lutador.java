package com.Aula7;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empate;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empate = empate;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }



    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }



    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }



    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria() {
        if(this.peso < 52.2){
            System.out.println("Categoria inválida. Lutador abaixo do peso mínimo");
        }else if(this.peso <= 70.3){
            this.categoria = "leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            System.out.println(this.categoria = "Categoria Inválida");
        }
    }



    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }



    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }



    public int getEmpate() {
        return this.empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }



    public void apresentar(){
        System.out.println("--------------------------------------------------");
        System.out.println("E agora, vindo direto do " +this.getNacionalidade());
        System.out.println("Ele que tem um total de "+ this.getVitorias() + " vitorias " + this.getEmpate() + " empates e " + this.getDerrotas() + " derrotas");
        System.out.println("Com " +this.getIdade() + " anos de idade e pesando um total de " +this.getPeso() + "Kg");
        System.out.println("Representando a categoria peso " +this.getCategoria());
        System.out.println("O destemido, o unico o inigualável " +this.getNome());
        System.out.println("--------------------------------------------------");
    }


    public void status(){
        System.out.println("Lutador " +this.getNome());
    }



    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }



    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }



    public void empatarLuta(){
        this.setEmpate(this.getEmpate()+1);
    }
}
