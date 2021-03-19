package comOrientacaoObjeto.aulaOrientacaoObjeto;

public class Main {

    public static void main(String[] args) {

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(0001);
        p1.setDono("Lindomar");
        p1.abrirConta("CC");
        p1.depositar(300);
        System.out.println(p1.getSaldo());
        p1.sacar(100);
        p1.retornaStatus();
        System.out.println("------------------");



        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(0002);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(200);
        p2.retornaStatus();

    }




}