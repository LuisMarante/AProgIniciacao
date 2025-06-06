package fichaPratica07;

import java.io.*;

public class ex02 {
    public static void main(String[] args) {

        try {
            File file = new File("filesAlg/teste.txt");

            FileWriter writer = new FileWriter(file,true);

            writer.append("!!!!!!!!!!!!!!!!!!!!"+"\n");
            writer.append("Tá tudo ou quê?"+"\n");

            writer.close();

            System.out.println("Texto criado com sucesso");

        }
        catch (FileNotFoundException e) {

            System.out.println("Mensagem não foi criada");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
