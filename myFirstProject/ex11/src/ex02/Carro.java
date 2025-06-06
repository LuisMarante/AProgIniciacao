package ex02;

public class Carro extends Veiculo{

    private int numPasseiros;

    public Carro(String marca, String modelo, int anoFabrico, int cilindrada, TipoCombustivel tipoCombustivel, double litros100KM, int numPasseiros) {
        super(marca, modelo, anoFabrico, cilindrada, tipoCombustivel, litros100KM);
        this.numPasseiros = numPasseiros;

    }

    public void exibirDetalhes(){
        System.out.println(super.marca + " | " + super.modelo + " | " + super.anoFabrico + " | "
                + super.cilindrada + " | " + super.tipoCombustivel + " | " + super.litros100KM + " | " + this.numPasseiros);
    }

    public void calcularCustoViagem (double distancia){
// (GASOLINA = 2.10€/L, DIESEL = 1.95€/L, GPL = 1.15€/L, ELETRICO = 0.12€/L



    }
}

