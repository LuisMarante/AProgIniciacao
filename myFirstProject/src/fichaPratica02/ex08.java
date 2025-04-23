package fichaPratica02;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3;

        System.out.print("Introduz a nota1:");
        nota1= input.nextDouble();

        System.out.print("Introduz a nota2:");
        nota2= input.nextDouble();

        System.out.print("Introduz a nota3:");
        nota3= input.nextDouble();

        double mediaFinal= nota1*0.25 + nota2*0.35 + nota3*0.4;

        if(mediaFinal >= 9.5){
            System.out.println("O aluno foi aprovado");
            System.out.println("A média final foi: " + mediaFinal);
        } else{
            System.out.println("O aluno reprovou");
            System.out.println("A média final foi: " + mediaFinal);
        }
    }
}
