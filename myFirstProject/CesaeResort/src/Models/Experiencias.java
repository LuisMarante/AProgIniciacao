package Models;

public class Experiencias {

    private String id;
    private String nome;
    private String idGuiaExperiencia;
    private double precoAdulto;
    private double precoCrianca;

    public Experiencias(String id, String nome, String idGuiaExperiencia, double precoAdulto, double precoCrianca) {
        this.id = id;
        this.nome = nome;
        this.idGuiaExperiencia = idGuiaExperiencia;
        this.precoAdulto = precoAdulto;
        this.precoCrianca = precoCrianca;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getIdGuiaExperiencia() {
        return idGuiaExperiencia;
    }

    public double getPrecoAdulto() {
        return precoAdulto;
    }

    public double getPrecoCrianca() {
        return precoCrianca;
    }


    @Override
    public String toString() {
        return "Experiencias{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", idGuiaExperiencia='" + idGuiaExperiencia + '\'' +
                ", precoAdulto=" + precoAdulto +
                ", precoCrianca=" + precoCrianca +
                '}';
    }
}
