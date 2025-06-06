package ex09;

public class Funcionario {

    private String nome;
    private String email;
    private String departamento;
    private double salario;


    public Funcionario(String nome, String email, String departamento, double salario) {
        this.nome = nome;
        this.email = email;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void exibirDetalhes(){
        System.out.println(this.nome);
        System.out.println(this.email);
        System.out.println(this.departamento);
        System.out.println(this.salario);

    }

    public void aumentarSalario(double aumento){

        salario = salario* (1+aumento/100);
    }
}
