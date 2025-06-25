package Singleton.ex02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger logger;

    private String nomeFicheiro;

    /// //////////////////////////////////// CONSTRUTOR

    private Logger(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;

    }
    /// //////////////////////////////////// OBRIGA A USAR SEMPRE O MESMO OBJETO

    public static Logger getLogger(String nomeFicheiro) {

        if (logger == null) {
            logger = new Logger(nomeFicheiro);
        }
        return logger;
    }

    /// //////////////////////////////////// METODO

    public void log(String mensagem) throws IOException {
        FileWriter fw = new FileWriter(nomeFicheiro,true);
        fw.write(mensagem+"\n");
        fw.close();
    }
}
