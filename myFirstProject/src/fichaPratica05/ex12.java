package fichaPratica05;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arr1 = new int[5];
        int [] arr2 = new int[5];


        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Introduza um numero: ");
            arr1[i]= input.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Introduza um numero: ");
            arr2[i]= input.nextInt();
        }

        int [][] arrPai = new int[2][5];

//        for (int i = 0; i < arrPai.length; i++) {
//            for (int j = 0; j < arrPai[0].length; j++) {
//                arrPai[i][j]=arr1[j];
//            }
//            for (int j = 0; j < arrPai[0].length; j++) {
//                arrPai[i][j]=arr2[j];
//            }
//
//        }

        for (int i = 0; i < arrPai.length; i++) {
                arrPai[i][0]=arr1[i];
                arrPai[i][1]=arr2[i];
        }
    }
}
