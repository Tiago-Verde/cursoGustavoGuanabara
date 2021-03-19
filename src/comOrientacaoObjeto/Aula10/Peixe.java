package comOrientacaoObjeto.Aula10;

public class Peixe extends Animal{

    protected String corEscama;


    @Override
    public void locomover() {
        System.out.println("Nadando");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ração");

    }

    @Override
    public void emitirSom() {
        System.out.println("silencio");

    }

    public void soltarBolha(){
        System.out.println("glu glu");
    }
}
