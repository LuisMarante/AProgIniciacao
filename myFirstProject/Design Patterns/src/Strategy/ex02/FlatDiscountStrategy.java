package Strategy.ex02;

public class FlatDiscountStrategy implements DiscountStrategy {

    private double descontoFixo;

    public FlatDiscountStrategy(double descontoFixo) {
        this.descontoFixo = descontoFixo;
    }

    @Override
    public double calcularTotal(double valorInicial) {
        return valorInicial - this.descontoFixo;
    }
}
