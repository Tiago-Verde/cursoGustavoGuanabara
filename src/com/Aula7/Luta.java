package com.Aula7;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private short round;
    private boolean aprovada;



    public Lutador getDesafiado() {

        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {

        this.desafiado = desafiado;
    }



    public Lutador getDesafiante() {

        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {

        this.desafiante = desafiante;
    }



    public short getRound() {

        return this.round;
    }

    public void setRound(short round) {
        this.round = round;
    }



    public boolean isAprovada() {

        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {

        this.aprovada = aprovada;
    }



    public void marcarLuta(Lutador l1 , Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && (l1 != l2)){
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }

    }



    public void lutar(){
        if(this.isAprovada()){
            this.desafiado.apresentar();
            System.out.println("##################");
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    System.out.println("Houve um empate");
                    break;
                case 1:
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println("O lutador " + this.desafiante.getNome() + " foi o vencedor");
                    break;
                case 2:
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    System.out.println("O vencedor foi " +this.desafiado.getNome());
                    break;
            }
        }else{
            System.out.println("Luta não pode ser realizada");
        }

    }
}
