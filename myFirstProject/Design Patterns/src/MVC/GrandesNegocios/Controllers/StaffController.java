package MVC.GrandesNegocios.Controllers;

import MVC.GrandesNegocios.Models.Sale;
import MVC.GrandesNegocios.Repositories.SalesRepositories;

import java.io.FileNotFoundException;

public class StaffController {


    private SalesRepositories salesRepositories;

    public StaffController() throws FileNotFoundException {

        this.salesRepositories = new SalesRepositories();
    }


    public void adiconaVenda(String tipoProduto, String produto, double quantidade, double precoUnitario) {

        Sale newSale = new Sale(tipoProduto, produto, quantidade, precoUnitario);

        this.salesRepositories.getArrayListSales().add(newSale);

    }


    public Sale consultaStock(String produto) {

        Sale produtoEscolhido = null;

        for (Sale saleAtual : this.salesRepositories.getArrayListSales()) {
            if (saleAtual.getProduto().equalsIgnoreCase(produto)) {

                produtoEscolhido = saleAtual;
            }
        }
        return produtoEscolhido;
    }


}
