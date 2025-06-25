package MVC.GrandesNegocios.Controllers;

import MVC.GrandesNegocios.Models.User;
import MVC.GrandesNegocios.Repositories.UsersRepositories;

import java.io.FileNotFoundException;

public class LoginController {


    private UsersRepositories usersRepositories;



    public LoginController() throws FileNotFoundException {

        this.usersRepositories = new UsersRepositories();
    }



    public String validateLogin(String usernameInput, String passwordInput){

        for(User userAtual : this.usersRepositories.getUserArrayList()){
            if(userAtual.getUsername().equals(usernameInput) && userAtual.getPassword().equals(passwordInput)){
                // Encontramos o match (username e password)
                return userAtual.getTipoConta();
            }
        }

        return "ERROR";

    }
}
