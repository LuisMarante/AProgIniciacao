package ex08;

public class Main {
    public static void main(String[] args) {

        Produto p1= new Produto("canivetes",10.99);
        Produto p2= new Produto("caneta",1.12);
        Produto p3= new Produto("aloquete",5.90);


        p1.adquirirStock(10);
        p1.adquirirStock(20);

        p1.venderProduto(35);


        p2.adquirirStock(50);
        p3.adquirirStock(20);

        System.out.println(p1.getQuantideStock());
        System.out.println(p2.getQuantideStock());
        System.out.println(p3.getQuantideStock());

    }
}
