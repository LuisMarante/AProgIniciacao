package Strategy.ex02;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor pp1 = new PaymentProcessor(new NoDiscountStrategy());
        PaymentProcessor pp2 = new PaymentProcessor(new FlatDiscountStrategy(10));

PaymentProcessor p3 = new PaymentProcessor(new PercentageDiscountStrategy(0.2));






        System.out.println(p3.calcularTotal(100));
    }
}
