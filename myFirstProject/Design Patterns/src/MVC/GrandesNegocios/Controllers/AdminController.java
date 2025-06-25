package MVC.GrandesNegocios.Controllers;

import MVC.GrandesNegocios.Models.Sale;
import MVC.GrandesNegocios.Repositories.SalesRepositories;

import java.io.FileNotFoundException;

public class AdminController {


    private SalesRepositories salesRepositories;


    public AdminController() throws FileNotFoundException {

        this.salesRepositories = new SalesRepositories();
    }



    public Sale produtoMaisVendido() {

        Sale produtoMaisVendido = this.salesRepositories.getArrayListSales().get(0);

        for (Sale saleAtual : this.salesRepositories.getArrayListSales()) {

            if (saleAtual.getQuantidade() > produtoMaisVendido.getQuantidade()) {
                produtoMaisVendido = saleAtual;
            }
        }
        return produtoMaisVendido;
    }


    public Sale maiorValorGerado() {

        Sale produtoQueGerouMais = this.salesRepositories.getArrayListSales().get(0);



        for (Sale saleAtual : this.salesRepositories.getArrayListSales()) {

            if ((saleAtual.getQuantidade() * saleAtual.getPrecoUnitario() > produtoMaisVendido().getPrecoUnitario() * produtoMaisVendido().getQuantidade())) {

                produtoQueGerouMais = saleAtual;
            }
        }

        return produtoQueGerouMais;
    }


    public Sale vendaMaisUnidades () {

        Sale vendaMaisUnidades = this.salesRepositories.getArrayListSales().get(0);

        for(Sale saleAtual : salesRepositories.getArrayListSales()){

            if(saleAtual.getQuantidade() > vendaMaisUnidades.getQuantidade()){

                vendaMaisUnidades = saleAtual;
            }
        }
        return vendaMaisUnidades;
    }

    public Sale vendaMaisValor () {

        Sale vendaMaisValor = this.salesRepositories.getArrayListSales().get(0);

        for(Sale saleAtual : salesRepositories.getArrayListSales()){

            if(saleAtual.getQuantidade() * saleAtual.getPrecoUnitario() > vendaMaisValor.getQuantidade()* vendaMaisValor().getPrecoUnitario() ){

                vendaMaisValor = saleAtual;
            }
        }
        return vendaMaisValor;
    }

    public double totalSalesValue() {

        double totalSalesValue = 0;

        for (Sale saleAtual : this.salesRepositories.getArrayListSales()) {
            totalSalesValue += saleAtual.getQuantidade() * saleAtual.getPrecoUnitario();
        }

        return totalSalesValue;
    }

    public double mediaSalesValue() {

        return totalSalesValue()/this.salesRepositories.getArrayListSales().size();
    }
}
