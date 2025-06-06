package ex01;

public class Main {
    public static void main(String[] args) {

        Pessoa p1= new Pessoa("Luis", 32, 176);
        Pessoa p2 = new Pessoa("Quim" , 40, 180);


        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getAltura());

        System.out.println(p2.getNome());
        System.out.println(p2.getIdade());
        System.out.println(p2.getAltura());

    }
}
