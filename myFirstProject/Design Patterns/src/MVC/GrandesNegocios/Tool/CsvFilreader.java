package MVC.GrandesNegocios.Tool;

import MVC.GrandesNegocios.Models.Sale;
import MVC.GrandesNegocios.Models.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvFilreader {


    public ArrayList<Sale> lerProduto(String filePath) throws FileNotFoundException {

        File file = new File(filePath);
        ArrayList<Sale> saleArrayList = new ArrayList<>();

        Scanner readFile = new Scanner(file);

        readFile.nextLine();

        while (readFile.hasNextLine()) {

            String linha = readFile.nextLine();

            String[] linhaSeparada = linha.split(",");

            String tipoProduto = linhaSeparada[0];
            String produto = linhaSeparada[1];
            String quantidade = linhaSeparada[2];
            String precoUnitario = linhaSeparada[3];

            Sale newSale = new Sale(tipoProduto, produto, Double.parseDouble(quantidade), Double.parseDouble(precoUnitario));

            saleArrayList.add(newSale);
        }

        return saleArrayList;
    }



    public ArrayList<User> lerUser(String filePath) throws FileNotFoundException {

        File file = new File(filePath);
        ArrayList<User> userArrayList = new ArrayList<>();

        Scanner readFile = new Scanner(file);

        readFile.nextLine();

        while (readFile.hasNextLine()) {

            String linha = readFile.nextLine();

            String[] linhaSeparada = linha.split(";");

            String tipoConta = linhaSeparada[0];
            String username = linhaSeparada[1];
            String password = linhaSeparada[2];


            User newUser = new User(tipoConta,username,password);

            userArrayList.add(newUser);
        }

        return userArrayList;
    }

}
