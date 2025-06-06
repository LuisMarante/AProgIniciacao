package ex03;

public class Marisco {

    private String especie;
    private double peso;
    private double precoPorKilo;

    public Marisco(String especie, double peso, double precoPorKil) {
        this.especie = especie;
        this.peso = peso;
        this.precoPorKilo = precoPorKil;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecoPorKilo() {
        return precoPorKilo;
    }
}
