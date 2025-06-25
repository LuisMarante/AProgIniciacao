package MVC.GrandesNegocios;

import MVC.GrandesNegocios.Views.LoginView;

import java.io.FileNotFoundException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        LoginView lv = new LoginView();
        lv.mainMenu();

    }
}
