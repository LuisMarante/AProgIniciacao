package fichaPratica04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numPedido, divisoesInteiras=0;

        System.out.println("Escolha um número: ");
        numPedido = input.nextInt();
        int numDivisor=numPedido;


        while(numDivisor>0) {
            if(numPedido%numDivisor==0){
                divisoesInteiras++;
            }
            numDivisor--;
        }

        if(divisoesInteiras==2){
            System.out.println("O número é primo");
        } else {
            System.out.println("O número não é primo");
        }
    }
}
