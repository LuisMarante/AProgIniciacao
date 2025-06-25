package Repositories;

import Models.User;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UserRepository {

    private ArrayList<User> usersArrayList;

    public UserRepository() throws FileNotFoundException {
        CSVFileReader cv= new CSVFileReader();

        this.usersArrayList =cv.usersFileReader("Cesaeland_logins.csv");
    }


    public ArrayList<User> getUsersArrayList() {
        return usersArrayList;
    }
}