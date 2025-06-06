package Ex_03.Ingredientes;

import Ex_03.Enums.OrigemProduto;
import Ex_03.Enums.TipoCarne;
import Ex_03.Enums.UnidadeMedida;

public class Carne extends  Topping{

    private TipoCarne tipoCarne;

    public Carne(int id, String nome, UnidadeMedida unidadeMedida, int caloriasUnidadeMedida, OrigemProduto origemProduto, TipoCarne tipoCarne) {
        super(id, nome, unidadeMedida, caloriasUnidadeMedida, origemProduto);
        this.tipoCarne = tipoCarne;
    }
}
