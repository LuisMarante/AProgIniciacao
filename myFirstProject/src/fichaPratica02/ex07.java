package fichaPratica02;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        System.out.print("Introduz um numero:");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O número é ímpar");
        }

    }
}
