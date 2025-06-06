package fichaPraticaExtraArrays;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escolha o tamanho do array: ");
        int[] array = new int[input.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Escolha um número: ");
            array[i] = input.nextInt();
        }

        System.out.print("Escolha o valor a remover:");
        int valorRemover = input.nextInt();


        int contador=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=valorRemover){
                contador++;
            }
        }

        int [] arrayFinal= new int[contador];
        int index=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]!=valorRemover){
                arrayFinal[index]=array[i];
                index++;
            }
        }

        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.println(arrayFinal[i]);
        }
    }
}
