package fichaPraticaExtraArrays;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escolha o tamanho do array: ");
        int[] array = new int[input.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Escolha um número: ");
            array[i] = input.nextInt();
        }

        int aux;

        for (int i = 0; i < array.length - 1; i++) {
            for (int k = i+1; k < array.length; k++) {
                if (array[k] <= array[i]) {
                    aux = array[i];
                    array[i] = array[k];
                    array[k] = aux;
                }
            }
        }
       for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}

