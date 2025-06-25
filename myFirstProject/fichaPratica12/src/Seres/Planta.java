package Seres;

import Enums.FamiliaPlantas;

public class Planta extends SerVivo {

    private FamiliaPlantas familiaPlantas;
    private int grauDefesa;

    public Planta(String nome, String especie, String pais, int idade, FamiliaPlantas familiaPlantas, int grauDefesa) {
        super(nome, especie, pais, idade);
        this.familiaPlantas = familiaPlantas;
        this.grauDefesa = grauDefesa;
    }
    public void exibirDetalhes() {

        System.out.println(this.nome + " | " + this.especie + " | " + this.pais + " | " + this.idade + " | " + this.familiaPlantas+ " | " +this.grauDefesa );
    }

    public FamiliaPlantas getFamiliaPlantas() {
        return familiaPlantas;
    }

    public int getGrauDefesa() {
        return grauDefesa;
    }
}
