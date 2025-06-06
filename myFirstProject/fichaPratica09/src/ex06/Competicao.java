package ex06;

public class Competicao {

private String nome;
private String pais;
private Atleta[] listaAtletas;


    public Competicao(String nome, String pais, int tamanho) {
        this.nome = nome;
        this.pais = pais;
        this.listaAtletas = new Atleta[tamanho];
    }

    public String getPais() {
        return pais;
    }

    public void inscreverAtleta(Atleta atleta){
        for (int i = 0; i < listaAtletas.length; i++) {
            if(listaAtletas[i]==null) {
                listaAtletas[i]=atleta;
                break;
            }
        }
    }

    public void listarAtletas(){
        for (int i = 0; i < listaAtletas.length; i++) {
            if(listaAtletas[i]!=null){
                listaAtletas[i].exibirDetalhes();
            }
        }
    }

    public void atletasCasa(){
        for (int i = 0; i < listaAtletas.length; i++) {
            if (listaAtletas[i]!=null) {
                if (listaAtletas[i].getPaisOrigem().equalsIgnoreCase(getPais())) {
                    listaAtletas[i].exibirDetalhes();
                }
            }
        }
    }
}
