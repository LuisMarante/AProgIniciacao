package fichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex07 {

    public static void numeroLinhasNumeroPalavras(String file) throws FileNotFoundException {

        Scanner ler = new Scanner(new File(file));

        int numLinhas=0,numPalavras=0;

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String [] cadaPalavra = linha.split(" ");
            numPalavras+= cadaPalavra.length;
            numLinhas++;
        }

        System.out.println("O numero de linhas é " + numLinhas + "e o numero de palavras é " + numPalavras);
    }

    public static void main(String[] args) throws FileNotFoundException {

        numeroLinhasNumeroPalavras("filesAlg/exercicio_07.txt");
    }
}
