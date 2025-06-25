package MVC.GrandesNegocios.Repositories;

import MVC.GrandesNegocios.Models.Sale;
import MVC.GrandesNegocios.Tool.CsvFilreader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesRepositories {

    private ArrayList<Sale> arrayListSales;


    public SalesRepositories() throws FileNotFoundException {

        CsvFilreader csvFR = new CsvFilreader();

        this.arrayListSales= csvFR.lerProduto("Files/minimercado.csv");

    }

    public ArrayList<Sale> getArrayListSales() {
        return arrayListSales;
    }
}
