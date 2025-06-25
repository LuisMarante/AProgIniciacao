package Item;

public class Luvas extends Item {

    private int defesa;

    public Luvas(String nome, String descricao, int preco, int defesa) {
        super(nome, descricao, preco);
        this.defesa = defesa;
    }


    /**
     * Função que imprime todas as informações do item do tipo Luvas
     */
    @Override
    public void exibirDetalhes(){
        System.out.println( getClass().getSimpleName() + " === Nome: " + getNome() + " | Descrição: " + getDescricao() + " | Preço: " + getPreco() + " | Defesa: " + getDefesa());

    }

    public int getDefesa() {
        return defesa;
    }
}
