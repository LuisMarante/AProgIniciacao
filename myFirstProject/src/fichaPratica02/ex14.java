package fichaPratica02;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;
        int menor=0;
        int intermedio=0;
        int maior=0;

        System.out.print("Introduz o numero 1:");
        num1= input.nextInt();

        System.out.print("Introduz o numero 2:");
        num2= input.nextInt();

        System.out.print("Introduz o numero 3:");
        num3= input.nextInt();


        if(num1<num2 && num1<num3){
            menor = num1;
            if (num2<num3) {

                intermedio=num2;
                maior=num3;
            } else {
                intermedio=num3;
                maior=num2;
            }
        }
        if(num2<num1 && num2<num3){
            menor=num2;
            if(num1<num3){
                intermedio= num1;
                maior=num3;
            } else{
                intermedio= num3;
                maior=num1;
            }
        }
        if(num3<num1 && num3<num2){
            menor=num3;
            if(num1<num2){
                intermedio= num1;
                maior=num2;
            }else{
                intermedio= num2;
                maior=num1;
            }
        }


        System.out.println(menor + "      "+intermedio + "      " + maior);




    }
}
