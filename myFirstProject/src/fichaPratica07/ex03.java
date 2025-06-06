package fichaPratica07;

import java.io.*;
import java.util.Scanner;

public class ex03 {

    /** Função que imprime o conteudo de um ficheiro
     *
     */

    public static void copiarConteudo(String origem, String destino) throws FileNotFoundException {

        File file1 = new File(origem);
        Scanner ler = new Scanner(file1);

        File file2 = new File("novoFicheiro.txt");
        PrintWriter writer = new PrintWriter(destino);

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            writer.println(linha);

        }

        writer.close();
    }

    public static void main(String[] args) throws IOException {

        copiarConteudo("filesAlg/exercicio_01.txt","filesAlg/exercicio_02.txt");

        }
    }

