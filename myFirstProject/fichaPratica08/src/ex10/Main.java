package ex10;

public class Main {
    public static void main(String[] args) {


        ContaBancaria cb1 = new ContaBancaria(1234, "Joao");
        ContaBancaria cb2 = new ContaBancaria(5678, "luis");
        ContaBancaria cb3 = new ContaBancaria(2468, "Zé");


        cb1.depositar(1000);
        cb2.depositar(15000);
        cb3.depositar(18000);

        cb2.levantar(5000);


        System.out.println(cb1.getSaldo());
        System.out.println(cb2.getSaldo());

        cb1.transferir(cb3,500);

    }
}
