package ex03;

public class Main {
    public static void main(String[] args) {


        Peixe p1= new Peixe("sardinha", 0.87,3);
        Peixe p2 = new Peixe("robalo", 1.5, 6);

        Marisco m1 = new Marisco("lagosta", 7,15);
        Peixe p3=new Peixe("salmão", 5, 10);
        Marisco m2= new Marisco("lagostim", 6, 12);

        BarcoPesca bp1 = new BarcoPesca("O pescaa-tudo", "preto", "1990", 5,100, Marca.BENTZ);


        bp1.pescarPeixe(p1);
        bp1.pescarPeixe(p2);
        bp1.pescarPeixe(p3);
        bp1.pescarMarisco(m1);
        bp1.pescarMarisco(m2);

        System.out.println(bp1.calcularTotal());

        bp1.salarioTripulacao();
    }
}
