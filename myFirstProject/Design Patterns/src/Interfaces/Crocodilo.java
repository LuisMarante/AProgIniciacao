package Interfaces;

public class Crocodilo extends Animal implements Terrestre, Aquatico {
    private double forcaMordida;

    public Crocodilo(String nome, String cor, int idade, double forcaMordida) {
        super(nome, cor, idade);
        this.forcaMordida = forcaMordida;
    }

    @Override
    public void nadar() {
        System.out.println("");
    }

    @Override
    public void mergulha() {

    }

    @Override
    public void andar() {

    }

    @Override
    public void saltar() {

    }
}
