package fichaPratica02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor;
        System.out.println("Qual é o valor em causa?");
        valor = input.nextInt();


        int notas200, notas100, notas50, notas20, notas10, notas5;


        notas200 = valor / 200;
        valor  %=  200; // valor=valor%200;

        System.out.println("numero de notas de 200: " + notas200);
        System.out.println("valor: " + valor);


        notas100 = valor / 100;
        valor  %=  100;


        notas50 = valor / 50;
        valor  %=  50;


        notas20 = valor / 20;
        valor  %=  20;


        notas10 = valor / 10;
        valor  %=  10;


        notas5 = valor / 5;
        valor  %=  5;


        System.out.println("Notas de 200: " + notas200);
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);

        System.out.println(valor);
    }
}
