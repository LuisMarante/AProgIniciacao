package fichaPratica02;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduz o número 1");
int num1= input.nextInt();
        System.out.println("Introduz o número 2");
int num2= input.nextInt();

if(num1>num2){
    System.out.println("Maior: " + num1);
} else if (num2>num1){
    System.out.println("Maior: "+num2);
        } else{
    System.out.println("Os números são iguais");
}




    }
}
