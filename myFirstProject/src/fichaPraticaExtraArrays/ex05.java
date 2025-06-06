package fichaPraticaExtraArrays;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr [] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Introduza um numero: ");
            arr[i]= input.nextInt();
        }

        int [] arrDuplicados= new int[5];
        int ultimoIndex=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j] && i!=j){

                    boolean existe = false;

                    for (int k = 0; k < arrDuplicados[k]; k++) {
                        if (arr[i] == arrDuplicados[k]) {
                            existe = true;
                        }
                    }
                    if (!existe) {
                        arrDuplicados[ultimoIndex] = arr[i];
                        ultimoIndex++;
                    }
                }
            }
        }

        int[] arrayMedida= new int[ultimoIndex];

        for(int i=0; i< arrayMedida.length;i++){
            arrayMedida[i]=arrDuplicados[i];
        }

        for (int i = 0; i < arrayMedida.length; i++) {
            System.out.println(arrayMedida[i]);
        }



    }
}
