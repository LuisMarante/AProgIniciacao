package Seres;

import Enums.Dieta;

public class Animal extends SerVivo{

private boolean fome;
private double peso;
private double inteligencia;
private Dieta dieta;
private String barulho;

    public Animal(String nome, String especie, String pais, int idade, boolean fome, double peso, double inteligencia, Dieta dieta, String barulho) {
        super(nome, especie, pais, idade);
        this.fome = fome;
        this.peso = peso;
        this.inteligencia = inteligencia;
        this.dieta = dieta;
        this.barulho = barulho;
    }


}
