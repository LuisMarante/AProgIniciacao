package FactoryMethod.ex01;

public class TacoVegetariano extends Taco {


    public TacoVegetariano(boolean picante, double preco) {
        super(picante, preco);
    }

    public void prepare() {
        System.out.println("A preparar taco vegetariano");
    }


    public void bake(){


    }


    public void box(){



    }


}
