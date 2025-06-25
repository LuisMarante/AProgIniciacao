package Tools;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {


    private static Logger logger;

    private String nomeFicheiro;


    private Logger(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;

    }

    public static Logger getLogger(String nomeFicheiro) {

        if (logger == null) {
            logger = new Logger(nomeFicheiro);
        }
        return logger;
    }


    public void log(String mensagem) throws IOException {
        FileWriter fw = new FileWriter(nomeFicheiro,true);
        fw.write(mensagem+"\n");
        fw.close();
    }
}
