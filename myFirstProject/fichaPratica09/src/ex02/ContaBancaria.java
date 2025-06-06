package ex02;

public class ContaBancaria {

    private int iban;
    private String titular;
    private double saldo = 0;
    private int anoAbertura=2025;
    private double margemEmprestimo=0.5;
    private double valorDivida=0;


    public ContaBancaria(int iban, String titular) {
        this.iban = iban;
        this.titular = titular;

    }

    public void exibirDetalhes(){
        System.out.println(this.iban + " | " + this.titular + " | " + this.saldo +" euros" + " | "  + this.anoAbertura + " | "  + this.margemEmprestimo + " | "  + this.valorDivida);
    }


    public void pedirEmprestimo(double valor){

        if(this.valorDivida>0){
            System.out.println("Não é permitido fazer mais do que um empréstimo");

        } else if (this.saldo*this.margemEmprestimo>=valor){
            this.saldo+=valor;
            this.valorDivida+=valor;
            System.out.println("Empréstimo concedido");
        } else {
            System.out.println("Não é possível realizar o empréstimo");
        }
    }

    public void amortizarEmprestimo(double valor){

        if(valor<=this.valorDivida && this.saldo>= valor){
            this.saldo-=valor;
            this.valorDivida-=valor;
        } else {
            System.out.println("Operação não permitida");
        }
    }


    public int getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(valor + " euros depositados na conta número " + iban);
    }

    public void levantar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            System.out.println(valor + " euros levantados da conta número " + iban);
        } else {
            System.out.println("Saldo insuficiente na conta " + iban);
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (this.saldo >= valor) {
            contaDestino.saldo += valor;
            this.saldo-=valor;
        }
    }

}
