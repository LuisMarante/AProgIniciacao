package fichaPraticaExtraArrays;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escolha o tamanho do array: ");
        int[] array = new int[input.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Escolha um número: ");
            array[i] = input.nextInt();
        }





    }
}
