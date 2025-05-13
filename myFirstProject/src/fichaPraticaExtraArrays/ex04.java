package fichaPraticaExtraArrays;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int arr [] = new int[5];
        boolean numExiste=false;
        int numParaEncontrar;

        System.out.println("Escolha o numero a procurar: ");
        numParaEncontrar= input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            System.out.print("introduza um numero: ");
            arr[i]= input.nextInt();
            if(arr[i]==numParaEncontrar){
                numExiste=true;
            }
        }

        if (numExiste){
            System.out.println("O seu numero está no array");
        } else {
            System.out.println(numParaEncontrar + " não encontrado");
        }


    }
}
