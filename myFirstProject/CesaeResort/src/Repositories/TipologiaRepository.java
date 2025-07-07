package Repositories;

import Models.Experiencias;
import Models.Tipologia;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TipologiaRepository {

    private ArrayList<Tipologia> tipologiaArrayList;

    public TipologiaRepository() throws FileNotFoundException {

        CSVFileReader cv = new CSVFileReader();

        this.tipologiaArrayList=cv.tipologiaFileReader("src/Files/tipologia.csv");
    }

    public ArrayList<Tipologia> getTipologiaArrayList() {
        return tipologiaArrayList;
    }
}
