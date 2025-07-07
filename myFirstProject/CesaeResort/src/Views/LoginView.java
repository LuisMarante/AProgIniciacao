package Views;

import Controllers.LoginControler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LoginView {

    private LoginControler loginController;

    public LoginView() throws FileNotFoundException {

        this.loginController = new LoginControler();
    }

    public void mainMenu() throws IOException {

        Scanner input = new Scanner(System.in);
        int opcaoLogin;

        do {
            System.out.println("\n\n********** Bem-vindo/a Parque de diversões Cesaeland **********\n");
            System.out.println("1. Cliente");
            System.out.println("2. Staff");
            System.out.println("\n0. Terminar Programa");

            System.out.print("\nOpção: ");
            opcaoLogin = input.nextInt();

            switch (opcaoLogin) {
                case 1:

                    ClienteView cliente = new ClienteView();
                    cliente.clienteMenu();
                    break;

                case 2:

                    this.loginMenu();
                    break;
                case 0:
                    System.out.println("\nObrigado por utilizar o nosso programa... Até à próxima!");
                    loginController.guardar();
                    break;

                default:
                    System.out.println("\nOpção Inválida");
            }
        } while (opcaoLogin != 0);
    }

    public void loginMenu() throws IOException {


        Scanner input = new Scanner(System.in);

        System.out.print("\nUsername: ");
        String usernameInput = input.next();

        System.out.print("Password: ");
        String passwordInput = input.next();

        String accessType = this.loginController.validateLogin(usernameInput, passwordInput);

        switch (accessType) {
            case "ADMIN":
                AdminView av = new AdminView();
                av.adminMenu();
                break;

            case "GUIA":
                GuiaExperienciaView ge = new GuiaExperienciaView(usernameInput);
                ge.guiaExperienciasMenu();

                break;
            case "GESTAO":
                RececionistaView r = new RececionistaView();
                r.rececionistaMenu();
                break;

            case "ERROR":
                System.out.println("Acessos inválidos");
                break;
        }
    }

}
