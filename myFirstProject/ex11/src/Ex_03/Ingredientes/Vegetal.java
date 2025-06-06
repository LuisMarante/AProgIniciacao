package Ex_03.Ingredientes;

import Ex_03.Enums.OrigemProduto;
import Ex_03.Enums.TipoVegetal;
import Ex_03.Enums.UnidadeMedida;

public class Vegetal extends  Topping{

    private TipoVegetal tipoVegetal;

    public Vegetal(int id, String nome, UnidadeMedida unidadeMedida, int caloriasUnidadeMedida, OrigemProduto origemProduto, TipoVegetal tipoVegetal) {
        super(id, nome, unidadeMedida, caloriasUnidadeMedida, origemProduto);
        this.tipoVegetal = tipoVegetal;
    }
}
