package Entidades;

import Enums.TipoArma;
import Item.Arma;

import java.util.Random;

public class Cavaleiro extends Heroi {

    public Cavaleiro(String nome, int maxHP, int hpAtual, int forca, int defesa, int ouro, int stealth, int energia) {
        super(nome, maxHP, hpAtual, forca, defesa, ouro, stealth, energia,TipoArma.ESPADA);
        this.inventario.clear();
        this.inventario.add(new Arma("Faca Manteiga","Básica",0,1,1,TipoArma.ESPADA));
    }


    /**
     * função que cria as stats do heroi de forma aleatória com valores minimos definidos pelo programador
     * @param nome que o herói vai ter
     * @return do heroi já com os seus atributos
     *      */

    public static Cavaleiro criarCavaleiro(String nome){

        Random rd = new Random();

        int maxHP= rd.nextInt(21) + 320;
        int hpAtual= maxHP;
        int forca= rd.nextInt(21) + 180;
        int defesa= rd.nextInt(21) + 240;
        int ouro= rd.nextInt(11) + 40;
        int stealth= rd.nextInt(21) + 50;
        int energia= 130;



        return  new Cavaleiro (nome, maxHP,hpAtual,forca,defesa,ouro,stealth,energia);
    }
}
