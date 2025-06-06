package ex02;

public class Main {
    public static void main(String[] args) {


        Carro c1 = new Carro("BMW", "m4", 2008, 1900, TipoCombustivel.DIESEL, 8.5, 5);
        Mota m1 = new Mota("Suzuki", "ajsfjefbj", 2010, 2200, TipoCombustivel.GASOLINA, 10);
        Camiao cam1 = new Camiao("Ford", "Transit", 2005, 2000, TipoCombustivel.DIESEL, 9, 500);

        Carro c2 = new Carro("Audi", "A3", 2015, 1600, TipoCombustivel.DIESEL, 7.5, 5);


        c1.corrida(c2).exibirDetalhes();

        m1.corrida(cam1).exibirDetalhes();
    }
}
