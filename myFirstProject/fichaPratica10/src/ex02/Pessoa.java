package ex02;

public class Pessoa {

private String nome;
private int idade;
private int telemovel;
private String email;


    public Pessoa(String nome, int idade, int telemovel, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telemovel = telemovel;
        this.email = email;
    }

    public void exibirDetalhes(){
    System.out.println("Nome: " + this.nome + " |  Idade: " + this.idade +
            " |  Telemovel: " + this.telemovel + " |  Email: " + this.email);
}


//public boolean ehAdulto(int idade){
//    if (idade<18){
//        return false;
//    }
//    return true;
//}

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
