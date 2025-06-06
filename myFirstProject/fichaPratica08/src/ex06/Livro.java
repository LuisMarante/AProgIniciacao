package ex06;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private int isbn;

    public Livro(String titulo, String autor, String categoria, int numPaginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public void imprimirDetalhes(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(categoria);
        System.out.println(numPaginas);
        System.out.println(isbn);

    }

}
