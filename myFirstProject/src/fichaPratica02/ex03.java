package fichaPratica02;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;

        salario = input.nextDouble();
        double taxa = 0;

        if (salario <= 15000) {
            taxa = salario * 0.2;
        }

        if (salario > 15000 && salario<=20000) {
            taxa = salario * 0.3;
        }

        if (salario < 20000 && salario<=25000) {
            taxa = salario * 0.35;
        }

        if (salario > 25000) {
            taxa = salario * 0.4;
        }

        System.out.println("A taxa é: " + taxa);

    }
}

