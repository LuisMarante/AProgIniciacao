package fichaPratica02;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double saldoAtual, valorMovimentado;

        System.out.print("Introduza o seu saldo atual: ");
        saldoAtual = input.nextDouble();

        System.out.print("Introduza o valor que quer movimentar: ");
        valorMovimentado = input.nextDouble();


        if (saldoAtual >= -valorMovimentado) {
            saldoAtual = saldoAtual + valorMovimentado;
            System.out.println("O seu saldo atual é: " + saldoAtual);
        } else {
            System.out.println("Não tem saldo suficiente");
        }


    }
}
