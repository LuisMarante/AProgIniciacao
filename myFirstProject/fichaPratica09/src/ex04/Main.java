package ex04;

public class Main {
    public static void main(String[] args) {


        Imovel i1= new Imovel("rua das flores", 34, "Porto", Tipo.CASA,Acabamento.NOVA_COM_ALTO_ACABAMENTO,100, 2, 2, 0);


        System.out.println(i1.calcularValor());

    }
}
