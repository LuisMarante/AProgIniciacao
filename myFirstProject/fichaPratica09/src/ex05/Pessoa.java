package ex05;

public class Pessoa {

    private String nome;
    private int idade;
    private String cidade;
    private String email;
    private int contacto;


    public Pessoa(String nome, int idade, String cidade, String email, int contacto) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.email = email;
        this.contacto = contacto;
    }

    public String getCidade() {
        return cidade;
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.idade + " | " + this.cidade + " | " + this.email + " | " + this.contacto);
    }
}
