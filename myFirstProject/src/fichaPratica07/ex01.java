package fichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ex01 {

    public static void imprimirFicheiro() throws FileNotFoundException {

        File file = new File("filesAlg/exercicio_01.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);

        }
        scanner.close();
    }


    public static void main(String[] args) throws FileNotFoundException {

        imprimirFicheiro();
    }
}
