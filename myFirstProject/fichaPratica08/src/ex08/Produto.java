package ex08;

public class Produto {

    private String nome;
    private double preco;
    private int quantideStock = 0;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantideStock() {
        return quantideStock;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adquirirStock(int quantidade) {
        quantideStock += quantidade;

        System.out.println("Quantidade em Stock aumentada com sucesso");
    }


    public void venderProduto(int quantidadeParaVenda) {
        if (quantidadeParaVenda <= getQuantideStock()) {
            System.out.println("Venda realizada com sucesso. O preço total foi: " + quantidadeParaVenda * getPreco());
            quantideStock -= quantidadeParaVenda;

        } else{
            System.out.println("Não há stock suficiente");
        }
    }
}
