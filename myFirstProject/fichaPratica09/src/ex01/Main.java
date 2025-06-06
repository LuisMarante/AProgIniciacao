package ex01;

public class Main {
    public static void main(String[] args) {
        Carro audi = new Carro("Audi", "A3", "Cinza", 2020, 150, 1600, TipoCombustivel.DIESEL, 7.5);
        Carro fiat = new Carro("fiat", "Panda", "Branco", 2010, 90, 1200, TipoCombustivel.DIESEL, 5);
        Carro bmw = new Carro("BMW", "M4", "Preto", 2006, 300, 2000, TipoCombustivel.GASOLINA, 9.5);
        Carro mercedes = new Carro("Mercedes", "modelo caro", "preto", 2022, 600, 1900, TipoCombustivel.DIESEL, 8.5);

//        audi.ligar();
//        fiat.ligar();
//        bmw.ligar();
//        mercedes.ligar();

        Carro vencedor1=audi.corrida(fiat);
        Carro vencedor2=bmw.corrida(mercedes);

      Carro vencedorFinal=vencedor1.corrida(vencedor2);


//        System.out.println( fiat.calcularConsumo(50));

        System.out.println(vencedorFinal.calcularConsumo(65));

    }
}
