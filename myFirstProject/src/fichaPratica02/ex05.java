package fichaPratica02;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduza o número 1:");
        int num1 = input.nextInt();

        System.out.println("Introduza o número 2:");
        int num2 = input.nextInt();

        int maior=0;
        int menor=0;


        if(num1>num2){
           maior=num1;
           menor=num2;
        } else{
           maior = num2;
           menor=num1;
        }


        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }
}
