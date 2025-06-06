package ex01;

import java.util.ArrayList;

public class JatoParticular extends Aviao {

    protected int lotacao;
    protected double capacidadeBagagem;
    protected Categoria categoria;
    protected ArrayList<Instalacoes> instalacoes;


    public JatoParticular(int numSerie, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double envergaduraAsas,
                          double alturaCauda, int numMotores, int autonomia, double velocidadeMaxima, double preco, int lotacao, double capacidadeBagagem, Categoria categoria) {

        super(numSerie, modelo, anoFabrico, peso, comprimentoFuselagem, envergaduraAsas,
                alturaCauda, numMotores, autonomia, velocidadeMaxima, preco);
        this.lotacao = lotacao;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<>();
    }



    public void exibirDetalhes(){
        System.out.println(super.numSerie + " | " + super.modelo + " | " + super.anoFabrico+ " | " + super.peso + " | " +super.comprimentoFuselagem+ " | " +envergaduraAsas+ " | " +super.alturaCauda+ " | "
                +super.numMotores+ " | " +super.autonomia+ " | " +super.velocidadeMaxima+ " | " +super.preco+ " | " +this.lotacao+ " | " +this.categoria+ " | " +this.instalacoes  + " | " + this.capacidadeBagagem);

    }

    public void inserirInstalacao(Instalacoes instalacoesParaAdicionar) {
        instalacoes.add(instalacoesParaAdicionar);
    }

    public void removerInstalacoes(Instalacoes instalacaoRemover){
        instalacoes.remove(instalacaoRemover);
    }




}
