package ex07;

public class Main {
    public static void main(String[] args) {


        Aluno a1 = new Aluno("joao", 15, "hdhdgsh@sjdhf.com", "Soft Dev", 15);

        Aluno a2 = new Aluno("marco", 15, "hdhdgsh@sjdhf.com", "Soft Dev", 7.5);


        System.out.println(a1.aprovacao());
        System.out.println(a2.aprovacao());

    }
}
