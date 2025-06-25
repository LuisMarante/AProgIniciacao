package Item;

public abstract class Item {


    protected String nome;
    protected String descricao;
    protected int preco;

    public Item(String nome, String descricao, int preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }


    /**
     * Função que imprime todas as informações do item
     */
    public void exibirDetalhes(){

        System.out.println("Nome: " + getNome() + " | Descrição: " + getDescricao() + " | Preço: " + getPreco());

    }

    public String getNome() {

        return nome;
    }

    public String getDescricao() {

        return descricao;
    }

    public int getPreco() {
        return preco;
    }


}
