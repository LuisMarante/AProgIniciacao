package Repositories;

import Models.Experiencias;
import Models.GuiasExperiencias;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GuiaExperienciasRepository {

    private ArrayList<GuiasExperiencias> guiaExperienciasArrayList;

    public GuiaExperienciasRepository() throws FileNotFoundException {

        CSVFileReader cv = new CSVFileReader();

        this.guiaExperienciasArrayList=cv.guiaExperienciasFileReader("src/Repositories/GuiaExperienciasRepository.java");
    }

    public ArrayList<GuiasExperiencias> getGuiaExperienciasArrayList() {
        return guiaExperienciasArrayList;
    }
}
