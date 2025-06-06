package fichaPratica06;

import java.util.Arrays;
import java.util.Scanner;

public class ex07 {

    /**
     * função que desenha quadrados;
     * @param charact caracter a imprimir
     * @param numLinhas numero de linhas da matriz
     * @param numColunas numero de colunas da matriz
     */



    public static void desenhaQuadrados(String charact, int numLinhas, int numColunas) {

        Scanner input = new Scanner(System.in);


        String[][] array = new String[numLinhas][numColunas];

        for (int i = 0; i < array[0].length; i++) {
            array[0][i] = charact;
        }

        for (int i = 0; i < array[0].length; i++) {
            array[numLinhas - 1][i] = charact;
        }

        for (int i = 1; i < array.length - 1; i++) {
            for (int k = 0; k < array[0].length; k++) {
                if (k == 0 || k == (array.length - 1)) {
                    array[i][k] = charact;
                } else {
                    array[i][k] = " ";
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[0].length; k++) {
                System.out.print(array[i][k]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escolha um simbolo: ");
        String charact = input.next();


        if (charact.length() != 1) {
            System.out.print("Escolha apenas um simbolo: ");
            charact = input.next();
        }

        int numLinhas = 5;
        int numColunas = 5;

desenhaQuadrados(charact,numLinhas,numColunas);
    }
}
