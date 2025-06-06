package ex09;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("luis", "hgsgsjd@djdh.com", "backend", 1579.87);

        f1.exibirDetalhes();

        f1.aumentarSalario(20);

        System.out.println();
        f1.exibirDetalhes();
    }
}
