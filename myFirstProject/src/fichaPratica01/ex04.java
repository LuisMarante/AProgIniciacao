package fichaPratica01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double area;
        double raio;


        raio= input.nextDouble();

        area= Math.PI * raio * raio;
        System.out.println("Área: " + area);





    }
}
