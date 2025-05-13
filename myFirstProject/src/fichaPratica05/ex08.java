package fichaPratica05;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int [][] matriz = new int [3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Introduz um valor: ");
                matriz[i][j]= input.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
}
