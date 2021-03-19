package comOrientacaoObjeto.Aula10;

public class Reptil extends Animal {

    protected String corEscama;


    @Override
    public void locomover() {
        System.out.println("Rastejar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer vegetais");

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");

    }
}
