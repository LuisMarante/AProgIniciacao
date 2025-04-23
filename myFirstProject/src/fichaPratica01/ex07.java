package fichaPratica01;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double preco1, preco2, preco3, precoTotal;

        System.out.print("Quanto custa o primeiro produto? ");
        preco1= input.nextDouble();
        System.out.print("Quanto custa o primeiro produto? ");
        preco2= input.nextDouble();
        System.out.print("Quanto custa o primeiro produto? ");
        preco3= input.nextDouble();

        double desconto = 0.1;

        precoTotal = (preco1 + preco2 + preco3) * (1-desconto);

        System.out.println("O preço total após desconto é: "+precoTotal);

    }
}
