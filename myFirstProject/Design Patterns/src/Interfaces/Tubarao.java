package Interfaces;

public class Tubarao extends Animal implements Aquatico{

    private boolean agressivo;

    public Tubarao(String nome, String cor, int idade, boolean agressivo) {
        super(nome, cor, idade);
        this.agressivo = agressivo;
    }

    @Override
    public void nadar() {
        System.out.println("O tubarão nada assim...");
    }

    @Override
    public void mergulha() {
        System.out.println("O tubarão mergulha assim...");
    }
}
