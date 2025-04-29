package fichaPraatica03;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int contador=0;
        int num=0;
        int total=0;
        double media=0;

        while(num!=-1) {
            System.out.println("Introduza um número: ");
            num= input.nextInt();
            if(num== -1){

            } else {
                total = total + num;
                contador++;
            }
        }
        media = (double) total / contador;
        System.out.println("Média: " + media);

    }
}
