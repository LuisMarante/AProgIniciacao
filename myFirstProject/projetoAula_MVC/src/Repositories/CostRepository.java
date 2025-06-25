package Repositories;

import Models.Cost;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CostRepository {


        private ArrayList<Cost> costsArrayList;

        public CostRepository() throws FileNotFoundException {

            CSVFileReader cv = new CSVFileReader();
            this.costsArrayList = cv.costsFilereader("Cesaeland_custos.csv");
        }

        public ArrayList<Cost> getCostsArrayListarray() {
            return costsArrayList;
        }
    }

