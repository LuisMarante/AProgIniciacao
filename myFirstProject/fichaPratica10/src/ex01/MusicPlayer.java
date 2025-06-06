package ex01;

import java.util.ArrayList;

public class MusicPlayer {

    private ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<Musica>();
    }

    public void adicionarMusica(Musica musicaNova){
        this.programacao.add(musicaNova);
    }


    public void imprimirDetalhes(){


        for (Musica musicaAtual : programacao) {
            musicaAtual.exibirDetalhes();
        }
    }

    public void removerMusica(int index1){

        Musica m1 = this.programacao.get(index1);
        this.programacao.remove(m1);

    }

    public void trocarMusicas(int index1, int index2){
        Musica m1 = this.programacao.get(index1);
        Musica m2 = this.programacao.get(index2);

        this.programacao.set(index1,m2);
        this.programacao.set(index2,m1);
    }
    public void trocarMusicas(Musica musica1, Musica musica2){
        int index1 = programacao.indexOf(musica1);
        int index2= programacao.indexOf(musica2);

        programacao.set(index1, musica2);
        programacao.set(index2,musica2);

    }

    public void duracaoTotal(){
        int totalSegundos=0;

        for (Musica musicaAtual : programacao){
          totalSegundos+=musicaAtual.getDuracao();
        }

        int horas=0;
        int minutos=0;

        horas = totalSegundos / 3600;
        minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;


        System.out.println("O album "+horas + ":"+minutos+":"+segundos);
    }
}
