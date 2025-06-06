package ex02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("luis", 32, 917093275, "fhagsaufh@fehfe.com");
        Pessoa p2 = new Pessoa("joao", 32, 917093275, "fhagsaufh@fehfe.com");
        Pessoa p3 = new Pessoa("helder", 32, 917093275, "fhagsaufh@fehfe.com");
        Pessoa p4 = new Pessoa("vitor", 32, 917093275, "fhagsaufh@fehfe.com");
        Pessoa p5 = new Pessoa("hugo", 32, 917093275, "fhagsaufh@fehfe.com");
        Pessoa p6 = new Pessoa("ze", 15, 917093275, "fhagsaufh@fehfe.com");

        Sorteio sort = new Sorteio("Jogo de sorte", 1000);

        sort.inscreverParticipante(p1);
        sort.inscreverParticipante(p2);
        sort.inscreverParticipante(p3);
        sort.inscreverParticipante(p4);
        sort.inscreverParticipante(p5);
        sort.inscreverParticipante(p6);


        sort.sortear();
        sort.imprimirParticipantes();

    }
}
