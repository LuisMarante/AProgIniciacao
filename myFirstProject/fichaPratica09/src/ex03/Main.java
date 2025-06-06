package ex03;

public class Main {
    public static void main(String[] args) {


        Animal a1 = new Animal("joca", "cabra", "senegal", 30, new String[]{"couve","alface"},Classe.MAMIFERO);
        Animal a2 = new Animal("micael", "pato", "chipre", 3, new String[]{"milho", "pão"}, Classe.AVE);
        a1.exibirDetalhes();

        a1.comer("couve", 3);
        a2.comer("milho",0.4);

    }
}
