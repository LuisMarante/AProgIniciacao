package FactoryMethod.ex03;

public class Main {
    public static void main(String[] args) {


        Document d1 = FabricaDocumentos.criarDocumento("qqcoisa","luis","Word");

        d1.open();
    }
}
