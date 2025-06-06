package fichaPratica06;

import java.util.Scanner;

public class ex03 {

    public static boolean ehPar(int num) {

        return num % 2 == 0;
    }

    public static boolean ehPoisitivo(int num) {

        return num>0;

    }

    public static boolean ehPrimo(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean ehPerfeito(int num) {

        int soma=0;
        for (int i = 1; i < num; i++) {
            if (num%i==0) {
                soma+=i;
            }
        }
        return soma==num;

    }

    public static boolean ehTriangular (int num) {

int contador=0;

        for (int i = 0; contador < num; i++) {
            contador+=i;
        }

        if (contador==num) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escolha um numero (0 para sair): ");
        int numero = input.nextInt();


        // está mal realizado, tem de ser com do while, com o numero a ser escolhido fora do "do while" e a poder trocar com a opção 6;


        while(numero!=0) {

            switch (numero) {
                case 1:
                    if (ehPar(numero)) {
                        System.out.println("O numero é par");
                    } else {
                        System.out.println("O numero é impar");
                    }
                    break;
                case 2:
                    if (ehPoisitivo(numero)) {
                        System.out.println("O numero é positivo");
                    } else {
                        System.out.println("O numero é negativo");
                    }
                    break;
                case 3:
                    if (ehPrimo(numero)) {
                        System.out.println("O numero é primo");
                    } else {
                        System.out.println("O numero não é primo");
                    }
                    break;
                case 4:
                    if (ehPerfeito(numero)) {
                        System.out.println("O numero é perfeito");
                    } else {
                        System.out.println("O numero não é perfeito");
                    }
                    break;
                case 6:
                    System.out.print("Escolha outro numero:");
                    numero = input.nextInt();
                    break;
                default:
                    System.out.println("Escolha um número válido");
            }
        }

        System.out.println(ehTriangular(6));

    }
}
