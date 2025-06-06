package Ex_03.Ingredientes;

import Ex_03.Enums.OrigemProduto;
import Ex_03.Enums.TipoFrutosDoMar;
import Ex_03.Enums.UnidadeMedida;

public class FrutoMar extends Topping{

    private TipoFrutosDoMar tipoFrutosDoMar;

    public FrutoMar(int id, String nome, UnidadeMedida unidadeMedida, int caloriasUnidadeMedida, OrigemProduto origemProduto, TipoFrutosDoMar tipoFrutosDoMar) {
        super(id, nome, unidadeMedida, caloriasUnidadeMedida, origemProduto);
        this.tipoFrutosDoMar = tipoFrutosDoMar;
    }
}
