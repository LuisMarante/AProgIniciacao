package fichaPraticaExtraArrays;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escolha o tamanho do array: ");
        int[] array = new int[input.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Escolha um número: ");
            array[i] = input.nextInt();
        }

        System.out.print("Diga um novo valor:");
        int valorAcrescentar = input.nextInt();

        System.out.print("Escolha a sua posição:");
        int index = input.nextInt();

        int [] arrayMaior = new int[array.length + 1];

//        arrayMaior[index]=valorAcrescentar;

        for (int i = 0; i < (index); i++) {
            arrayMaior[i] = array[i];
        }

        arrayMaior[index]=valorAcrescentar;

        for (int i = index+1; i <arrayMaior.length ; i++) {
            arrayMaior[i]=array[i-1];
        }

    }
}
