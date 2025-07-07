package Controllers;

import Models.Quartos;
import Models.ReservasQuartos;
import Models.VendasExperiencias;
import Repositories.ExperienciasRepository;
import Repositories.QuartosRepository;
import Repositories.ReservasQuartosRepository;
import Repositories.VendasExperienciasRepository;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RececionistaController {


    private QuartosRepository quartosRepository;
    private ExperienciasRepository experienciasRepository;
    private VendasExperienciasRepository vendasExperienciasRepository;
    private ReservasQuartosRepository reservasQuartosRepository;

    public RececionistaController() throws FileNotFoundException {
        this.quartosRepository = new QuartosRepository();
        this.experienciasRepository = new ExperienciasRepository();
        this.vendasExperienciasRepository = new VendasExperienciasRepository();
        this.reservasQuartosRepository = new ReservasQuartosRepository();
    }


    /**
     * Função que verifica quais são os quartos disponíveis
     * @return arrayList com os quartos disponíveis
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
     * Função que verifica quais são os quartos que estão reservados
     * @return arrayList com os quartos reservados
     */
    public ArrayList<Quartos> quartosReservados() {
        return  null;
    }


    /**
     * Função que verifica os quartos que estão ocupados no momento
     * @return arrayList dos quartos ocupados no momento
     */
    public ArrayList<Quartos> reservasAtuais() {
        return  null;
    }


    /**
     * Função que efetua uma nova reserva, após verificar se quarto está livre na data desejada para a reserva
     * @param idCliente
     * @param numQuarto
     * @param ano
     * @param mes
     * @param semana
     * @return boolean que informa se foi feita a reserva
     */
    public boolean efetuarReserva(String idCliente, int numQuarto , int ano , int mes , int semana) {
        return  true;
    }


    /**
     * Função que reserva uma experiência
     * @param idCliente
     * @param idReserva
     * @param numAdultos
     * @param numCriancas
     */
    public void reservarExperiencia(String idCliente , String idReserva , int numAdultos , int numCriancas) {

    }

}
