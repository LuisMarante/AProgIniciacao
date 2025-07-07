package Controllers;

import Models.Users;
import Repositories.UsersRepository;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class LoginControler {

    private UsersRepository usersRepository;

    public LoginControler() throws FileNotFoundException {
        this.usersRepository = new UsersRepository();
    }


    /**
     * Função que valida os dados de login colocados e averigua se existem e , se sim, qual é o tipo de acesso desse login
     * @param usernameInput
     * @param passwordInput
     * @return tipo de acesso ou "ERROR"
     */
    public String validateLogin(String usernameInput, String passwordInput) {

        for (Users userAtual : this.usersRepository.getUsersArrayList()) {
            if (userAtual.getUsername().equals(usernameInput) && userAtual.getPassword().equals(passwordInput)) {
                // Encontramos o match (username e password)
                return userAtual.getTipoAcesso();
            }
        }
        return "ERROR";
    }


    /**
     * Função que guarda as informações do novo login
     * @throws IOException
     */
    public void guardar() throws IOException {
        FileWriter fw = new FileWriter("src/Files/logins.csv");
        for (Users userAtual : this.usersRepository.getUsersArrayList()) {
            fw.write(userAtual.getUsername() + "," + userAtual.getPassword() + "," + userAtual.getTipoAcesso());
        }

        fw.close();
    }
}
