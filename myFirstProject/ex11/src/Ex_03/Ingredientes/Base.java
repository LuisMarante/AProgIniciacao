package Ex_03.Ingredientes;

import Ex_03.Enums.TipoMassa;
import Ex_03.Enums.UnidadeMedida;

public class Base extends Ingrediente {

    protected TipoMassa tipoMassa;
    protected String descricao;

    public Base(int id, String nome, int caloriasUnidadeMedida, TipoMassa tipoMassa, String descricao) {
        super(id, nome, UnidadeMedida.GRAMAS, caloriasUnidadeMedida);
        this.tipoMassa = tipoMassa;
        this.descricao = descricao;
    }

    public TipoMassa getTipoMassa() {
        return tipoMassa;
    }
}

