package Strategy.ex01;

public class Main {
    public static void main(String[] args) {

        Hero luis = new Hero("Luis", 100, 50, new MagicAttackStrategy());
        luis.attack(1);

        luis.setAttackStrategy(new MeleeAttackStrategy());
        luis.attack(2);
        luis.attack(2);

        luis.setAttackStrategy(new SneakAttackStrategy());
        luis.attack(5);
    }
}
