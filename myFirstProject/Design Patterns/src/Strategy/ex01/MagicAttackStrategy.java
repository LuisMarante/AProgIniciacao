package Strategy.ex01;

public class MagicAttackStrategy implements AttackStrategy{
    @Override
    public void attack() {

    }

    @Override
    public void attack(int raiva) {
        System.out.println("Fazes uma magia bonita");
    }
}
