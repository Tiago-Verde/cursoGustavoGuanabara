package comOrientacaoObjeto.Aula10;

public class Cachorro extends Lobo{

    public void reagir(String frase) {
        if (frase.equals("bom garoto")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Latir");
        }

    }

    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar rabo alegre");
        }else{
            System.out.println("Morder");
        }

    }



    }


