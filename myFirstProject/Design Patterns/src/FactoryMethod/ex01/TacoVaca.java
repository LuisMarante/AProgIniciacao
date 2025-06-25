package FactoryMethod.ex01;

public class TacoVaca extends Taco{


    public TacoVaca(boolean picante, double preco) {
        super(picante, preco);
    }

    public void prepare() {
        System.out.println("A preparar taco de vaca");
    }


    public void bake() {

    }


    public void box() {

    }



}
