package fichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex10 {

    public static void menuGeral(String file, String [][] arr) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n========== MENU ==========");
            System.out.println("1. Pesquisas");
            System.out.println("2. Adicionar formando");
            System.out.println("3. Editar formando");
            System.out.println("4. Remover formando ");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    menuPesquisas(file, arr);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }


    public static void menuPesquisas(String file, String [][] arr) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n========== Pesquisas ==========");
            System.out.println("1. Imprimir todos os alunos ");
            System.out.println("2. Imprimir informação de um aluno (por número de matrícula)");
            System.out.println("3. Imprimir informação de alunos (por curso)");
            System.out.println("4. Imprimir o aluno mais velho");
            System.out.println("5. Imprimir alunos que estão inscritos em mais de um curso ");
            System.out.println("6. Imprimir número total de alunos ");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    imprimirTodosAlunos(file);
                    break;
                case 2:
                    imprimirInformacaoAluno(file);
                    break;
                case 3:
                    imprimirAlunosPorCurso(file);
                    break;
                case 4:
                    imprimirAlunoMaisVelho(file);
                    break;
                case 5:
                    imprimirAlunosDuasInscricoes(arr);
                    break;
                case 6:
                    imprimirTotalAlunos(arr);
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }


    public static void imprimirTodosAlunos(String file) throws FileNotFoundException {

        Scanner ler = new Scanner(new File(file));

        ler.nextLine();

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            System.out.println(linha);

        }

    }

    public static void imprimirInformacaoAluno(String file) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        System.out.print("Qual é o número de matricula que seja pesquisar? ");
        int numMatricula = input.nextInt();

        Scanner ler = new Scanner(new File(file));
        ler.nextLine();

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] linhaAluno = linha.split(",");
            if (Integer.parseInt(linhaAluno[1]) == numMatricula) {
                System.out.println(linha);
            }
        }
    }

    public static void imprimirAlunosPorCurso(String file) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual é o curso que deseja pesquisar? ");
        String curso = input.next();

        Scanner ler = new Scanner(new File(file));
        ler.nextLine();
        int contador = 0;

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] linhaAluno = linha.split(",");
            if (linhaAluno[2].equalsIgnoreCase(curso)) {
                System.out.println("Nome: " + linhaAluno[0] + " |   Matricula: " + linhaAluno[1]);
                contador++;
            }
        }

        System.out.println("Há " + contador + "alunos inscritos nesse curso");
    }


    public static void imprimirAlunoMaisVelho(String file) throws FileNotFoundException {
        Scanner ler = new Scanner(new File(file));
        ler.nextLine();

        int alunoMaisVelho = 0;
        String informacaoMaisVelho = " ";
        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] linhaAluno = linha.split(",");

            if (Integer.parseInt(linhaAluno[4]) >= alunoMaisVelho) {
                alunoMaisVelho = Integer.parseInt(linhaAluno[4]);
                informacaoMaisVelho = linha;
            }
        }
        System.out.println("As informações do aluno mais velho são: " + informacaoMaisVelho);
    }

    public static void imprimirAlunosDuasInscricoes(String[][] arr) throws FileNotFoundException {

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                for (int m = 0; m < arr[0].length; m++) {

                    if (Integer.parseInt(arr[i][1]) == Integer.parseInt(arr[k][1])) {
                        System.out.println(arr[k][m]);

                    }
                }
            }
        }
    }

    public static int imprimirTotalAlunos(String[][] arr) throws FileNotFoundException {


        int numLinhasRepetidas = 0;
        int numLinhas=0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                for (int m = 0; m < arr[0].length; m++) {

                    if (Integer.parseInt(arr[i][1]) == Integer.parseInt(arr[k][1])) {
                        numLinhasRepetidas++;

                    }
                }
            }
            numLinhas++;
        }

        return numLinhas - numLinhasRepetidas;
    }

public static void criarFormando(String file) throws IOException {


    FileWriter writer = new FileWriter(new File(file),true);

    writer.append("Luís André Marante Moreira,123456789,Software Developer,luis@gmail.com");

}

public static void editarFormando() {




}





    public static String[][] transformarEmMatriz(String file) throws FileNotFoundException {

        Scanner ler = new Scanner(new File(file));
        ler.nextLine();

        int numLinhas = 0;
        while (ler.hasNextLine()) {
            numLinhas++;
        }

        String[][] ficheiroEmMatriz = new String[numLinhas][5];
        Scanner ler2 = new Scanner(new File(file));

        ler2.nextLine();

        while (ler2.hasNextLine()) {
            String linha2 = ler2.nextLine();
            String[] linha2Aluno = linha2.split(",");
            for (int i = 0; i < ficheiroEmMatriz.length; i++) {
                for (int k = 0; k < ficheiroEmMatriz[0].length; k++) {
                    ficheiroEmMatriz[i][k] = linha2Aluno[k];
                }
            }
        }
        return ficheiroEmMatriz;
    }

    public static void main(String[] args) throws FileNotFoundException {

       String[][] matriz= transformarEmMatriz("filesAlg/exercicio_10.csv");

        menuGeral("filesAlg/exercicio_10.csv", matriz);
       imprimirTotalAlunos(matriz);
        imprimirAlunosDuasInscricoes(matriz);


    }
}




