package FactoryMethod.ex01;

public class TacoFrango extends Taco{


    public TacoFrango(boolean picante, double preco) {
        super(picante, preco);
    }

    public void prepare() {
        System.out.println("A preparar taco de frango");
    }


    public void bake() {

    }


    public void box() {

    }

}
