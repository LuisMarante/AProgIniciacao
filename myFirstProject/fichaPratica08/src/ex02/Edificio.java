package ex02;

public class Edificio {

    private String nome;
    private String rua;
    private String cidade;
    private String corFachada;
    private int numAndares;
    private boolean temGaragem;




    public Edificio(String nome, String rua, String cidade, String corFachada, int numAndares, boolean temGaragem){
        this.nome=nome;
        this.rua=rua;
        this.cidade=cidade;
        this.corFachada=corFachada;
        this.numAndares=numAndares;
        this.temGaragem=temGaragem;
    }


    public String getNome(){
        return this.nome;
    }

    public String getRua(){
        return this.rua;
    }

    public String getCidade(){
        return this.cidade;
    }

    public String getCorFachada(){
        return this.corFachada;
    }

    public int getNumAndares(){
        return this.numAndares;
    }

    public boolean getTemGaragem(){
        return this.temGaragem;
    }


    public void setCorFachada(String corFachada) {
        this.corFachada = corFachada;
    }
}
