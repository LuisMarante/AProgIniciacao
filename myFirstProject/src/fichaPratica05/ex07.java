package fichaPratica05;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduz um valor: ");
            arr[i] = input.nextInt();
        }

        boolean haPar = true;
        double maior = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                maior = arr[i];
                haPar = false;
            }
        }
        if (haPar) {
            System.out.println("Não há números pares");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] > maior) {
                    maior = arr[i];
                }
            }
            System.out.println("O maior número par é " + maior);
        }


    }
}
