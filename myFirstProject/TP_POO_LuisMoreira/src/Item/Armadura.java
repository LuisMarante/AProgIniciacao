package Item;

public class Armadura extends Item{

    private int defesa;

    public Armadura(String nome, String descricao, int preco, int defesa) {
        super(nome, descricao, preco);
        this.defesa = defesa;
    }


    /**
     * Função que imprime todas as informações do item do tipo Armadura
     */
    @Override
    public void exibirDetalhes(){
        System.out.println(getClass().getSimpleName() + " === Nome: " + getNome() + " | Descrição: " + getDescricao() + " | Preço: " + getPreco() + " | Defesa: " + getDefesa());

    }

    public int getDefesa() {
        return defesa;
    }
}
