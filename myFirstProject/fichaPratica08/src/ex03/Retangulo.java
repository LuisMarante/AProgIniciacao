package ex03;

public class Retangulo {

    private String cor;
    private double altura;
    private double largura;


    /**
     * construtor da class retangulo
     * @param cor Cor do retangulo
     * @param altura Altura do retangulo
     * @param largura Largura do retangulo
     */
    public Retangulo (String cor, double altura, double largura){
        this.cor=cor;
        this.altura=altura;
        this.largura=largura;

    }

    public double calculoArea(){

        return this.largura * this.altura;
    }

    public double calculoPerimetro(){

        return this.largura*2 + this.altura*2;
    }







}
