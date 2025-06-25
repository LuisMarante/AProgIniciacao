package Entidades;

public abstract  class Entidade {

    protected String nome;
    protected double maxHP;
    protected double hpAtual;
    protected int forca;
    protected int defesa;
    protected int ouro;


    public Entidade(String nome, double maxHP, double hpAtual, int forca, int defesa, int ouro ) {
        this.nome = nome;
        this.maxHP = maxHP;
        this.hpAtual = maxHP;
        this.forca=forca;
        this.defesa=defesa;
        this.ouro=ouro;

    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome + " | " + "HP: " + this.maxHP + " | HP atual: " + this.hpAtual +
                " | Ataque: " + this.forca+ " | Defesa: " + this.defesa + " | Ouro: " + this.ouro);

    }

    public String getNome() {
        return nome;
    }


    public void setHpAtual(double hpAtual) {
        this.hpAtual = hpAtual;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public double getMaxHP() {
        return maxHP;
    }

    public double getHpAtual() {
        return hpAtual;
    }

    public int getForca() {
        return forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getOuro() {
        return ouro;
    }
}
