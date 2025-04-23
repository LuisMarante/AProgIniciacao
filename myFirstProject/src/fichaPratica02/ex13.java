package fichaPratica02;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas;
        int minutos;

        System.out.println("Introduza as horas");
        horas= input.nextInt();

        System.out.println("Introduza os minutos");
        minutos= input.nextInt();


        if (horas>12){
            horas = horas-12;
            System.out.println(horas + ":" + minutos + "PM");
        } else {
            System.out.println(horas + ":" + minutos + "AM");
        }
    }
}
