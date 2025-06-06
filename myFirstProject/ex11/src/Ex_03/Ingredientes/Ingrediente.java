package Ex_03.Ingredientes;

import Ex_03.Enums.TipoMassa;
import Ex_03.Enums.UnidadeMedida;

import java.util.ArrayList;

public class Ingrediente {


    protected int id;
    protected String nome;
    protected UnidadeMedida unidadeMedida;
    protected int caloriasUnidadeMedida;

    public Ingrediente(int id, String nome, UnidadeMedida unidadeMedida, int caloriasUnidadeMedida) {
        this.id = id;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.caloriasUnidadeMedida = caloriasUnidadeMedida;
    }

    public void exibirDetalhes(){
        System.out.print(" [ " + this.id + " | "+ this.nome + " | " + this.unidadeMedida + " | " + this.caloriasUnidadeMedida + "] : ");
    }

    public int getId() {
        return id;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public String getNome() {
        return nome;
    }

    public double getCaloriasUnidadeMedida() {
        return caloriasUnidadeMedida;
    }

}
