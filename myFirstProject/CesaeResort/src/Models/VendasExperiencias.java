package Models;

public class VendasExperiencias {

    private String id;
    private String idExperiencia;
    private String tipoCliente;
    private int ano;
    private int mes;


    public VendasExperiencias(String id, String idExperiencia, String tipoCliente, int ano, int mes) {
        this.id = id;
        this.idExperiencia = idExperiencia;
        this.tipoCliente = tipoCliente;
        this.ano = ano;
        this.mes = mes;
    }

    public String getId() {
        return id;
    }

    public String getIdExperiencia() {
        return idExperiencia;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return "VendasExperiencias{" +
                "id='" + id + '\'' +
                ", idExperiencia='" + idExperiencia + '\'' +
                ", tipoCliente='" + tipoCliente + '\'' +
                ", ano=" + ano +
                ", mes=" + mes +
                '}';
    }
}
