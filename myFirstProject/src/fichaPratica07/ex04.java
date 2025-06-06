package fichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex04 {

    public static void imprimirCVS(String ficheiro) throws FileNotFoundException {

        File file = new File("filesAlg/exercicio_04.csv");

        Scanner ler = new Scanner(file);

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] linhaSeparada = linha.split(";");

            for (int i = 0; i < linhaSeparada.length; i++) {
                System.out.print(linhaSeparada[i]+" | ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) throws FileNotFoundException {
        imprimirCVS("filesAlg/exercicio_04.csv");
    }
}
