package Ex_03.Ingredientes;

import Ex_03.Enums.OrigemProduto;
import Ex_03.Enums.TipoQueijo;
import Ex_03.Enums.UnidadeMedida;

public class Queijo extends Topping{

    private TipoQueijo tipoQueijo;

    public Queijo(int id, String nome, UnidadeMedida unidadeMedida, int caloriasUnidadeMedida, OrigemProduto origemProduto, TipoQueijo tipoQueijo) {
        super(id, nome, unidadeMedida, caloriasUnidadeMedida, origemProduto);
        this.tipoQueijo = tipoQueijo;
    }
}
