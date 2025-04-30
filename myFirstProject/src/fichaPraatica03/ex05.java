package fichaPraatica03;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int numero;
        String mensagem;


        System.out.println("introduza um número:");
        numero = input.nextInt();

        input.nextLine();

        System.out.println("introduza uma mensagem:");
        mensagem = input.nextLine();


        int i = 0;
        while (i < numero) {
            System.out.println(mensagem);
            i++;
        }
    }
}
