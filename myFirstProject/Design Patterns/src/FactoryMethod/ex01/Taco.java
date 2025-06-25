package FactoryMethod.ex01;

public abstract class Taco {
    protected boolean picante;
    protected double preco;


    public Taco(boolean picante, double preco) {
        this.picante = picante;
        this.preco = preco;
    }


    public abstract void prepare();


    public abstract void bake();


    public abstract void box();



}
