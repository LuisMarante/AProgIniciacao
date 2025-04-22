package fichaPratica01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //area retangulo = l x c
        // perimetro retangulo = l+c+l+c

        int largura, comprimento, perimetro;
        double area;

        System.out.print("Introduz a largura:");
        largura= input.nextInt();

        System.out.println("Introduz o comprimentos:");
        comprimento= input.nextInt();



        perimetro= largura*2 + comprimento*2;
        System.out.println("Perimetro: " + perimetro);


        area=largura * comprimento;
        System.out.println("Área: " + area);





    }




}
