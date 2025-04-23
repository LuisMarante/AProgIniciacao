package fichaPratica02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


      int salario;
      double taxa;

        System.out.println("Qual é o salário? ");
      salario= input.nextInt();



      if(salario>15000){
        taxa = salario*0.3;
      } else{
          taxa=salario *0.2;
      }


        System.out.println("A taxa é: "+taxa);







    }
}
