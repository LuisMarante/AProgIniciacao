package Ex_03.Pizzaria;

import Ex_03.Ingredientes.*;

import java.util.ArrayList;

public class Pizza {

    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private ArrayList<IngredientesPizza> listaIngredientes;

    public Pizza(int id, String nome, String descricao, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.listaIngredientes = new ArrayList<>();
    }

    public void exibirDetalhes() {
        System.out.println(this.id + " | " + this.nome + " | " + this.descricao + " | " + this.preco);
        System.out.println("\nreceita:");
        for (IngredientesPizza ingredienteAtual : listaIngredientes) {
            ingredienteAtual.getIngrediente().exibirDetalhes();
            System.out.println(ingredienteAtual.getQuantidade());
        }
    }

    public void adicionarIngrediente(IngredientesPizza ingrediente) {

        boolean temBase = false;
        for (IngredientesPizza ingredientePizzaAtual : listaIngredientes) {
            if (ingredientePizzaAtual.getIngrediente() instanceof Base) {
                temBase=true;
                break;
            }
        }
        if(temBase) {
            if(ingrediente.getIngrediente()instanceof Topping) {
                if (listaIngredientes.size() <= 4) {
                    listaIngredientes.add(ingrediente);
                } else {
                    System.out.println("Não pode colocar mais do que 5 ingredientes");
                }
            } else {
                System.out.println("Não pode colocar outra base");
            }
        }
    }

    public void removerIngrediente(int id) {
        for (IngredientesPizza ingredienteAtual : listaIngredientes) {
            if (ingredienteAtual.getIngrediente().getId() == id) {
                listaIngredientes.remove(ingredienteAtual);
            }
        }
    }

    public void calcularCaloriasTotais() {
        double totalCalorias = 0;

        for (IngredientesPizza ingredientePizzaAtual : listaIngredientes) {
            totalCalorias += ingredientePizzaAtual.getQuantidade() * ingredientePizzaAtual.getIngrediente().getCaloriasUnidadeMedida();
        }
    }

    public void definirTipoPizza(){

        int contadorCarne=0;
        int contadorFrutosMar=0;
        int contadorVegetal=0;
        int contadorQueijo=0;


        for(IngredientesPizza ingrediente : listaIngredientes){
            if(ingrediente.getIngrediente()instanceof Carne){
                contadorCarne++;
            } else if(ingrediente.getIngrediente()instanceof Vegetal){
                contadorVegetal++;
            }  else if(ingrediente.getIngrediente()instanceof FrutoMar){
                contadorFrutosMar++;
            } else if(ingrediente.getIngrediente()instanceof Queijo){
                contadorQueijo++;
            }
        }

        if(contadorCarne>0 && contadorQueijo==0 &contadorVegetal==0&& contadorFrutosMar==0){
            System.out.println("A pizza é de Carne");
        } else if(contadorCarne==0 && contadorQueijo==0 &contadorVegetal==0&& contadorFrutosMar>0){
            System.out.println("A pizza é de frutos do mar");
        }else if(contadorCarne==0 && contadorQueijo==0 &contadorVegetal>0&& contadorFrutosMar==0){
            System.out.println("A piza é vegetariana");
        }else if(contadorCarne>0 && contadorQueijo>0 &contadorVegetal>0&& contadorFrutosMar>0){
            System.out.println("É uma pizza completa");
        } else {
            System.out.println("É uma pizza mista");
        }

    }
}
