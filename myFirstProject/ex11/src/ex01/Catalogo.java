package ex01;

import java.util.ArrayList;

public class Catalogo {

    protected ArrayList<Aviao> listaAvioes;

    public Catalogo(ArrayList<Aviao> listaAvioes) {
        this.listaAvioes = listaAvioes;
    }

    public void exibirDetalhes(){
        System.out.println(this.listaAvioes);
    }

    public void adquirirAviao(Aviao aviaoParaAdicionar){
        listaAvioes.add(aviaoParaAdicionar);
    }

    public void venderAviao(Aviao aviaoParaRemover){
        listaAvioes.remove(aviaoParaRemover);
    }

    public void calcularValorTotal(){

        double precoTotal=0;
        for (Aviao aviao : listaAvioes){
            precoTotal+=aviao.getPreco();
        }
    }

    public void imprimirListaAvioes(){

        for(Aviao aviao : listaAvioes){
            if(aviao instanceof JatoParticular){

                JatoParticular jp = (JatoParticular) aviao;
                jp.exibirDetalhes();
            }

            if(aviao instanceof AviaoCombate){
                AviaoCombate ac = (AviaoCombate) aviao;
                ac.exibirDetalhes();
            }
        }
    }
}
