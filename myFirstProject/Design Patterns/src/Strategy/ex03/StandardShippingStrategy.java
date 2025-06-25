package Strategy.ex03;

public class StandardShippingStrategy implements ShippingStrategy{


    @Override
    public double calcularPortes(double peso) {

        System.out.println("Standard");

      double portes = peso * 5;

      return  portes;
    }
}
