package Strategy.ex01;

public class SneakAttackStrategy implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Vais por trás caladinho");
    }

    @Override
    public void attack(int raiva) {

    }
}
