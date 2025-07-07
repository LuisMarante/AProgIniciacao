package Controllers;

import Models.Attraction;
import Repositories.AttractionRepository;

import java.io.FileNotFoundException;

public class ClientController {

    private AttractionRepository attractionRepository;

    public ClientController() throws FileNotFoundException {

        this.attractionRepository = new AttractionRepository();
    }

    public void availableAttractions() {


        for (Attraction atracaoAtual : this.attractionRepository.getAttractionsArrayList()) {

            int segundos = atracaoAtual.getDuration();

            int minutos = segundos / 60;

            segundos = segundos % 60;

            System.out.println(atracaoAtual.getName() + " preço de bilhete de adulto: " + atracaoAtual.getAdultPrice() + " | preço de bilhete de criança: " + atracaoAtual.getChildrenPrice() + " | Duração: " + minutos + ":" + segundos);
        }

    }

    public void favoriteAttractions(){

    }
}
