package ex05;

public class Agenda {

    private int anoCriacao = 2025;
    private Pessoa[] listaContactos;

    public Agenda(int tamanho) {
        this.listaContactos = new Pessoa[tamanho];
    }


    public void adicionarPessoa(Pessoa pessoa) {
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] == null) {
                listaContactos[i] = pessoa;
                break;

            }
        }
    }

    public void listarContactos() {
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] != null) {
                listaContactos[i].exibirDetalhes();
            }
        }
    }

    public void pesquisarContactos(String cidade) {
        for (int i = 0; i < listaContactos.length; i++) {
            if (listaContactos[i] != null) {
                if (listaContactos[i].getCidade().equalsIgnoreCase(cidade)) {
                    listaContactos[i].exibirDetalhes();
                }
            }

        }
    }
}







