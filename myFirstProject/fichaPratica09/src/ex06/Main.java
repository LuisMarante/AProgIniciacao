package ex06;

public class Main {
    public static void main(String[] args) {

        Atleta a1=new Atleta("joao", "futebol", 170,70,"Portugal", 150);
        Atleta a2=new Atleta("marco", "voleibol", 190,87,"Portugal", 4);
        Atleta a3=new Atleta("ze", "basket", 198,90,"Brasil", 15);
        Atleta a4=new Atleta("joca", "futebol", 170,70,"Portugal", 33);
        Atleta a5=new Atleta("bruno", "voleibol", 205,94,"França", 20);


        Competicao c1 = new Competicao("Campeonato Mundo", "Portugal", 10);


        c1.inscreverAtleta(a1);
        c1.inscreverAtleta(a2);
        c1.inscreverAtleta(a3);
        c1.inscreverAtleta(a4);
        c1.inscreverAtleta(a5);

        c1.atletasCasa();


    }
}
