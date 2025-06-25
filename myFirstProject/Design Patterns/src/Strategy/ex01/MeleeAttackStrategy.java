package Strategy.ex01;

public class MeleeAttackStrategy implements AttackStrategy{


    @Override
    public void attack() {

    }

    @Override
    public void attack(int raiva) {
        System.out.println("Atacar com uma murraça");
    }
}
