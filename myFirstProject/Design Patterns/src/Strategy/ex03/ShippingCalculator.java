package Strategy.ex03;

public class ShippingCalculator {

    private ShippingStrategy shippingStrategy;

    public ShippingCalculator(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }


    public double calculateShippingCost(double peso){

        return shippingStrategy.calcularPortes(peso);
    }

}
