package ex10;

public class ContaBancaria {

    private int iban;
    private String titular;
    private double saldo = 0;

    public ContaBancaria(int iban, String titular) {
        this.iban = iban;
        this.titular = titular;

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
