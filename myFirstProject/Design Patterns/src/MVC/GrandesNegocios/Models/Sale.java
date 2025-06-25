package MVC.GrandesNegocios.Models;

public class Sale {


    private String tipoProduto;
    private String produto;
    private double quantidade;
    private double precoUnitario;


    public Sale(String tipoProduto, String produto, double quantidade, double precoUnitario) {
        this.tipoProduto = tipoProduto;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public String getProduto() {
        return produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}
