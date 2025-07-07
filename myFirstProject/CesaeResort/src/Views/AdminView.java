package Views;

import Controllers.AdminController;
import Models.Users;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AdminView {

    private AdminController adminController;

    public AdminView() throws FileNotFoundException {
        this.adminController = new AdminController();
    }

    public void adminMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int opcaoAdmin;

        do {

            System.out.println("\n\n********** MENU ADMIN **********");
            System.out.println("1. Consultar o total de reservas.");
            System.out.println("2. Consultar o total de receitas.");
            System.out.println("3. Consultar o total de reservas/receitas mensais.");
            System.out.println("4. Consultar a tipologia do quarto mais reservado.");
            System.out.println("5. Consultar a experiência mais procurada por adultos.");
            System.out.println("6. Consultar a experiência mais procurada por crianças.");
            System.out.println("7. Consultar a experiência mais lucrativa.");
            System.out.println("8. Consultar a experiência menos lucrativa.");
            System.out.println("9. Consultar quarto com melhor preço/semana.");
            System.out.println("10. Adicionar novo login.");
            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoAdmin = input.nextInt();

            switch (opcaoAdmin) {
                case 1:
                    System.out.println("\n***** Total Reservas *****");
                    AdminController ad1 = new AdminController();
                    ad1.totalReservas();

                    break;

                case 2:
                    System.out.println("\n***** Total Receitas *****");
                    AdminController ad2 = new AdminController();
                    ad2.totalReceitas();

                    break;

                case 3:
                    System.out.println("\n***** Total Reservas/Receitas mensais *****");
                    AdminController ad3 = new AdminController();
                    int ano, mes;

                    System.out.println("Em que ano?");
                    ano = input.nextInt();
                    System.out.println("Em que mês?");
                    mes = input.nextInt();

                    ad3.reservas_receitas_mensais(ano, mes);
                    break;


                case 4:
                    System.out.println("\n***** Tipologia do Quarto mais procurado *****");

                    AdminController ad4 = new AdminController();

                    ad4.tipologiaQuartoMaisReservado();

                    break;


                case 5:
                    System.out.println("\n***** Experiência mais procurada (adultos) *****");
                    AdminController ad5 = new AdminController();
                    ad5.experienciaMaisProcuradaAdultos();

                    break;

                case 6:
                    System.out.println("\n***** Experiência mais procurada (crianças) *****");
                    AdminController ad6 = new AdminController();
                    ad6.experienciaMaisProcuradaCriancas();
                    break;

                case 7:
                    System.out.println("\n***** Experiência mais lucrativa *****");
                    AdminController ad7 = new AdminController();

                    ad7.experienciaMaisLucrativa();
                case 8:
                    System.out.println("\n***** Experiência menos lucrativa *****");
                    AdminController ad8 = new AdminController();
                    ad8.experienciaMenosLucrativa();
                    break;

                case 9:
                    System.out.println("\n***** Quarto com melhor preço/semana *****");
                    AdminController ad9 = new AdminController();
                    ad9.quartoMelhorPreco_Semana();
                    break;

                case 10:
                    System.out.println("\n***** Novo Login *****");
                    AdminController ad10 = new AdminController();


                    String username, password, tipoAcesso;
                    System.out.println("Qual é o username?");
                    username = input.next();

                    System.out.println("Qual é a password?");
                    password = input.next();
                    System.out.println("Qual é o tipo de acesso?");
                    tipoAcesso = input.next();

                    ad10.adicionarLogin(username, password, tipoAcesso);
                    break;

                case 0:

                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcaoAdmin != 0);
    }



}
