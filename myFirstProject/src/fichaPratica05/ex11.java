package fichaPratica05;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Introduza um numero: ");
                arr[i][j] = input.nextInt();
            }
        }
        int menor = arr[0][0];
        int maior = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > maior) {
                    maior = arr[i][j];
                } else if (arr[i][j] < menor) {
                    menor = arr[i][j];
                }
            }
        }
        System.out.println("O maior é " + maior + " e o menor é " + menor);
    }
}
