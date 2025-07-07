package Repositories;

import Models.Clientes;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClientesRepository {

    private ArrayList<Clientes> clientesArrayList;

    public ClientesRepository() throws FileNotFoundException {

        CSVFileReader cv = new CSVFileReader();

        this.clientesArrayList=cv.clientesFileReader("src/Files/clientes.csv");
    }


    public ArrayList<Clientes> getClientesArrayList() {
        return clientesArrayList;
    }
}
