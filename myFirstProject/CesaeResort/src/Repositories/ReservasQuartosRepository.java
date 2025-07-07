package Repositories;

import Models.Experiencias;
import Models.ReservasQuartos;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ReservasQuartosRepository {

    private ArrayList<ReservasQuartos> reservasQuartosArrayList;

    public ReservasQuartosRepository() throws FileNotFoundException {

        CSVFileReader cv = new CSVFileReader();

        this.reservasQuartosArrayList=cv.reservasQuartosFileReader("src/Files/reservas_quartos.csv");
    }

    public ArrayList<ReservasQuartos> getReservasQuartosArrayList() {
        return reservasQuartosArrayList;
    }
}
