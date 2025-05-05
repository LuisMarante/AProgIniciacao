package fichaPraatica03;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o fatorial?");
        int fatorial = input.nextInt();

        int fatorialAtualizado = fatorial;
        int soma = 0;
        int i = fatorial - 2;
        int k = fatorial - 1;



        while (i > 0) {

            while (k > 0) {
                soma = soma + fatorialAtualizado;
                k--;
                System.out.println(" fatorial atualizado: " + fatorialAtualizado);
                System.out.println("Soma: " + soma);
            }
            fatorialAtualizado = soma;
            soma=0;
            System.out.println(fatorialAtualizado);
            i--;
            System.out.println("i: " + i);
            fatorial--;
            k = fatorial - 1;
            System.out.println("k: " + k);
        }


        System.out.println("O resultado é: " + fatorialAtualizado);
    }
}
