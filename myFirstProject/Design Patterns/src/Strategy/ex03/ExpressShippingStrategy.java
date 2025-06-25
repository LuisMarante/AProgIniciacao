package Strategy.ex03;

public class ExpressShippingStrategy implements ShippingStrategy{


    @Override
    public double calcularPortes(double peso) {

        System.out.println("Express");

        double portes = peso * 10;

        return  portes;

    }
}
