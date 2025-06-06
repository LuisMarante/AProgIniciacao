package Ex_03.Pizzaria;

import Ex_03.Ingredientes.Ingrediente;

public class IngredientesPizza {

    private Ingrediente ingrediente;
    private int quantidade;


    public IngredientesPizza(Ingrediente ingrediente, int quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;


    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
