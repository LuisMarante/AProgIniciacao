package fichaPratica05;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("introduza um numero: ");
                arr[i][j] = input.nextInt();
            }
        }
        int total = 0;

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                if (i==j){
//                    total = total +arr[i][j];
//                }
//            }
//
//        }


        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i][i];
        }

    }

}
