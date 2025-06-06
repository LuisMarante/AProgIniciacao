package fichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex08 {

    public static double totalVendas(String file) throws FileNotFoundException {

        double total = 0;

        Scanner ler = new Scanner(new File(file));
        ler.nextLine();

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] arrVendas = linha.split(",");
            total += Double.parseDouble(arrVendas[2]) * Double.parseDouble(arrVendas[3]);
        }
        return total;
    }

    public static void main(String[] args) throws FileNotFoundException {



        System.out.println(totalVendas("filesAlg/exercicio_08.csv"));
    }
}
