package Item;

public class Capa extends Item{

    private int defesa;
    private int stealth;

    public Capa(String nome, String descricao, int preco, int defesa, int stealth) {
        super(nome, descricao, preco);
        this.defesa = defesa;
        this.stealth = stealth;
    }


    /**
     * Função que imprime todas as informações do item do tipo Capa
     */
    @Override
    public void exibirDetalhes(){
        System.out.println(getClass().getSimpleName() + " === Nome: " + getNome() + " | Descrição: " + getDescricao() + " | Preço: " + getPreco() + " | Defesa: " + getDefesa() + " | Stealth: " + getStealth());

    }

    public int getDefesa() {
        return defesa;
    }

    public int getStealth() {
        return stealth;
    }
}
