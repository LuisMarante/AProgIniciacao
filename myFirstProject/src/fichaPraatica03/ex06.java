package fichaPraatica03;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numInicial, numFinal;

        System.out.println("introduz o numero inicial: ");
        numInicial= input.nextInt();

        System.out.println("introduz o numero final: ");
        numFinal= input.nextInt();

        int i=numInicial;

        while(i>=numInicial && i<=numFinal) {
            System.out.println(i);
            i++;
        }






    }
}
