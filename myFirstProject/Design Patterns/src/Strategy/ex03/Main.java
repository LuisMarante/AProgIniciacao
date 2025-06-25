package Strategy.ex03;

public class Main {
    public static void main(String[] args) {

        ShippingCalculator calculatorStandard = new ShippingCalculator(new StandardShippingStrategy());

        ShippingCalculator calculatorOvernight = new ShippingCalculator(new OvernightShippingStrategy());

        ShippingCalculator calculatorExpress = new ShippingCalculator(new ExpressShippingStrategy());


        System.out.println(  calculatorStandard.calculateShippingCost(50));
        System.out.println( calculatorExpress.calculateShippingCost(50));

        System.out.println(   calculatorOvernight.calculateShippingCost(50));









    }
}
