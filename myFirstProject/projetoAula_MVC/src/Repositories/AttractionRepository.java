package Repositories;

import Models.Attraction;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class AttractionRepository {

    private ArrayList<Attraction> attractionsArrayList;

    public AttractionRepository() throws FileNotFoundException {

        CSVFileReader cv = new CSVFileReader();

        cv.attractionsFileReader("src/Files/Cesaeland_atracoes.csv");
    }

    public ArrayList<Attraction> getAttractionsArrayList() {
        return attractionsArrayList;
    }

}
