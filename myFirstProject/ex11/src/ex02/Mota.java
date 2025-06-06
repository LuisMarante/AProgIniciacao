package ex02;

public class Mota extends Veiculo{

    public Mota(String marca, String modelo, int anoFabrico, int cilindrada, TipoCombustivel tipoCombustivel, double litros100KM) {
        super(marca, modelo, anoFabrico, cilindrada, tipoCombustivel, litros100KM);
    }


    public void exibirDetalhes() {
        System.out.println(super.marca + " | " + super.modelo + " | " + super.anoFabrico + " | "
                + super.cilindrada + " | " + super.tipoCombustivel + " | " + super.litros100KM);
    }

    public void imprimoImagem(){


    }
}
