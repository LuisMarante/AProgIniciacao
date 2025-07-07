package Controllers;

import Models.Experiencias;
import Models.VendasExperiencias;
import Repositories.ExperienciasRepository;
import Repositories.VendasExperienciasRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GuiaExperienciaController {

    private ExperienciasRepository experienciasRepository;
    private VendasExperienciasRepository vendasExperienciasRepository;

    public GuiaExperienciaController() throws FileNotFoundException {
        this.experienciasRepository = new ExperienciasRepository();
        this.vendasExperienciasRepository = new VendasExperienciasRepository();
    }


    /**
     * Função que, com o id do gui, percorre todas as experiências e separa as experiências do guia em questão e depois faz o cálculo dos diferentes tipos de bilhetes
     * @param id
     * @return das informações das experiências à responsabilidade do Guia enviado por parámetro
     */
    public String consultarHistoricoExperiencias(String id) {

        String data = "";
        ArrayList<Experiencias> minhasExperiencias = new ArrayList<>();


        for (Experiencias experienciaAtual : experienciasRepository.getExperienciasArrayList()) {
            if (experienciaAtual.getIdGuiaExperiencia().equals(id)) {
                minhasExperiencias.add(experienciaAtual);
            }
        }


        for (Experiencias experienciaAtual : minhasExperiencias) {

            int contadorAdultos = 0, contadorCrianca = 0;
            double valorTotalArrecado = 0;
            for (VendasExperiencias vendaAtual : vendasExperienciasRepository.getVendasExperienciasArrayList()) {
                if (experienciaAtual.getId().equals(vendaAtual.getIdExperiencia())) {
                    if (vendaAtual.getTipoCliente().equals("crianca")) {
                        valorTotalArrecado += experienciaAtual.getPrecoCrianca();
                        contadorCrianca++;
                    } else {
                        valorTotalArrecado += experienciaAtual.getPrecoAdulto();
                        contadorAdultos++;
                    }
                }
            }

            data += experienciaAtual + " | Bilhetes Adulto: " + contadorAdultos + " | Bilhetes Crianca: " + contadorCrianca + " | Valor Gerado: " + valorTotalArrecado + " €\n";

        }
        return data;
    }
}
