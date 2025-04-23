package fichaPratica01;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("introduz um número:");
        num1= input.nextInt();
        System.out.print("introduz um número:");
        num2= input.nextInt();

        
        int numAux;
        
        numAux = num1;

        num1 = num2;

        num2 = numAux;

        System.out.println(num1);
        System.out.println(num2);
        


    }
}
