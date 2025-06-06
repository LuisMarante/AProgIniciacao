package ex01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        JatoParticular jp1 = new JatoParticular(1, "boeing", 2022, 50000,30, 15,10,4,1000,500,10000000,10,1000,Categoria.LIGHT_JET);


        jp1.inserirInstalacao(Instalacoes.WC);
        jp1.inserirInstalacao(Instalacoes.COZINHA);

        jp1.exibirDetalhes();
    }
}
