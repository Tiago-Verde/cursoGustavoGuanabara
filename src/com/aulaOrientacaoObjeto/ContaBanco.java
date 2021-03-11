package com.aulaOrientacaoObjeto;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public void ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    public void retornaStatus(){
        System.out.println(getDono());
        System.out.println(getNumConta());
        System.out.println(getSaldo());
        System.out.println(getTipo());
        System.out.println(isStatus());
    }


    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }


    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }


    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    // abre conta verificando se é poupança ou corrente
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
            {
            }
        }
        System.out.println("Conta Aberta com sucesso");
    }



    // fecha conta verificando se tem saldo ou divida
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada. Realiza o saque do total primeiro");
        }else if (this.getSaldo() < 0) {
                System.out.println("Elimine a divida para so entao encerrar a conta");
            }else{
                this.setStatus(false);
            }
    }



    // verifica se a conta esta aberta e realiza de deposito
    public void depositar(float valor) {
        if (this.isStatus() == true){
            this.setSaldo(valor + this.getSaldo());
            System.out.println("Valor de "+valor+ " depositado com sucesso");
        }else{
                System.out.println("Conta ainda não foi aberta");
            }
        }



        // realiza saque em conta
        public void sacar(float v){
            if (this.isStatus() == true){
            }if(this.getSaldo() >= v){
                    this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso");
            }else{
                    System.out.println("Impossivel realizar saque. Saldo insuficiente");
            }
        }



        // cobra mensalidade conta corrente 12 conta poupança 20
        public void pagarMensal(){
        float v;
            if(getTipo() == "CC"){
                v = 12;
            }else if(getTipo() == "CP"){
                v = 20;
            if(isStatus()){
                    if(getSaldo() > v){
                      setSaldo(v-getSaldo());
                    }else{
                        System.out.println("Conta não possui saldo");
                    }
            }else{
                System.out.println("Conta não está aberta");
            }
            }

        }


}

