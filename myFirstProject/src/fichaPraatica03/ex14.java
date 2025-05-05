package fichaPraatica03;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroFora, numero1, numero2, numSucesso=1;

        System.out.println("Quantos numeros quer inserir?");
        numeroFora= input.nextInt();

        int i =1;

        System.out.println("insira um numero");
        numero1= input.nextInt();

        while(i<numeroFora) {
            i++;
            System.out.println("insira um numero");
            numero2= input.nextInt();
            if (numero2>numero1){
                numSucesso++;
            }
            numero1=numero2;
        }
        if (numSucesso==i){
            System.out.println("É crescente");
        } else {
            System.out.println("Não é crescente");
        }
    }
}
