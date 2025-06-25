package Entidades;
import Enums.TipoArma;
import Item.Arma;

import java.util.Random;

public class Arqueiro extends Heroi {

    public Arqueiro(String nome, int maxHP, int hpAtual, int forca, int defesa, int ouro, int stealth, int energia) {
        super(nome, maxHP, hpAtual, forca, defesa, ouro, stealth, energia,TipoArma.ARCO);
        this.inventario.clear();
        this.inventario.add(new Arma("Fisga","Básica",0,1,1,TipoArma.ARCO));
    }


    /**
     * função que cria as stats do heroi de forma aleatória com valores minimos definidos pelo programador
     * @param nome que o herói vai ter
     * @return do heroi já com os seus atributos
     */
    public static Arqueiro criarArqueiro(String nome){

        Random rd = new Random();

        int maxHP= rd.nextInt(21) + 250;
        int hpAtual= maxHP;
        int forca= rd.nextInt(21) + 200;
        int defesa= rd.nextInt(21) + 180;
        int ouro= rd.nextInt(11) + 40;
        int stealth= rd.nextInt(21) + 100;
        int energia= 130;

        return  new Arqueiro (nome, maxHP,hpAtual,forca,defesa,ouro,stealth,energia);
    }
}
