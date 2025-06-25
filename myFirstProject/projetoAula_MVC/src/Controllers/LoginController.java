package Controllers;

import Models.User;
import Repositories.UserRepository;

import java.io.FileNotFoundException;

public class LoginController {


    private UserRepository usersRepository;

    public LoginController() throws FileNotFoundException {
        this.usersRepository = new UserRepository();
    }

    public String validateLogin(String usernameInput, String passwordInput){

        for(User userAtual : this.usersRepository.getUsersArrayList()){
            if(userAtual.getUsername().equals(usernameInput) && userAtual.getPassword().equals(passwordInput)){
                // Encontramos o match (username e password)
                return userAtual.getUserType();
            }
        }

        return "ERROR";

    }

}
