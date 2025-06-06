package Ex_03.Ingredientes;

import Ex_03.Enums.OrigemProduto;
import Ex_03.Enums.UnidadeMedida;

public class Topping extends  Ingrediente{


protected OrigemProduto origemProduto;

    public Topping(int id, String nome, UnidadeMedida unidadeMedida, int caloriasUnidadeMedida, OrigemProduto origemProduto) {
        super(id, nome, unidadeMedida, caloriasUnidadeMedida);
        this.origemProduto = origemProduto;
    }
}




