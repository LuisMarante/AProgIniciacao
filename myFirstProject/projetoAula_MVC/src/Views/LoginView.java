package Views;

import Controllers.LoginController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoginView {

    private LoginController loginController;

    public LoginView() throws FileNotFoundException {

        this.loginController = new LoginController();
    }

    public void mainMenu() throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcaoLogin;

        do {
            System.out.println("\n\n********** Bem-vindo/a Parque de diversões Cesaeland **********\n");
            System.out.println("1. Cliente");
            System.out.println("2. Administrador");
            System.out.println("3. Engenheiro de manutenção");
            System.out.println("\n0. Terminar Programa");

            System.out.print("\nOpção: ");
            opcaoLogin = input.nextInt();

            switch (opcaoLogin) {
                case 1:
                    // CLIENTE

                    break;

                case 2:
                    // ADMINISTRADOR
                    this.loginMenu();
                    break;
                case 3:
                    // ENG. MANUTENÇÃO
                    this.loginMenu();
                    break;

                case 0:
                    System.out.println("\nObrigado por utilizar o nosso programa... Até à próxima!");
                    break;

                default:
                    System.out.println("\nOpção Inválida");
            }
        } while (opcaoLogin != 0);
    }

    public void loginMenu() {


            Scanner input = new Scanner(System.in);

            System.out.print("\nUsername: ");
            String usernameInput = input.next();

            System.out.print("Password: ");
            String passwordInput = input.next();

            String accessType = this.loginController.validateLogin(usernameInput, passwordInput);

            switch (accessType) {
                case "ADMIN":

                    break;

                case "ENG":

                    break;

                case "ERROR":
                    System.out.println("Acessos inválidos");
                    break;
            }

        }

    }


