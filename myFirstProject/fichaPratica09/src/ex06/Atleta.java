package ex06;

public class Atleta {

    private String nome;
    private String modalidade;
    private int altura;
    private int peso;
    private String paisOrigem;
    private int ranking;

    public Atleta(String nome, String modalidade, int altura, int peso, String paisOrigem, int ranking) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
        this.ranking = ranking;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.modalidade + " | " + this.altura + " | " + this.peso + " | " + this.paisOrigem + " | " + this.ranking);


    }
}
