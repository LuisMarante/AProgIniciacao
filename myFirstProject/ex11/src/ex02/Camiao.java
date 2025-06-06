package ex02;

public class Camiao extends Veiculo {

    private double capacidadeCarga;


    public Camiao(String marca, String modelo, int anoFabrico, int cilindrada, TipoCombustivel tipoCombustivel, double litros100KM, double capacidadeCarga) {
        super(marca, modelo, anoFabrico, cilindrada, tipoCombustivel, litros100KM);
        this.capacidadeCarga = capacidadeCarga;
    }


    public void exibirDetalhes() {
        System.out.println(super.marca + " | " + super.modelo + " | " + super.anoFabrico + " | "
                + super.cilindrada + " | " + super.tipoCombustivel + " | " + super.litros100KM + " | " + this.capacidadeCarga);
    }


    public void viagem(double distancia, double carga) {
        double litros = this.litros100KM * distancia/100;
        double litrosExtra = (carga / 100) * 0.1;
        double totalLitros= litros+litrosExtra;

        double consumo = 0;
        double custo = 0;

        if (this.capacidadeCarga < carga) {
            System.out.println("Não pode fazer a viagem");
            return;
        } else {
            consumo = (totalLitros*100) / distancia;
            custo = totalLitros * 1.95;

        }

        System.out.println("Consumo: " + consumo);
        System.out.println("Custo: " + custo);


    }
}
