package fichaPratica02;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lugar;
        System.out.println("Em que lugar ficou?");
        lugar= input.nextInt();

        switch (lugar){
            case 1:
                System.out.println("ganha 10 pontos");
                break;
            case 2:
                System.out.println("ganha 8 pontos");
                break;
            case 3:
                System.out.println("ganha 6 pontos");
                break;
            case 4:
                System.out.println("ganha 5 pontos");
                break;
            case 5:
                System.out.println("ganha 4 pontos");
                break;
            case 6:
                System.out.println("ganha 3 pontos");
                break;
            case 7:
                System.out.println("ganha 2 pontos");
                break;
            case 8:
                System.out.println("ganha 1 pontos");
                break;
            default:
                System.out.println("Não ganha pontos");
                break;

        }
    }
}
