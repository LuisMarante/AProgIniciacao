package ex05;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("luis", 32, "Paredes", "sfjwjfefj@jfjf.com", 918098914);
        Pessoa p2 = new Pessoa("joao", 20, "Porto", "kjdjfjd@jfjf.com", 918833592);
        Agenda a1 = new Agenda(10);

        a1.adicionarPessoa(p1);
        a1.adicionarPessoa(p2);
        a1.listarContactos();

        a1.pesquisarContactos("Paredes");

    }
}
