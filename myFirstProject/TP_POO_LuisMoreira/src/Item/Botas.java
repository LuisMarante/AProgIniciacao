package Item;

public class Botas extends Item{

    private int defesa;
    private int stealth;

    public Botas(String nome, String descricao, int preco, int defesa, int stealth) {
        super(nome, descricao, preco);
        this.defesa = defesa;
        this.stealth = stealth;
    }


    /**
     * Função que imprime todas as informações do item do tipo Botas
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
