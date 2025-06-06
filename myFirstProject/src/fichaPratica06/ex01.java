package fichaPratica06;

import java.util.Scanner;

public class ex01 {

    public static void fazerBarulho (String animal) {

        switch (animal) {
            case "cao":
                System.out.println("Au au");
                break;
            case "gato":
                System.out.println("Miau");
                break;
            default:
                System.out.println("Não conheço esse animal");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o animal? ");
        String animalUtilizador= input.next();

        fazerBarulho(animalUtilizador);
    }
}
