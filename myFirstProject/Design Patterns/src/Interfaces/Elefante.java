package Interfaces;

public class Elefante extends Animal implements Terrestre{
    private double compTromba;

    public Elefante(String nome, String cor, int idade, double compTromba) {
        super(nome, cor, idade);
        this.compTromba = compTromba;
    }

    public void abanarTromba(){
        System.out.println("Abanar a tromba...");
    }

    @Override
    public void andar() {
        System.out.println("O elefante anda assim");
    }

    @Override
    public void saltar() {
        System.out.println("O elefante salta assim");
    }
}
