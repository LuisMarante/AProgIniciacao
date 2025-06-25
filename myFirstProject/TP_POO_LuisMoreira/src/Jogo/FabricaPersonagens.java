package Jogo;

import Entidades.*;

import java.util.Random;

public class FabricaPersonagens {

    public static NPC criarNPC(String tipoNPC) {
        switch (tipoNPC) {
            case "Orc":
                return criarOrc();
            case "Troll":
                return criarTroll();
            case "Goblin":
                return criarGoblin();
            default:
                throw  new IllegalArgumentException("Tipo Inválido");
        }
    }

    public static Orc criarOrc() {

        Random rd = new Random();
        String nome = "Orc";
        int maxHP = rd.nextInt(21) + 150;
        int hpAtual = maxHP;
        int forca = rd.nextInt(21) + 80;
        int defesa = rd.nextInt(21) + 120;
        int ouro = rd.nextInt(11) + 20;

        return new Orc(nome, maxHP, hpAtual, forca, defesa, ouro);

    }


    /**
     * Função que cria um NPC com nome "Troll" já com seus atributos aleatórios com mínimos controlados pelo programador
     *
     * @return Troll
     */
    public static Troll criarTroll() {

        Random rd = new Random();
        String nome = "Troll";
        int maxHP = rd.nextInt(21) + 200;
        int hpAtual = maxHP;
        int forca = rd.nextInt(21) + 150;
        int defesa = rd.nextInt(21) + 180;
        int ouro = rd.nextInt(11) + 30;

        return new Troll(nome, maxHP, hpAtual, forca, defesa, ouro);

    }


    /**
     * Função que cria um NPC com nome "Goblin" já com seus atributos aleatórios com mínimos controlados pelo programador
     *
     * @return Goblin
     */
    public static Goblin criarGoblin() {

        Random rd = new Random();
        String nome = "Goblin";
        int maxHP = rd.nextInt(21) + 120;
        int hpAtual = maxHP;
        int forca = rd.nextInt(21) + 60;
        int defesa = rd.nextInt(21) + 100;
        int ouro = rd.nextInt(11) + 25;

        return new Goblin(nome, maxHP, hpAtual, forca, defesa, ouro);

    }


    /**
     * Função que cria um NPC com nome "Witch King" já com seus atributos aleatórios com mínimos controlados pelo programador
     *
     * @return Witch King
     */
    public static WitchKing criarWitchKing() {

        Random rd = new Random();
        String nome = "Witch King";
        int maxHP = rd.nextInt(21) + 250;
        int hpAtual = maxHP;
        int forca = rd.nextInt(21) + 230;
        int defesa = rd.nextInt(21) + 180;
        int ouro = rd.nextInt(11) + 10;

        return new WitchKing(nome, maxHP, hpAtual, forca, defesa, ouro);

    }


    /**
     * Função que cria um NPC com nome "Nazgul" já com seus atributos aleatórios com mínimos controlados pelo programador
     *
     * @return Nazgul
     */
    public static Nazgul criarNazgul() {

        Random rd = new Random();
        String nome = "Nazgul";
        int maxHP = rd.nextInt(21) + 220;
        int hpAtual = maxHP;
        int forca = rd.nextInt(21) + 200;
        int defesa = rd.nextInt(21) + 150;
        int ouro = rd.nextInt(11) + 10;

        return new Nazgul(nome, maxHP, hpAtual, forca, defesa, ouro);

    }


    /**
     * Função que cria um NPC com nome "Warg" já com seus atributos aleatórios com mínimos controlados pelo programador
     *
     * @return Warg
     */
    public static Nazgul criarWarg() {

        Random rd = new Random();
        String nome = "Nazgul";
        int maxHP = rd.nextInt(21) + 170;
        int hpAtual = maxHP;
        int forca = rd.nextInt(21) + 170;
        int defesa = rd.nextInt(21) + 120;
        int ouro = rd.nextInt(11) + 30;

        return new Nazgul(nome, maxHP, hpAtual, forca, defesa, ouro);

    }


    /**
     * Função que cria um NPC com nome "Balrog" já com seus atributos aleatórios com mínimos controlados pelo programador
     *
     * @return Balrog
     */
    public static Balrog criarBalrog() {

        Random rd = new Random();
        String nome = "Balrog";
        int maxHP = rd.nextInt(21) + 280;
        int hpAtual = maxHP;
        int forca = rd.nextInt(21) + 280;
        int defesa = rd.nextInt(21) + 280;
        int ouro = rd.nextInt(11) + 10;

        return new Balrog(nome, maxHP, hpAtual, forca, defesa, ouro);

    }


    /**
     * Função que escolhe um NPC aleatoriamente, com percentagens controladas pelo programador
     *
     * @return NPC aleatório
     */
    public static NPC inimigoAleatorio() {
        Random rd = new Random();
        int npcSorteado = rd.nextInt(7);

        switch (npcSorteado) {
            case 0, 1, 2:
                return criarOrc();
            case 3, 4, 5:
                return criarGoblin();
            case 6:
                return criarTroll();

        }
        return null;
    }
}
