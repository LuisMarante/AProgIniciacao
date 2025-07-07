package Tools;

import Models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVFileReader {


    /**
     * Função que lê o ficheiro e copia cada linha para um arrayList
     * @param filePath
     * @return arrayList
     * @throws FileNotFoundException
     */
    public ArrayList<Clientes> clientesFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File clienteFile = new File(filePath);
        Scanner newScanner = new Scanner(clienteFile);

        // Criamos o ArrayList, vazio
        ArrayList<Clientes> clientesArrayList = new ArrayList<>();

        // Avançar o cabeçalho
        newScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (newScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = newScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // Reunir todas as informações

            String id = linhaSeparada[0];
            String nome = linhaSeparada[1];
            String nacionalidade = linhaSeparada[2];
            String email = linhaSeparada[3];
            int telemovel = Integer.parseInt(linhaSeparada[4]);
            String dataNascimento = linhaSeparada[5];
            boolean consentimentoMarketing = Boolean.parseBoolean(linhaSeparada[6]);


            // Criar novo objeto
            Clientes newObject = new Clientes(id, nome, nacionalidade, email, telemovel, dataNascimento, consentimentoMarketing);

            // Adicionamos ao Array
            clientesArrayList.add(newObject);

        }

        // Terminando o ciclo (não há mais linhas)
        return clientesArrayList;
    }


    /**
     * Função que lê o ficheiro e copia cada linha para um arrayList
     * @param filePath
     * @return arrayList
     * @throws FileNotFoundException
     */
    public ArrayList<Experiencias> experienciasFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File experienciasFile = new File(filePath);
        Scanner newScanner = new Scanner(experienciasFile);

        // Criamos o ArrayList, vazio
        ArrayList<Experiencias> experienciasArrayList = new ArrayList<>();

        // Avançar o cabeçalho
        newScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (newScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = newScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // Reunir todas as informações

            String id = linhaSeparada[0];
            String nome = linhaSeparada[1];
            String idGuiaExperiencia = linhaSeparada[2];
            double precoAdulto = Double.parseDouble(linhaSeparada[3]);
            double precoCrianca = Double.parseDouble(linhaSeparada[4]);


            // Criar novo objeto
            Experiencias newObject = new Experiencias(id, nome, idGuiaExperiencia, precoAdulto, precoCrianca);

            // Adicionamos ao Array
            experienciasArrayList.add(newObject);

        }

        // Terminando o ciclo (não há mais linhas)
        return experienciasArrayList;
    }


    /**
     * Função que lê o ficheiro e copia cada linha para um arrayList
     * @param filePath
     * @return arrayList
     * @throws FileNotFoundException
     */
    public ArrayList<GuiasExperiencias> guiaExperienciasFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File guiaExperienciasFile = new File(filePath);
        Scanner newScanner = new Scanner(guiaExperienciasFile);

        // Criamos o ArrayList, vazio
        ArrayList<GuiasExperiencias> guiasExperienciasArrayList = new ArrayList<>();

        // Avançar o cabeçalho
        newScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (newScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = newScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // Reunir todas as informações

            String id = linhaSeparada[0];
            String nome = linhaSeparada[1];
            String nacionalidade = linhaSeparada[2];
            String email = linhaSeparada[3];
            int telemovel = Integer.parseInt(linhaSeparada[4]);


            // Criar novo objeto
            GuiasExperiencias newObject = new GuiasExperiencias(id, nome, nacionalidade, email, telemovel);

            // Adicionamos ao Array
            guiasExperienciasArrayList.add(newObject);

        }

        // Terminando o ciclo (não há mais linhas)
        return guiasExperienciasArrayList;
    }


    /**
     * Função que lê o ficheiro e copia cada linha para um arrayList
     * @param filePath
     * @return arrayList
     * @throws FileNotFoundException
     */
    public ArrayList<Users> usersFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File usersFile = new File(filePath);
        Scanner newScanner = new Scanner(usersFile);

        // Criamos o ArrayList, vazio
        ArrayList<Users> usersArrayList = new ArrayList<>();

        // Avançar o cabeçalho
        newScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (newScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = newScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // Reunir todas as informações

            String username = linhaSeparada[0];
            String password = linhaSeparada[1];
            String tipoAcesso = linhaSeparada[2];



            // Criar novo objeto
            Users newObject = new Users(username, password, tipoAcesso );

            // Adicionamos ao Array
            usersArrayList.add(newObject);

        }

        // Terminando o ciclo (não há mais linhas)
        return usersArrayList;
    }


    /**
     * Função que lê o ficheiro e copia cada linha para um arrayList
     * @param filePath
     * @return arrayList
     * @throws FileNotFoundException
     */
    public ArrayList<Quartos> quartosFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File quartosFile = new File(filePath);
        Scanner newScanner = new Scanner(quartosFile);

        // Criamos o ArrayList, vazio
        ArrayList<Quartos> quartosArrayList = new ArrayList<>();

        // Avançar o cabeçalho
        newScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (newScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = newScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // Reunir todas as informações

            int numQuarto = Integer.parseInt(linhaSeparada[0]);
            int idTipologia = Integer.parseInt(linhaSeparada[1]);




            // Criar novo objeto
            Quartos newObject = new Quartos(numQuarto, idTipologia );

            // Adicionamos ao Array
            quartosArrayList.add(newObject);

        }

        // Terminando o ciclo (não há mais linhas)
        return quartosArrayList;
    }


    /**
     * Função que lê o ficheiro e copia cada linha para um arrayList
     * @param filePath
     * @return arrayList
     * @throws FileNotFoundException
     */
    public ArrayList<RatingExperiencias> ratingExperienciasFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File ratingExperiencasFile = new File(filePath);
        Scanner newScanner = new Scanner(ratingExperiencasFile);

        // Criamos o ArrayList, vazio
        ArrayList<RatingExperiencias> ratingExperienciasArrayList = new ArrayList<>();

        // Avançar o cabeçalho
        newScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (newScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = newScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // Reunir todas as informações

            String id = (linhaSeparada[0]);
            String idExperienca = linhaSeparada[1];
            int ratingExperiencia = Integer.parseInt(linhaSeparada[2]);
            int ratingGuia = Integer.parseInt(linhaSeparada[3]);




            // Criar novo objeto
            RatingExperiencias newObject = new RatingExperiencias(id, idExperienca, ratingExperiencia, ratingGuia );

            // Adicionamos ao Array
            ratingExperienciasArrayList.add(newObject);

        }

        // Terminando o ciclo (não há mais linhas)
        return ratingExperienciasArrayList;
    }


    /**
     * Função que lê o ficheiro e copia cada linha para um arrayList
     * @param filePath
     * @return arrayList
     * @throws FileNotFoundException
     */
    public ArrayList<ReservasQuartos> reservasQuartosFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File reservasQuartosFile = new File(filePath);
        Scanner newScanner = new Scanner(reservasQuartosFile);

        // Criamos o ArrayList, vazio
        ArrayList<ReservasQuartos> reservasQuartosArrayList = new ArrayList<>();

        // Avançar o cabeçalho
        newScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (newScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = newScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // Reunir todas as informações

            String id = (linhaSeparada[0]);
            int numQuarto = Integer.parseInt(linhaSeparada[1]);
            String idCliente = linhaSeparada[2];
            int ano = Integer.parseInt(linhaSeparada[3]);
            int mes = Integer.parseInt(linhaSeparada[4]);
            int semana = Integer.parseInt(linhaSeparada[5]);




            // Criar novo objeto
            ReservasQuartos newObject = new ReservasQuartos(id, numQuarto, idCliente, ano, mes, semana );

            // Adicionamos ao Array
            reservasQuartosArrayList.add(newObject);

        }

        // Terminando o ciclo (não há mais linhas)
        return reservasQuartosArrayList;
    }


    /**
     * Função que lê o ficheiro e copia cada linha para um arrayList
     * @param filePath
     * @return arrayList
     * @throws FileNotFoundException
     */
    public ArrayList<Tipologia> tipologiaFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File tipologiaFile = new File(filePath);
        Scanner newScanner = new Scanner(tipologiaFile);

        // Criamos o ArrayList, vazio
        ArrayList<Tipologia> tipologiasArrayList = new ArrayList<>();

        // Avançar o cabeçalho
        newScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (newScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = newScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // Reunir todas as informações


            int id = Integer.parseInt(linhaSeparada[0]);
            String descricao = linhaSeparada[1];
            double precoPorSemana = Double.parseDouble(linhaSeparada[2]);



            // Criar novo objeto
            Tipologia newObject = new Tipologia(id, descricao, precoPorSemana );

            // Adicionamos ao Array
            tipologiasArrayList.add(newObject);

        }

        // Terminando o ciclo (não há mais linhas)
        return tipologiasArrayList;
    }


    /**
     * Função que lê o ficheiro e copia cada linha para um arrayList
     * @param filePath
     * @return arrayList
     * @throws FileNotFoundException
     */
    public ArrayList<VendasExperiencias> vendasExperienciasFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File vendasExperienciasFile = new File(filePath);
        Scanner newScanner = new Scanner(vendasExperienciasFile);

        // Criamos o ArrayList, vazio
        ArrayList<VendasExperiencias> vendasExperienciasArrayList = new ArrayList<>();

        // Avançar o cabeçalho
        newScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (newScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = newScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(",");

            // Reunir todas as informações


            String id = linhaSeparada[0];
            String idExperiencia = linhaSeparada[1];
            String tipoCliente =linhaSeparada[2];
            int ano = Integer.parseInt(linhaSeparada[3]);
            int mes = Integer.parseInt(linhaSeparada[4]);


            // Criar novo objeto
            VendasExperiencias newObject = new VendasExperiencias(id, idExperiencia, tipoCliente, ano,mes );

            // Adicionamos ao Array
            vendasExperienciasArrayList.add(newObject);

        }

        // Terminando o ciclo (não há mais linhas)
        return vendasExperienciasArrayList;
    }

}

