package Strategy.ex02;

public class NoDiscountStrategy implements DiscountStrategy{


    @Override
    public double calcularTotal(double valorInicial) {

        return valorInicial;

    }
}
