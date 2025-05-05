package fichaPraatica03;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num = 0;
        int quarteiraoUm = 0;
        int quarteiraoDois = 0;
        int quarteiraoTres = 0;
        int quarteiraoQuatro = 0;


        while (num >= 0) {
            System.out.println("Introduza um número: ");
            num = input.nextInt();
            if (num >= 0) {
                if (num >= 0 && num <= 25) {
                    quarteiraoUm++;
                } else if (num > 26 && num <= 50) {
                    quarteiraoDois++;
                } else if (num >50 && num<= 75) {
                    quarteiraoTres++;
                } else if(num>75 && num<=100){
                    quarteiraoQuatro++;
                } else {
                    System.out.println("coloque um numero menor ou igual a 100");
                }
            }
        }
    }
}
