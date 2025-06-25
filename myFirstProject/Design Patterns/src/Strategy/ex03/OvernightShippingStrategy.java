package Strategy.ex03;

public class OvernightShippingStrategy implements  ShippingStrategy{


    @Override
    public double calcularPortes(double peso) {

        System.out.println("Overnight");

        double portes = peso * 15;

        return  portes;
    }

}
