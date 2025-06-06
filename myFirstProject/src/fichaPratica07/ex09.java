package fichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex09 {

    /**
     * Função que tem menu para pesquisa de musicas
     *
     * @param file
     * @throws FileNotFoundException
     */
    public static void menuOpcoes(String file) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n\n========== Programa Músicas TOP ==========");
            System.out.println("1. Pesquisa por género ");
            System.out.println("2. Pesquisa por artista");
            System.out.println("3. Descobrir música mais longa");
            System.out.println("4. Selecione músicas maiores que determinada duração à sua escolha ");
            System.out.println("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Género a pesquisar: ");
                    input.nextLine();
                    String genero = input.nextLine();

                    pesquisarPorGenero(file, genero);
                    break;

                case 2:
                    System.out.print("Artista a pesquisar: ");
                    input.nextLine();
                    String artista = input.nextLine();
                    pesquisarPorArtista(file, artista);
                    break;

                case 3:
                    pesquisarComMaiorDuracao(file);
                    break;

                case 4:
                    System.out.println("Qual é o tamanho pretendido? ");
                    int tamanho = input.nextInt();
                    pesquisarMusicasComDuracaoSuperiorADeterminadoTempo(file, tamanho);
                    break;

                case 5:
                    numeroTotalMusicas(file);
                    break;

                default:

                    break;
            }
        } while (opcao != 0);

    }


    /**
     *  função que faz pesquisa por genero musical
     * @param file
     * @param generoPesquisa
     * @throws FileNotFoundException
     */
    public static void pesquisarPorGenero(String file, String generoPesquisa) throws FileNotFoundException {

        Scanner ler = new Scanner(new File(file));

        while (ler.hasNextLine()) {

            String linha = ler.nextLine();
            String[] linhaMusicas = linha.split(",");
            if (linhaMusicas[2].equalsIgnoreCase(generoPesquisa)) {
                System.out.println(linha);
            }
        }
    }


    /**
     * Função que pesquisa por artista
     * @param file
     * @param artistaPesquisa
     * @throws FileNotFoundException
     */
    public static void pesquisarPorArtista(String file, String artistaPesquisa) throws FileNotFoundException {

        Scanner ler = new Scanner(new File(file));

        while (ler.hasNextLine()) {

            String linha = ler.nextLine();
            String[] linhaMusicas = linha.split(",");
            if (linhaMusicas[1].equalsIgnoreCase(artistaPesquisa)) {
                System.out.println(linha);
            }
        }
    }

    /**
     *  Função que pesquisa a música com a maior duração
     * @param file
     * @throws FileNotFoundException
     */
    public static void pesquisarComMaiorDuracao(String file) throws FileNotFoundException {

        Scanner ler = new Scanner(new File(file));

        int maiorNumeroSegundos = 0;
        String maiorMusica = " ";

        ler.nextLine();

        while (ler.hasNextLine()) {

            String linha = ler.nextLine();
            String[] linhaMusicas = linha.split(",");

            String[] minutosSegundos = linhaMusicas[3].split(":");

            int numeroSegundos = Integer.parseInt(minutosSegundos[0]) * 60;
            numeroSegundos += Integer.parseInt(minutosSegundos[1]);

            if (numeroSegundos > maiorNumeroSegundos) {
                maiorNumeroSegundos = numeroSegundos;
                maiorMusica = linha;
            }
        }

        System.out.println(maiorMusica);
    }


    /**
     * Função que seleciona as músicas acima de uma duração escolhida
     * @param file
     * @param tamanho
     * @throws FileNotFoundException
     */
    public static void pesquisarMusicasComDuracaoSuperiorADeterminadoTempo(String file, int tamanho) throws FileNotFoundException {

        Scanner ler = new Scanner(new File(file));

        ler.nextLine();

        while (ler.hasNextLine()) {

            String linha = ler.nextLine();
            String[] linhaMusicas = linha.split(",");

            String[] minutosSegundos = linhaMusicas[3].split(":");

            int numeroSegundos = Integer.parseInt(minutosSegundos[0]) * 60;
            numeroSegundos += Integer.parseInt(minutosSegundos[1]);

            if (numeroSegundos > tamanho) {
                System.out.println(linha);

            }
        }
    }

    /**
     *  Função que conta a totalidade das músicas
     * @param file
     * @return um inteiro que é o valor total de músicas
     * @throws FileNotFoundException
     */
    public static int numeroTotalMusicas(String file) throws FileNotFoundException {

        Scanner ler = new Scanner(new File(file));
        ler.nextLine();

        int contador=0;

        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            contador++;
        }

        return contador;
    }

    public static void main(String[] args) throws FileNotFoundException {

        menuOpcoes("filesAlg/exercicio_09.csv");
    }


}
