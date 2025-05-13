package fichaPratica05;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int [][] matriz = new int [3][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Preencha o array: ");
                matriz[i][j]= input.nextInt();
            }
        }

        System.out.println("Escolha um numero");
        int numeroPretendido= input.nextInt();
        int contador=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz [i][j] == numeroPretendido) {
                    contador++;
                }
            }
        }

        System.out.println("O numero " + numeroPretendido + " surgiu " + contador + " vezes");



    }
}
