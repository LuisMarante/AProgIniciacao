package Entidades;

import Enums.TipoArma;
import Item.Item;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Item.*;
import Tools.Logger;

public abstract class Heroi extends Entidade {

    protected double furtividade;
    protected int energia;
    private double bonusAtaque = 1.0;
    private double bonusAtaqueEspecial = 1.0;
    private double bonusDefesa = 1.0;
    protected ArrayList<Item> inventario;
    protected TipoArma tipoArmaPermitido;

    public Heroi(String nome, int maxHP, int hpAtual, int forca, int defesa, int ouro, int stealth, int energia, TipoArma tipoArmaPermitido) {
        super(nome, maxHP, hpAtual, forca, defesa, ouro);
        this.furtividade = stealth;
        this.energia = energia;
        this.tipoArmaPermitido = tipoArmaPermitido;

        this.inventario = new ArrayList<>();
        this.inventario.add(new Arma("Murro", "Sem nada", 0, 0, 0, null));
    }

    public TipoArma getTipoArmaPermitido() {
        return tipoArmaPermitido;
    }


    /**
     * Função que imprime as informações dos itens no inventário do herói
     */
    public void exibirInventario() {
        for (Item item : inventario) {

            item.exibirDetalhes();
        }
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public double getFurtividade() {
        return furtividade;
    }

    public void setFurtividade(double furtividade) {
        this.furtividade = furtividade;
    }


    /**
     * Função que adiciona um novo item ao inventátio do herói
     *
     * @param itemNovo a ser adicionado
     */
    public void adicionarItem(Item itemNovo) {
        this.inventario.add(itemNovo);
    }


    /**
     * Função que remove um novo item ao inventátio do herói
     *
     * @param itemRemovido para remover do inventário
     */
    public void removeItem(Item itemRemovido) {
        this.inventario.remove(itemRemovido);
    }


    /**
     * Função que tem como objetivo apresentar ao utilizador os consumíveis disponíveis e permitir-lhe escolher um deles.
     *
     * @return o consumivel escolhido pelo heroi ou null se não houver consumiveis disponíveis
     */
    public Consumivel consumivel() {

        Scanner input = new Scanner(System.in);
        ArrayList<Item> consumiveisDisponiveis = new ArrayList<>();

        System.out.println("=== Consumíveis disponíveis ===");
        int contador = 1;

        for (Item item : inventario) {
            if (item instanceof Consumivel) {
                System.out.print(contador + ". ");
                item.exibirDetalhes();
                consumiveisDisponiveis.add(item);
                contador++;
            }
        }

        if (consumiveisDisponiveis.isEmpty()) {
            System.out.println("Não tens consumíveis disponíveis.");
            return null;
        } else {
            int opcao;

            do {
                opcao = input.nextInt();
                if (opcao == 0) {

                } else if (opcao > 0 && opcao <= consumiveisDisponiveis.size()) {
                    return (Consumivel) consumiveisDisponiveis.get(opcao - 1);
                }

            } while (opcao < 0 || opcao > consumiveisDisponiveis.size());
        }
        return null;
    }

    /**
     * Função que retorna todas as luvas
     *
     * @return Luvas || null se não existe
     */
    public Luvas luvas() {
        for (Item item : inventario) {
            if (item instanceof Luvas) {
                return (Luvas) item;
            }
        }
        return null;
    }


    /**
     * Função que retorna todas as botas
     *
     * @return Botas || null se não existe
     */
    public Botas botas() {
        for (Item item : inventario) {
            if (item instanceof Botas) {
                return (Botas) item;
            }
        }
        return null;
    }

    public Capacete capacete() {
        for (Item item : inventario) {
            if (item instanceof Capacete) {
                return (Capacete) item;
            }
        }
        return null;
    }


    /**
     * Função que retorna todas as Capas
     *
     * @return Capas || null se não existe
     */
    public Capa capa() {
        for (Item item : inventario) {
            if (item instanceof Capa) {
                return (Capa) item;
            }
        }
        return null;
    }


    /**
     * Função que retorna todas as Armaduras
     *
     * @return Armaduras || null se não existe
     */
    public Armadura armadura() {
        for (Item item : inventario) {
            if (item instanceof Armadura) {
                return (Armadura) item;
            }
        }
        return null;
    }


    /**
     * Função que retorna todas as Armas
     *
     * @return Armas || null se não existe
     */
    public Arma arma() {
        for (Item item : inventario) {
            if (item instanceof Arma) {
                return (Arma) item;
            }
        }
        return null;
    }


    /**
     * Função que calcula o valor do ataque depois acrescentar as stats originadas pelos itens à força base do herói
     *
     * @return valor do ataque final
     */
    public double ataqueValorCombate() {
        int ataqueExtra = 0;
        for (Item item : inventario) {
            if (item instanceof Arma) {
                Arma armaAtual = (Arma) item;
                ataqueExtra += armaAtual.getAtaque();
            }
        }
        double valorFinalAtaque = this.forca + ataqueExtra;
        return valorFinalAtaque;
    }


    /**
     * Função que calcula o valor do ataque especial  depois acrescentar as stats originadas pelos itens à força base do herói
     *
     * @return valor do ataque especial final
     */
    public double ataqueEspecialValorCombate() {
        int ataqueExtra = 0;
        for (Item item : inventario) {
            if (item instanceof Arma) {
                Arma armaAtual = (Arma) item;
                ataqueExtra += (armaAtual.getAtaqueEspecial() + armaAtual.getAtaque());
            }
        }
        double valorFinalAtaqueEspecial = this.forca + ataqueExtra;
        return valorFinalAtaqueEspecial;
    }


    /**
     * Função que calcula o valor da defesa depois acrescentar as stats originadas pelos itens à força base do herói
     *
     * @return valor da defesa final
     */
    public double defesaValorCombate() {
        int defesaExtra = 0;
        for (Item item : inventario) {
            if (item instanceof Armadura) {
                Armadura armaduraAtual = (Armadura) item;
                defesaExtra += ((Armadura) item).getDefesa();
            }
            if (item instanceof Botas) {
                Botas botasAtuais = (Botas) item;
                defesaExtra += ((Botas) item).getDefesa();
            }
            if (item instanceof Luvas) {
                Luvas luvasAtuais = (Luvas) item;
                defesaExtra += ((Luvas) item).getDefesa();
            }
            if (item instanceof Capacete) {
                Capacete CapaceteAtual = (Capacete) item;
                defesaExtra += ((Capacete) item).getDefesa();
            }
            if (item instanceof Capa) {
                Capa capaAtual = (Capa) item;
                defesaExtra += ((Capa) item).getDefesa();
            }
        }
        double valorFinalDefesa = this.defesa + defesaExtra;
        return valorFinalDefesa;
    }


    /**
     * Função que calcula o valor da furtividade depois acrescentar as stats originadas pelos itens à força base do herói
     *
     * @return valor da furtividade final
     */
    public double furtividadeValorCombate() {
        int furtividadeExtra = 0;
        for (Item item : inventario) {
            if (item instanceof Botas) {
                Botas armaduraAtual = (Botas) item;
                furtividadeExtra += ((Botas) item).getStealth();
            }
            if (item instanceof Capa) {
                Capa botasAtuais = (Capa) item;
                furtividadeExtra += ((Capa) item).getStealth();
            }

        }
        double valorFinalFurtividade = this.furtividade + furtividadeExtra;
        return valorFinalFurtividade;
    }


    /**
     * Função que calcula a chance de fuga numa batalha
     *
     * @param furtividade do heroi
     * @param npc         que luta contra herói
     * @return true - herói foge || false - herói não consegue fugir
     */
    public boolean fugir(double furtividade, NPC npc) {
        double chanceFuga = 0.3 + (furtividade / (furtividade + npc.getForca()));
        if (chanceFuga > 1) {
            chanceFuga = 1;
        }
        Random rd = new Random();

        double fuga = rd.nextDouble();
        if (chanceFuga >= fuga) {
            return true;
        }
        return false;
    }


    /**
     * Função auxiliar para conseuir calcular as stats do herói com base na sua energia em cada momento do combate
     *
     * @return as variáveis de cada stat
     */
    public double[] calculoAtributosEnergia() {
        double energiaFator = this.energia / 100.0;

        double valorAtaque = (ataqueValorCombate() * energiaFator) * bonusAtaque;
        double valorAtaqueEspecial = (ataqueEspecialValorCombate() * energiaFator) * bonusAtaqueEspecial;
        double valorDefesa = (defesaValorCombate() * energiaFator) * bonusDefesa;
        double valorFurtividade = (furtividadeValorCombate() * energiaFator); // sem bónus, se quiseres podes criar bonusFurtividade

        return new double[]{valorAtaque, valorAtaqueEspecial, valorDefesa, valorFurtividade};
    }


    /**
     * Função da forma de combate normal, onde o herói ataca e é atacado, pode também ingerir consumível e tentar fugir da batalha.
     * Específico para a classe cavaleiro
     *
     * @param npc que luta contra herói
     * @return true - herói venceu || false, herói morreu
     */
    public boolean combateNormal(NPC npc) throws IOException {

        Logger logCombate = Logger.getLogger("logCombate.txt");
        logCombate.log("O combate começou agora");

        Scanner input = new Scanner(System.in);

        boolean possoUsar = true;
        int maxEnergia = this.energia;

        System.out.println("Um " + npc.getNome() + " atravessou-se no teu caminho. O que vais fazer, fugir ou lutar?");

        do {
            double[] atributos = calculoAtributosEnergia();
            double valorAtaque = atributos[0];
            double valorAtaqueEspecial = atributos[1];
            double valorDefesa = atributos[2];
            double valorFurtividade = atributos[3];

            System.out.println("Que ação queres fazer?");
            System.out.println("1. Corte normal");
            System.out.println("2. Corte Forte - especial");
            System.out.println("3. Ingerir um consumível");
            System.out.println("0. fugir");
            int opcao = input.nextInt();

            logCombate.log("O heroi selecionou ataque: " + opcao);
            logCombate.log("Vida do heroi: " + hpAtual);
            logCombate.log("Vida NPC: " + npc.getHpAtual() + "/" + npc.getMaxHP());

            double danoRecebido, danoAplicado;

            switch (opcao) {
                case 1:
                    System.out.println("Foste atingido pelo teu oponente");
                    if (npc.getForca() > valorDefesa) {
                        danoRecebido = npc.getForca() - valorDefesa;
                    } else {
                        danoRecebido = 10;
                    }

                    if (danoRecebido > this.hpAtual) {
                        danoRecebido = this.hpAtual;
                    }

                    this.hpAtual -= danoRecebido;

                    if (this.hpAtual > 0) {
                        System.out.println(this.nome + " levou com " + danoRecebido + " de dano");
                        System.out.println("A tua HP é " + this.hpAtual);
                    } else if (this.hpAtual <= 0) {
                        System.out.println("A luz apagou-se... mas a memória do herói perdurará em Valinor.");
                        System.out.println("O teu heroi foi assassinado em combate\n");
                        System.out.println("GAME OVER");
                        System.exit(0);
                    }


                    System.out.println("Atingiste o teu adversário");
                    if (valorAtaque - npc.getDefesa() >= 10) {
                        danoAplicado = valorAtaque - npc.getDefesa();
                    } else {
                        danoAplicado = 10;
                    }

                    if (danoAplicado > npc.getHpAtual()) {
                        danoAplicado = npc.getHpAtual();
                    }

                    npc.setHpAtual(npc.getHpAtual() - danoAplicado);
                    System.out.println("O teu oponente levou com " + danoAplicado + " de dano");
                    System.out.println("A HP dele é " + npc.getHpAtual());

                    if (npc.getHpAtual() <= 0) {
                        setOuro(this.ouro + npc.getOuro());
                        System.out.println("Venceste o duelo!! Ganhaste " + npc.getOuro() + " moedas de ouro do teu inimigo");
                        return true;
                    }
                    this.energia -= 10;
                    if (this.energia < 0) {
                        this.energia = 0;
                    }
                    break;

                case 2:

                    if (possoUsar) {
                        possoUsar = false;

                        System.out.println("Foste atingido pelo teu oponente");
                        if (npc.getForca() > valorDefesa) {
                            danoRecebido = npc.getForca() - valorDefesa;
                        } else {
                            danoRecebido = 10;
                        }

                        if (danoRecebido > this.hpAtual) {
                            danoRecebido = this.hpAtual;
                        }

                        this.hpAtual -= danoRecebido;

                        if (this.hpAtual > 0) {
                            System.out.println(this.nome + " levou com " + danoRecebido + " de dano");
                            System.out.println("A tua HP é " + this.hpAtual);
                        } else if (this.hpAtual <= 0) {
                            System.out.println("A luz apagou-se... mas a memória do herói perdurará em Valinor.");
                            System.out.println("O teu heroi foi assassinado em combate\n");
                            System.out.println("GAME OVER");
                            System.exit(0);
                        }


                        System.out.println("Atingiste o teu adversário");
                        if (valorAtaqueEspecial - npc.getDefesa() >= 10) {
                            danoAplicado = valorAtaqueEspecial - npc.getDefesa();
                        } else {
                            danoAplicado = 10;
                        }

                        if (danoAplicado > npc.getHpAtual()) {
                            danoAplicado = npc.getHpAtual();
                        }

                        npc.setHpAtual(npc.getHpAtual() - danoAplicado);
                        System.out.println("O teu oponente levou com " + danoAplicado + " de dano");
                        System.out.println("A HP dele é " + npc.getHpAtual());

                        if (npc.getHpAtual() <= 0) {
                            setOuro(this.ouro + npc.getOuro());
                            System.out.println("Venceste o duelo!! Ganhaste " + npc.getOuro() + " moedas de ouro do teu inimigo");
                            return true;
                        }
                    } else {
                        System.out.println("Não podes usar mais o teu ataque especial!\n");
                    }
                    this.energia -= 10;
                    if (this.energia < 0) {
                        this.energia = 0;
                    }
                    break;

                case 3:
                    Item consumivel = consumivel();

                    if (consumivel != null) {
                        if (this.ouro >= consumivel.getPreco()) {
                            if (consumivel.getNome().equalsIgnoreCase("Poção de vida")) {
                                setHpAtual(getHpAtual() + 25);
                                if (getHpAtual() > getMaxHP()) {
                                    setHpAtual(getMaxHP());
                                }
                                System.out.println("A tua HP é " + this.hpAtual);


                            } else if (consumivel.getNome().equalsIgnoreCase("Pão de Lembas")) {
                                setHpAtual(getHpAtual() + 50);
                                if (getHpAtual() > getMaxHP()) {
                                    setHpAtual(getMaxHP());
                                }
                                System.out.println("A tua HP é " + this.hpAtual);


                            } else if (consumivel.getNome().equalsIgnoreCase("Athelas, Kingsfoil")) {
                                setHpAtual(getHpAtual() + 80);
                                if (getHpAtual() > getMaxHP()) {
                                    setHpAtual(getMaxHP());
                                }
                                System.out.println("A tua HP é " + this.hpAtual);


                            } else if (consumivel.getNome().equalsIgnoreCase("Poção de energia")) {
                                setEnergia(getEnergia() + 25);
                                if (getEnergia() > 100) {
                                    setEnergia(100);
                                }
                                System.out.println("A tua energia foi aumentada");


                            } else if (consumivel.getNome().equalsIgnoreCase("Luz de Earendil")) {
                                bonusAtaque *= 1.1;
                                bonusAtaqueEspecial *= 1.1;
                                System.out.println("O teu valor de ataque normal e de ataque especial foi aumentado");


                            } else if (consumivel.getNome().equalsIgnoreCase("Miruvor")) {
                                bonusDefesa *= 1.1;
                                System.out.println("O teu valor de defesa foi aumentado");

                            }
                        }
                        this.ouro -= consumivel.getPreco();
                        inventario.remove(consumivel);
                        break;
                    } else {
                        System.out.println("O teu inventário está vazio");
                    }
                case 0:

                    if (fugir(valorFurtividade, npc)) {
                        System.out.println("Conseguiste fugir do combate!");
                        return true;
                    } else {
                        System.out.println("Falhaste a tentativa de fuga! O inimigo ataca.");
                        if (npc.getForca() > valorDefesa) {
                            danoRecebido = npc.getForca() - valorDefesa;
                        } else {
                            danoRecebido = 10;
                        }

                        if (danoRecebido > this.hpAtual) {
                            danoRecebido = this.hpAtual;
                        }

                        this.hpAtual -= danoRecebido;

                        if (this.hpAtual > 0) {
                            System.out.println(this.nome + " levou com " + danoRecebido + " de dano");
                            System.out.println("A tua HP é " + this.hpAtual);
                        } else if (this.hpAtual <= 0) {
                            System.out.println("A luz apagou-se... mas a memória do herói perdurará em Valinor.");
                            System.out.println("O teu heroi foi assassinado em combate\n");
                            System.out.println("GAME OVER");
                            System.exit(0);
                        }

                    }
                    this.energia -= 10;
                    if (this.energia < 0) {
                        this.energia = 0;
                    }
                    break;
                default:
                    System.out.println("Tens de usar uma opção válida");
                    break;
            }


        } while (getHpAtual() > 0 && npc.getHpAtual() > 0);

        this.energia = maxEnergia;
        return true;
    }


    /**
     * Função da forma de combate normal, onde o herói ataca e é atacado, pode também ingerir consumível e tentar fugir da batalha.
     * específico para classe Arqueiro e Feiticeiro
     *
     * @param npc que luta contra herói
     * @return true - o herói vence || false - o herói morre
     */
    public boolean combateNormalArqFeiti(NPC npc) {
        Scanner input = new Scanner(System.in);

        boolean possoUsar = true;
        int maxEnergia = this.energia;

        System.out.println("Um " + npc.getNome() + " atravessou-se no teu caminho. O que vais fazer, fugir ou lutar?");

        do {
            double[] atributos = calculoAtributosEnergia();
            double valorAtaque = atributos[0];
            double valorAtaqueEspecial = atributos[1];
            double valorDefesa = atributos[2];
            double valorFurtividade = atributos[3];


            if (getTipoArmaPermitido() == TipoArma.ARCO) {
                System.out.println("Que ação queres fazer?");
                System.out.println("1. Disparo normal");
                System.out.println("2.  Flecha Celestial - especial");
                System.out.println("3. Ingerir um consumível");
                System.out.println("0. fugir");

            } else if (getTipoArmaPermitido() == TipoArma.CAJADO) {

                System.out.println("Que ação queres fazer?");
                System.out.println("1. Raio Arcano");
                System.out.println("2. Julgamento Astral - especial");
                System.out.println("3. Ingerir um consumível");
                System.out.println("0. fugir");
            }

            int opcao = input.nextInt();

            double danoRecebido, danoAplicado;

            switch (opcao) {
                case 1:

                    System.out.println("Atingiste o teu adversário");
                    if (valorAtaque - npc.getDefesa() >= 10) {
                        danoAplicado = valorAtaque - npc.getDefesa();
                    } else {
                        danoAplicado = 10;
                    }

                    if (danoAplicado > npc.getHpAtual()) {
                        danoAplicado = npc.getHpAtual();
                    }

                    npc.setHpAtual(npc.getHpAtual() - danoAplicado);
                    System.out.println("O teu oponente levou com " + danoAplicado + " de dano");
                    System.out.println("A HP dele é " + npc.getHpAtual());

                    if (npc.getHpAtual() <= 0) {
                        setOuro(this.ouro + npc.getOuro());
                        System.out.println("Venceste o duelo!! Ganhaste " + npc.getOuro() + " moedas de ouro do teu inimigo");
                        return true;
                    }

                    System.out.println("Foste atingido pelo teu oponente");
                    if (npc.getForca() > valorDefesa) {
                        danoRecebido = npc.getForca() - valorDefesa;
                    } else {
                        danoRecebido = 10;
                    }

                    if (danoRecebido > this.hpAtual) {
                        danoRecebido = this.hpAtual;
                    }

                    this.hpAtual -= danoRecebido;


                    if (this.hpAtual > 0) {
                        System.out.println(this.nome + " levou com " + danoRecebido + " de dano");
                        System.out.println("A tua HP é " + this.hpAtual);
                    } else if (this.hpAtual <= 0) {
                        System.out.println("A luz apagou-se... mas a memória do herói perdurará em Valinor.");
                        System.out.println("O teu heroi foi assassinado em combate\n");
                        System.out.println("GAME OVER");
                        System.exit(0);
                    }

                    this.defesa -= 10;
                    if (this.defesa < 0) {
                        this.defesa = 0;
                    }

                    this.energia -= 10;
                    if (this.energia < 0) {
                        this.energia = 0;
                    }
                    break;

                case 2:

                    if (possoUsar) {
                        possoUsar = false;

                        System.out.println("Atingiste o teu adversário");
                        if (valorAtaqueEspecial - npc.getDefesa() >= 10) {
                            danoAplicado = valorAtaqueEspecial - npc.getDefesa();
                        } else {
                            danoAplicado = 10;
                        }

                        if (danoAplicado > npc.getHpAtual()) {
                            danoAplicado = npc.getHpAtual();
                        }

                        npc.setHpAtual(npc.getHpAtual() - danoAplicado);
                        System.out.println("O teu oponente levou com " + danoAplicado + " de dano");
                        System.out.println("A HP dele é " + npc.getHpAtual());

                        if (npc.getHpAtual() <= 0) {
                            setOuro(this.ouro + npc.getOuro());
                            System.out.println("Venceste o duelo!! Ganhaste " + npc.getOuro() + " moedas de ouro do teu inimigo");
                            return true;
                        }

                        System.out.println("Foste atingido pelo teu oponente");
                        if (npc.getForca() > valorDefesa) {
                            danoRecebido = npc.getForca() - valorDefesa;
                        } else {
                            danoRecebido = 10;
                        }

                        if (danoRecebido > this.hpAtual) {
                            danoRecebido = this.hpAtual;
                        }

                        this.hpAtual -= danoRecebido;

                        if (this.hpAtual > 0) {
                            System.out.println(this.nome + " levou com " + danoRecebido + " de dano");
                            System.out.println("A tua HP é " + this.hpAtual);
                        } else if (this.hpAtual <= 0) {
                            System.out.println("A luz apagou-se... mas a memória do herói perdurará em Valinor.");
                            System.out.println("O teu heroi foi assassinado em combate\n");
                            System.out.println("GAME OVER");
                            System.exit(0);
                        }
                    } else {
                        System.out.println("Não podes usar mais o teu ataque especial!\n");
                    }
                    this.energia -= 10;
                    if (this.energia < 0) {
                        this.energia = 0;
                    }
                    this.defesa -= 10;
                    if (this.defesa < 0) {
                        this.defesa = 0;
                    }
                    break;

                case 3:
                    Item consumivel = consumivel();

                    if (consumivel != null) {
                        if (this.ouro >= consumivel.getPreco()) {
                            if (consumivel.getNome().equalsIgnoreCase("Poção de vida")) {
                                setHpAtual(getHpAtual() + 25);
                                if (getHpAtual() > getMaxHP()) {
                                    setHpAtual(getMaxHP());
                                }
                                System.out.println("A tua HP é " + this.hpAtual);


                            } else if (consumivel.getNome().equalsIgnoreCase("Pão de Lembas")) {
                                setHpAtual(getHpAtual() + 50);
                                if (getHpAtual() > getMaxHP()) {
                                    setHpAtual(getMaxHP());
                                }
                                System.out.println("A tua HP é " + this.hpAtual);


                            } else if (consumivel.getNome().equalsIgnoreCase("Athelas, Kingsfoil")) {
                                setHpAtual(getHpAtual() + 80);
                                if (getHpAtual() > getMaxHP()) {
                                    setHpAtual(getMaxHP());
                                }
                                System.out.println("A tua HP é " + this.hpAtual);


                            } else if (consumivel.getNome().equalsIgnoreCase("Poção de energia")) {
                                setEnergia(getEnergia() + 25);
                                if (getEnergia() > 100) {
                                    setEnergia(100);
                                }
                                System.out.println("A tua energia foi aumentada");


                            } else if (consumivel.getNome().equalsIgnoreCase("Luz de Earendil")) {
                                bonusAtaque *= 1.1;
                                bonusAtaqueEspecial *= 1.1;
                                System.out.println("O teu valor de ataque normal e de ataque especial foi aumentado");


                            } else if (consumivel.getNome().equalsIgnoreCase("Miruvor")) {
                                bonusDefesa *= 1.1;
                                System.out.println("O teu valor de defesa foi aumentado");

                            }
                        }
                        this.ouro -= consumivel.getPreco();
                        inventario.remove(consumivel);
                        break;
                    } else {
                        System.out.println("O teu inventário está vazio");
                    }
                case 0:

                    if (fugir(valorFurtividade, npc)) {
                        System.out.println("Conseguiste fugir do combate!");
                        return true;
                    } else {
                        System.out.println("Falhaste a tentativa de fuga! O inimigo ataca.");
                        if (npc.getForca() > valorDefesa) {
                            danoRecebido = npc.getForca() - valorDefesa;
                        } else {
                            danoRecebido = 10;
                        }

                        if (danoRecebido > this.hpAtual) {
                            danoRecebido = this.hpAtual;
                        }

                        this.hpAtual -= danoRecebido;
                        System.out.println(this.nome + " levou com " + danoRecebido + " de dano");
                        System.out.println("A tua HP é " + this.hpAtual);

                        if (this.hpAtual <= 0) {
                            return false;
                        }
                    }
                    this.energia -= 10;
                    if (this.energia < 0) {
                        this.energia = 0;
                    }
                    break;
                default:
                    System.out.println("Tens de usar uma opção válida");
                    break;
            }

        } while (getHpAtual() > 0 && npc.getHpAtual() > 0);

        this.energia = maxEnergia;
        return true;
    }


    /**
     * Função da forma de combate contra bosses, onde o herói ataca e é atacado, pode também ingerir consumível mas não pode tentar fugir da batalha.
     * Específico para a classe cavaleiro
     *
     * @param boss que luta contra herói
     * @return true - herói vence || false - herói morre
     */
    public boolean combateBoss(NPC boss) {

        Scanner input = new Scanner(System.in);

        boolean possoUsar = true;
        int maxEnergia = this.energia;

        do {
            double[] atributos = calculoAtributosEnergia();
            double valorAtaque = atributos[0];
            double valorAtaqueEspecial = atributos[1];
            double valorDefesa = atributos[2];


            System.out.println("Que ação queres fazer?");
            System.out.println("1. Corte normal");
            System.out.println("2. Corte Forte - especial");
            System.out.println("3. Ingerir um consumível");
            System.out.println("0. fugir");
            int opcao = input.nextInt();

            double danoRecebido, danoAplicado;

            switch (opcao) {
                case 1:
                    System.out.println("Foste atingido pelo teu oponente");
                    if (boss.getForca() > valorDefesa) {
                        danoRecebido = boss.getForca() - valorDefesa;
                    } else {
                        danoRecebido = 10;
                    }

                    if (danoRecebido > this.hpAtual) {
                        danoRecebido = this.hpAtual;
                    }

                    this.hpAtual -= danoRecebido;

                    if (this.hpAtual > 0) {
                        System.out.println(this.nome + " levou com " + danoRecebido + " de dano");
                        System.out.println("A tua HP é " + this.hpAtual);
                    } else if (this.hpAtual <= 0) {
                        System.out.println("A luz apagou-se... mas a memória do herói perdurará em Valinor.");
                        System.out.println("O teu heroi foi assassinado em combate\n");
                        System.out.println("GAME OVER");
                        System.exit(0);
                    }

                    System.out.println("Atingiste o teu adversário");
                    if (valorAtaque - boss.getDefesa() >= 10) {
                        danoAplicado = valorAtaque - boss.getDefesa();
                    } else {
                        danoAplicado = 10;
                    }

                    if (danoAplicado > boss.getHpAtual()) {
                        danoAplicado = boss.getHpAtual();
                    }

                    boss.setHpAtual(boss.getHpAtual() - danoAplicado);
                    System.out.println("O teu oponente levou com " + danoAplicado + " de dano");
                    System.out.println("A HP dele é " + boss.getHpAtual());

                    if (boss.getHpAtual() <= 0) {
                        return true;
                    }
                    this.energia -= 10;
                    if (this.energia < 0) {
                        this.energia = 0;
                    }
                    break;

                case 2:

                    if (possoUsar) {
                        possoUsar = false;

                        System.out.println("Foste atingido pelo teu oponente");
                        if (boss.getForca() > valorDefesa) {
                            danoRecebido = boss.getForca() - valorDefesa;
                        } else {
                            danoRecebido = 10;
                        }

                        if (danoRecebido > this.hpAtual) {
                            danoRecebido = this.hpAtual;
                        }

                        this.hpAtual -= danoRecebido;


                        if (this.hpAtual > 0) {
                            System.out.println(this.nome + " levou com " + danoRecebido + " de dano");
                            System.out.println("A tua HP é " + this.hpAtual);
                        } else if (this.hpAtual <= 0) {
                            System.out.println("A luz apagou-se... mas a memória do herói perdurará em Valinor.");
                            System.out.println("O teu heroi foi assassinado em combate\n");
                            System.out.println("GAME OVER");
                            System.exit(0);
                        }

                        System.out.println("Atingiste o teu adversário");
                        if (valorAtaqueEspecial - boss.getDefesa() >= 10) {
                            danoAplicado = valorAtaqueEspecial - boss.getDefesa();
                        } else {
                            danoAplicado = 10;
                        }

                        if (danoAplicado > boss.getHpAtual()) {
                            danoAplicado = boss.getHpAtual();
                        }

                        boss.setHpAtual(boss.getHpAtual() - danoAplicado);
                        System.out.println("O teu oponente levou com " + danoAplicado + " de dano");
                        System.out.println("A HP dele é " + boss.getHpAtual());

                        if (boss.getHpAtual() <= 0) {

                            return true;

                        }
                    } else {
                        System.out.println("Não podes usar mais o teu ataque especial!");
                    }

                    this.energia -= 10;
                    if (this.energia < 0) {
                        this.energia = 0;
                    }
                    break;

                case 3:
                    Item consumivel = consumivel();

                    if (consumivel != null) {
                        if (this.ouro >= consumivel.getPreco()) {
                            if (consumivel.getNome().equalsIgnoreCase("Poção de vida")) {
                                setHpAtual(getHpAtual() + 25);
                                if (getHpAtual() > getMaxHP()) {
                                    setHpAtual(getMaxHP());
                                }
                                System.out.println("A tua HP é " + this.hpAtual);


                            } else if (consumivel.getNome().equalsIgnoreCase("Pão de Lembas")) {
                                setHpAtual(getHpAtual() + 50);
                                if (getHpAtual() > getMaxHP()) {
                                    setHpAtual(getMaxHP());
                                }
                                System.out.println("A tua HP é " + this.hpAtual);


                            } else if (consumivel.getNome().equalsIgnoreCase("Athelas, Kingsfoil")) {
                                setHpAtual(getHpAtual() + 80);
                                if (getHpAtual() > getMaxHP()) {
                                    setHpAtual(getMaxHP());
                                }
                                System.out.println("A tua HP é " + this.hpAtual);


                            } else if (consumivel.getNome().equalsIgnoreCase("Poção de energia")) {
                                setEnergia(getEnergia() + 25);
                                if (getEnergia() > 100) {
                                    setEnergia(100);
                                }
                                System.out.println("A tua energia foi aumentada");


                            } else if (consumivel.getNome().equalsIgnoreCase("Luz de Earendil")) {
                                bonusAtaque *= 1.1;
                                bonusAtaqueEspecial *= 1.1;
                                System.out.println("O teu valor de ataque normal e de ataque especial foi aumentado");


                            } else if (consumivel.getNome().equalsIgnoreCase("Miruvor")) {
                                bonusDefesa *= 1.1;
                                System.out.println("O teu valor de defesa foi aumentado");
                            }
                        }
                        this.ouro -= consumivel.getPreco();
                        inventario.remove(consumivel);
                        break;
                    } else {
                        System.out.println("O teu inventário está vazio");
                    }
                    break;
                case 0:
                    System.out.println("Não podes fugir, a Terra Média depende de ti!");

                    break;
                default:
                    System.out.println("Tens de usar uma opção válida");
                    break;
            }

        } while (getHpAtual() > 0 && boss.getHpAtual() > 0);

        this.energia = maxEnergia;
        return true;
    }


    /**
     * Função da forma de combate contra bosses, onde o herói ataca e é atacado, pode também ingerir consumível mas não pode tentar fugir da batalha.
     * Específico para a classe Arqueiro e Feiticeiro
     *
     * @param boss que luta contra o herói
     * @return true - herói vence || false - herói morre
     */
    public boolean combateBossArqFeiti(NPC boss) {

        Scanner input = new Scanner(System.in);

        boolean possoUsar = true;
        int maxEnergia = this.energia;


        do {
            double[] atributos = calculoAtributosEnergia();
            double valorAtaque = atributos[0];
            double valorAtaqueEspecial = atributos[1];
            double valorDefesa = atributos[2];
            if (getTipoArmaPermitido() == TipoArma.ARCO) {
                System.out.println("Que ação queres fazer?");
                System.out.println("1. Disparo normal");
                System.out.println("2.  Flecha Celestial - especial");
                System.out.println("3. Ingerir um consumível");
                System.out.println("0. fugir");

            } else if (getTipoArmaPermitido() == TipoArma.CAJADO) {

                System.out.println("Que ação queres fazer?");
                System.out.println("1. Raio Arcano");
                System.out.println("2. Julgamento Astral - especial");
                System.out.println("3. Ingerir um consumível");
                System.out.println("0. fugir");
            }

            int opcao = input.nextInt();

            double danoRecebido, danoAplicado;

            switch (opcao) {
                case 1:

                    System.out.println("Atingiste o teu adversário");
                    if (valorAtaque - boss.getDefesa() >= 10) {
                        danoAplicado = valorAtaque - boss.getDefesa();
                    } else {
                        danoAplicado = 10;
                    }

                    if (danoAplicado > boss.getHpAtual()) {
                        danoAplicado = boss.getHpAtual();
                    }

                    boss.setHpAtual(boss.getHpAtual() - danoAplicado);
                    System.out.println("O teu oponente levou com " + danoAplicado + " de dano");
                    System.out.println("A HP dele é " + boss.getHpAtual());

                    if (boss.getHpAtual() <= 0) {
                        return true;
                    }

                    System.out.println("Foste atingido pelo teu oponente");
                    if (boss.getForca() > valorDefesa) {
                        danoRecebido = boss.getForca() - valorDefesa;
                    } else {
                        danoRecebido = 10;
                    }

                    if (danoRecebido > this.hpAtual) {
                        danoRecebido = this.hpAtual;
                    }

                    this.hpAtual -= danoRecebido;

                    if (this.hpAtual > 0) {
                        System.out.println(this.nome + " levou com " + danoRecebido + " de dano");
                        System.out.println("A tua HP é " + this.hpAtual);
                    } else if (this.hpAtual <= 0) {
                        System.out.println("A luz apagou-se... mas a memória do herói perdurará em Valinor.");
                        System.out.println("O teu heroi foi assassinado em combate\n");
                        System.out.println("GAME OVER");
                        System.exit(0);
                    }

                    this.energia -= 10;
                    if (this.energia < 0) {
                        this.energia = 0;
                    }
                    this.defesa -= 10;
                    if (this.defesa < 0) {
                        this.defesa = 0;
                    }
                    break;

                case 2:

                    if (possoUsar) {
                        possoUsar = false;


                        System.out.println("Atingiste o teu adversário");
                        if (valorAtaqueEspecial - boss.getDefesa() >= 10) {
                            danoAplicado = valorAtaqueEspecial - boss.getDefesa();
                        } else {
                            danoAplicado = 10;
                        }

                        if (danoAplicado > boss.getHpAtual()) {
                            danoAplicado = boss.getHpAtual();
                        }

                        boss.setHpAtual(boss.getHpAtual() - danoAplicado);
                        System.out.println("O teu oponente levou com " + danoAplicado + " de dano");
                        System.out.println("A HP dele é " + boss.getHpAtual());

                        if (boss.getHpAtual() <= 0) {
                            return true;
                        }

                        System.out.println("Foste atingido pelo teu oponente");
                        if (boss.getForca() > valorDefesa) {
                            danoRecebido = boss.getForca() - valorDefesa;
                        } else {
                            danoRecebido = 10;
                        }

                        if (danoRecebido > this.hpAtual) {
                            danoRecebido = this.hpAtual;
                        }

                        this.hpAtual -= danoRecebido;

                        if (this.hpAtual > 0) {
                            System.out.println(this.nome + " levou com " + danoRecebido + " de dano");
                            System.out.println("A tua HP é " + this.hpAtual);
                        } else if (this.hpAtual <= 0) {
                            System.out.println("A luz apagou-se... mas a memória do herói perdurará em Valinor.");
                            System.out.println("O teu heroi foi assassinado em combate\n");
                            System.out.println("GAME OVER");
                            System.exit(0);
                        }

                    } else {
                        System.out.println("Não podes usar mais o teu ataque especial!");
                    }

                    this.energia -= 10;
                    if (this.energia < 0) {
                        this.energia = 0;
                    }
                    this.defesa -= 10;
                    if (this.defesa < 0) {
                        this.defesa = 0;
                    }
                    break;

                case 3:
                    Item consumivel = consumivel();

                    if (consumivel != null) {
                        if (this.ouro >= consumivel.getPreco()) {
                            if (consumivel.getNome().equalsIgnoreCase("Poção de vida")) {
                                setHpAtual(getHpAtual() + 25);
                                if (getHpAtual() > getMaxHP()) {
                                    setHpAtual(getMaxHP());
                                }
                                System.out.println("A tua HP é " + this.hpAtual);


                            } else if (consumivel.getNome().equalsIgnoreCase("Pão de Lembas")) {
                                setHpAtual(getHpAtual() + 50);
                                if (getHpAtual() > getMaxHP()) {
                                    setHpAtual(getMaxHP());
                                }
                                System.out.println("A tua HP é " + this.hpAtual);


                            } else if (consumivel.getNome().equalsIgnoreCase("Athelas, Kingsfoil")) {
                                setHpAtual(getHpAtual() + 80);
                                if (getHpAtual() > getMaxHP()) {
                                    setHpAtual(getMaxHP());
                                }
                                System.out.println("A tua HP é " + this.hpAtual);


                            } else if (consumivel.getNome().equalsIgnoreCase("Poção de energia")) {
                                setEnergia(getEnergia() + 25);
                                if (getEnergia() > 100) {
                                    setEnergia(100);
                                }
                                System.out.println("A tua energia foi aumentada");


                            } else if (consumivel.getNome().equalsIgnoreCase("Luz de Earendil")) {
                                bonusAtaque *= 1.1;
                                bonusAtaqueEspecial *= 1.1;
                                System.out.println("O teu valor de ataque normal e de ataque especial foi aumentado");


                            } else if (consumivel.getNome().equalsIgnoreCase("Miruvor")) {
                                bonusDefesa *= 1.1;
                                System.out.println("O teu valor de defesa foi aumentado");
                            }
                        }
                        this.ouro -= consumivel.getPreco();
                        inventario.remove(consumivel);
                        break;
                    } else {
                        System.out.println("O teu inventário está vazio");
                    }
                    break;
                case 0:
                    System.out.println("Não podes fugir, a Terra Média depende de ti!");

                    break;
                default:
                    System.out.println("Tens de usar uma opção válida");
                    break;
            }

        } while (getHpAtual() > 0 && boss.getHpAtual() > 0);

        this.energia = maxEnergia;
        return true;
    }


}

