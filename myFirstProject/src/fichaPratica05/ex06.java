package fichaPratica05;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduz um numero: ");
            array[i]= input.nextInt();
        }
        boolean eCrescente=true;

        for (int i = 1; i < array.length; i++) {
            if (array[i-1]>=array[i]){
                eCrescente=false;
            }
        }

        System.out.println("É crescente? " + eCrescente);
    }
}
