package fichaPratica02;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cargo;
        int diasDeTrabalho, salarioPorDia, salarioSemDescontos=0;
        double salarioLiquido =0;
        double subAlimentacao=0;

        System.out.println("Qual é o seu cargo?");
        cargo= input.next();

        System.out.println("Quantos dias trabalhou?");
        diasDeTrabalho= input.nextInt();

        switch (cargo){
            case "A":
                System.out.println("Administrador selecionado");
                salarioPorDia=80;

                subAlimentacao=7.5 * diasDeTrabalho;
                salarioSemDescontos=diasDeTrabalho*salarioPorDia;
                if (salarioSemDescontos < 1000){
                    salarioLiquido = salarioSemDescontos * (1- (0.1 + 0.09 + 0.21));
                    salarioLiquido= salarioLiquido + subAlimentacao;
                } else {
                    salarioLiquido=salarioSemDescontos * (1- (0.2 + 0.09 + 0.21));
                    salarioLiquido= salarioLiquido + subAlimentacao;
                }
                break;

            case "C":
                System.out.println("Chefe selecionado");
                subAlimentacao=5 * diasDeTrabalho;
                salarioPorDia=60;
                salarioSemDescontos=diasDeTrabalho*salarioPorDia;
                if (salarioSemDescontos < 1000){
                    salarioLiquido = salarioSemDescontos * (1- (0.1 + 0.11 + 0.2375));
                    salarioLiquido= salarioLiquido + 5*diasDeTrabalho;
                } else {
                    salarioLiquido=salarioSemDescontos * (1- (0.2 + 0.11 + 0.2375));
                    salarioLiquido= salarioLiquido + 5*diasDeTrabalho;
                }
                break;

            case "E":
                salarioPorDia=40;
                System.out.println("Empregado selecionado");
                subAlimentacao=5 * diasDeTrabalho;
                salarioSemDescontos=diasDeTrabalho*salarioPorDia;
                if (salarioSemDescontos < 1000){
                    salarioLiquido = salarioSemDescontos * (1- (0.1 + 0.11 + 0.2375));
                    salarioLiquido= salarioLiquido + 5*diasDeTrabalho;
                } else {
                    salarioLiquido=salarioSemDescontos * (1- (0.2 + 0.11 + 0.2375));
                    salarioLiquido= salarioLiquido + 5*diasDeTrabalho;
                }
                break;
            default:
                System.out.println("cargo invalido");
        }

        if(salarioSemDescontos!=0) {
            System.out.println("a: " + salarioSemDescontos);
            System.out.println("b: " + subAlimentacao);
            System.out.println("c: " + (salarioSemDescontos - salarioLiquido));
            System.out.println("d: " + salarioSemDescontos);
            System.out.println("e: " + salarioSemDescontos);
        }


    }
}
