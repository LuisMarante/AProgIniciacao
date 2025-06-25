package Strategy.ex02;

public class PercentageDiscountStrategy implements DiscountStrategy{

private double percentagem;


    public PercentageDiscountStrategy(double percentagem) {
        this.percentagem = percentagem;
    }

    @Override
    public double calcularTotal(double valorInicial) {



        return valorInicial * (1-percentagem);
    }
}
