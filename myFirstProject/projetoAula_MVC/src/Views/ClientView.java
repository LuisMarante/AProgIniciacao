package Views;

import Controllers.ClientController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientView {

    private ClientController clientController;

    public ClientView() throws FileNotFoundException {
        this.clientController = new ClientController();
    }

    public void mostrarMenu() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("★★★★★★ MENU CLIENTE ★★★★★★");
            System.out.println("1. Consultar Atrações Disponíveis");
            System.out.println("2. Consultar Atrações Favoritas");
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    //controller.listarAtracoes();
                    ClientController cm1 = new ClientController();
                    cm1.availableAttractions();
                    break;
                case 2:
                    // controller.mostrarAtracoesFavoritas();
                    ClientController cm2 = new ClientController();
                    cm2.favoriteAttractions();
                    break;
                case 0:
                    System.out.println("Sair...");
                    break;
                default:
                    System.out.println("Opção inválida! ☹︎");
            }
        } while (opcao != 0);
    }
}

