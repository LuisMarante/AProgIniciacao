package Views;

import Controllers.GuiaExperienciaController;
import Controllers.RececionistaController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class RececionistaView {

    private RececionistaController rececionistaController;

    public RececionistaView()  throws FileNotFoundException {
        this.rececionistaController = new RececionistaController();
    }

    public void rececionistaMenu() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcaoRececionista;

        do {

            System.out.println("\n\n********** MENU RECECIONISTA **********");
            System.out.println("1. Consultar quartos disponíveis.");
            System.out.println("2. Consultar quartos reservados.");
            System.out.println("3. Consultar reservas atuais.");
            System.out.println("4. Efetua uma reserva.");
            System.out.println("5. Reserve uma experiência.");
            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoRececionista= input.nextInt();

            switch (opcaoRececionista){
                case 1:
                    System.out.println("\n***** Quartos Disponíveis *****");
                    RececionistaController rc1 = new RececionistaController();
                    System.out.println(rc1.quartosDisponiveis());
                    break;

                case 2:
                    System.out.println("\n***** Quartos Reservados *****");
                    RececionistaController rc2 = new RececionistaController();
                    rc2.quartosReservados();
                    break;

                case 3:
                    System.out.println("\n***** Reservas Atuais *****");
                    RececionistaController rc3 = new RececionistaController();
                    rc3.reservasAtuais();
                    break;

                case 4:
                    System.out.println("\n***** Efetue Reserva *****");
                    RececionistaController rc4 = new RececionistaController();

                    String idCliente;
                    int numQuarto, ano, mes , semana;

                    System.out.println("Qual é o id do cliente?");
                    idCliente = input.next();
                    System.out.println("Quarto para reservar:");
                    numQuarto = input.nextInt();
                    System.out.println("Qual é o ano?");
                    ano = input.nextInt();
                    System.out.println("Qual é o mês?");
                    mes = input.nextInt();
                    System.out.println("Qual é a semana?");
                    semana = input.nextInt();

                    rc4.efetuarReserva( idCliente,  numQuarto ,  ano ,  mes ,  semana);


                    break;

                case 5:
                    System.out.println("\n***** Reserve Experiência *****");
                    RececionistaController rc5 = new RececionistaController();


                    String iDCliente, idReserva;
                    int numAdultos, numCriancas ;

                    System.out.println("Qual é o id do cliente?");
                    iDCliente = input.next();
                    System.out.println("Qual é a reserva:");
                    idReserva = input.next();
                    System.out.println("Quantos adultos?");
                    numAdultos = input.nextInt();
                    System.out.println("Quantas crianças?");
                    numCriancas = input.nextInt();

                    rc5.reservarExperiencia(iDCliente ,  idReserva ,  numAdultos, numCriancas );
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        }while (opcaoRececionista!=0);
    }
}
