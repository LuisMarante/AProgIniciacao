package Views;

import Controllers.AdminController;
import Controllers.ClienteController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClienteView {

    private ClienteController clienteController;

    public ClienteView() throws FileNotFoundException {
        this.clienteController = new ClienteController();
    }

    public void clienteMenu() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcaoCliente;

        do {

            System.out.println("\n\n********** MENU CLIENTE **********");
            System.out.println("1. Consultar quartos disponíveis.");
            System.out.println("2. Consultar experiências disponíveis.");
            System.out.println("3. Consultar experiência com maior rating.");
            System.out.println("4. Consultar experiência Top-seller.");
            System.out.println("5. Avalia uma experiência.");
            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoCliente = input.nextInt();

            switch (opcaoCliente) {
                case 1:
                    System.out.println("\n***** Quartos Disponíveis *****");
                    ClienteController cc1 = new ClienteController();
                    System.out.println(cc1.quartosDisponiveis());
                    break;

                case 2:
                    System.out.println("\n***** Experiências Disponíveis *****");
                    ClienteController cc2 = new ClienteController();
                    cc2.experienciasDisponiveis();
                    break;

                case 3:
                    System.out.println("\n***** Melhor Experiência *****");
                    ClienteController cc3 = new ClienteController();
                    cc3.experienciaFavorita();
                    break;

                case 4:
                    System.out.println("\n***** Experiência Top-seller *****");
                    ClienteController cc4 = new ClienteController();
                    cc4.experienciaTopSeller();
                    break;

                case 5:
                    System.out.println("\n***** Avaliar Experiência *****");
                    ClienteController cc5 = new ClienteController();

                    String experiencia;
                    int ratingExperiencia, ratingGuia;

                    System.out.println("Qual é a experiencia?");
                    experiencia = input.next();
                    System.out.println("Raring da experienca:");
                    ratingExperiencia = input.nextInt();
                    System.out.println("Rating do guia:");
                    ratingGuia = input.nextInt();
                    cc5.adicionarExperiencia(experiencia, ratingExperiencia, ratingGuia);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcaoCliente != 0);
    }


}
