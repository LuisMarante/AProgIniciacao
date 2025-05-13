package fichaPratica05;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double comissoes[] = new double[12];

        for (int i = 0; i < comissoes.length; i++) {
            System.out.println("Introduza a comissão do mês " + (i+1) + ":");
            comissoes[i] = input.nextInt();
        }

        double soma=0;

        for (int i = 0; i < comissoes.length; i++) {
            soma= soma+ comissoes[i];
        }
        System.out.println(soma);
    }
}

