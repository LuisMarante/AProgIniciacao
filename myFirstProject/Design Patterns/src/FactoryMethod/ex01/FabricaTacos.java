package FactoryMethod.ex01;

public class FabricaTacos {

    public static Taco criarTaco(String tipoTaco, boolean picante, double preco) {
        switch (tipoTaco) {
            case "TacoVaca":
                return new TacoVaca(picante,preco);

            case "TacoFrango":
                return new TacoFrango(picante,preco);

            case "TacoVegetariano":

                return new TacoVegetariano(picante,preco);

            default:
                System.out.println("Escolha uma opcao correta");
        }
        return null;
    }
}


