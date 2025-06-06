package ex04;

public class Circulo {

    private String cor;
    private double raio;




    public Circulo(String cor, double raio){
        this.cor=cor;
        this.raio=raio;
    }


    public double calculoArea(){
        return Math.PI * raio * raio;

    }

    public double calculoPerimetro(){
        return 2 * Math.PI * raio;
    }
}
