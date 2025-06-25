package MVC.GrandesNegocios.Views;

import MVC.GrandesNegocios.Controllers.AdminController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminView {




    private AdminController adminController;



    public AdminView() throws FileNotFoundException {

        this.adminController= new AdminController();
    }



    public void adminMenu() throws FileNotFoundException {


        Scanner input = new Scanner(System.in);
        int opcaoAdmin;

        do {

            System.out.println("\n\n********** MENU ADMIN **********");
            System.out.println("1. Produto Mais Vendido - Unidades");
            System.out.println("2. Produto Mais Vendido - Valor Vendas");
            System.out.println("3. Melhor Venda - Unidades");
            System.out.println("4. Melhor Venda - Valor");
            System.out.println("5. Total Vendas");
            System.out.println("6. Média Vendas");
            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoAdmin= input.nextInt();

            switch (opcaoAdmin){
                case 1: // Produto Mais Vendido - Unidades
                    AdminController admC1 = new AdminController();
                    admC1.produtoMaisVendido();
                    break;

                case 2: // Produto Mais Vendido - Valor de vendas
                    AdminController admC2 = new AdminController();
                    admC2.maiorValorGerado();
                    break;

                case 3: // Venda com mais unidades
                    AdminController admC3 = new AdminController();
                    admC3.vendaMaisUnidades();
                    break;


                case 4: // Venda que mais dinheiro gerou
                    AdminController admC4 = new AdminController();
                    admC4.vendaMaisValor();
                    break;

                case 5: // Total Vendas
                    AdminController admC5 = new AdminController();
                    admC5.totalSalesValue();
                    break;

                case 6: // Média de vendas
                    AdminController admC6 = new AdminController();
                    admC6.mediaSalesValue();
                    break;

                case 0:

                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        }while (opcaoAdmin!=0);
    }

}
