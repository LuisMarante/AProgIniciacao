package ex03;

public class Peixe {

    private String especie;
    private double peso;
    private double precoPorKil;


    public Peixe(String especie, double peso, double precoPorKil) {
        this.especie = especie;
        this.peso = peso;
        this.precoPorKil = precoPorKil;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecoPorKil() {
        return precoPorKil;
    }
}
