package Repositories;

import Models.Experiencias;
import Models.RatingExperiencias;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RatingExperienciasRepository {

    private ArrayList<RatingExperiencias> ratingExperienciasArrayList;

    public RatingExperienciasRepository() throws FileNotFoundException {

        CSVFileReader cv = new CSVFileReader();

        this.ratingExperienciasArrayList=cv.ratingExperienciasFileReader("src/Files/ratings_experiencias.csv");
    }

    public ArrayList<RatingExperiencias> getRatingExperienciasArrayList() {
        return ratingExperienciasArrayList;
    }
}
