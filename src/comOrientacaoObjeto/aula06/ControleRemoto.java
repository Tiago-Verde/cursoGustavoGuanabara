package comOrientacaoObjeto.aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;


    @Override
    public void ligar() {
        this.setLigado(true);
    }



    @Override
    public void desligar() {
        this.setLigado(false);
    }



    @Override
    public void abrirMenu() {
        if(!this.isLigado()){
            System.out.println("Não pode acessar menu. Aparelho desligado");
        }
        System.out.println("Menu foi aberto");
        for(int i = 0; i <= this.getVolume(); i +=10){
            System.out.println("|");
        }
    }



    @Override
    public void fecharMenu() {
        if(!this.isLigado()){
            System.out.println("Aparelho desligado");
        }
        System.out.println("Menu foi fechado");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume()+1);
        }
    }



    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume()-1);
        }
    }



    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() >0){
            this.setVolume(0);
        }
    }



    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }



    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
            System.out.println("Em estado de play");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
            System.out.println("Em pause");
        }

    }

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }



    private void setVolume(int volume) {
        this.volume = volume;
    }



    private boolean isLigado() {
        return ligado;
    }



    private void setLigado(boolean ligado) {
        this.ligado = true;
    }



    private boolean isTocando() {
        return tocando;
    }



    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }




    public void mostrarStatus(){
        System.out.println("----------------------------");
        System.out.println("Volume: " +getVolume());
        System.out.println("Tocando: " +isTocando());
        System.out.println("Ligado: " +isLigado());
        System.out.println("-----------------------------");

    }


}
