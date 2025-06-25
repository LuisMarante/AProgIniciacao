package MVC.GrandesNegocios.Controllers;

import MVC.GrandesNegocios.Models.Sale;
import MVC.GrandesNegocios.Repositories.SalesRepositories;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClientController {


    private SalesRepositories salesRepositories;

    public ClientController() throws FileNotFoundException {

        this.salesRepositories = new SalesRepositories();
    }


    public ArrayList<Sale> produtosDisponiveis() {

        ArrayList<Sale> produtosDisponiveis = new ArrayList<>();

        produtosDisponiveis.add(this.salesRepositories.getArrayListSales().getFirst());

        for (Sale saleAtual : this.salesRepositories.getArrayListSales()) {

            for (Sale saleProdutosDisponiveis : produtosDisponiveis) {

                if (saleAtual.getProduto().equalsIgnoreCase(saleProdutosDisponiveis.getProduto())) {
                    // nada acontece
                } else {
                    // adiciona ao nosso array
                    produtosDisponiveis.add(saleAtual);
                }
            }
        }

        return produtosDisponiveis;
    }

    public ArrayList<Sale> produtosPorCategoria(String tipoProduto) {

        ArrayList<Sale> produtosCategoria = new ArrayList<>();

        for(Sale saleAtual : this.salesRepositories.getArrayListSales()){
            if(saleAtual.getTipoProduto().equalsIgnoreCase(tipoProduto)){
                produtosCategoria.add(saleAtual);
            }
        }

        return produtosCategoria;
    }



}
