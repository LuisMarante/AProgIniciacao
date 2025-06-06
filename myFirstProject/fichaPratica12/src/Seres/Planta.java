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


}
