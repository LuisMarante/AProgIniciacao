package MVC.GrandesNegocios.Repositories;

import MVC.GrandesNegocios.Models.User;
import MVC.GrandesNegocios.Tool.CsvFilreader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class UsersRepositories {

    private ArrayList<User> userArrayList;


    public UsersRepositories() throws FileNotFoundException {

        CsvFilreader csvFR = new CsvFilreader();

        this.userArrayList= csvFR.lerUser("Files/login_grandesNegocios.csv");

    }

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }
}
