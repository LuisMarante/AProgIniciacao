package Tools;

import Models.Attraction;
import Models.Cost;
import Models.Sale;
import Models.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVFileReader {

    public ArrayList<Attraction> attractionsFileReader(String filePath) throws FileNotFoundException {


        // Abrimos o ficheiro e criamos um Scanner associado
        File attractionFile = new File(filePath);
        Scanner attractionScanner = new Scanner(attractionFile);

        // Criamos o ArrayList de Vendas, vazio
        ArrayList<Attraction> attractionArrayListArray = new ArrayList<>();

        // Avançar o cabeçalho
        attractionScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (attractionScanner.hasNextLine()) {

            // Apanhamos a linha
            String linha = attractionScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] linhaSeparada = linha.split(";");

            // Reunir todas as informações da Venda
            int idAttraction = Integer.parseInt(linhaSeparada[0]);
            String name = linhaSeparada[1];
            double adultPrice = Double.parseDouble(linhaSeparada[2]);
            double childrenPrice = Double.parseDouble(linhaSeparada[3]);
            int duration = Integer.parseInt(linhaSeparada[4]);

            // Criar nova Venda
            Attraction newSale = new Attraction(idAttraction, name, adultPrice, childrenPrice, duration);

            // Adicionamos ao Array
            attractionArrayListArray.add(newSale);

        }

        // Terminando o ciclo (não há mais linhas)
        return attractionArrayListArray;
    }


    public ArrayList<User> usersFileReader(String filePath) throws FileNotFoundException {

        // Abrimos o ficheiro e criamos um Scanner associado
        File userFile = new File(filePath);
        Scanner userScanner = new Scanner(userFile);

        // Criamos o ArrayList de Vendas, vazio
        ArrayList<User> usersArrayList = new ArrayList<>();

        // Avançar o cabeçalho
        userScanner.nextLine();

        // Ciclo que vai correr para cada linha do ficheiro
        while (userScanner.hasNextLine()) {

            // Apanhamos a linha
            String line = userScanner.nextLine();

            // Separamos a linha, com base no seu separador ","
            String[] splitLine = line.split(",");

            // Reunir todas as informações da Venda
            String type = splitLine[0];
            String username = splitLine[1];
            String password = splitLine[3];


            // Criar novo jogador
            User newUser = new User(type, username, password);
            // Adicionamos ao Array
            usersArrayList.add(newUser);

        }

        // Terminando o ciclo (não há mais linhas)
        return usersArrayList;

    }

    public ArrayList<Sale> salesFileReader(String filepath) throws FileNotFoundException {

        File salesFile = new File(filepath);
        Scanner salesScanner = new Scanner((salesFile));

        ArrayList<Sale> salesArray = new ArrayList<>();

        salesScanner.nextLine();

        while (salesScanner.hasNextLine()) {

            String line = salesScanner.nextLine();
            String[] splitLine = line.split(";");

            int idAttraction = Integer.parseInt(splitLine[0]);
            String date = splitLine[1]; // this will save the month/year in the "date" variable
            String clientType = splitLine[2];

            String[] splitDate = date.split("/"); // we split the "date" variable in two, so we can have the month and year separately.
            int monthDate = Integer.parseInt(splitDate[0]);
            int yearDate = Integer.parseInt(splitDate[1]);

            Sale newSale = new Sale(idAttraction, monthDate, yearDate, clientType);

            salesArray.add(newSale);

            salesScanner.close();
        }
        return salesArray;
    }



        public ArrayList<Cost> costsFilereader(String filePath) throws FileNotFoundException {

            File costFile = new File(filePath);
            Scanner costScanner = new Scanner(costFile);

            ArrayList<Cost> costArrayList = new ArrayList<>();

            costScanner.nextLine();

            while (costScanner.hasNextLine()) {


                String linha = costScanner.nextLine();

                String[] linhaSeparada = linha.split(";");

                String idAttraction = linhaSeparada[0];
                String costMaintenanceTicket = linhaSeparada[1];
                String fixedCostMonth = linhaSeparada[3];


                Cost newCost = new Cost(Integer.parseInt(idAttraction), Double.parseDouble(costMaintenanceTicket), Double.parseDouble(fixedCostMonth));

                costArrayList.add(newCost);

            }

            return costArrayList;
        }

    }



