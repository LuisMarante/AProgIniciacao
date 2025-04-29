package fichaPratica02;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoMedio;
        double credito;

        System.out.println("Introduza o seu salário médio");
        saldoMedio= input.nextDouble();

        if (saldoMedio<=2000) {
            System.out.println("Não tem direito a crédito");
        } else if (saldoMedio>2000 && saldoMedio<=4000){
            credito= saldoMedio*0.2;
            System.out.println("O crédito é: " +credito);
        } else if (saldoMedio>4000 && saldoMedio<=6000){
            credito=saldoMedio*0.3;
            System.out.println("O crédito é: " + credito);
        } else {
            credito=saldoMedio*0.4;
            System.out.println("O crédito é: " + credito);

        }



    }
}
