package fichaPratica06;

import java.util.Scanner;

public class ex05 {


    public static int maiorDoArray(int[] arr) {

        int maiorElemento = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maiorElemento) {
                maiorElemento = arr[i];
            }
        }

        return maiorElemento;
    }

    public static int menorDoArray(int[] arr) {

        int menorElemento = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > menorElemento) {
                menorElemento = arr[i];
            }
        }
        return menorElemento;
    }

    public static boolean arrayEhCrescente(int[] arr) {

        boolean ehCrescente = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                ehCrescente = false;
            }
        }

        return ehCrescente;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha o tamanho do array");
        int tamanho = input.nextInt();
        int[] meuArray = new int[tamanho];

        for (int i = 0; i < meuArray.length; i++) {
            System.out.println("Escolha um numero para a posição " + i);
            meuArray[i] = input.nextInt();
        }

        System.out.println("Escolha uma opção");
        int opcao = input.nextInt();
        do {
            switch (opcao) {
                case 1:
                    int maior = maiorDoArray(meuArray);
                    System.out.println("Maior: " + maior);

                    break;
                case 2:
                    System.out.println("Menor: " + menorDoArray(meuArray));


                    break;
                case 3:
                    if (arrayEhCrescente(meuArray)) { // arrayEhCrescente(meuArray) == true
                        System.out.println("É cescente");
                    } else {
                        System.out.println("Não é crescente");
                    }
            }
            opcao = input.nextInt();
        } while (opcao != 0);

    }
}



