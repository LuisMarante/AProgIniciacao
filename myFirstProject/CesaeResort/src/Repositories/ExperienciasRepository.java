package Repositories;

import Models.Clientes;
import Models.Experiencias;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ExperienciasRepository {


    private ArrayList<Experiencias> experienciasArrayList;

    public ExperienciasRepository() throws FileNotFoundException {

        CSVFileReader cv = new CSVFileReader();

        this.experienciasArrayList=cv.experienciasFileReader("src/Files/experiencias.csv");
    }

    public ArrayList<Experiencias> getExperienciasArrayList() {
        return experienciasArrayList;
    }
}
