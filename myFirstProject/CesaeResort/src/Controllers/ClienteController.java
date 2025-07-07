package Controllers;

import Models.Experiencias;
import Models.Quartos;
import Models.ReservasQuartos;
import Models.VendasExperiencias;
import Repositories.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClienteController {


    private QuartosRepository quartosRepository;
    private ExperienciasRepository experienciasRepository;
    private VendasExperienciasRepository vendasExperienciasRepository;
    private ReservasQuartosRepository reservasQuartosRepository;

    public ClienteController() throws FileNotFoundException {
        this.experienciasRepository = new ExperienciasRepository();
        this.quartosRepository = new QuartosRepository();
        this.vendasExperienciasRepository = new VendasExperienciasRepository();
        this.reservasQuartosRepository = new ReservasQuartosRepository();
    }


    /**
     * Função que verifica quais são os quartos disponíveis
     * @return um arrayList com os quartos disponíveis
     */
    public ArrayList<Quartos> quartosDisponiveis() {

        ArrayList<Quartos> quartosDisponiveis = new ArrayList<>();

        for (Quartos quartoAtual : quartosRepository.getQuartosArrayList()) {
            boolean disponivel = true;
            for (ReservasQuartos reservaAtual : reservasQuartosRepository.getReservasQuartosArrayList()) {
                if (quartoAtual.getNumQuarto() == reservaAtual.getNumQuarto() && reservaAtual.getAno() == 2025 && reservaAtual.getMes() == 7 && reservaAtual.getSemana() == 1) {
                    disponivel = false;
                }

            }
            if (disponivel) {
                quartosDisponiveis.add(quartoAtual);
            }

        }
        return quartosDisponiveis;
    }


    /**
     * Função que verifica quais são as experiências disponíveis
     * @return arrayList com as experiêmncias disponíveis
     */
    public ArrayList<Experiencias> experienciasDisponiveis() {
        return  null;
    }


    /**
     * Função que verifica qual é a experiência favorita
     * @return experiência favorita
     */
    public Experiencias experienciaFavorita() {
        return  null;
    }


    /**
     * Função que verifica qual é a experiência que mais foi vendida
     * @return experiência mais vendida
     */
    public Experiencias experienciaTopSeller() {
        return  null;
    }


    /**
     * Função que serve para adicionar uma nova experiência
     * @param experiencia
     * @param ratingExperiencia
     * @param ratingGuia
     */
    public void adicionarExperiencia(String experiencia, int ratingExperiencia, int ratingGuia) {

    }
}
