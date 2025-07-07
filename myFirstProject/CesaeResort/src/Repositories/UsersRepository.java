package Repositories;

import Models.Experiencias;
import Models.Users;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepository {


    private ArrayList<Users> usersArrayList;

    public UsersRepository() throws FileNotFoundException {

        CSVFileReader cv = new CSVFileReader();

        this.usersArrayList = cv.usersFileReader("src/Files/logins.csv");
    }

    public ArrayList<Users> getUsersArrayList() {
        return usersArrayList;
    }
}
