package Controllers;

import Models.*;
import Repositories.*;

import java.io.FileNotFoundException;

public class AdminController {


    private QuartosRepository quartosRepository;
    private ExperienciasRepository experienciasRepository;
    private TipologiaRepository tipologiaRepository;
    private UsersRepository usersRepository;
    private VendasExperienciasRepository vendasExperienciasRepository;


    public AdminController() throws FileNotFoundException {
        this.quartosRepository = new QuartosRepository();
        this.experienciasRepository = new ExperienciasRepository();
        this.tipologiaRepository = new TipologiaRepository();
        this.usersRepository = new UsersRepository();
        this.vendasExperienciasRepository = new VendasExperienciasRepository();
    }


    /**
     * Função que conta o total de reservas
     * @return total de reservas
     */
    public int totalReservas() {
return  0;
    }


    /**
     * Função que calcula o total de receitas
     * @return total de receitas
     */
    public int totalReceitas() {
        return  0;
    }


    /**
     * Função que utilizando o ano e o mes passados por parámetro, calcula o total de reservas e receitas dessa data
     * @param ano
     * @param mes
     * @return total de reservas e receitas dessa data
     */
    public double reservas_receitas_mensais(int ano, int mes) {
        return  0;

    }


    /**
     * Função que calcula qual é tipologia de quarto mais reservada
     * @return tipologia mis reservada
     */
    public Tipologia tipologiaQuartoMaisReservado() {

        return  null;
    }


    /**
     * Função que calcula a experiência mais procurada por adutos
     * @return experiência mais procurada por adutos
     */
    public Experiencias experienciaMaisProcuradaAdultos() {
        return  null;
    }


    /**
     * Função que calcula a experiência mais procurada por crianças
     * @return experiência mais procurada por crianças
     */
    public Experiencias experienciaMaisProcuradaCriancas() {
        return  null;
    }


    /**
     * Função que calcula a experiência mais lucrativa
     * @return experiência mais lucrativa
     */
    public Experiencias experienciaMaisLucrativa() {
        return  null;
    }


    /**
     * Função que calcula a experiência mais lucrativa
     * @return experiência mais lucrativa
     */
    public Experiencias experienciaMenosLucrativa() {
        return  null;
    }


    /**
     * Função que apresenta o quarto com melhor preço por semana
     * @return quarto com melhor preço por semana
     */
    public Quartos quartoMelhorPreco_Semana() {

        return  null;
    }


    /**
     * Função responsável por adicionar um novo login
     * @param inputUsername
     * @param inputPassword
     * @param tipoAcesso
     * @return boolean que informa se houne um novo login registado ou não
     */
    public boolean adicionarLogin(String inputUsername , String inputPassword , String tipoAcesso){

        boolean existe = false;

        for(Users userAtual : usersRepository.getUsersArrayList()){
            if(userAtual.getUsername().equals(inputUsername) ){
                existe=true;
            }
        }

        if(!existe){
            usersRepository.getUsersArrayList().add(new Users(inputUsername, inputPassword, tipoAcesso));
        }

        return existe;
    }
}
