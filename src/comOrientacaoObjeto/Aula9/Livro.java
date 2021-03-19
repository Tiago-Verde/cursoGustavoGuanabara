package comOrientacaoObjeto.Aula9;

import java.util.Random;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, int pagAtual, boolean aberto) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }



    public String getAutor() {

        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }



    public int getTotalPaginas() {

        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {

        this.totalPaginas = totalPaginas;
    }



    public int getPagAtual() {

        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {

        this.pagAtual = pagAtual;
    }



    public boolean isAberto() {

        return aberto;
    }

    public void setAberto(boolean aberto) {

        this.aberto = aberto;
    }



    public Pessoa getLeitor() {

        return leitor;
    }

    public void setLeitor(Pessoa leitor) {

        this.leitor = leitor;
    }



    public void detalhes(){
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("Autor: " +this.getAutor());
        System.out.println("Nº de Pag: "+this.getTotalPaginas());
        System.out.println("Leitor: "+this.leitor.getNome());

    }

    @Override
    public void abrir() {
        this.setAberto(true);

    }

    @Override
    public void fechar() {
        this.setAberto(false);

    }

    @Override
    public void folhear() {
        Random folhear = new Random();
        int folha = folhear.nextInt(this.getTotalPaginas());
        this.setPagAtual(folha);
        System.out.println("o livro foi folheado até a pagina " +this.getPagAtual());

    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);

    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);

    }
}
