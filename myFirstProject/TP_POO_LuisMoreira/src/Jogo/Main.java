package Jogo;

import Entidades.Heroi;
import Tools.Audio;
import Tools.Logger;

import java.io.IOException;

import static Jogo.Jogo.criarPersonagem;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {


        Logger logger = Logger.getLogger("log.txt");
        logger.log("Começou o jogo");

        enterMiddleEarth();

    }

    public static void enterMiddleEarth() throws InterruptedException, IOException {

        Jogo.criarPersonagem();

    }
}
