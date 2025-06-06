package ex02;

public class Main {
    public static void main(String[] args) {

       Edificio e1 = new Edificio("Edificio do eletrico", "rua monte da passagem", "paredes", "azul", 4, true);

        System.out.println(e1.getNome());
        System.out.println(e1.getRua());
        System.out.println(e1.getCidade());
        System.out.println(e1.getCorFachada());
        System.out.println(e1.getNumAndares());
        System.out.println(e1.getTemGaragem());

        e1.setCorFachada("amarelo");

        System.out.println(e1.getNome());
        System.out.println(e1.getRua());
        System.out.println(e1.getCidade());
        System.out.println(e1.getCorFachada());
        System.out.println(e1.getNumAndares());
        System.out.println(e1.getTemGaragem());

    }


}
