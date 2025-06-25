package IMV;

import Enums.Dieta;
import Seres.Animal;
import Seres.Insecto;

public class Main {
    public static void main(String[] args) {

        MeioAmbiente ma = new MeioAmbiente("MeioAmbiente", 10000);

        Animal urso = new Animal("Joca", "urso", "nepal", 12, false, 130, 70, Dieta.CARNIVORO,"AURGH");
        Animal leao = new Animal("simba", "leao", "senegal", 12, true, 90, 80, Dieta.CARNIVORO,"AURGH");
        Insecto mosquito = new Insecto("chato", "mosquito", "Portugal", 1, false);


        ma.adicionarSeresVivos(urso);
        ma.adicionarSeresVivos(leao);
        ma.adicionarSeresVivos(mosquito);

        ma.exibirDetalhes();

    }
}
