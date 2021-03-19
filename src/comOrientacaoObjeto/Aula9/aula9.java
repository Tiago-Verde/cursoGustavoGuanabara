package comOrientacaoObjeto.Aula9;

public class aula9 {
    public static void main(String[] args) {

        Livro li = new Livro("Nada dura para Sempre", "Sidney Sheldon", 350, 0, false);
        Pessoa p1 = new Pessoa("Tiago", 36, "Masculino");

        li.setLeitor(p1);
        li.detalhes();
        p1.fazerAniversario();

        li.folhear();
        li.avancarPag();
        System.out.println(li.getPagAtual());




    }
}
