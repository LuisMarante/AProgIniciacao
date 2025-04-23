package fichaPratica01;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idFuncionario, diasDeTrabalho;

        double irs= 0.1;
        double sSocial=0.11;
        double encargoEntidadePatronal=0.2375;
        double totalDescontos = irs + sSocial + encargoEntidadePatronal;

        System.out.println("Qual é o seu ID?");
        int id= input.nextInt();

        System.out.println("Quantos dias trabalhou este mês?");
        diasDeTrabalho= input.nextInt();

        int salario = 40 * diasDeTrabalho;
        int subAlimentacao = 5 *diasDeTrabalho;

        int salarioSemDescontos = salario + subAlimentacao;
        System.out.println("Salário ilíquido: " + salarioSemDescontos);

        double salarioLiquido = salarioSemDescontos * (1-totalDescontos);
        System.out.println(salarioLiquido);





    }
}
