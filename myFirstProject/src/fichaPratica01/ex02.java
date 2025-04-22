package fichaPratica01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("introduza um número:");
        int numero1 = ler.nextInt();
        System.out.println("introduza um número:");
        int numero2= ler.nextInt();

        int soma=numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;


        System.out.println("soma:" + soma);
        System.out.println("Subtração:" + subtracao);
        System.out.println("Multiplicação:" + multiplicacao);
        System.out.println("divisao:" + divisao);

    }
}
