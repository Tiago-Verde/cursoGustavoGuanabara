package com.company;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carro carro1 = new Carro();

        Caneta c1 = new Caneta("Faber Russa", "Amarela", 1.8f);
        c1.Status();

        System.out.println("Para inserir digite 1 para remover digite 2");
        int recebe = sc.nextInt();

        if (recebe == 1) {
            System.out.println("Qual a quantidade sera inserida: ");
            int insereQtd = sc.nextInt();
            carro1.inserirPessoa(insereQtd);
        } else {
            System.out.println("Qual a quantidade sera removida: ");
            int removeQtd = sc.nextInt();
            carro1.removerPessoa(removeQtd);
        }

        System.out.println("A quantidade de pessoas no veiculo é de: " + carro1.getQuantidade());


    }
}



