package Item;

public class Consumivel extends Item {


    private int aumentoHP;
    private int aumentoEnergia;
    private double aumentoAtaque;
    private double aumentoDefesa;

    public Consumivel(String nome, String descricao, int preco, int aumentoHP, int aumentoEnergia, double aumentoAtaque, double aumentoDefesa) {
        super(nome, descricao, preco);
        this.aumentoHP = aumentoHP;
        this.aumentoEnergia = aumentoEnergia;
        this.aumentoAtaque=aumentoAtaque;
        this.aumentoDefesa=aumentoDefesa;
    }


    /**
     * Função que imprime todas as informações do item do tipo Consumível
     */
    @Override
    public void exibirDetalhes(){
        System.out.println( getClass().getSimpleName() + " === Nome: " + getNome() + " | Descrição: " + getDescricao() + " | Preço: " + getPreco() + " | Aumento de HP: " + getAumentoHP() +
                " | Aumento de energia: " + getAumentoEnergia() + " | Aumento de ataque: " + getAumentoAtaque() + " | Aumento de defesa: " + getAumentoDefesa());

    }

    public int getAumentoHP() {
        return aumentoHP;
    }

    public int getAumentoEnergia() {
        return aumentoEnergia;
    }

    public double getAumentoAtaque() {
        return aumentoAtaque;
    }

    public double getAumentoDefesa() {
        return aumentoDefesa;
    }
}
