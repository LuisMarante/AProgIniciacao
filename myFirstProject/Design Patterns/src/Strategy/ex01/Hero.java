package Strategy.ex01;

public class Hero {
    private String nome;
    private int vida;
    private int forca;

    private AttackStrategy attackStrategy;

    public Hero(String nome, int vida, int forca, AttackStrategy attackStrategy) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.attackStrategy = attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack(int raiva){
        this.attackStrategy.attack(raiva);
    }
}
