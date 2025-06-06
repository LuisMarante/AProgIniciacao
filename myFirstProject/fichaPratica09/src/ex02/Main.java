package ex02;

public class Main {
    public static void main(String[] args) {

        ContaBancaria cb1 = new ContaBancaria(123, "luis");
        ContaBancaria cb2 = new ContaBancaria(456, "Joao");
        ContaBancaria cb3 = new ContaBancaria(789, "Marco");
        ContaBancaria cb4 = new ContaBancaria(987, "Zé");

        cb1.depositar(1000);
        cb2.depositar(15000);
        cb3.depositar(18000);
        cb4.depositar(700);

        cb2.levantar(5000);

//cb1.exibirDetalhes();
//cb2.exibirDetalhes();
//cb3.exibirDetalhes();
//cb4.exibirDetalhes();

cb1.exibirDetalhes();
cb1.pedirEmprestimo(10000);

cb1.exibirDetalhes();
cb1.pedirEmprestimo(500);
cb1.exibirDetalhes();
cb1.pedirEmprestimo(100);
cb1.exibirDetalhes();
    }
}
