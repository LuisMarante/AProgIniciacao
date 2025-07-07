package Models;

public class ReservasQuartos {


    private String id;
    private int numQuarto;
    private String idCliente;
    private int ano;
    private int mes;
    private int semana;


    public ReservasQuartos(String id, int numQuarto, String idCliente, int ano, int mes, int semana) {
        this.id = id;
        this.numQuarto = numQuarto;
        this.idCliente = idCliente;
        this.ano = ano;
        this.mes = mes;
        this.semana = semana;
    }

    public String getId() {
        return id;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getSemana() {
        return semana;
    }

    @Override
    public String toString() {
        return "ReservasQuartos{" +
                "id='" + id + '\'' +
                ", numQuarto=" + numQuarto +
                ", idCliente='" + idCliente + '\'' +
                ", ano=" + ano +
                ", mes=" + mes +
                ", semana=" + semana +
                '}';
    }
}
