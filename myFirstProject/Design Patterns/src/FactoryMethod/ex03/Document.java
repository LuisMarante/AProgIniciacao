package FactoryMethod.ex03;

public abstract class Document {

    protected String nome;
    protected String autor;
    protected String extensao;

    public Document(String nome, String autor,String extensao) {
        this.nome = nome;
        this.autor = autor;
        this.extensao=extensao;

    }

    public abstract void open();

    public abstract void close();


    public abstract void save();

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getExtensao() {
        return extensao;
    }
}
