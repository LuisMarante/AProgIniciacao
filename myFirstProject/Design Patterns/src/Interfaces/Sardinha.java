package Interfaces;

public class Sardinha extends Animal implements Aquatico{
    private int numEspinhas;

    public Sardinha(String nome, String cor, int idade, int numEspinhas) {
        super(nome, cor, idade);
        this.numEspinhas = numEspinhas;
    }


    @Override
    public void nadar() {
        System.out.println("A sardinha nada assim");
    }

    @Override
    public void mergulha() {
        System.out.println("A sardinha mergulha assim");
    }
}
