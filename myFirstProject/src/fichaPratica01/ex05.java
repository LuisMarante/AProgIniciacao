package fichaPratica01;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, valor3;
        double mediaAritmetic, mediaPond;

        System.out.print("introduza um número:");
        valor1= input.nextInt();
        System.out.print("introduza um número:");
        valor2= input.nextInt();
        System.out.print("introduza um número:");
        valor3= input.nextInt();


mediaAritmetic = (valor1 + valor2 + valor3) / 3;
        System.out.println("Média aritmética é: "
                + mediaAritmetic);


        mediaPond = (valor1 *20 + valor2*30 + valor3*50) /100;
        System.out.println("média ponderada é: " + mediaPond);

    }
}
