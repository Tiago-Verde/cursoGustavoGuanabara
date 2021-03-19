package comOrientacaoObjeto.Aula10;

public class Aula10 {

    public static void main(String[] args) {

        Peixe nemo = new Peixe();
        Ave albatroz = new Ave();
        Reptil reptile = new Reptil();
        Canguru australia = new Canguru();
        Lobo mogli = new Lobo();
        Cachorro pluto = new Cachorro();

        nemo.emitirSom();
        albatroz.emitirSom();
        reptile.emitirSom();

        reptile.idade = 16;

        System.out.println("A idade do reptil é de "+reptile.idade);

        australia.emitirSom();
        australia.usarBolsa();
        australia.locomover();
        australia.idade = 45;

        System.out.println("A idade do canguru é: " +australia.idade);

        mogli.emitirSom();
        pluto.emitirSom();
        pluto.reagir(false);
        pluto.reagir("bom garoto");
        pluto.reagir(13, 50);



    }
}
