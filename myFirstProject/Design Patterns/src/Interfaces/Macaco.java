package Interfaces;

public class Macaco extends Animal implements Terrestre{
    private int capacidadeBananas;

    public Macaco(String nome, String cor, int idade, int capacidadeBananas) {
        super(nome, cor, idade);
        this.capacidadeBananas = capacidadeBananas;
    }

    public void trepar(){
        System.out.println("Subiu a uma arvore");
    }

    @Override
    public void andar() {
        System.out.println("O macaco anda assim");
    }

    @Override
    public void saltar() {
        System.out.println("O macaco salta assim");
    }
}
