package Seres;

public class Insecto extends SerVivo{

private boolean venenoso;

    public Insecto(String nome, String especie, String pais, int idade, boolean venenoso) {
        super(nome, especie, pais, idade);
        this.venenoso = venenoso;
    }

    public void exibirDetalhes() {

        System.out.println(this.nome + " | " + this.especie + " | " + this.pais + " | " + this.idade + " | " + this.venenoso );
    }
}
