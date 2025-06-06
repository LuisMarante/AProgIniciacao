package fichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex05 {

    public static double somarNumerosFicheiroTexto(String file) throws FileNotFoundException {

//        File ficheiro= new File(file);
//        Scanner ler = new Scanner(ficheiro);

        Scanner ler = new Scanner(new File(file));

        double soma=0;

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] valoresSeparados = linha.split(" ");

            for (int i = 0; i < valoresSeparados.length; i++) {
                soma+= Double.parseDouble(valoresSeparados[i]);
            }
        }
return soma;

    }

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(somarNumerosFicheiroTexto("filesAlg/exercicio_05_1999.txt"));
    }
}
