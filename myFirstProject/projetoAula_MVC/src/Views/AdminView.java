package Views;

import Controllers.AdminController;

import java.io.FileNotFoundException;
import java.util.Scanner;


    public class AdminView {
        private AdminController adminController;

        public AdminView()  throws FileNotFoundException {
            this.adminController = new AdminController();
        }

        public void adminMenu() throws FileNotFoundException {
            Scanner input = new Scanner(System.in);
            int opcaoAdmin;

            do {

                System.out.println("\n\n********** MENU ADMIN **********");
                System.out.println("1. Consultar o total de todas as vendas.");
                System.out.println("2. Consultar o total de lucro.");
                System.out.println("3. Consultar o total de vendas e lucro por mês, tabelado.");
                System.out.println("4. Consultar a atração mais procurada por adultos.");
                System.out.println("5. Consultar a atração mais procurada por crianças.");
                System.out.println("6. Consultar a atração mais procurada.");
                System.out.println("7. Consultar a atração mais lucrativa.");
                System.out.println("8. Consultar a atração menos lucrativa.");
                System.out.println("9. Consultar a atração com melhor preço/tempo.");
                System.out.println("10. Adicionar novo login.");
                System.out.println("0. Voltar");

                System.out.print("\nOpção: ");
                opcaoAdmin= input.nextInt();

                switch (opcaoAdmin){
                    case 1: // Consultar o total de todas as vendas
                        System.out.println("\n***** Total Vendas *****");
                        System.out.println(this.adminController.totalSalesValue()+" €");
                        break;

                    case 2: // Consultar o total de lucro
                        System.out.println("\n***** Lucro Total *****");
                        System.out.println(this.adminController.totalProfit()+" €");
                        break;

                    case 3: // Consultar o total de vendas e lucro por mês, tabelado
                        System.out.println("\n***** Total Vendas & Lucro por mês *****");
                        System.out.println(this.adminController.totalSalesAndProfitPerMonth());
                        break;

                    case 4: // Consultar a atração mais procurada por adultos (nº bilhetes vendidos)
                        System.out.println("\n***** Atração mais procurada (Adulto) *****");
                        // for test purposes
                        AdminController ad1 = new AdminController();
                        ad1.mostWantedAttractionByAdults();
                        break;

                    case 5: // Consultar a atração mais procurada por crianças (nº bilhetes vendidos)
                        System.out.println("\n***** Atração mais procurada (Criança) *****");
                        // for test purposes
                        AdminController ad2 = new AdminController();
                        ad2.mostWantedAttractionByChildren();
                        break;

                    case 6: // Consultar a atração mais procurada (nº bilhetes vendidos)
                        System.out.println("\n***** Atração mais procurada *****");
                        // for test purposes
                        AdminController ad3 = new AdminController();
                        ad3.mostWantedAttraction();
                        break;

                    case 7: // Consultar a atração mais lucrativa (considere o período total)
                        System.out.println("\n***** Atração mais lucrativa *****");
                        // for test purposes
                        AdminController ad4 = new AdminController();
                        ad4.mostProfitableAttraction();
                        break;

                    case 8: // Consultar a atração menos lucrativa (considere o período total)
                        System.out.println("\n***** Atração menos lucrativa *****");
                        // for test purposes
                        AdminController ad5 = new AdminController();
                        ad5.leastProfitableAttraction();
                        break;

                    case 9: // Consultar a atração com melhor preço/tempo (atração que custa menos por seg)
                        System.out.println("\n***** Atração com melhor relação preço/tempo *****");
                        // for test purposes
                        AdminController ad6 = new AdminController();
                        ad6.bestPriceTimeAttraction();
                        break;

                    case 10: // Adicionar novo login (permite adicionar um novo acesso válido, perguntando que tipo de acesso a criar)
                        System.out.println("\n***** Novo Login *****");
                        // for test purposes
                        AdminController ad7 = new AdminController();
                        ad7.newLogin();
                        break;

                    case 0: // Sair
                        break;

                    default:
                        System.out.println("\nOpção Inválida!");
                }

            }while (opcaoAdmin!=0);
        }
    }


