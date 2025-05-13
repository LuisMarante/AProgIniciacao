package fichaPratica05;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] comissoes = new double[4];



        for (int i = 0; i < comissoes.length; i++) {
            System.out.println("Introduza um valor:");
            comissoes[i] = input.nextInt();
        }

        double maiorElemento=comissoes[0];

        for (int i = 0; i < comissoes.length; i++) {
            if (comissoes[i]>maiorElemento){
                maiorElemento=comissoes[i];
            }
        }
        System.out.println("O maior elemento é: " + maiorElemento);
    }
}
