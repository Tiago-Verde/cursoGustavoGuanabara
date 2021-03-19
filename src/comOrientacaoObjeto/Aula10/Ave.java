package comOrientacaoObjeto.Aula10;

public class Ave extends Animal {

    private String corPena;


    public void fazerNinho(){
        System.out.println("Estou fazendo um ninho");
    }


    @Override
    public void locomover() {
        System.out.println("Voando");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo minhoca");

    }

    @Override
    public void emitirSom() {
        System.out.println("Ave gritando");

    }
}
