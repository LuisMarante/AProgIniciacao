package Entidades;

import Enums.TipoArma;
import Item.Arma;

import java.util.Random;

public class Feiticeiro extends Heroi {

    public Feiticeiro(String nome, int maxHP, int hpAtual, int forca, int defesa, int ouro, int stealth, int energia) {
        super(nome, maxHP, hpAtual, forca, defesa, ouro, stealth, energia,TipoArma.CAJADO);
        this.inventario.clear();
        this.inventario.add(new Arma("Pau encontrado no monte","Básica",0,1,1,TipoArma.CAJADO));

    }


    /**
     * função que cria as stats do heroi de forma aleatória com valores minimos definidos pelo programador
     * @param nome  que o herói vai ter
     * @return do heroi já com os seus atributos
     */
    public static Feiticeiro criarFeiticeiro(String nome){

        Random rd = new Random();

        int maxHP= rd.nextInt(21) + 280;
        int hpAtual= maxHP;
        int forca= rd.nextInt(21) + 220;
        int defesa= rd.nextInt(21) + 200;
        int ouro= rd.nextInt(11) + 40;
        int stealth= rd.nextInt(21) + 90;
        int energia= 130;
        

        return  new Feiticeiro (nome, maxHP,hpAtual,forca,defesa,ouro,stealth,energia);

    }
}

