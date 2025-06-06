package ex04;

public class Imovel {

    private String rua;
    private int numPorta;
    private String cidade;
    private Tipo tipo;
    private Acabamento acabamento;
    private double areaTotal;
    private int numQuartos;
    private int numBanheiros;
    private double areaPiscina;


    public Imovel(String rua, int numPorta, String cidade, Tipo tipo, Acabamento acabamento, double areaTotal,
                  int numQuartos, int numBanheiros, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.areaTotal = areaTotal;
        this.numQuartos = numQuartos;
        this.numBanheiros = numBanheiros;
        this.areaPiscina = areaPiscina;
    }

    public void exibirDetalhes() {
        System.out.println(this.rua + " | " + this.numPorta + " | " + this.cidade + " | " + this.tipo + " | " + this.acabamento
                + " | " + this.areaTotal + " | " + this.numQuartos + " | " + this.numBanheiros + " | " + this.areaPiscina);
    }


    public double calcularValor() {

        double valorTotal = 7500 * this.numQuartos + 10500 * numBanheiros;

        switch (this.tipo) {
            case CASA:
                valorTotal += 3000 * this.areaTotal;
                break;
            case APARTAMENTO:
                valorTotal += 1000 * this.areaTotal;
                break;
            case MANSAO:
                valorTotal += 5000 * this.areaTotal;
                break;
            default:
                System.out.println("Inválido. Inicie novamente");
                break;
        }

        switch (this.acabamento) {
            case NOVA:
                valorTotal += 0;
                break;
            case USADA:
                valorTotal *= 0.9;
                break;
            case PARA_RESTAURO:
                valorTotal *= 0.5;
                break;
            case NOVA_COM_ALTO_ACABAMENTO:
                valorTotal *= 1.25;
                break;
            default:
                System.out.println("Inválido. Inicie novamente");
                break;

        }
        return valorTotal;
    }
}


