package fichaPratica02;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        opcao= input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("escolheu a opção - Criar");
                break;
            case 2: System.out.println("escolheu a opção - Atualizar");
                break;
            case 3: System.out.println("escolheu a opção - Eliminar");
                break;
            case 4:
                break;
            default: System.out.println("Selecione uma opção válida");
                break;
        }



    }
}
