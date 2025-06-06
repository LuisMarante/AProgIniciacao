package ex03;

import java.util.Arrays;

public class Animal {

    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String[] alimentacao;
    private Classe classe;

    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao, Classe classe) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
        this.classe = classe;
    }

    public void exibirDetalhes(){
        System.out.println(this.nome + " | " + this.especie + " | " + this.paisOrigem + " | "+ this.peso + " | "  + this.classe);
        System.out.print("Alimentação: ");
        for (int i = 0; i < this.alimentacao.length; i++) {
            System.out.print( this.alimentacao[i]+" | ");
        }
        System.out.println();

    }

    public void comer(String alimento, double peso){
        boolean animalCome=false;
        for (int i = 0; i < this.alimentacao.length; i++) {
            if(this.alimentacao[i].equalsIgnoreCase(alimento)){
                animalCome=true;
            }
        }

        if(animalCome){
            this.peso+=peso;
            System.out.println(this.nome + " comeu " + alimento + " e o peso alterou-se para " + this.peso);
            fazerBarulho();
        }

    }

public void fazerBarulho(){

        switch (classe){
            case MAMIFERO:
                System.out.println("Tinonino");
                break;
            case ANFIBIO:
                System.out.println("Brrrrrrrrr");
                break;
            case AVE:
                System.out.println("Kwak kwak");
                break;
            case REPTIL:
                System.out.println("Psssssssss");
                break;
            case PEIXE:
                System.out.println("Blub Blub Splash");
                break;
        }

}



}
