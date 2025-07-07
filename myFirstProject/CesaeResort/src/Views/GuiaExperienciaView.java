package Views;

import Controllers.ClienteController;
import Controllers.GuiaExperienciaController;
import Models.GuiasExperiencias;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class GuiaExperienciaView {

    private GuiaExperienciaController guiaExperienciaController;
    private String idGuiaLoginFeito;

    public GuiaExperienciaView(String idGuiaLoginFeito) throws FileNotFoundException {
        this.guiaExperienciaController = new GuiaExperienciaController();
        this.idGuiaLoginFeito=idGuiaLoginFeito;
    }

    public void guiaExperienciasMenu() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        int opcaoGuia;

        do {

            System.out.println("\n\n********** MENU GUIA **********");
            System.out.println("1. Consultar histórico de experiências.");
            System.out.println("0. Voltar");

            System.out.print("\nOpção: ");
            opcaoGuia = input.nextInt();

            switch (opcaoGuia) {
                case 1:
                    System.out.println("\n***** Histórico de Experiências *****");
                    GuiaExperienciaController ge1 = new GuiaExperienciaController();

                    System.out.println(ge1.consultarHistoricoExperiencias(idGuiaLoginFeito));
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }

        } while (opcaoGuia != 0);
    }


}
