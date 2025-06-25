package FactoryMethod.ex03;

public class FabricaDocumentos {


    public static Document criarDocumento(String nome, String autor, String tipoDocumento) {

        switch (tipoDocumento) {
            case "Word":
                return new Word(nome, autor);
            case "Excel":
                return new Excel(nome, autor);
            case "PowerPoint":
                return new PowerPoint(nome, autor);
            default:
                System.out.println("Opção inválida");
        }

        return null;
    }

}
