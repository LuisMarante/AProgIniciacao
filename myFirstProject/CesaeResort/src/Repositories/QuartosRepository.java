package Repositories;

import Models.Experiencias;
import Models.Quartos;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class QuartosRepository {

    private ArrayList<Quartos> quartosArrayList;

    public QuartosRepository() throws FileNotFoundException {

        CSVFileReader cv = new CSVFileReader();

        this.quartosArrayList=cv.quartosFileReader("src/Files/quartos.csv");
    }


    public ArrayList<Quartos> getQuartosArrayList() {
        return quartosArrayList;
    }
}
