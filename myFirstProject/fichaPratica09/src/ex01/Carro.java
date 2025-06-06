package ex01;

public class Carro {

    private String marca;
    private String modelo;
    private String cor;
    private int anoFabrico;
    private int potencia;
    private double cilindrada;
    private TipoCombustivel combustivel;
    private double consumo100km;

    public Carro(String marca, String modelo, String cor, int anoFabrico, int potencia, double cilindrada, TipoCombustivel combustivel, double consumo100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.consumo100km = consumo100km;
    }

    public double calcularConsumo(double distancia) {

return  (distancia * this.consumo100km)/100;
    }

    public Carro corrida(Carro carroAdversario) {
        if (this.potencia > carroAdversario.potencia) {
            System.out.println(this.marca + " " + this.modelo + " ganhou!");

        } else if (this.potencia < carroAdversario.potencia) {
            System.out.println(carroAdversario.marca + " " + carroAdversario.modelo + " ganhou!");
            return carroAdversario;

        } else {
            if (this.cilindrada > carroAdversario.cilindrada) {
                System.out.println(this.marca + " " + this.modelo + " ganhou!");
            } else if (this.cilindrada < carroAdversario.cilindrada) {
                System.out.println(carroAdversario.marca + " " + carroAdversario.modelo + " ganhou!");
                return carroAdversario;

            } else {
                if (this.calcularIdade() < carroAdversario.calcularIdade()) {
                    System.out.println(this.marca + " " + this.modelo + " ganhou!");
                } else if (this.calcularIdade() > carroAdversario.calcularIdade()) {
                    System.out.println(carroAdversario.marca + " " + carroAdversario.modelo + " ganhou!");
                    return carroAdversario;

                } else {
                    System.out.println("Empate! Ninguém ganhou a corrida");
                    return null;
                }
            }
        }

        return this;
    }

    public int calcularIdade() {
        return 2025 - this.anoFabrico;
    }

    public void ligar() {

        if (this.calcularIdade() > 30) {
            if (combustivel.equals(TipoCombustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-Vrum-Vrum");

            } else {
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-Vrum-Vrum");
            }

        } else {
            if (potencia >= 250) {
                System.out.println("O carro está ligado!");
                System.out.println("VRUUUUUUUUUUUUUUUUM!");
            } else {
                System.out.println("O carro está ligado!");
                System.out.println("vruuuuuuuum!");
            }
        }
    }
}
