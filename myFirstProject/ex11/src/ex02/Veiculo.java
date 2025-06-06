package ex02;

public class Veiculo {

    protected String marca;
    protected String modelo;
    protected int anoFabrico;
    protected int cilindrada;
    protected TipoCombustivel tipoCombustivel;
    protected double litros100KM;

    public Veiculo(String marca, String modelo, int anoFabrico, int cilindrada, TipoCombustivel tipoCombustivel, double litros100KM) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100KM = litros100KM;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void exibirDetalhes() {
        System.out.println(this.marca + " | " + this.modelo + " | " + this.anoFabrico + " | "
                + this.cilindrada + " | " + this.tipoCombustivel + " | " + this.litros100KM);

    }


    public void ligar() {
        System.out.println("O veículo está ligado");
    }


    public Veiculo corrida(Veiculo adversario) {
        Veiculo vencedor = null;
        if (this.getCilindrada() > adversario.getCilindrada()) {
            vencedor = this;
        } else if (adversario.getCilindrada() > this.getCilindrada()) {
            vencedor = adversario;
        } else {
            System.out.println("Houve empate");
        }

        return vencedor;
    }

    public double calcularCusto(double distancia) {

        double litrosTotais = this.litros100KM * distancia / 100;
// (GASOLINA = 2.10€/L, DIESEL = 1.95€/L, GPL = 1.15€/L, ELETRICO = 0.12€/L).

        double consumo = 0;
        if (this.tipoCombustivel.equals(TipoCombustivel.GASOLINA)) {
            consumo = litrosTotais * 2.1;
        } else if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)) {
            consumo = litrosTotais * 1.95;
        } else if (this.tipoCombustivel.equals(TipoCombustivel.GPL)) {
            consumo = litrosTotais * 1.15;
        } else if (this.tipoCombustivel.equals(TipoCombustivel.ELETRICO)) {
            consumo = litrosTotais * 0.12;
        }

        return consumo;
    }
}
