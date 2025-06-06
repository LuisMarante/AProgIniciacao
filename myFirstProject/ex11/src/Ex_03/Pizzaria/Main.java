package Ex_03.Pizzaria;

import Ex_03.Enums.OrigemProduto;
import Ex_03.Enums.TipoCarne;
import Ex_03.Enums.TipoMassa;
import Ex_03.Enums.UnidadeMedida;
import Ex_03.Ingredientes.Base;
import Ex_03.Ingredientes.Carne;
import Ex_03.Ingredientes.Ingrediente;

public class Main {
    public static void main(String[] args) {

        Base baseFinaItaliana = new Base(15,"Base de Farinha s/ Gluten",1,TipoMassa.MASSA_FINA,"Tradicional não falha");

        Carne pepperoni = new Carne(12,"Pepperoni Francês",UnidadeMedida.UNIDADES,15, OrigemProduto.IMPORTADO, TipoCarne.CHOURICO);

        Pizza pizza4EstacoesPequena = new Pizza(1,"Pizza 4 Estações","Maravilha",12.5);
        pizza4EstacoesPequena.adicionarIngrediente(new IngredientesPizza(baseFinaItaliana,100));
        pizza4EstacoesPequena.adicionarIngrediente(new IngredientesPizza(pepperoni,6));

        pizza4EstacoesPequena.exibirDetalhes();

    }
}
