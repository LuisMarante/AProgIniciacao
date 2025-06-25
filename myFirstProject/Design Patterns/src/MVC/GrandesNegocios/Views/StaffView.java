package MVC.GrandesNegocios.Views;

import MVC.GrandesNegocios.Controllers.StaffController;
import MVC.GrandesNegocios.Models.Sale;
import MVC.GrandesNegocios.Repositories.SalesRepositories;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class StaffView {


    private StaffController staffController;


    public StaffView() throws FileNotFoundException {

        this.staffController = new StaffController();
    }


    public void staffMenu() throws FileNotFoundException {


        Scanner input = new Scanner(System.in);
        int opcaoAdmin;

        do {

            System.out.println("\n\n********** MENU ADMIN **********");
            System.out.println("1. Adicionar nova venda");
            System.out.println("2. Consultar stock de um produto");

            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoAdmin = input.nextInt();

            switch (opcaoAdmin) {
                case 1: // adicionar nova venda
                    StaffController stf1 = new StaffController();

                    System.out.print("Diga o tipo de produto:");
                    String tipoProduto = input.next();

                    System.out.print("Diga o nome do produto:");
                    String produto = input.next();

                    System.out.print("Diga a quantidade que foi vendida:");
                    double quantidade = input.nextDouble();

                    System.out.print("Diga o preço do produto (por unidade :");
                    double precoUnitario = input.nextDouble();

                    stf1.adiconaVenda(tipoProduto, produto, quantidade, precoUnitario);
                    break;

                case 2: // Consulta produto específico
                    StaffController stf2 = new StaffController();
                    System.out.print("Diga o produto que pretende pessquisar:");
                    String produtoParaPesquisa = input.next();
                    stf2.consultaStock(produtoParaPesquisa);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcaoAdmin != 0);
    }

}
