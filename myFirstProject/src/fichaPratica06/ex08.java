package fichaPratica06;

import java.util.Arrays;
import java.util.Scanner;

public class ex08 {

    public static int somaElementos2Arrays(int[] array1, int[] array2) {

        int soma = 0;

        for (int i = 0; i < array1.length; i++) {
            soma += (array1[i] + array2[i]);
        }

        return soma;
    }


    public static int[] somar2Arrays(int[] array1, int[] array2) {


        int[] arrSomas = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            arrSomas[i] = array1[i] + array2[i];

        }
        return arrSomas;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Escolha um numero para preencher: ");
            arr1[i]= input.nextInt();
            arr2[i]= input.nextInt();

        }

        System.out.println(somaElementos2Arrays(arr1,arr2));

        System.out.println(Arrays.toString(somar2Arrays(arr1, arr2)));

    }
}
