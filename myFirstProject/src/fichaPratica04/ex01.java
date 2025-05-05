package fichaPratica04;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String operacao, resposta;

        int num1, num2;
        double resultado=0;

        do {
            System.out.println("Insira o primeiro número: ");
            num1= input.nextInt();

            System.out.println("Insira o segundo número: ");
            num2= input.nextInt();

            System.out.println("Insira a operação a realizar: ");
            operacao= input.next();

            if (operacao.equals("+")) {
                resultado = num1 + num2;
            } else if (operacao.equals("-")){
                resultado = num1 - num2;
            } else if (operacao.equals("*")){
                resultado = num1 * num2;
            } else if (operacao.equals("/")){
                resultado = (double) num1 / num2;
            } else {
                System.out.println("Operação inválida");
            }

            System.out.println("O resultado é: " + resultado);

            do{
                System.out.println("Deseja continuar? (s/n) ");
                resposta= input.next();
            }while (!resposta.equalsIgnoreCase("s")&&!resposta.equalsIgnoreCase("n"));



        } while(resposta.equalsIgnoreCase("s"));




    }
}
