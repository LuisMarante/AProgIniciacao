package ex01;

public class Aviao {

    protected int numSerie;
    protected String modelo;
    protected int anoFabrico;
    protected double peso;
    protected double comprimentoFuselagem;
    protected double envergaduraAsas;
    protected double alturaCauda;
    protected int numMotores;
    protected int autonomia;
    protected double velocidadeMaxima;
    protected double preco;

    public Aviao(int numSerie, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double envergaduraAsas,
                 double alturaCauda, int numMotores, int autonomia, double velocidadeMaxima, double preco) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.comprimentoFuselagem = comprimentoFuselagem;
        this.envergaduraAsas = envergaduraAsas;
        this.alturaCauda = alturaCauda;
        this.numMotores = numMotores;
        this.autonomia = autonomia;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes(){
        System.out.println(this.numSerie + " | " + this.modelo + " | " + this.anoFabrico+ " | " + this.peso + " | " +this.comprimentoFuselagem+ " | " +envergaduraAsas+ " | " +this.alturaCauda+ " | "
                +this.numMotores+ " | " +this.autonomia+ " | " +this.velocidadeMaxima+ " | " +this.preco);
    }
}
