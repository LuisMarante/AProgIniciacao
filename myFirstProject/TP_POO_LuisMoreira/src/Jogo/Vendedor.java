package Jogo;

import Entidades.Heroi;
import Enums.TipoArma;
import Item.Consumivel;
import Item.Arma;
import Item.Armadura;
import Item.Botas;
import Item.Capa;
import Item.Capacete;
import Item.Luvas;
import Item.Item;
import Tools.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Vendedor {

    private String nome;
    private ArrayList<Item> stock;

    public Vendedor(String nome) {

        this.nome = nome;
        this.stock = new ArrayList<>();
        this.adicionarStock();
    }

    public String getNome() {
        return nome;
    }


    /**
     * Função que cria todos os objetos a ser usados no jogo e os adiciona a um stock geral do vendedor
     */
    public void adicionarStock() {

        Armadura mithril = new Armadura("Mithril", "A gift of Kings, fabricada pelos anões", 80, 80);
        Armadura armaduraLeve = new Armadura("Armadura leve", "Armadura leve e fina", 15, 15);
        Armadura armaduraPesada = new Armadura("Armadura pesada", "Armadura pesada e dura", 30, 30);
        Armadura armaduraGondor = new Armadura("Armadura de Gondor", "Armadura usada pelos soldados de Gondor", 40, 40);
        Armadura armaduraElfica = new Armadura("Armadura Élfica", "Armadura usada pela maior parte dos elfos", 50, 50);
        Armadura armaduraNoldor = new Armadura("Armadura dos Noldor", "Armadura usada pelos elfos mais poderosos", 30, 30);

        Capa mantoSimples = new Capa("Manto simples", "Manto pouco útil mas é melhor do que nada", 10, 0, 10);
        Capa mantoImladris = new Capa("Manto de Imladris", "Manto élfico", 50, 0, 50);
        Capa mantoShire = new Capa("Manto do Shire", "Usado principalmente por hobbits", 30, 0, 30);
        Capa mantoLorien = new Capa("Manto de Lothlórien", "Usado principalmente pelos wardens de lothlórien", 20, 0, 20);
        Capa mantoProtecao = new Capa("Manto de proteção", "Usado mais para fins de batalha e não de furtividade", 20, 10, 10);

        Capacete dragonHelm = new Capacete("Dragon-helm de Dor-lómin", "Capacete usado por Turin Turambar na primeira era", 40, 40);
        Capacete capaceteAberto = new Capacete("Capacete aberto", "Capacete básico", 5, 5);
        Capacete capaceteFechado = new Capacete("Capacete fechado", "Capacete básico que protege toda a cabeça", 10, 10);
        Capacete capaceteRohan = new Capacete("Capacete de Rohan", "Capacete duro que protege partes da cabeça", 15, 15);
        Capacete capaceteGondor = new Capacete("Capacete alada dos guardas da citadela", "Capacete duro que protege toda a cabeça", 20, 20);
        Capacete capaceteElfico = new Capacete("Capacete Elfico", "Capacete poderoso que resiste a impactos fortes", 30, 30);
        Capacete capaceteNoldor = new Capacete("Capacete dos Noldor", "Capacete usado pelos elfos mais poderosos", 40, 40);

        Luvas luvasFinas = new Luvas("Luvas finas", "Luvas com tecido fino e rasgadas", 5, 5);
        Luvas luvasGrossas = new Luvas("Luvas grossas", "Luvas de tecido mais resistentes", 10, 10);
        Luvas luvasAcoForjado = new Luvas("Luvas de aço forjado", "Luvas de aço mais resistentes ", 20, 20);
        Luvas luvasGuardiaoOeste = new Luvas("Luvas do guardião do Oeste", "Luvas muito resistentes", 25, 25);
        Luvas luvasEscamaDragao = new Luvas("Luvas Escama de Dragão", "Luvas muito resistentes fabricadas através de escamas de dragão", 35, 35);
        Luvas punhosMithril = new Luvas("Punhos de Mithril", "As luvas mais protetoras de Middle-Earth", 50, 50);


        Botas sapatosRotos = new Botas("Sapatos rotos", "Sapatos pouco resistentes", 5, 0, 5);
        Botas botasArmaduraFina = new Botas("Botas de armadura fina", "Botas de armaduras leves", 10, 10, 10);
        Botas botasArmaduraGrossa = new Botas("Botas de armadura grossa", "Botas mais resistentes, usadas na armadura de Rohan e Gondor", 20, 20, 0);
        Botas botasElfosFloresta = new Botas("Botas de armadura Élfica", "Botas usadas nas armaduras Élficas", 30, 20, 20);
        Botas botasArmaduraNoldor = new Botas("Botas de armadura dos Noldor", "Botas usadas pelos elfos mais poderosos", 30, 30, 10);
        Botas botasArmaduraAna = new Botas("Botaas de armadura dos Anões", "Botas usadas nas armaduras dos Anões", 35, 35, 0);


        Arma cajadoGandalf = new Arma("Cajado do Gandalf", "Cajado poderoso com características de suporte", 40, 40, 70, TipoArma.CAJADO);
        Arma cajadoSaruman = new Arma("Cajado do Saruman", "Cajado poderoso com características de ataque", 50, 50, 60, TipoArma.CAJADO);
        Arma cajadoRadagast = new Arma("Cajado do Radagast", "Cajado com características de suporte", 20, 20, 30, TipoArma.CAJADO);
        Arma cajadoSalgueiro = new Arma("Cajado de Salgueiro", "Cajado para jovens aprendizes", 5, 5, 5, TipoArma.CAJADO);
        Arma arpaNargothrond = new Arma("Arpa de Nargothrond", "Arpa mágica manejada por Finrod Felagund", 80, 50, 100, TipoArma.CAJADO);
        Arma cajadoCarvalho = new Arma("Cajado de Carvalho", "Cajado para aprendizes com experiência", 10, 10, 20, TipoArma.CAJADO);

        Arma espadaLonga = new Arma("Espada longa", "Espada com um alcance longo", 30, 20, 10, TipoArma.ESPADA);
        Arma Sting = new Arma("Sting", "Espada afiada que te ajuda a escapar", 40, 10, 10, TipoArma.ESPADA);
        Arma espadaGondolin = new Arma("Espada de Gondolin", "Espada poderosa com poder aumentado contra seres mágicos", 80, 60, 40, TipoArma.ESPADA);
        Arma narsil = new Arma("Narsil", "Espada de Elendil", 40, 35, 25, TipoArma.ESPADA);
        Arma anduril = new Arma("Anduril", "Espada reforjada dos restos de Narsil", 50, 45, 30, TipoArma.ESPADA);
        Arma aeglos = new Arma("Aeglos", "Espada de Gil-galad", 50, 50, 50, TipoArma.ESPADA);
        Arma glamdring = new Arma("Glamdring", "Espada élfica usada por Gandalf", 50, 45, 60, TipoArma.ESPADA);
        Arma orcrist = new Arma("Orcrist", "Espada de Thorin Oakenshield", 30, 30, 20, TipoArma.ESPADA);

        Arma arcoPequeno = new Arma("Arco pequeno", "Arco com pouco alcance e poder", 15, 15, 15, TipoArma.ARCO);
        Arma strongBow = new Arma("Strong bow ", "Arco com bom alcance e poder", 30, 30, 30, TipoArma.ARCO);
        Arma arcoLorien = new Arma("Arco élfico de Lórien", "Arco usado pelos wardens de Lothlórien", 50, 50, 50, TipoArma.ARCO);
        Arma arcoDale = new Arma("Arco negro de Dale", "Arco originário da cidade de Dale", 40, 40, 60, TipoArma.ARCO);
        Arma arcoIthilien = new Arma("Ithilen bow", "Arco usado pelos Ithilen rangers", 45, 45, 45, TipoArma.ARCO);
        Arma arcoBelthronding = new Arma("Belthronding", "Arco usado por Beleg Cutalhion (Um dos melhores arqueiros do universo de Tolkien)", 80, 60, 60, TipoArma.ARCO);


        this.stock.add(mithril);
        this.stock.add(armaduraLeve);
        this.stock.add(armaduraPesada);
        this.stock.add(armaduraGondor);
        this.stock.add(armaduraElfica);
        this.stock.add(armaduraNoldor);

        this.stock.add(mantoSimples);
        this.stock.add(mantoShire);
        this.stock.add(mantoImladris);
        this.stock.add(mantoLorien);
        this.stock.add(mantoProtecao);

        this.stock.add(dragonHelm);
        this.stock.add(capaceteAberto);
        this.stock.add(capaceteFechado);
        this.stock.add(capaceteGondor);
        this.stock.add(capaceteRohan);
        this.stock.add(capaceteElfico);
        this.stock.add(capaceteNoldor);

        this.stock.add(luvasFinas);
        this.stock.add(luvasGrossas);
        this.stock.add(luvasAcoForjado);
        this.stock.add(luvasGuardiaoOeste);
        this.stock.add(luvasEscamaDragao);
        this.stock.add(punhosMithril);

        this.stock.add(sapatosRotos);
        this.stock.add(botasArmaduraFina);
        this.stock.add(botasArmaduraGrossa);
        this.stock.add(botasElfosFloresta);
        this.stock.add(botasArmaduraNoldor);
        this.stock.add(botasArmaduraAna);

        this.stock.add(cajadoGandalf);
        this.stock.add(cajadoCarvalho);
        this.stock.add(cajadoRadagast);
        this.stock.add(cajadoSaruman);
        this.stock.add(arpaNargothrond);
        this.stock.add(cajadoSalgueiro);

        this.stock.add(espadaLonga);
        this.stock.add(Sting);
        this.stock.add(espadaGondolin);
        this.stock.add(narsil);
        this.stock.add(anduril);
        this.stock.add(aeglos);
        this.stock.add(glamdring);
        this.stock.add(orcrist);

        this.stock.add(arcoPequeno);
        this.stock.add(strongBow);
        this.stock.add(arcoLorien);
        this.stock.add(arcoDale);
        this.stock.add(arcoIthilien);
        this.stock.add(arcoBelthronding);

    }


    /**
     * Função que cria um stock específico e reduzido e adiciona sempre todos os consumíveis existentes e apenas um item de cada tipo que resta.
     * Faz a distinção do tipo de arma a adicionar ao stock tendo em conta o tipo de arma permitido pela classe do herói escolhida
     *
     * @param heroi
     * @return stock final a ser apresentado ao herói
     */
    public ArrayList<Item> criarStock(Heroi heroi) throws IOException {

        Logger logVendedor = Logger.getLogger("logvendedor.txt");
        logVendedor.log("O vendedor está a criar o stock...");

        Random random = new Random();
        ArrayList<Item> stockAtual = new ArrayList<>();

        Consumivel pocaoHP = new Consumivel("Poção de vida", "Cura 25 pontos de vida", 10, 25, 0, 0, 0);
        Consumivel lembas = new Consumivel("Pão de Lembas", "Cura 50 pontos de vida", 20, 50, 0, 0, 0);
        Consumivel pocaoEnergia = new Consumivel("Poção de energia", "Aumenta 25 pontos de energia", 10, 0, 25, 0, 0);
        Consumivel athelas = new Consumivel("Athelas, Kingsfoil", "Cura 80 pontos de vida", 30, 80, 0, 0, 0);
        Consumivel luzEarendil = new Consumivel("Luz de Earendil", "Aumenta o ataque em 10%", 30, 0, 0, 1.1, 0);
        Consumivel miruvor = new Consumivel("Miruvor", "Licor quente e fortalecedor", 30, 0, 0, 0, 1.1);

        stockAtual.add(pocaoHP);
        stockAtual.add(lembas);
        stockAtual.add(athelas);
        stockAtual.add(pocaoEnergia);
        stockAtual.add(luzEarendil);
        stockAtual.add(miruvor);

        ArrayList<Luvas> stockLuvas = new ArrayList<>();
        ArrayList<Botas> stockBotas = new ArrayList<>();
        ArrayList<Capacete> stockCapacete = new ArrayList<>();
        ArrayList<Capa> stockCapa = new ArrayList<>();
        ArrayList<Armadura> stockArmadura = new ArrayList<>();
        ArrayList<Arma> stockArma = new ArrayList<>();


        for (Item item : stock) {
            if (item instanceof Luvas) {
                stockLuvas.add((Luvas) item);
            } else if (item instanceof Botas) {
                stockBotas.add((Botas) item);
            } else if (item instanceof Capacete) {
                stockCapacete.add((Capacete) item);
            } else if (item instanceof Capa) {
                stockCapa.add((Capa) item);
            } else if (item instanceof Armadura) {
                stockArmadura.add((Armadura) item);
            } else if (item instanceof Arma) {
                if (((Arma) item).getTipoArma() == heroi.getTipoArmaPermitido()) {
                    stockArma.add((Arma) item);
                }
            }
        }

        int itemSorteadoLuvas = random.nextInt(stockLuvas.size());
        stockAtual.add(stockLuvas.get(itemSorteadoLuvas));


        int itemSorteadoBotas = random.nextInt(stockBotas.size());
        stockAtual.add(stockBotas.get(itemSorteadoBotas));

        int itemSorteadoCapacete = random.nextInt(stockCapacete.size());
        stockAtual.add(stockCapacete.get(itemSorteadoCapacete));

        int itemSorteadoCapa = random.nextInt(stockCapa.size());
        stockAtual.add(stockCapa.get(itemSorteadoCapa));

        int itemSorteadoArmadura = random.nextInt(stockArmadura.size());
        stockAtual.add(stockArmadura.get(itemSorteadoArmadura));

        int itemSorteadoArma = random.nextInt(stockArma.size());
        stockAtual.add(stockArma.get(itemSorteadoArma));

        return stockAtual;
    }


    /**
     * Função que mostra o stock atual do vendedor, que varia sempre que a função é invocada e serve para o herói comprar os itens
     *
     * @param heroi
     * @param stockAtual
     */
    public void vender(Heroi heroi, ArrayList<Item> stockAtual) throws IOException {

        Logger loggerVenda = Logger.getLogger("logLoja.txt");
        loggerVenda.log("O herói entrou na loja");

        boolean case7 = true;
        boolean case8 = true;
        boolean case9 = true;
        boolean case10 = true;
        boolean case11 = true;
        boolean case12 = true;

        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("==== Isto é o que tenho para ti hoje ==== ");
            System.out.println("O teu ouro é " + heroi.getOuro());
            for (int i = 0; i < stockAtual.size(); i++) {
                System.out.print((i + 1) + ". ");
                stockAtual.get(i).exibirDetalhes();

                loggerVenda.log(stockAtual.get(i).getNome() + " | " + stockAtual.get(i).getPreco());
            }
            System.out.println("13. Verifica o teu inventário");
            System.out.println("0. Sair");
            System.out.print("Escolhe uma opção");

            opcao = input.nextInt();

            loggerVenda.log("O heroi tentou comprar o item " + opcao);

            switch (opcao) {
                case 1:
                    if (heroi.getOuro() < stockAtual.get(0).getPreco()) {
                        System.out.println("Não tens dinheiro para este item");
                    } else {
                        heroi.adicionarItem(stockAtual.get(0));
                        heroi.setOuro(heroi.getOuro() - stockAtual.get(0).getPreco());
                        System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(0).getNome() + ".");
                    }
                    break;

                case 2:
                    if (heroi.getOuro() < stockAtual.get(1).getPreco()) {
                        System.out.println("Não tens dinheiro para este item");
                    } else {
                        heroi.adicionarItem(stockAtual.get(1));
                        heroi.setOuro(heroi.getOuro() - stockAtual.get(1).getPreco());
                        System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(1).getNome() + ".");
                    }
                    break;

                case 3:
                    if (heroi.getOuro() < stockAtual.get(2).getPreco()) {
                        System.out.println("Não tens dinheiro para este item");
                    } else {
                        heroi.adicionarItem(stockAtual.get(2));
                        heroi.setOuro(heroi.getOuro() - stockAtual.get(2).getPreco());
                        System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(2).getNome() + ".");
                    }
                    break;

                case 4:
                    if (heroi.getOuro() < stockAtual.get(3).getPreco()) {
                        System.out.println("Não tens dinheiro para este item");
                    } else {
                        heroi.adicionarItem(stockAtual.get(3));
                        heroi.setOuro(heroi.getOuro() - stockAtual.get(3).getPreco());
                        System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(3).getNome() + ".");
                    }
                    break;

                case 5:
                    if (heroi.getOuro() < stockAtual.get(4).getPreco()) {
                        System.out.println("Não tens dinheiro para este item");
                    } else {
                        heroi.adicionarItem(stockAtual.get(4));
                        heroi.setOuro(heroi.getOuro() - stockAtual.get(4).getPreco());
                        System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(4).getNome() + ".");
                    }
                    break;

                case 6:
                    if (heroi.getOuro() < stockAtual.get(5).getPreco()) {
                        System.out.println("Não tens dinheiro para este item");
                    } else {
                        heroi.adicionarItem(stockAtual.get(5));
                        heroi.setOuro(heroi.getOuro() - stockAtual.get(5).getPreco());
                        System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(5).getNome() + ".");
                    }
                    break;

                case 7:

                    if (case7) {
                        if (heroi.getOuro() < stockAtual.get(6).getPreco()) {
                            System.out.println("Não tens dinheiro para este item");
                        } else {
                            case7 = false;
                            if (heroi.luvas() != null) {
                                heroi.removeItem(heroi.luvas());
                                heroi.adicionarItem(stockAtual.get(6));
                                System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(6).getNome() + ".");
                                heroi.setOuro(heroi.getOuro() - stockAtual.get(6).getPreco());
                                stock.remove(stockAtual.get(6));
                            } else {
                                heroi.adicionarItem(stockAtual.get(6));
                                System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(6).getNome() + ".");
                                heroi.setOuro(heroi.getOuro() - stockAtual.get(6).getPreco());
                                stock.remove(stockAtual.get(6));
                            }
                        }
                    } else {
                        System.out.println("Já te vendi este item. Escolhe outra coisa ou continua a tua jornada");
                    }

                    break;

                case 8:

                    if (case8) {
                        if (heroi.getOuro() < stockAtual.get(6).getPreco()) {
                            System.out.println("Não tens dinheiro para este item");
                        } else {
                            case8 = false;
                            if (heroi.botas() != null) {
                                heroi.removeItem(heroi.botas());
                                heroi.adicionarItem(stockAtual.get(7));
                                System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(7).getNome() + ".");
                                heroi.setOuro(heroi.getOuro() - stockAtual.get(7).getPreco());
                                stock.remove(stockAtual.get(7));
                            } else {
                                heroi.adicionarItem(stockAtual.get(7));
                                System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(7).getNome() + ".");
                                heroi.setOuro(heroi.getOuro() - stockAtual.get(7).getPreco());
                                stock.remove(stockAtual.get(7));
                            }
                        }
                    } else {
                        System.out.println("Já te vendi este item. Escolhe outra coisa ou continua a tua jornada");
                    }

                    break;

                case 9:

                    if (case9) {
                        if (heroi.getOuro() < stockAtual.get(8).getPreco()) {
                            System.out.println("Não tens dinheiro para este item");
                        } else {
                            case9 = false;
                            if (heroi.capacete() != null) {
                                heroi.removeItem(heroi.capacete());
                                heroi.adicionarItem(stockAtual.get(8));
                                System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(8).getNome() + ".");
                                heroi.setOuro(heroi.getOuro() - stockAtual.get(8).getPreco());
                                stock.remove(stockAtual.get(8));
                            } else {
                                heroi.adicionarItem(stockAtual.get(8));
                                System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(8).getNome() + ".");
                                heroi.setOuro(heroi.getOuro() - stockAtual.get(8).getPreco());
                                stock.remove(stockAtual.get(8));
                            }
                        }
                    } else {
                        System.out.println("Já te vendi este item. Escolhe outra coisa ou continua a tua jornada");
                    }

                    break;

                case 10:

                    if (case10) {
                        if (heroi.getOuro() < stockAtual.get(9).getPreco()) {
                            System.out.println("Não tens dinheiro para este item");
                        } else {
                            case10 = false;
                            if (heroi.capa() != null) {
                                heroi.removeItem(heroi.capa());
                                heroi.adicionarItem(stockAtual.get(9));
                                System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(9).getNome() + ".");
                                heroi.setOuro(heroi.getOuro() - stockAtual.get(9).getPreco());
                                stock.remove(stockAtual.get(9));
                            } else {
                                heroi.adicionarItem(stockAtual.get(9));
                                System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(9).getNome() + ".");
                                heroi.setOuro(heroi.getOuro() - stockAtual.get(9).getPreco());
                                stock.remove(stockAtual.get(9));
                            }
                        }
                    } else {
                        System.out.println("Já te vendi este item. Escolhe outra coisa ou continua a tua jornada");
                    }

                    break;

                case 11:

                    if (case11) {

                        if (heroi.getOuro() < stockAtual.get(10).getPreco()) {
                            System.out.println("Não tens dinheiro para este item");
                        } else {
                            case11 = false;
                            if (heroi.armadura() != null) {
                                heroi.removeItem(heroi.armadura());
                                heroi.adicionarItem(stockAtual.get(10));
                                System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(10).getNome() + ".");
                                heroi.setOuro(heroi.getOuro() - stockAtual.get(10).getPreco());
                                stock.remove(stockAtual.get(10));
                            } else {
                                heroi.adicionarItem(stockAtual.get(10));
                                System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(10).getNome() + ".");
                                heroi.setOuro(heroi.getOuro() - stockAtual.get(10).getPreco());
                                stock.remove(stockAtual.get(10));
                            }
                        }
                    } else {
                        System.out.println("Já te vendi este item. Escolhe outra coisa ou continua a tua jornada");
                    }

                    break;

                case 12:

                    if (case12) {
                        if (heroi.getOuro() < stockAtual.get(11).getPreco()) {
                            System.out.println("Não tens dinheiro para este item");
                        } else {
                            case12 = false;
                            if (heroi.arma() != null) {
                                heroi.removeItem(heroi.arma());
                                heroi.adicionarItem(stockAtual.get(11));
                                System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(11).getNome() + ".");
                                heroi.setOuro(heroi.getOuro() - stockAtual.get(11).getPreco());
                                stock.remove(stockAtual.get(11));
                            } else {
                                heroi.adicionarItem(stockAtual.get(11));
                                System.out.println(this.getNome() + " vendeu-te " + stockAtual.get(11).getNome() + ".");
                                heroi.setOuro(heroi.getOuro() - stockAtual.get(11).getPreco());
                                stock.remove(stockAtual.get(11));
                            }
                        }
                    } else {
                        System.out.println("Já te vendi este item. Escolhe outra coisa ou continua a tua jornada");
                    }

                    break;
                case 13:
                    heroi.exibirInventario();

                    break;
                case 0:
                    System.out.println("Boa sorte no resto da tua viagem");
                    break;


                default:
                    System.out.println("Escolha inválida, tenta outra vez");
            }

        } while (opcao != 0);

    }
}
