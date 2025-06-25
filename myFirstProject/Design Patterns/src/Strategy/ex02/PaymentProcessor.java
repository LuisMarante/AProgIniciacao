package Strategy.ex02;

public class PaymentProcessor {

    private DiscountStrategy discountStrategy;

    public PaymentProcessor(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }


    public double calcularTotal(double valorInicial) {

        return discountStrategy.calcularTotal(valorInicial);

    }

}
