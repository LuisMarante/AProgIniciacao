package fichaPratica02;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num1, num2;

        

        System.out.print("Introduza o primeiro número: ");
        num1= input.nextInt();

        System.out.print("Introduza o segundo número: ");
        num2= input.nextInt();

        String operacao;
        operacao= input.next();

        if(operacao.equals("+")){
            System.out.println("Soma: "+ (num1+num2));
        }

        if(operacao.equals("-")){
            System.out.println("Subtracao: "+ (num1-num2));
        }

        if(operacao.equals("*")){
            System.out.println("Multiplicação: "+ num1*num2);
        }

        if(operacao.equals("/")){
            System.out.println("Divisão: "+ num1/num2);
        }
    }
}
