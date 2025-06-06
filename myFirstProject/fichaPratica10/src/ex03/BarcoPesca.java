package ex03;

import java.util.ArrayList;

public class BarcoPesca {

    private String nome;
    private String cor;
    private String anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca BENTZ;
    private ArrayList<Peixe> peixesPescados;
    private ArrayList<Marisco> mariscoPescado;

    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeCarga, Marca BENTZ) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.BENTZ = BENTZ;
        this.peixesPescados = new ArrayList<>();
        this.mariscoPescado = new ArrayList<>();
    }

    public double pesoAtual() {
        double pesoAtual = 0;

        for (Peixe peixe : peixesPescados) {
            pesoAtual += peixe.getPeso();
        }

        for (Marisco marisco : mariscoPescado) {
            pesoAtual += marisco.getPeso();
        }
        return pesoAtual;
    }

    public void pescarPeixe(Peixe peixe) {
        if (pesoAtual() + peixe.getPeso() <= capacidadeCarga) {
            this.peixesPescados.add(peixe);
        }
    }

    public void pescarMarisco(Marisco marisco) {
        if (pesoAtual() + marisco.getPeso() <= capacidadeCarga) {
            this.mariscoPescado.add(marisco);
        }
    }

    public void largarPeixe(Peixe peixeLargar) {

            peixesPescados.remove(peixeLargar);

    }

    public void largarMarisco(int index) {
        if(index>= 0 && index< mariscoPescado.size()) {
            mariscoPescado.remove(index);
        }
    }

    public double calcularTotal() {
        double valorTotal = 0;
        for (Peixe peixe : peixesPescados) {
            valorTotal += peixe.getPeso() * peixe.getPrecoPorKil();
        }

        for (Marisco marisco : mariscoPescado) {
            valorTotal += marisco.getPeso() * marisco.getPrecoPorKilo();
        }

        return valorTotal;
    }

    public void salarioTripulacao(){
        double salarioTripulacao=0;

        salarioTripulacao=(calcularTotal()*0.6)/this.tripulacao;

        System.out.println("Salário de cada tripulante: " + salarioTripulacao);

    }
}
