package fichaPratica05;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int [][] matriz = new int [5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]= input.nextInt();
            }
        }
int soma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                soma=soma+matriz[i][j];
            }
        }
    }
}
