package IMV;

import Seres.Animal;
import Seres.Insecto;
import Seres.Planta;
import Seres.SerVivo;

import java.util.ArrayList;

import static Enums.FamiliaPlantas.*;

public class MeioAmbiente {

    private String nome;
    private double agua;
    private ArrayList<SerVivo> seres;

    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
        this.seres = new ArrayList<>();
    }

    public void exibirDetalhes() {

        System.out.println(this.nome + " | " + this.agua);
        for (SerVivo ser : seres) {
            ser.exibirDetalhes();
        }
    }

    public void adicionarSeresVivos(SerVivo serVivo) {

        seres.add(serVivo);
    }


    public boolean plantaBebe(int indexPlanta) {

        SerVivo ser = this.seres.get(indexPlanta);

        boolean plantaCome = false;
        if (ser instanceof Planta) {
            if (((Planta) ser).getFamiliaPlantas().equals(ARVORES)) {
                if (this.agua >= 1) {
                    System.out.println(ser.getNome() + "bebeu 1 litro de água");
                    this.agua -= 1;
                    plantaCome = true;
                }

            } else if ((((Planta) ser).getFamiliaPlantas().equals(FLORES))) {
                if (this.agua >= 0.1) {
                    System.out.println(ser.getNome() + "bebeu 0,1 litro de água");
                    this.agua -= 0.1;
                    plantaCome = true;
                }

            } else if ((((Planta) ser).getFamiliaPlantas().equals(ERVAS))) {
                if (this.agua >= 0.25) {
                    System.out.println(ser.getNome() + "bebeu 0,25 litros de água");
                    this.agua -= 0.25;
                    plantaCome = true;
                }

            } else {
                System.out.println(ser.getNome() + "não bebeu água e, então, secou");
                seres.remove(ser);
            }
        }
        return plantaCome;
    }

    public boolean plantaComeInseto(int indexPlanta) {

        SerVivo ser = this.seres.get(indexPlanta);

        boolean haInsecto = false;

        if (ser instanceof Planta) {
            for (SerVivo inseto : seres) {
                if (inseto instanceof Insecto) {
                    haInsecto = true;
                } else {
                    seres.remove(ser);
                }
            }
        }

        return haInsecto;
    }

    public void plantaAbanaComVento(int indexPlanta) {

        SerVivo ser = this.seres.get(indexPlanta);

        System.out.println("Está muito vento. A" + ser.getNome() + "abanou");

    }

    public void animalFazBarulho(int indexAnimal) {

        Animal ser = (Animal) this.seres.get(indexAnimal);
        System.out.println("O " + ser.getNome() + "faz " + ser.getBarulho());

    }

    public void animalMovimenta(int indexAnimal) {

        Animal ser = (Animal) this.seres.get(indexAnimal);
        System.out.println("O " + ser.getNome() + "movimenta-se");

    }

    public boolean animalBebe(int indexAnimal) {

        Animal ser = (Animal) this.seres.get(indexAnimal);
        boolean animalBebe = false;




        return animalBebe;
    }

    public boolean animalCome(int indexAnimal) {
        boolean animalCome = false;


        return animalCome;
    }

    public void insetoChateia() {

    }

    public void simulador() {


    }
}
