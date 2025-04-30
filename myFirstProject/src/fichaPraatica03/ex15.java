package fichaPraatica03;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o fatorial?");
        int fatorial = input.nextInt();
int fatorialInterno= fatorial;
        int soma = 0, resultadoInicial = 2;
int i,k;
int resultado=0;
int resultadoFinal = 0;

        i=1;
        k=1;

        while(i<fatorial) {
            fatorial= fatorial+2;
            while (k<fatorial){
                resultado=resultado + resultadoInicial;
                k++;
            }
            resultadoFinal=resultado;
            resultadoInicial= resultado;
            resultado=0;

        }




        System.out.println("O resultado é: " +resultadoFinal);
    }
}
