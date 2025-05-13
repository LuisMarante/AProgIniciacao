package fichaPratica05;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] valores = new int [10];
double total=0;
double media;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduz um valor: ");
            valores[i]= input.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            total+=valores[i];
        }

        media = total/ valores.length;

        System.out.println("A média é: " + media);
    }
}
