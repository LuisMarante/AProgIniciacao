package MVC.GrandesNegocios.Views;

import MVC.GrandesNegocios.Controllers.ClientController;
import MVC.GrandesNegocios.Models.Sale;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientView {

    private ClientController clientController;

    public ClientView() throws FileNotFoundException {
        this.clientController = new ClientController();
    }

    public void clientMenu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcaoCliente;

        do {

            System.out.println("\n\n********** MENU CLIENTE **********");
            System.out.println("1. Consultar Produtos Disponíveis");
            System.out.println("2. Consultar Produtos p/ Categoria");
            System.out.println("3. Consultar Produto Mais Barato / Mais Caro");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcaoCliente = input.nextInt();

            switch (opcaoCliente) {
                case 1: // Consultar Produtos Disponíveis
                    ClientController cc1 = new ClientController();
                    cc1.produtosDisponiveis();
                    break;

                case 2: // Consultar Produtos p/ Categoria
                    ClientController cc2 = new ClientController();
                    System.out.print("Diga a categoria que pretende pessquisar:");
                    String categoria = input.next();

                    for(Sale saleAtual : cc2.produtosPorCategoria(categoria)){
                        System.out.println("Nome:" + saleAtual.getProduto() + "Preço: " +saleAtual.getPrecoUnitario() );
                    }
                    break;

                case 3: // Consultar Produto Mais Barato / Mais Caro
                    ClientController cc3 = new ClientController();
                    System.out.print("Quer pesquisar o produto mais caro ou o mais barato?");
                    System.out.println("1. Mais caro");
                    System.out.println("2. Mais barato");
                    int opcao = input.nextInt();


                    break;

                case 0: // Voltar
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcaoCliente != 0);
    }

}
