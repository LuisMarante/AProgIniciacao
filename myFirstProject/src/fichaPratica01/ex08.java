package fichaPratica01;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


       int segundos1, minutos1, segundos2, minutos2, totalSegundos, totalMinutos, totalHoras;

        System.out.print("Introduz quantos segundos tem a música 1: ");
        segundos1= input.nextInt();
        System.out.print("Introduz quantos minutos tem a música 1: ");
        minutos1= input.nextInt();

        System.out.print("Introduz quantos segundos tem a música 2: ");
        segundos2= input.nextInt();
        System.out.print("Introduz quantos minutos tem a música 2: ");
        minutos2= input.nextInt();


        totalSegundos= segundos1 + segundos2;
        totalMinutos=minutos1+minutos2;


        System.out.println("total segundos: " + totalSegundos);
        System.out.println("total minutos:" + totalMinutos);

        totalSegundos= totalSegundos + totalMinutos*60;

        System.out.println(totalSegundos);

        totalHoras= totalSegundos/3600;
        System.out.println("total horas: " + totalHoras);

        totalSegundos=totalSegundos%3600;
        System.out.println("total segundos: "+totalSegundos);

totalMinutos = totalSegundos/60;
        System.out.println("total minutos:" + totalMinutos);

        totalSegundos= totalSegundos%60;
        System.out.println(totalSegundos);

    }
}
