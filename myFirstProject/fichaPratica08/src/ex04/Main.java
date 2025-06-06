package ex04;

public class Main {
    public static void main(String[] args) {

Circulo c1 = new Circulo("azul", 2.5);
        Circulo c2 = new Circulo("branco", 3);



        if(c1.calculoArea()>c2.calculoArea()){
            System.out.println(c1.calculoArea());
        } else {
            System.out.println(c2.calculoArea());
        }


        if(c1.calculoPerimetro()>c2.calculoPerimetro()){
            System.out.println(c1.calculoPerimetro());
        } else {
            System.out.println(c2.calculoPerimetro());
        }

    }
}
