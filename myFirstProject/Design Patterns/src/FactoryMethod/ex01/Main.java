package FactoryMethod.ex01;

public class Main {
    public static void main(String[] args) {
        Taco meuTaco = FabricaTacos.criarTaco("TacoFrango", true, 10);
        meuTaco.prepare();
    }
}
