package fichaPratica04;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int opcao;

        do {
            System.out.print("Escolha uma opção (1 - criar; 2 - atualizar; 3 - eliminar; 4 - sair ): ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolheu criar alguma coisa");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Escolheu atualizar alguma coisa");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Escolheu eliminar alguma coisa");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Até à próxima");
                    break;
            }

        } while (opcao!=4);

    }
}
