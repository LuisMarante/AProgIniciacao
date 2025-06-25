package Item;

import Enums.TipoArma;

public class Arma extends Item{


    private int ataque;
    private int ataqueEspecial;
    private TipoArma tipoArma;

    public Arma(String nome, String descricao, int preco, int ataque, int ataqueEspecial, TipoArma tipoArma) {
        super(nome, descricao, preco);
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.tipoArma = tipoArma;
    }


    /**
     * Função que imprime todas as informações do item do tipo Arma
     */
    @Override
    public void exibirDetalhes(){
        System.out.println(getClass().getSimpleName() + " === Nome: " + getNome() + " | Descrição: " + getDescricao() + " | Preço: " + getPreco() + " | Ataque: " + getAtaque() +
                " | Ataque especial: " + getAtaqueEspecial() + " | Tipo de arma: " + getTipoArma());

    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public TipoArma getTipoArma() {
        return tipoArma;
    }
}
