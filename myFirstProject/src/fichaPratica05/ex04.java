package fichaPratica05;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] comissoes = new double[10];


        for (int i = 0; i < comissoes.length; i++) {
            System.out.println("Introduza um valor:");
            comissoes[i] = input.nextInt();
        }
            double menorElemento = comissoes[0];

        for (int i = 0; i < comissoes.length; i++) {
                if (comissoes[i] < menorElemento) {
                    menorElemento = comissoes[i];
                }
            }
        System.out.println("O menor elemento é: " + menorElemento);
        }
    }





