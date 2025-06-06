package fichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex06 {

    public static void imprimirPessoaMaisVelha(String filePath) throws FileNotFoundException {

        Scanner ler = new Scanner(new File(filePath));

        int maiorIdade = 0;
        String nome = " ";
        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] informacaoPessoa = linha.split(",");


            if (Integer.parseInt(informacaoPessoa[1]) > maiorIdade) {
                maiorIdade = Integer.parseInt(informacaoPessoa[1]);
                nome = informacaoPessoa[0];

            }
        }

        System.out.println("A pessoa com mais idade é o/a " + nome + "que tem " + maiorIdade + "anos");


    }


    public static void main(String[] args) throws FileNotFoundException {

        imprimirPessoaMaisVelha("filesAlg/exercicio_06.txt");
    }
}
