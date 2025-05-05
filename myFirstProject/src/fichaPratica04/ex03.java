package fichaPratica04;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numCerto, numTentativas=0, numAdivinha;

        System.out.println("Escolha O número: ");
        numCerto= input.nextInt();


        do {
            System.out.println("Tente adivinhar o número do outro jogador");
            numAdivinha= input.nextInt();
            numTentativas++;
            if(numAdivinha==numCerto){
                System.out.println("Você acertou e só precisou de "+ numTentativas + "tentativas");
            } else if(numAdivinha<numCerto){
                System.out.println("Um pouco mais");
            } else {
                System.out.println("Um pouco menos");
            }

        } while(numAdivinha!=numCerto);


    }
}
