package ex01;

import java.util.ArrayList;

public class AviaoCombate extends  Aviao {

    protected String paisOrigem;
    protected boolean camuflagem;
    protected ArrayList<Armas> armas;

    public AviaoCombate(int numSerie, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double envergaduraAsas, double alturaCauda, int numMotores, int autonomia, double velocidadeMaxima, double preco, String paisOrigem, boolean camuflagem, String[] armas) {
        super(numSerie, modelo, anoFabrico, peso, comprimentoFuselagem, envergaduraAsas, alturaCauda, numMotores, autonomia, velocidadeMaxima, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.armas = new ArrayList<>();
    }

    public void exibirDetalhes(){

        System.out.println(super.numSerie + " | " + super.modelo + " | " + super.anoFabrico+ " | " + super.peso + " | " +super.comprimentoFuselagem+ " | " +envergaduraAsas+ " | " +super.alturaCauda+ " | "
                +super.numMotores+ " | " +super.autonomia+ " | " +super.velocidadeMaxima+ " | " +super.preco+ " | " +this.paisOrigem+ " | " +this.camuflagem+ " | " +this.armas  );

    }

    public void adicionarArma(Armas armaParaAdicionar){
        armas.add(armaParaAdicionar);

    }

    public void removerArma(Armas armaParaRemover){
        armas.add(armaParaRemover);

    }


}
