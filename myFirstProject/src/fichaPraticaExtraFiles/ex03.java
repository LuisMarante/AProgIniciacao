package fichaPraticaExtraFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex03 {


    public static void imprimoImagemSpa(String imagemSpa) {


    }

    public static void imprimoImagemFachada(String imagemFachada) {


    }

    public static void imprimoImagemQuarto(String imagemQuarto) {


    }

    public static void imprimoImagensDaGaleria(String imagemQuarto, String imagemFachada, String imagemSpa) {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n========== Gestão da galeria ==========");
            System.out.println("1. Imprimir imagem do quarto");
            System.out.println("2. Imprimir imagem da fachada");
            System.out.println("3. Imprimir imagem do spa");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    imprimoImagemQuarto(imagemQuarto);
                    break;
                case 2:
                    imprimoImagemFachada(imagemFachada);
                    break;
                case 3:
                    imprimoImagemSpa(imagemSpa);
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }


    public static void produtoMaisLucrativo(String[][]matrizProdutos , String[][] matrizServicos) {

    }


    public static void produtoMenosEscolhido(String[][]matrizProdutos , String[][] matrizServicos) {

    }


    public static void produtoMaisEscolhido(String[][]matrizProdutos , String[][] matrizServicos) {

    }

    public static void temaMenosLucrativo(String[][]matrizTemas , String[][] matrizQuartos, String[][] matrizReservas) {

    }

    public static void temaMaisLucrativo(String[][]matrizTemas , String[][] matrizQuartos, String[][] matrizReservas) {

    }


    public static void temaMaisEscolhido(String[][]matrizTemas , String[][] matrizQuartos , String[][] matrizReservas){

    }

    public static void clienteMaisPresente(String[][]matrizClientes,String[][]matrizReservas) {


    }


    public static void ClienteMaisConsumista(String[][]matrizClientes, String[][]matrizServicos) {

    }

    public static void MelhorCliente(String[][]matrizClientes, String[][]matrizServicos,String[][]matrizReservas) {

    }

    public static void calculoLucroTotal(String[][]matrizReservas) {

    }

    public static void calculoReceitaTotal(String[][]matrizReservas) {

    }
    public static void calculoDespesaTotal(String[][]matrizReservas) {

    }


    public static void dashboardDeAnalise(String[][]matrizClientes , String[][] matrizTemas, String[][] matrizQuartos, String[][] matrizLogin,String[][] matrizProdutos,String[][] matrizReservas, String[][] matrizServicos) {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n========== Dashboard de análise ==========");
            System.out.println("1. Consultar receita total (por ano)");
            System.out.println("2. Consultar despesa total (por ano)");
            System.out.println("3. Consultar lucro total (por ano)");
            System.out.println("4. Consultar melhor cliente (O que mais gastou no total e quanto gastou)");
            System.out.println("5. Consultar cliente mais consumista (O que mais gastou em serviço de quarto e quanto gastou)");
            System.out.println("6. Consultar cliente mais presente (o que mais noites passou no hotem e quantas foram)");
            System.out.println("7. Consultar tema mais escolhido (O que mais gastou e quanto gastou)");
            System.out.println("8. Consultar tema mais lucrativo (que tema gerou mais lucro e quanto)");
            System.out.println("9. Consultar tema menos lucrativo (que tema gerou menos lucro e quanto)");
            System.out.println("10. Consultar produto mais escolhido (que vendeu mais unidades e quantas foram)");
            System.out.println("11. Consultar produto menos escolhido (que vendeu menos unidades e quantas foram)");
            System.out.println("12. Consultar produto mais lucrativo (que gerou mais lucro e quanto gerou)");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    calculoReceitaTotal(matrizReservas);
                    break;
                case 2:
                    calculoDespesaTotal(matrizReservas);
                    break;
                case 3:
                    calculoLucroTotal(matrizReservas);
                    break;
                case 4:
                    MelhorCliente(matrizClientes,matrizServicos,matrizReservas);
                    break;
                case 5:
                    ClienteMaisConsumista(matrizClientes,matrizServicos);
                    break;
                case 6:
                    clienteMaisPresente(matrizClientes,matrizReservas);
                    break;
                case 7:
                    temaMaisEscolhido(matrizTemas, matrizQuartos, matrizReservas);
                    break;
                case 8:
                    temaMaisLucrativo(matrizTemas, matrizQuartos, matrizReservas);
                    break;
                case 9:
                    temaMenosLucrativo(matrizTemas, matrizQuartos, matrizReservas);
                    break;
                case 10:
                    produtoMaisEscolhido(matrizProdutos, matrizServicos);
                    break;
                case 11:
                    produtoMenosEscolhido(matrizProdutos, matrizServicos);
                    break;
                case 12:
                    produtoMaisLucrativo(matrizProdutos, matrizServicos);
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }


    public static void registoNovaReserva(String[][] matrizReservas) {


    }

    public static void consultoHistoricoReservas(String[][] matrizReservas) {


    }

    public static void consultoReservasAtivas(String[][] matrizReservas) {


    }

    public static void consultoReservas(String[][] matrizReservas) {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n========== Gestão de reservas ==========");
            System.out.println("1. Consultar histórico de reservas");
            System.out.println("2. Consultar reservas ativas");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    consultoHistoricoReservas(matrizReservas);
                    break;
                case 2:
                    consultoReservasAtivas(matrizReservas);
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }

    public static void consultoTodosQuartosDisponiveis(String[][] matrizQuartos) {

    }

    public static void consultoQuartosDisponiveisPorTema(String[][] matrizQuartos) {

    }

    public static void consultoQuartosDisponiveisPorTipoQuarto(String[][] matrizQuartos) {

    }


    public static void consultoQuartosDisponiveis(String[][] matrizQuartos) {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n========== Gestão de quartos disponíveis ==========");
            System.out.println("1. Consultar todos os quartos disponíveis");
            System.out.println("2. Consultar por tema");
            System.out.println("3. Consultar por tipo de quarto");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    consultoTodosQuartosDisponiveis(matrizQuartos);
                    break;
                case 2:
                    consultoQuartosDisponiveisPorTema(matrizQuartos);
                    break;
                case 3:
                    consultoQuartosDisponiveisPorTipoQuarto(matrizQuartos);
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }


    public static void consultoClientePorID(String [][] matrizClientes) {

    }

    public static void consultoClientePortelemovel(String [][] matrizClientes) {

    }

    public static void consultoClientePorEmail(String [][] matrizClientes) {

    }


    public static void consultoClientes(String [][] matrizClientes) {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n========== Consulta de clientes ==========");
            System.out.println("1. Consultar por ID");
            System.out.println("2. Consultar por Nº de telemóvel");
            System.out.println("3. Consultar por email");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    consultoClientePorID(matrizClientes);
                    break;
                case 2:
                    consultoClientePortelemovel(matrizClientes);
                    break;
                case 3:
                    consultoClientePorEmail(matrizClientes);
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }

    public static void adicionoProduto(String [][] matrizProduto) {

    }

    public static void adicionoCredenciais(String [][] matrizLogin) {

    }


    public static void eliminoCredenciais(String [][] matrizLogin) {

    }

    public static void facoGestaoAutenticacao(String [][] matrizLogin) {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n========== Gestão de clientes ==========");
            System.out.println("1. Adicionar novas credenciais");
            System.out.println("2. Eliminar credenciais ");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    adicionoCredenciais(matrizLogin);

                    break;
                case 2:
                    eliminoCredenciais(matrizLogin);
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }

    public static void adicionoQuarto(String[][] matrizQuartos) {

    }


    public static void adicionoTema(String[][] matrizTemas) {

    }


    public static void atualizoTelemovelCliente(String[][] matrizClientes) {

    }


    public static void atualizoEmailCliente(String[][] matrizClientes) {


    }


    public static void atualizoDadosCliente(String[][] matrizClientes) {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n========== Atualização dos dados do cliente ==========");
            System.out.println("1. Atualizar Nº de telemóvel");
            System.out.println("2. Atualizar email ");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    atualizoTelemovelCliente(matrizClientes);
                    break;
                case 2:
                    atualizoEmailCliente(matrizClientes);
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }

    public static void adicionoCliente(String[][] matrizClientes) {


    }


    public static void facoGestaoClientes(String[][] matrizClientes) {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n========== Gestão de clientes ==========");
            System.out.println("1. Adicionar novo Cliente");
            System.out.println("2. Atualizar contactos de cliente (Apenas altera Nº telemóvel e email ");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    adicionoCliente(matrizClientes);
                    break;
                case 2:
                    atualizoDadosCliente(matrizClientes);
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }


    public static void gestaoBaseDados(String[][] matrizClientes , String[][] matrizTemas, String[][]  matrizQuartos , String[][]matrizLogin , String[][] matrizProduto ) {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n========== Gestão de base de dados ==========");
            System.out.println("1. Clientes");
            System.out.println("2. Temas (adicione novo tema)");
            System.out.println("3. Quartos");
            System.out.println("4. Autenticação");
            System.out.println("5. Produtos");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    facoGestaoClientes(matrizClientes);
                    break;
                case 2:
                    adicionoTema(matrizTemas);
                    break;
                case 3:
                    adicionoQuarto(matrizQuartos);
                    break;
                case 4:
                    facoGestaoAutenticacao(matrizLogin);
                    break;
                case 5:
                    adicionoProduto(matrizProduto);
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }


    public static void menuGeral(String[][] matrizClientes , String[][] matrizTemas, String[][]  matrizQuartos , String[][]matrizLogin , String[][] matrizProduto, String[][]matrizReservas,String[][]matrizServico, String imagemQuarto, String imagemFachada, String imagemSpa) {

        Scanner input = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n\n========== MENU ==========");
            System.out.println("1. Gerir base de dados");
            System.out.println("2. Consultar clientes");
            System.out.println("3. Consultar quartos disponíveis");
            System.out.println("4. Consultar reservas");
            System.out.println("5. Registar nova reserva");
            System.out.println("6. Dashboard de análise");
            System.out.println("7. Galeria (Imprime imagens à tua escolha");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    gestaoBaseDados(matrizClientes , matrizTemas, matrizQuartos , matrizLogin , matrizProduto);
                    break;
                case 2:
                    consultoClientes(matrizClientes);
                    break;
                case 3:
                    consultoQuartosDisponiveis(matrizQuartos);

                    break;
                case 4:
                    consultoReservas(matrizReservas);
                    break;
                case 5:
                    registoNovaReserva(matrizReservas);
                    break;
                case 6:
                    dashboardDeAnalise(matrizClientes,matrizTemas, matrizQuartos, matrizLogin, matrizProduto, matrizReservas, matrizServico);
                    break;
                case 7:
                    imprimoImagensDaGaleria(imagemQuarto, imagemFachada, imagemSpa);

                    break;
                default:
                    break;
            }
        } while (opcao != 0);

    }


    public static void transformoMatrizEmFicheiro() {

    }


    public static String[][] transformoFicheiroEmMatriz(String file) throws FileNotFoundException {

        Scanner ler = new Scanner(new File(file));
        ler.nextLine();
        int tamanho = 0;
        int numLinhas = 0;
        while (ler.hasNextLine()) {
            String linha = ler.nextLine();
            String[] arrParaSaberTamanho = linha.split(",");
            tamanho = arrParaSaberTamanho.length;
            numLinhas++;
        }

        String[][] ficheiroEmMatriz = new String[numLinhas][tamanho];
        Scanner ler2 = new Scanner(new File(file));

        ler2.nextLine();

        while (ler2.hasNextLine()) {
            String linha2 = ler2.nextLine();
            String[] linha2Aluno = linha2.split(",");
            for (int i = 0; i < ficheiroEmMatriz.length; i++) {
                for (int k = 0; k < ficheiroEmMatriz[0].length; k++) {
                    ficheiroEmMatriz[i][k] = linha2Aluno[k];
                }
            }
        }

        return ficheiroEmMatriz;
    }

    public static void main(String[] args) throws FileNotFoundException {

        String[][] matrizClientes = transformoFicheiroEmMatriz("FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/clientesHotel.csv");
        String[][] matrizTemas = transformoFicheiroEmMatriz("FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/temasHotel.csv");
        String[][] matrizQuartos = transformoFicheiroEmMatriz("FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/quartosHotel.csv");

        String[][] matrizLogin = transformoFicheiroEmMatriz("FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/loginHotel.txt");
        String[][] matrizProdutos = transformoFicheiroEmMatriz("FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/produtosHotel.csv");

        String[][] matrizReservas = transformoFicheiroEmMatriz("FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/reservasHotel.csv");
        String[][] matrizServico = transformoFicheiroEmMatriz("FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/servicoQuartoHotel.csv");



        String imagemQuarto = "FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/galeriaQuartoHotel.txt";
        String imagemFachada = "FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/galeriaFachadaHotel.txt";
        String imagemSpa = "FichaPraticaExtraFicheiros/Ex_03 Hotel Temático/galeriaSpaHotel.txt";


        menuGeral(matrizClientes,matrizTemas, matrizQuartos, matrizLogin,matrizProdutos,matrizReservas,matrizServico, imagemQuarto,imagemFachada,imagemSpa);

    }
}
