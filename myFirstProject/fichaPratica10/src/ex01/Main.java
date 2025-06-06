package ex01;

public class Main {
    public static void main(String[] args) {
        Musica m1 = new Musica("Mestre da Culinaria", "Pimba", "Quim", 180);
        Musica m2 = new Musica("rock you", "Pimba", "Quim", 180);
        Musica m3 = new Musica("hello", "Pimba", "Quim", 180);
        Musica m4 = new Musica("Goodbye", "Pimba", "Quim", 180);
        Musica m5 = new Musica("beatiful day", "Pimba", "Quim", 180);


        MusicPlayer mp = new MusicPlayer();

        mp.adicionarMusica(m1);
        mp.adicionarMusica(m2);
        mp.adicionarMusica(m3);
        mp.adicionarMusica(m4);
        mp.adicionarMusica(m5);

        mp.imprimirDetalhes();

        mp.trocarMusicas(0, 3);
        System.out.println();
        mp.imprimirDetalhes();
        System.out.println();
        mp.removerMusica(2);
        mp.imprimirDetalhes();


        mp.duracaoTotal();
    }
}
