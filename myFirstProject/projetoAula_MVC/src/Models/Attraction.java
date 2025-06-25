package Models;

public class Attraction {


    private int idAttraction;
    private String name;
    private double adultPrice;
    private double childrenPrice;
    private int duration;

    public Attraction(int id, String name, double adultPrice, double childrenPrice, int duration) {
        this.idAttraction = id;
        this.name = name;
        this.adultPrice = adultPrice;
        this.childrenPrice = childrenPrice;
        this.duration = duration;
    }

    public int getIdAttraction() {
        return idAttraction;
    }

    public String getName() {
        return name;
    }

    public double getAdultPrice() {
        return adultPrice;
    }

    public double getChildrenPrice() {
        return childrenPrice;
    }

    public int getDuration() {
        return duration;
    }


    @Override
    public String toString() {
        return  "Name: " + name + " |  Preço de adulto: " + adultPrice +"€ | Preço de criança: " + childrenPrice + "€ | Duração: " + duration;
    }
}
