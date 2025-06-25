package Repositories;

import Models.Sale;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SaleRepository {


        private ArrayList<Sale> salesArray;

        public SaleRepository() throws FileNotFoundException {

            CSVFileReader csvFileReader = new CSVFileReader();
            this.salesArray = csvFileReader.salesFileReader("Files/Cesaeland_vendas.csv");
        }

        public ArrayList<Sale> getSalesArray() {
            return salesArray;
        }
    }


