package Repositories;

import Models.Experiencias;
import Models.VendasExperiencias;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class VendasExperienciasRepository {

    private ArrayList<VendasExperiencias> vendasExperienciasArrayList;

    public VendasExperienciasRepository() throws FileNotFoundException {

        CSVFileReader cv = new CSVFileReader();

        this.vendasExperienciasArrayList=cv.vendasExperienciasFileReader("src/Files/vendas_experiencias.csv");
    }

    public ArrayList<VendasExperiencias> getVendasExperienciasArrayList() {
        return vendasExperienciasArrayList;
    }
}
