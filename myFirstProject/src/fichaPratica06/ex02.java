package fichaPratica06;

import java.util.Scanner;

public class ex02 {


    public static int lerValorInteiroPositivo() {
        Scanner input = new Scanner(System.in);

        int numero = -1;


        while (numero < 0) {
            System.out.print("Escolha um número: ");
            numero = input.nextInt();
        }
        return numero;
    }

    public static void imprimirAsteriscos(int a) {

        for (int i = 0; i < a; i++) {
            System.out.println("*");
        }
    }

    public static void main(String[] args) {

//        int numero= lerValorInteiroPositivo();
//        imprimirAsteriscos(numero);

        imprimirAsteriscos(lerValorInteiroPositivo());

    }
}
