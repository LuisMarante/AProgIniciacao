package ex02;

import ex01.Musica;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    Random rd = new Random();


    private String nome;
    private int premio;
    private ArrayList<Pessoa> participantes;


    public Sorteio(String nome, int premio) {
        this.nome = nome;
        this.premio = premio;
        this.participantes = new ArrayList<>();
    }

    public ArrayList<Pessoa> getParticipantes() {
        return participantes;
    }

    public void inscreverParticipante(Pessoa pessoaParaInscrever) {
        if (pessoaParaInscrever.getIdade() >= 18) {
            System.out.println("A sua inscrição foi feita com sucesso");
            participantes.add(pessoaParaInscrever);
        }
    }

    public Pessoa sortear() {

        int indexSorteado = rd.nextInt(participantes.size());

        Pessoa vencedor = participantes.get(indexSorteado);
        vencedor.exibirDetalhes();
        return vencedor;
    }

    public void imprimirParticipantes(){

        for (Pessoa pessoa : participantes){
            pessoa.exibirDetalhes();
        }
    }

}
