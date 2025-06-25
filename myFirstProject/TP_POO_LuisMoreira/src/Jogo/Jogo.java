package Jogo;

import Entidades.Arqueiro;
import Entidades.Cavaleiro;
import Entidades.Feiticeiro;
import Entidades.Heroi;
import Tools.Audio;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public abstract class Jogo {


    /**
     * Função que serve para o utilizador escolher o nome e classe para o seu herói
     * @return herói
     * @throws InterruptedException
     */
    public static Heroi criarPersonagem() throws InterruptedException, IOException {

        //    Audio.playMusic("audioFiles/The Fellowship of the Ring Soundtrack-16-Amon Hen.wav");

        Scanner input = new Scanner(System.in);

        System.out.println("Escolhe o nome da tua personagem: ");
        String nickname = input.nextLine();

//        System.out.println("Prepara-te para a aventura");
//        sleep(1000);

        int opcao;
        do {
            System.out.println("==== Escolhe a tua classe ==== ");
            System.out.println("1. Cavaleiro");
            System.out.println("2. Arqueiro");
            System.out.println("3. Feiticeiro");
            opcao = input.nextInt();

            Heroi heroi;

//            sleep(2000);
//            Audio.stopMusic();

            switch (opcao) {
                case 1:
                    heroi = Cavaleiro.criarCavaleiro(nickname);
                    AventuraCavaleiro(heroi);
                    return heroi;
                case 2:
                    heroi = Arqueiro.criarArqueiro(nickname);
                    AventuraArqFeiti(heroi);
                    return heroi;
                case 3:
                    heroi = Feiticeiro.criarFeiticeiro(nickname);
                    AventuraArqFeiti(heroi);
                    return heroi;
                default:
                    System.out.println("Escolha inválida, tenta outra vez");
            }


        } while (true);

    }


    /**
     * Função onde decorre toda a aventura quando é escolhida a classe Cavaleiro
     * @param heroi escolhido
     * @throws InterruptedException
     */
    public static void AventuraCavaleiro(Heroi heroi) throws InterruptedException, IOException {

        Scanner input = new Scanner(System.in);


        Audio.playMusic("audioFiles/Valinor.wav");

        System.out.println("=====================================================");
        System.out.println("                    O INÍCIO DOS TEMPOS              ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("No princípio, existia apenas Eru, o Único, chamado também de Ilúvatar.");
        System.out.println("De seu pensamento nasceram os Ainur, os Espíritos Sagrados, os primeiros filhos de sua mente.");
        System.out.println("Entre eles estavam os mais poderosos e sábios: Manwë, Varda, Ulmo, Aulë... e Melkor.");

        System.out.println("\nIlúvatar propôs aos Ainur um grande tema musical. Assim nasceu a Música dos Ainur,");
        System.out.println("uma sinfonia cósmica que daria origem ao mundo: Arda.");
        System.out.println("Cada Ainur contribuiu com a sua parte, mas Melkor começou a inserir notas dissonantes na melodia.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\nMelkor desejava criar por si próprio, não apenas seguir os desígnios de Ilúvatar, seu Pai.");
        System.out.println("Ansiava por poder, por domínio, e desejava o Fogo Secreto — a centelha da verdadeira Criação.");
        System.out.println("Mas esse Fogo habitava apenas em Ilúvatar, e Melkor, frustrado, começou a se encher de inveja e orgulho.");

        System.out.println("\nPor isso, mesmo antes da criação do mundo físico, Melkor já se afastava do propósito de Ilúvatar.");
        System.out.println("E assim, quando Arda foi formada, Melkor desceu até ela. Não para proteger mas para corromper.");
        System.out.println("Tornou-se o primeiro Mestre das Trevas, e os seus atos lançariam caos sobre toda a existência...");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\n=====================================================");
        System.out.println("            MUITOS MILÉNIOS SE PASSARAM...           ");
        System.out.println("=====================================================\n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\n=====================================================");
        System.out.println("              O DESPERTAR DOS PRIMEIROS FILHOS       ");
        System.out.println("=====================================================\n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Muito tempo se passou desde que Arda foi formada. As estrelas brilhavam no céu, mas o Sol e a Lua ainda não existiam.");
        System.out.println("Foi sob essa luz prateada que, à beira do lago Cuiviénen, os Primeiros Filhos de Ilúvatar despertaram.");
        System.out.println("Eram os Quendi — os Elfos — belos, imortais e profundamente ligados à música da criação.");

        System.out.println("\nOs Valar, espíritos guardiões de Arda, ficaram maravilhados com os Elfos.");
        System.out.println("Mas Melkor, sempre invejoso, começou a corrompê-los em segredo.");
        System.out.println("Ele capturou alguns dos Elfos e os transformou em horrores chamados Orcs — uma profanação da criação de Ilúvatar.");

        System.out.println("\nTemendo pelo destino dos Elfos, os Valar marcharam contra Melkor e o aprisionaram.");
        System.out.println("Então, enviaram emissários aos Quendi, convidando-os a viajar para o Oeste, para Valinor, a Terra Abençoada.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\nMas nem todos os Elfos aceitaram o chamamento");
        System.out.println("Alguns temeram a longa viagem, outros encantaram-se com as estrelas e preferiram permanecer em Cuiviénen.");
        System.out.println("Os que aceitaram partir foram guiados numa grande jornada por Oromë, o caçador dos Valar.");

        System.out.println("\nEntre eles estavam três grandes casas de Elfos: os Vanyar, os Noldor e os Teleri.");
        System.out.println("A viagem foi longa e cheia de provações — montanhas, rios e sombras os aguardavam.");
        System.out.println("Mas os que chegaram a Valinor contemplaram as Duas Árvores, fontes de luz pura, e viveram sob a proteção dos Valar.");
        System.out.println("E todos aqueles que contemplaram a luz das Duas Árvores foram para sempre transformados — tornaram-se mais sábios, mais belos e poderosos do que quaisquer outros que jamais viriam a existir em Arda.");
        System.out.println("Pois a luz das Duas Árvores não apenas iluminava Valinor — ela penetrava a alma de quem a via, enchendo-os de poder, sabedoria e uma memória que jamais se apagaria.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\n=====================================================");
        System.out.println("              A criação das Silmarils         ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Entre os Noldor, os mais sábios e habilidosos dos Elfos, surgiu Fëanor, o mais talentoso artífice de toda Arda.");
        System.out.println("Filho de Finwë, o Alto Rei dos Noldor, Fëanor era de espírito ardente, dotado de uma mente brilhante e uma paixão incomparável por criar.");
        System.out.println("Na sua ânsia por capturar e preservar a beleza da luz das Duas Árvores de Valinor, Laurelin e Telperion, Fëanor criou as Silmarils.");


        Audio.stopMusic();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/Morgoth and the High King of Noldor [Tolkien Elvish Tale - Music]  The Silmarillion  LOTR.wav");


        System.out.println("As Silmarils eram três jóias sagradas, forjadas com um poder que nem os próprios Valar conseguiam desvendar.");
        System.out.println("Dentro delas, Fëanor prendeu a pura luz das Árvores, e as pedras resplandeciam com uma beleza que superava tudo o que existia.");
        System.out.println("Nenhuma mão impura podia tocá-las sem ser queimada, pois as Silmarils estavam santificadas pelo poder de Eru Ilúvatar.");
        System.out.println("A fama das jóias espalhou-se por Valinor e além-mar, e até os Valar maravilhavam-se com a sua criação.");
        System.out.println("Mas com tamanha beleza e poder, veio também a inveja... e Melkor, que há muito planeava nas sombras, voltou o seu olhar para as Silmarils e para a vingança contra os Valar.");


        //            sleep(2000);


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\n=====================================================");
        System.out.println("                  O ataque de Morgoth                  ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("As Silmarils, forjadas por Fëanor com habilidade jamais vista, eram consideradas tesouros inigualáveis.");
        System.out.println("Nem os próprios Valar ousaram tocá-las sem permissão, tal era a sua santidade.");
        System.out.println("Mas Morgoth, consumido pela inveja e pelo desejo de possuí-las, planeou o seu ataque.\n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("Aliou-se a Ungoliant, uma criatura monstruosa em forma de aranha, tecedora de escuridão e devoradora de luz.");
        System.out.println("Juntos atravessaram secretamente as fronteiras de Aman e alcançaram as Duas Árvores — Telperion e Laurelin.");
        System.out.println("Ungoliant envolveu-as nas suas teias de trevas e sugou-lhes toda a seiva luminosa.");
        System.out.println("Morgoth, empunhando a sua lança negra, trespassou os troncos sagrados.");
        System.out.println("Telperion murchou e Laurelin queimou-se por dentro — e assim a Luz dos Valar extinguiu-se.\n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("Aproveitando o caos e a escuridão que se seguiram, Morgoth rumou à fortaleza onde estavam guardadas as Silmarils.");
        System.out.println("Ali, assassinou Finwë, pai de Fëanor, o guardião das joias, sem piedade.");
        System.out.println("Roubou-as do cofre sagrado e fugiu apressadamente para o norte, atravessando as montanhas geladas do norte até à Terra Média.\n");

        System.out.println("As Silmarils, agora corrompidas pelo toque de Morgoth, tornaram-se símbolo de guerra e tragédia.");
        System.out.println("E os Noldor, liderados por Fëanor, juraram persegui-lo até ao fim do mundo.\n");


        Audio.stopMusic();


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

        System.out.println("Após o roubo das Silmarils, duas grandes forças de Elfos partiram para a Terra Média, cada uma com um propósito e destino distintos.");

        System.out.println("O primeiro grupo eram os seguidores de Fëanor, movidos pela paixão e juramento feroz de recuperar as preciosas Silmarils a qualquer custo.");
        System.out.println("Esta Casa era conhecida pela sua determinação implacável e por estar disposta a enfrentar qualquer perigo para vingar o roubo e honrar o juramento de Fëanor.");

        System.out.println("O segundo grupo era formado pelos Elfos liderados por Fingolfin, irmão de Fëanor, e pelos irmãos de Galadriel.");
        System.out.println("Este grupo buscava proteger o seu povo, estabelecer novas terras seguras e lutar contra as forças sombrias de Morgoth, mesmo que não compartilhassem a mesma sede de vingança. \n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Tens uma escolha importante para fazer. Foste convidade por Feanor e por Fingolfin para te juntares aos seus grupos.");
        System.out.println("Que escolha queres fazer? Arrancar imediatamente com Feanor ou aguardar todo o exército do Fingolfin esteja preparado e cavalgar com eles? \n");
        int opcao;
        do {

            System.out.println("1. Jurar lealdade a Feanor e arrancar imediatamente");
            System.out.println("2. Jurar lealdade a Fingolfin e arrancar mais tarde");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n=====================================================");
                    System.out.println("                  O início da Aventura                 ");
                    System.out.println("=====================================================\n");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Vendedor vendedor = new Vendedor("Mablung");
                    vendedor.vender(heroi, vendedor.criarStock(heroi));


                    System.out.println();

                    System.out.println("Assim, os Elfos dividiram-se em dois caminhos, iniciando uma era de conflito e esperança na Terra Média, onde o destino das Silmarils e do próprio mundo seria decidido.");

                    System.out.println("O teu herói, movido pelo fogo da vingança e pelo juramento de Fëanor, decide juntar-se ao seu grupo. Sabia que esta jornada não seria apenas pela honra, mas também pelo destino das Silmarils e da sua própria alma.");

                    System.out.println("Depois de uma viagem longa e cheia de obstáculos, finalmente chegaram à Terra Média.");
                    System.out.println("O grupo liderado por Fëanor chegou mais cedo, pois era menos numeroso e movia-se com mais velocidade.\n");

                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Morgoth and the High King of Noldor [Tolkien Elvish Tale - Music]  The Silmarillion  LOTR.wav");

                    System.out.println("Ao chegarem ao seu destino, Fëanor não hesitou — decidiu dirigir-se imediatamente para Angband, a grande fortaleza de escuridão onde Morgoth residia.");
                    System.out.println("Mas Morgoth já conhecia os planos de Fëanor e ordenou um ataque preventivo, tentando travar o grupo antes mesmo de chegar aos portões da fortaleza.");

                    System.out.println(heroi.getNome() + ", na tentativa de alcançar Angband, foram embuscados por um exército numeroso enviado por Morgoth\n");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("No entanto, o grupo de Fëanor, assim como o grupo de Fingolfin, era formado por Elfos que tinham vislumbrado a luz das Duas Árvores — os Light Elves — e por isso eram incrivelmente poderosos.");
                    System.out.println("Com coragem e fúria, esmagaram rapidamente o bando de Orcs e Trolls enviado por Morgoth, continuando a sua marcha determinada rumo a Angband.\n");

                    System.out.println("Após derrotarem o exército de Orcs e Trolls enviado para os travar, Fëanor, tomado pela fúria e impaciência, não quis esperar que o resto do seu exército procurasse os caídos ou curasse os feridos.");
                    System.out.println("Num gesto precipitado, avançou sozinho com os seus sete filhos em direção aos portões de Angband.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Quando lá chegaram, perceberam que tinham sido atraídos para um destino sombrio...");
                    System.out.println("Os enormes portões de Angband abriram-se lentamente e, envoltos em sombras e fogo, sete Balrogs surgiram da escuridão para os enfrentar.");

                    System.out.println("A batalha que se seguiu foi brutal.");
                    System.out.println("Fëanor e os seus filhos, Elfos poderosos tocados pela luz das Árvores, lutaram com valentia e resistiram durante horas aos demónios flamejantes.");
                    System.out.println("Mas o cansaço abateu-se sobre eles, as forças esmoreceram, e um a um foram imobilizados.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("No fim, diante dos olhos dos seus filhos e sob as chamas da desolação, Fëanor, o Rei dos Grandes Elfos, foi escolhido por Gothmog, o Senhor dos Balrogs, para ser o único a cair.");
                    System.out.println("Com um golpe mortal, Gothmog assassinou Fëanor, pondo fim à chama mais ardente dos Noldor. \n");

                    System.out.println("Uma tragédia para os Elfos. Os membros do grupo de Feanor reparam que ajuda não chegou do grupo de Fingolfin e, enviando batedores para os procurar, ficaram a saber que tinham sido emboscados por um exército enviado por Morgoth");
                    System.out.println("No entanto, a maior parte prosseguiu para Angband quando estavam aptos e um sentimento nunca antes conhecido por qualquer elfo assombrou-os para sempre ao saber o que tinha acontecido");

                    Audio.stopMusic();
                    break;
                case 2:

                    System.out.println();
                    Vendedor vendedor2 = new Vendedor("Elu Thingol");
                    vendedor2.vender(heroi, vendedor2.criarStock(heroi));

                    System.out.println();


                    System.out.println("Assim, os Elfos dividiram-se em dois caminhos, iniciando uma era de conflito e esperança na Terra Média, onde o destino das Silmarils e do próprio mundo seria decidido.");
                    System.out.println("Depois de uma viagem longa e cheia de obstáculos, finalmente chegaram à terra Média. ");
                    System.out.println("O grupo liderado por Feanor chegou mais cedo pois era um grupo menos numeroso e movia-se com mais velocidade. \n");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Ao chegarem ao seu destino, Feanor decidiu dirigir-se imediatamente para Angband, a grande fortaleza de escuridão, onde Morgoth residia.");
                    System.out.println("Mas Morgoth sabia dos planos de Feanor e ordenou um ataque, não deixando sequer o grupo de Feanor chegar aos portões de Angband.");
                    System.out.println("Tratando-se de elfos que tinham vislumbrado a luz das árvores (Light Elfs), eram demasiado poderosos e derrotaram rapidamente o bando de Orcs e Trolls enviados por Morgoth e então seguiram para Angband. \n");


                    Audio.stopMusic();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Morgoth and the High King of Noldor [Tolkien Elvish Tale - Music]  The Silmarillion  LOTR.wav");


                    System.out.println("Mas isto foi o suficiente para Morgoth, através de espiões que estavam colocados em toda a Terra Média, " +
                            "perceber que este grupo de Feanor é pouco numeroso e que estão sedentos de vingança pelo roubo das silmarils e pelo assassinato de Finwe (pai de Feanor e de Fingolfin), " +
                            "estava muito longe do outro grupo de Elfos que eram 4 vezes mais e estavam mais calmos e com capacidade de decidir com sabedoria");
                    System.out.println("Então, enviou outro grupo de Orcs, Trolls e Goblins para atacar o grupo que estava mais longe, não para os derrotar, mas para os segurar tempo suficiente para...");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("\n=====================================================");
                    System.out.println("                  O início da Aventura                 ");
                    System.out.println("=====================================================\n");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println(heroi.getNome() + ", na tentativa de alcançar Feanor, foram embuscados por um exército numeroso enviado por Morgoth");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("Enquanto isso, o grupo de Fingolfin, após um combate árduo contra as forças enviadas por Morgoth, finalmente conseguiu derrotar os Orcs, Trolls e Goblins que tentavam atrasá-los.");
                    System.out.println("Exaustos, mas determinados, retomaram a sua marcha em direção a Angband, guiados pela esperança de se juntarem a Fëanor e aos seus filhos.");

                    System.out.println("Ao aproximarem-se da fortaleza envolta em sombras, o silêncio era estranho... opressivo.");
                    System.out.println("Não havia sinais de batalha, nem gritos de vitória, apenas o eco distante do vento nas montanhas de ferro.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("Foi então que encontraram os primeiros sinais do massacre.");
                    System.out.println("Armas partidas, vestígios de combate intenso, e por fim... os corpos de alguns dos filhos de Fëanor, gravemente feridos mas ainda vivos, incapazes de continuar a luta.");

                    System.out.println("Um deles, com as últimas forças, contou o que tinha acontecido.");
                    System.out.println("Fëanor, impaciente e consumido pela fúria, tinha avançado com os seus filhos até Angband sem esperar reforços.");
                    System.out.println("Lá, foram apanhados numa emboscada traiçoeira, enfrentando sete Balrogs liderados por Gothmog.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Os elfos de Fingolfin, outrora cheios de esperança, caíram num profundo silêncio.");
                    System.out.println("O destino de Fëanor, o mais ardente e orgulhoso dos Noldor, agora selado pelo senhor dos Balrogs, era uma ferida aberta na alma dos Elfos.");
                    System.out.println("O caminho para recuperar as Silmarils estava agora ainda mais manchado de dor, perda e sacrifício.");

                    Audio.stopMusic();
                    break;
                default:
                    System.out.println("Opção inválida, tenta outra vez.");
                    break;


            }
        } while (opcao != 1 && opcao != 2);

        System.out.println("\n=====================================================");
        System.out.println("                  A vida na Terra Média                ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        Audio.playMusic("audioFiles/Flight to the Ford.wav");

        System.out.println("Após a trágica queda de Fëanor, o teu herói, profundamente marcado pela perda e pelo caos da guerra, procurava agora um novo propósito.");
        System.out.println("Foi então que se aproximou de Turgon, filho do sábio rei Fingolfin, cuja liderança prudente e visão para o futuro começavam a inspirar esperança entre os Noldor sobreviventes.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Com o coração carregado de memórias, mas a vontade renovada, o herói ajoelhou-se perante Turgon e jurou-lhe lealdade eterna.");
        System.out.println("Turgon aceitou o juramento com gratidão e honra, reconhecendo no herói um espírito valente, digno dos maiores feitos da antiga linhagem dos Elfos.");

        System.out.println("Guiados por visões enviadas pelo próprio Vala Ulmo, Turgon conduziu o seu povo em segredo pelas vastas regiões da Terra Média até encontrarem o vale escondido de Tumladen.");
        System.out.println("Ali, rodeada por montanhas intransponíveis, ergueu-se aquela que viria a ser a mais magnífica cidade élfica alguma vez construída: Gondolin, a Cidade Oculta.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Gondolin foi erguida em segredo absoluto, protegida por encantamentos e pelas Montanhas Circundantes, invisível aos olhos dos inimigos.");
        System.out.println("Era uma joia de luz em tempos de trevas, um eco de Valinor na Terra Média, e tornou-se a esperança silenciosa dos Noldor contra o poder crescente de Morgoth.");

        System.out.println(heroi.getNome() + " agora braço-direito de Turgon, participou ativamente na construção da cidade, defendendo os trabalhadores, patrulhando os caminhos secretos e ajudando a transformar Tumladen num santuário de esplendor e segurança.");
        System.out.println("Mas, mesmo nas muralhas sagradas de Gondolin, os ventos do destino sussurravam que a paz não duraria para sempre...\n");

        int escolha;
        Audio.stopMusic();
        do {

            System.out.println("Foste convocado à presença do teu líder Turgon e tens uma escolha a fazer \n");
            System.out.println("Escolhe uma das missões\n");

            System.out.println();
            System.out.println();
            System.out.println("Pressiona enter para continuar");
            input.nextLine();

            System.out.println("=== Missão 1: Caça às Sombras de Morgoth ===");
            System.out.println("Rumores chegam a Gondolin sobre bandos de Orcs, Goblins e Trolls que estão a aterrorizar as aldeias próximas.");
            System.out.println(heroi.getNome() + " é convocado para caçar estas criaturas e proteger o povo.");
            System.out.println("Prepara-te para enfrentar inimigos ferozes e garantir a segurança das terras élficas.\n");


            System.out.println();
            System.out.println();
            System.out.println("Pressiona enter para continuar");
            input.nextLine();

            System.out.println("=== Missão 2: A Canção Perdida de Nevrast ===");
            System.out.println("Ulmo (um dos Valar) envia um pressentimento a Turgon: algo antigo foi deixado para trás em Vinyamar, a antiga morada costeira antes da construção de Gondolin.");
            System.out.println(heroi.getNome() + " é escolhido para uma missão secreta: retornar a Nevrast e recuperar um artefacto sagrado — um instrumento élfico que guarda a última canção das ondas, capaz de comunicar com Ulmo.");
            System.out.println("Objetivos:");
            System.out.println("- Viajar até às ruínas de Vinyamar.");
            System.out.println("- Evitar patrulhas inimigas ao longo da costa.");
            System.out.println("- Recuperar o artefacto e regressar em segurança. \n");


            System.out.println();
            System.out.println();
            System.out.println("Pressiona enter para continuar");
            input.nextLine();

            System.out.println("=== Missão 3: Os Segredos de Amon Ereb ===");
            System.out.println("Mensageiros captaram rumores de que Amon Ereb é ponto de encontro de Elfos dissidentes conspirando com espiões de Morgoth.");
            System.out.println(heroi.getNome() + " deverá infiltrar-se secretamente na colina, reunir provas da traição e decidir o que fazer: reportar, confrontar ou tentar persuadir.");
            System.out.println("A missão exige furtividade, inteligência e coragem, pois serás confrontado por irmãos de sangue e enfrentarás dilemas morais profundos.\n");

            System.out.println();
            System.out.println();
            System.out.println("Pressiona enter para continuar");
            input.nextLine();



            System.out.println();
            System.out.println();
            System.out.println("Pressiona enter para continuar");
            input.nextLine();


            System.out.println("1. Para escolher a 1ª missão");
            System.out.println("2. Para escolher a 2ª missão");
            System.out.println("3. Para escolher a 3ª missão");

            System.out.println();


            System.out.println();

            escolha = input.nextInt();
            switch (escolha) {
                case 1:

                    Vendedor vendedor3 = new Vendedor("Finrod Felagund");
                    vendedor3.vender(heroi, vendedor3.criarStock(heroi));

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    System.out.println("E então, " + heroi.getNome() + " saiu e dirigiu-se para norte, em direção a Dor Daedeloth. Apenas as motanhas separam esta lugar recheado de inimigos de Gondolin");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");


                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());


                    Audio.stopMusic();
                    sleep(2000);
                    Audio.playMusic("audioFiles/Morgoth and the High King of Noldor [Tolkien Elvish Tale - Music]  The Silmarillion  LOTR.wav");

                    System.out.println();

                    System.out.println("\nApós a vitória, enquanto recupera o fôlego, um mensageiro élfico aproxima-se a cavalo.");
                    System.out.println("Mensageiro de Turgon: \"Valente " + heroi.getNome() + ", tenho ordens urgentes de Gondolin!\"");
                    System.out.println("\"O Senhor Turgon convoca-te imediatamente. Abandona esta missão e regressa sem demora!\"\n");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println(heroi.getNome() + " parte a galope de volta para Gondolin, intrigado com a urgência do chamado.");

                    System.out.println("\nAo chegar a Gondolin, " + heroi.getNome() + " é levado imediatamente ao salão de Turgon, onde uma atmosfera tensa paira no ar.");
                    System.out.println("Guardas estão em alerta, conselheiros murmuram e o próprio Rei parece abalado.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("\nTurgon: \"" + heroi.getNome() + ", algo terrível aconteceu na tua ausência.\"");
                    System.out.println("Turgon: \"Descobrimos que há um traidor entre nós. Um que conhece os nossos segredos... e os revelou.\"");

                    System.out.println("\nO salão silencia-se quando o nome é pronunciado.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Turgon: \"Maeglin. O meu sobrinho. Ele desapareceu no mesmo dia em que anunciei o casamento da minha filha, Idril, com Tuor — um Homem.\"\n");

                    System.out.println("Turgon: \"Maeglin estava apaixonado por Idril... Mas ela nunca lhe correspondeu. O seu coração pertence a Tuor.\"");
                    System.out.println("Turgon: \"Envenenado pelo ciúme, Maeglin fugiu e foi capturado pelos servos de Morgoth. Levaram-no até ao próprio Senhor do Escuro.\"\n");

                    System.out.println("Turgon: \"E ali, diante do Inimigo, Maeglin traiu-nos. Revelou o que era sagrado: a localização de Gondolin.\"\n");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Turgon: \"Morgoth prometeu-lhe o impensável: que faria dele Rei de Gondolin... e que Idril seria sua.\"\n");

                    System.out.println("Todos os rostos em Gondolin estão mergulhados em choque e medo. Pela primeira vez em séculos, a cidade sagrada está em verdadeiro perigo.\n");

                    System.out.println("Turgon: \"Temos de nos preparar. A guerra aproxima-se das nossas muralhas. E tu, " + heroi.getNome() + ", serás essencial para a defesa da nossa casa.\"");
                    System.out.println("Não há tempo a perder, Temos de preparar as nossas defesas!\n");


                    Audio.stopMusic();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("\n=====================================================");
                    System.out.println("                   O cerco de Gondolin                 ");
                    System.out.println("=====================================================\n");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

                    System.out.println("O sol ainda mal nascera quando os primeiros gritos ecoaram pelas torres mais altas da cidade.");
                    System.out.println("Os sentinelas nos portões ocidentais tocaram os cornos élficos — um som agudo, rasgado pelo vento das montanhas.");

                    System.out.println("\nNos terraços, nas varandas, nos jardins suspensos — os habitantes de Gondolin reuniram-se.");
                    System.out.println("Pais agarraram os filhos, mães oraram aos Valar. Os anciãos, com olhos cheios de lágrimas, reconheciam a forma das sombras no horizonte.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("\nNo vale abaixo da cidade, uma escuridão se movia como um manto vivo. Milhares de tochas, bandeiras negras com o emblema do Olho Flamejante.");
                    System.out.println("Orcs armados, Trolls de guerra, Wargs uivantes, e até dragões avançavam em formação, liderados por capitães sombrios de Angband.");
                    System.out.println("Era o exército de Morgoth. O fim de Gondolin chegara.\n");

                    System.out.println("O medo era um veneno nos corações. Mas havia também fogo. Fogo nos olhos dos soldados, nos arcos dos arqueiros, nos cânticos élficos de coragem.");
                    System.out.println("Gondolin podia cair, mas cairia com honra.\n");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Vendedor vendedor4 = new Vendedor("Gwindor");
                    vendedor4.vender(heroi, vendedor4.criarStock(heroi));

                    System.out.println();
                    System.out.println();

                    System.out.println(heroi.getNome() + " estava já totalmente armado, com a sua capa a esvoaçar no vento das muralhas.");
                    System.out.println("Tuor, agora general dos exércitos, ergueu a sua lança e falou aos guerreiros:");
                    System.out.println("\"Hoje, lutamos não só por uma cidade, mas pelo que ela representa. Pelo amor, pela liberdade, pela beleza que Morgoth jamais compreenderá.\"");

                    System.out.println("\nAs muralhas tremiam. As catapultas foram ativadas. Os portões trancados. Os arqueiros assumiram posição.");
                    System.out.println("E então... com um grito de guerra que rasgou os céus, os tambores de Angband rugiram. E começou a batalha por Gondolin.");


                    Audio.stopMusic();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println();
                    System.out.println();

                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Vendedor vendedor5 = new Vendedor("Caranthir");
                    vendedor5.vender(heroi, vendedor5.criarStock(heroi));


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("As ruas de Gondolin ardem. Torres desabam. O céu está coberto de cinzas.");
                    System.out.println("Crianças choram, guerreiros tombam, e a esperança parece um fio de luz prestes a apagar-se.");

                    System.out.println();
                    System.out.println("No cume de uma escadaria destruída, à saída do Túnel das Águias, onde muitos civis tentam fugir da cidade em ruínas...");
                    System.out.println("...ele surge.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Glorfindel and Balrog  - The Silmarillion Soundtrack by Bugra Gokce  No Copyright Music.wav");

                    System.out.println("Gothmog, Senhor dos Balrogs. Com chamas por pele e ódio por alma.");
                    System.out.println("O arauto da destruição de Morgoth, o assassino de Fëanor e de Fingon.");
                    System.out.println("Empunha um machado negro e um chicote ardente que crepita com o sangue dos Valar.");

                    System.out.println();
                    System.out.println("As hostes élficas recuam. O medo paralisa até os mais bravos. Mas " + heroi.getNome() + " permanece.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Turgon já tombou. Idril e Tuor lideram os refugiados. E o caminho de fuga será perdido se Gothmog avançar.");
                    System.out.println("Sem hesitar, " + heroi.getNome() + " interpõe-se diante do monstro. A sua espada brilha como uma estrela caída.\n");
                    System.out.println("O combate começa. Fogo contra luz. Sombra contra coragem.");
                    System.out.println("Gothmog ruge e investe, a sua lâmina quebra pedras e o seu chicote devora ar e terra.");

                    System.out.println(heroi.getNome() + " esquiva, fere, recua, ataca. Ambos se enfrentam como tempestades em colisão.");
                    System.out.println("A batalha dura como se o tempo estivesse suspenso, e o mundo observasse, em silêncio.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateBoss(FabricaPersonagens.criarBalrog());
                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Por fim, ambos estão feridos. A escada sobre o abismo começa a ruir.");
                    System.out.println("Num último ato de bravura, " + heroi.getNome() + " finca a espada no peito de Gothmog e avança com ele, num abraço final de destruição.");

                    System.out.println();
                    System.out.println("Ambos tombam no abismo. Fogo e luz desaparecem no vazio.");

                    System.out.println();
                    System.out.println("Silêncio.");

                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Valinor.wav");

                    System.out.println("E então — das alturas — as Grandes Águias surgem, em lamento e glória.");
                    System.out.println("Elas recuperam o corpo de " + heroi.getNome() + " e levam-no para os céus, envolto em honra e luz.");

                    System.out.println();
                    System.out.println("Ele caiu... mas salvou Gondolin.");
                    System.out.println("O seu nome será lembrado enquanto as estrelas cantarem.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    break;

                case 2:


                    System.out.println();
                    Vendedor vendedor6 = new Vendedor("Curufin");
                    vendedor6.vender(heroi, vendedor6.criarStock(heroi));



                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");
                    System.out.println();

                    System.out.println("E então, " + heroi.getNome() + " saiu e dirigiu-se para Oeste, em direção a Vinyamar. O caminho é longo e " + heroi.getNome() + "decidiu parar em Dor-lómin para passar a noite. Noite essa, que de pacífico, nada teve");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());
                    System.out.println();

                    Audio.stopMusic();
                    sleep(2000);
                    Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

                    System.out.println(heroi.getNome() + " finalmente chega às ruínas silenciosas de Vinyamar.");
                    System.out.println("Ao tocar nas cordas do antigo instrumento élfico, uma melodia etérea ecoa, e uma mensagem mágica, enviada por Ulmo, se revela, destinada a Turgon:");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Ulmo (na mensagem): \"Turgon, meu aliado e rei de Gondolin, ouve minha palavra urgente.\"");
                    System.out.println("Ulmo: \"Maeglin, teu sobrinho, caiu na sombra da traição.\"");
                    System.out.println("Ulmo: \"Seu coração, consumido pelo ciúme por Idril, que ama Tuor, levou-o a entregar os segredos sagrados do teu reino a Morgoth.\"");
                    System.out.println("Ulmo: \"Enfeitiçado pelas promessas do Senhor do Escuro, ele revelou o esconderijo de Gondolin, pondo em perigo toda a tua gente.\"");
                    System.out.println("Ulmo: \"Agora, mais do que nunca, precisas ser avisado." +
                            " É dever deste mensageiro, " + heroi.getNome() + ", partir imediatamente para Gondolin e alertar-te para que prepareis a defesa.\"");
                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.stopMusic();

                    System.out.println("A canção termina e " + heroi.getNome() + " sente o peso da urgência — o destino de Gondolin está nas suas mãos.\n");

                    Vendedor vendedor7 = new Vendedor("Lúthien Tinuviel");
                    vendedor7.vender(heroi, vendedor7.criarStock(heroi));


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("O regresso a Gondolin foi tão complicado como a viagem até Vinyamar");

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());
                    System.out.println();


                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

                    System.out.println(heroi.getNome() + " chega finalmente a Gondolin e encontra Turgon.");
                    System.out.println(heroi.getNome() + " relata com urgência tudo o que descobriu em Vinyamar:");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println(heroi.getNome() + ": \"Majestade, Ulmo enviou-me uma mensagem através do antigo instrumento élfico. Maeglin traiu-vos, entregando os segredos de Gondolin a Morgoth por ciúmes de Idril.\"");
                    System.out.println(heroi.getNome() + ": \"Ele foi seduzido pelo poder e promessas de Morgoth, e agora a segurança da cidade está ameaçada.\"");

                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Turgon, com semblante grave, responde:");
                    System.out.println("Turgon: \"Agradeço-te, bravo " + heroi.getNome() + ". Este aviso chega em tempo crucial.\"");
                    System.out.println("Turgon: \"Graças à tua coragem e rapidez, podemos reforçar as defesas e preparar Gondolin para a tempestade que se aproxima.\"");
                    System.out.println("Turgon: \"Que os Valar guiem os teus passos nesta batalha que decidirá o nosso destino e de toda a Terra Média.\"");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("\n=====================================================");
                    System.out.println("                   O cerco de Gondolin                 ");
                    System.out.println("=====================================================\n");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("O sol ainda mal nascera quando os primeiros gritos ecoaram pelas torres mais altas da cidade.");
                    System.out.println("Os sentinelas nos portões ocidentais tocaram os cornos élficos — um som agudo, rasgado pelo vento das montanhas.");

                    System.out.println("\nNos terraços, nas varandas, nos jardins suspensos — os habitantes de Gondolin reuniram-se.");
                    System.out.println("Pais agarraram os filhos, mães oraram aos Valar. Os anciãos, com olhos cheios de lágrimas, reconheciam a forma das sombras no horizonte.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("\nNo vale abaixo da cidade, uma escuridão se movia como um manto vivo. Milhares de tochas, bandeiras negras com o emblema do Olho Flamejante.");
                    System.out.println("Orcs armados, Trolls de guerra, Wargs uivantes, e até dragões avançavam em formação, liderados por capitães sombrios de Angband.");
                    System.out.println("Era o exército de Morgoth. O fim de Gondolin chegara.\n");

                    System.out.println("O medo era um veneno nos corações. Mas havia também fogo. Fogo nos olhos dos soldados, nos arcos dos arqueiros, nos cânticos élficos de coragem.");
                    System.out.println("Gondolin podia cair, mas cairia com honra.\n");

                    Vendedor vendedor8 = new Vendedor("Beleg Cuthalion");
                    vendedor8.vender(heroi, vendedor8.criarStock(heroi));


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println();

                    System.out.println(heroi.getNome() + " estava já totalmente armado, com a sua capa a esvoaçar no vento das muralhas.");
                    System.out.println("Tuor, agora general dos exércitos, ergueu a sua lança e falou aos guerreiros:");
                    System.out.println("\"Hoje, lutamos não só por uma cidade, mas pelo que ela representa. Pelo amor, pela liberdade, pela beleza que Morgoth jamais compreenderá.\"");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("\nAs muralhas tremiam. As catapultas foram ativadas. Os portões trancados. Os arqueiros assumiram posição.");
                    System.out.println("E então... com um grito de guerra que rasgou os céus, os tambores de Angband rugiram. E começou a batalha por Gondolin.");

                    Audio.stopMusic();
                    sleep(2000);

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());
                    System.out.println();


                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("As ruas de Gondolin ardem. Torres desabam. O céu está coberto de cinzas.");
                    System.out.println("Crianças choram, guerreiros tombam, e a esperança parece um fio de luz prestes a apagar-se.\n");

                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Vendedor vendedor9 = new Vendedor("Ecthelion");
                    vendedor9.vender(heroi, vendedor9.criarStock(heroi));

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("No cume de uma escadaria destruída, à saída do Túnel das Águias, onde muitos civis tentam fugir da cidade em ruínas...");
                    System.out.println("...ele surge.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Audio.playMusic("audioFiles/Glorfindel and Balrog  - The Silmarillion Soundtrack by Bugra Gokce  No Copyright Music.wav");

                    System.out.println("Gothmog, Senhor dos Balrogs. Com chamas por pele e ódio por alma.");
                    System.out.println("O arauto da destruição de Morgoth, o assassino de Fëanor e de Fingon.");
                    System.out.println("Empunha um machado negro e um chicote ardente que crepita com o sangue dos Valar.");

                    System.out.println();
                    System.out.println("As hostes élficas recuam. O medo paralisa até os mais bravos. Mas " + heroi.getNome() + " permanece.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Turgon já tombou. Idril e Tuor lideram os refugiados. E o caminho de fuga será perdido se Gothmog avançar.");
                    System.out.println("Sem hesitar, " + heroi.getNome() + " interpõe-se diante do monstro. A sua espada brilha como uma estrela caída.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("O combate começa. Fogo contra luz. Sombra contra coragem.");
                    System.out.println("Gothmog ruge e investe, a sua lâmina quebra pedras e o seu chicote devora ar e terra.");
                    System.out.println(heroi.getNome() + " esquiva, fere, recua, ataca. Ambos se enfrentam como tempestades em colisão.");
                    System.out.println("A batalha dura como se o tempo estivesse suspenso, e o mundo observasse, em silêncio.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateBoss(FabricaPersonagens.criarBalrog());
                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Por fim, ambos estão feridos. A escada sobre o abismo começa a ruir.");
                    System.out.println("Num último ato de bravura, " + heroi.getNome() + " finca a espada no peito de Gothmog e avança com ele, num abraço final de destruição.");

                    System.out.println();
                    System.out.println("Ambos tombam no abismo. Fogo e luz desaparecem no vazio.");

                    System.out.println();
                    System.out.println("Silêncio.");


                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Valinor.wav");

                    System.out.println("E então — das alturas — as Grandes Águias surgem, em lamento e glória.");
                    System.out.println("Elas recuperam o corpo de " + heroi.getNome() + " e levam-no para os céus, envolto em honra e luz.");

                    System.out.println();
                    System.out.println("Ele caiu... mas salvou Gondolin.");
                    System.out.println("O seu nome será lembrado enquanto as estrelas cantarem.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    break;

                case 3:


                    System.out.println();
                    Vendedor vendedor10 = new Vendedor("Idril Celebrindal");
                    vendedor10.vender(heroi, vendedor10.criarStock(heroi));

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("E então, " + heroi.getNome() + " saiu e dirigiu-se para Este, em direção a Amon Ereb. O caminho é longo e " + heroi.getNome() + "decidiu atravessar o rio Sirion para chegar ao seu destino mais rápido. Talvez, tenha cometido um erro grave");

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());
                    System.out.println();

                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

                    System.out.println(heroi.getNome() + " chega discretamente a Amon Ereb, oculto pelas sombras da noite.");
                    System.out.println("Após ouvir conversas sussurradas e interceptar uma reunião secreta, uma verdade inquietante vem à tona:");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Alguns dos filhos de Fëanor — ainda consumidos pela sua jura sagrada — acreditam que uma das Silmarils foi roubada de Morgoth e levada para Vinyamar.");
                    System.out.println("Convencidos de que o artefacto sagrado se encontra escondido nas ruínas costeiras, planeiam lançar um ataque imediato.");
                    System.out.println("Não lhes importa quem a possui, nem se o guardião é inocente — a Silmaril deve ser entregue... ou haverá mortes.");
                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println(heroi.getNome() + " sabe agora que uma nova ameaça paira sobre o mundo livre — e que as consequências podem ser devastadoras.");


                    System.out.println(heroi.getNome() + " sente o peso da revelação sobre os ombros.\n");

                    Audio.stopMusic();

                    Vendedor vendedor11 = new Vendedor("Angrod");
                    vendedor11.vender(heroi, vendedor11.criarStock(heroi));
                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("A conspiração em Amon Ereb é mais perigosa do que se imaginava — um ataque contra Vinyamar pode pôr em risco os últimos segredos dos elfos e provocar guerra entre irmãos.");
                    System.out.println("Sem tempo a perder, " + heroi.getNome() + " parte imediatamente em direção a Gondolin, atravessando montanhas e vales ocultos pelo véu da noite.");

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());
                    System.out.println();

                    Audio.stopMusic();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

                    System.out.println("Ao chegar a Gondolin, é imediatamente conduzido até o trono de Turgon.");

                    System.out.println(heroi.getNome() + ": \"Majestade, trago notícias urgentes de Amon Ereb. Alguns dos filhos de Fëanor acreditam que uma das Silmarils está escondida em Vinyamar.\"");
                    System.out.println(heroi.getNome() + ": \"Eles planeiam atacar, e nada os impedirá — querem recuperar a jóia, custe o que custar.\"");

                    System.out.println();
                    System.out.println("Turgon levanta-se, visivelmente perturbado com a notícia.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("Turgon: \"Mesmo entre os nossos, a obsessão pelas Silmarils ainda queima como um fogo insaciável...\"");
                    System.out.println("Turgon: \"Se o que dizes for verdade, Vinyamar corre perigo. Mas mais ainda: a frágil união entre os Noldor poderá ruir.\"");
                    System.out.println("Turgon: \"Agradeço-te, " + heroi.getNome() + ". Mais uma vez, trouxeste-nos aviso em hora oportuna.\"");
                    System.out.println("Turgon: \"Mandaremos vigias às costas e prepararemos uma resposta... mas talvez ainda haja tempo para evitar o confronto.\"");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("O destino agora depende de decisões delicadas... e da coragem de quem ousa interceder entre antigos aliados à beira da guerra.");

                    System.out.println("Turgon convoca os capitães e prepara um exército para marchar até Vinyamar.");
                    System.out.println("A ordem é clara: proteger as antigas ruínas e evitar um conflito com os filhos de Fëanor — ou, se necessário, enfrentá-los.");
                    System.out.println(heroi.getNome() + " acompanha a força expedicionária, ciente de que os ventos da guerra começam a soprar com força sobre Beleriand.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("\n=====================================================");
                    System.out.println("                   O cerco de Gondolin                 ");
                    System.out.println("=====================================================\n");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Mas antes mesmo de partirem... os sinos da cidade soam com urgência.");
                    System.out.println("Sentinelas correm pelas muralhas. O céu escurece com uma névoa densa e antinatural.");
                    System.out.println("Todos se voltam para os portões... e então veem o que ninguém ousava imaginar:");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("O exército de Morgoth, incontável e envolto em sombras, marcha sobre Gondolin.");
                    System.out.println("Tambores de guerra ecoam pelos vales ocultos. Trolls, orcs, lobos e criaturas de ferro avançam como uma maré negra.");
                    System.out.println("Dragões rugem nas alturas, enquanto estandartes do Senhor do Escuro tremulam entre as fileiras inimigas.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Turgon, com o rosto endurecido pela dor e pelo destino, murmura:");

                    System.out.println("Turgon: \"Não marcharemos para Vinyamar. O destino veio até nós.\"");
                    System.out.println("Turgon: \"Homens e elfos, preparem-se. Gondolin deve resistir — ou cairá como lenda.\"");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Vendedor vendedor12 = new Vendedor("Orodreth");
                    vendedor12.vender(heroi, vendedor12.criarStock(heroi));

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println();
                    System.out.println(heroi.getNome() + " empunha a sua arma. O tempo de decisões terminou. A batalha pela sobrevivência de Gondolin começou.");

                    Audio.stopMusic();
                    sleep(2000);
                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");


                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");


                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Vendedor vendedor13 = new Vendedor("Celegorn");
                    vendedor13.vender(heroi, vendedor13.criarStock(heroi));

                    System.out.println();

                    System.out.println("As ruas de Gondolin ardem. Torres desabam. O céu está coberto de cinzas.");
                    System.out.println("Crianças choram, guerreiros tombam, e a esperança parece um fio de luz prestes a apagar-se.");

                    System.out.println();
                    System.out.println("No cume de uma escadaria destruída, à saída do Túnel das Águias, onde muitos civis tentam fugir da cidade em ruínas...");
                    System.out.println("...ele surge.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Audio.playMusic("audioFiles/Glorfindel and Balrog  - The Silmarillion Soundtrack by Bugra Gokce  No Copyright Music.wav");

                    System.out.println("Gothmog, Senhor dos Balrogs. Com chamas por pele e ódio por alma.");
                    System.out.println("O arauto da destruição de Morgoth, o assassino de Fëanor e de Fingon.");
                    System.out.println("Empunha um machado negro e um chicote ardente que crepita com o sangue dos Valar.");

                    System.out.println();
                    System.out.println("As hostes élficas recuam. O medo paralisa até os mais bravos. Mas " + heroi.getNome() + " permanece.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Turgon já tombou. Idril e Tuor lideram os refugiados. E o caminho de fuga será perdido se Gothmog avançar.");
                    System.out.println("Sem hesitar, " + heroi.getNome() + " interpõe-se diante do monstro. A sua espada brilha como uma estrela caída.");


                    System.out.println();
                    System.out.println("O combate começa. Fogo contra luz. Sombra contra coragem.");
                    System.out.println("Gothmog ruge e investe, a sua lâmina quebra pedras e o seu chicote devora ar e terra.");
                    System.out.println(heroi.getNome() + " esquiva, fere, recua, ataca. Ambos se enfrentam como tempestades em colisão.");
                    System.out.println("A batalha dura como se o tempo estivesse suspenso, e o mundo observasse, em silêncio.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateBoss(FabricaPersonagens.criarBalrog());
                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println();
                    System.out.println("Por fim, ambos estão feridos. A escada sobre o abismo começa a ruir.");
                    System.out.println("Num último ato de bravura, " + heroi.getNome() + " finca a espada no peito de Gothmog e avança com ele, num abraço final de destruição.");

                    System.out.println();
                    System.out.println("Ambos tombam no abismo. Fogo e luz desaparecem no vazio.");

                    System.out.println();
                    System.out.println("Silêncio.");


                    Audio.stopMusic();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Audio.playMusic("audioFiles/Valinor.wav");

                    System.out.println("E então — das alturas — as Grandes Águias surgem, em lamento e glória.");
                    System.out.println("Elas recuperam o corpo de " + heroi.getNome() + " e levam-no para os céus, envolto em honra e luz.");

                    System.out.println();
                    System.out.println("Ele caiu... mas salvou Gondolin.");
                    System.out.println("O seu nome será lembrado enquanto as estrelas cantarem.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    break;
                default:
                    System.out.println("Tens de escolher uma destas missões. Ordens de Turgon. tenta outra vez.");
            }

        } while (escolha != 1 && escolha != 2 && escolha != 3);


        System.out.println("Gondolin caiu.");
        System.out.println("As muralhas foram consumidas pelas chamas.");
        System.out.println("As torres douradas, antes símbolo de beleza e resistência, ruíram sob o peso do ódio de Morgoth.");
        System.out.println("Mas... não caiu em vão.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("O sacrifício de " + heroi.getNome() + ", que enfrentou Gothmog e salvou a fuga de Idril, Tuor e seu filho Eärendil, garantiu que a semente da esperança sobrevivesse.");
        System.out.println("Idril guiou os sobreviventes por um caminho secreto até as costas esquecidas de Sirion.");
        System.out.println("E ali, longe das sombras de Angband, nasceu um plano mais antigo que o próprio medo.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Eärendil, filho de Tuor e Idril — herdeiro de Elfos e Homens — cresceu ouvindo as histórias do herói que enfrentou o Balrog.");
        System.out.println("Inspirado por essa coragem, ele embarcará um dia numa jornada até Valinor.");
        System.out.println("Uma jornada impossível, para rogar aos Valar que olhem novamente para a Terra-média... e ajudem contra a escuridão eterna de Morgoth.");

        System.out.println();
        System.out.println("Foi graças à resistência de Gondolin, e ao tempo comprado com sangue e bravura, que Eärendil teve tempo de crescer, aprender... e partir.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("E quando os Valar finalmente escutarem o seu apelo, lançarão a Guerra da Ira.");
        System.out.println("Será o fim de Morgoth, o Senhor do Escuro.");
        System.out.println("Mas tudo começou ali — nas ruínas de Gondolin, na coragem de um herói, e no último grito de luz contra a escuridão.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("O nome de " + heroi.getNome() + " será sussurrado pelas ondas, gravado nas estrelas, e cantado em todas as línguas livres.");
        System.out.println("Pois ele não salvou apenas uma cidade.");
        System.out.println("Ele deu ao mundo... tempo suficiente para a esperança vencer.\n");

        Audio.stopMusic();
        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("\n=====================================================");
        System.out.println("                  O fim da primeira Era                ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("E assim terminou a Primeira Era da Terra-média.");
        System.out.println("A Guerra da Ira, liderada pelos exércitos dos Valar, pelos Vanyar, pelos Maiar e pelos elfos exilados, esmagou as legiões de Morgoth.");
        System.out.println("Angband foi destruída, e Morgoth, acorrentado com grilhões de eterna humilhação, foi lançado para fora dos círculos do mundo.");
        System.out.println("A Terra-média sofreu, mas sobreviveu.");
        System.out.println("Tudo isso — por causa do tempo ganho pela coragem de Gondolin... e pelo sacrifício de um herói.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("\n=====================================================");
        System.out.println("                   O Retorno do Herói                  ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("Muito tempo depois, nas sagradas terras de Valinor, entre os salões de Mandos, ecoa um nome há muito silenciado.");
        System.out.println("Os Valar reúnem-se. Ulmo fala em sua defesa. Varda recorda-lhe a luz que carregava no coração. Manwë ouve, em silêncio.");

        System.out.println();
        System.out.println("E então, por decreto dos Valar, e por graça de Eru, o espírito de " + heroi.getNome() + " é libertado dos Salões do Silêncio.");
        System.out.println("Não como castigo, mas como recompensa.");
        System.out.println("Pois sua alma enfrentou as trevas sem cair na tentação, e o seu coração ardeu mais puro do que o fogo do Inimigo.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("O herói desperta em paz, sob a luz dourada de Aman.");
        System.out.println("O seu corpo é restaurado, purificado da dor e das chamas.");
        System.out.println("Ele vive novamente — não como apenas um guerreiro, mas como um ser de nobreza imortal.");

        System.out.println();
        System.out.println("As águias sobrevoam as planícies verdes. Os elfos cantam o seu nome.");
        System.out.println("E os próprios Valar, em honra rara, inclinam a cabeça àquele que tombou por todos.");

        System.out.println();
        System.out.println("O tempo dos contos antigos terminou... mas o destino de " + heroi.getNome() + " ainda está por ser escrito.");
        System.out.println("Pois na Terra-média, outras sombras um dia virão — e ele poderá ser chamado... mais uma vez.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        Audio.stopMusic();


        System.out.println("\n=====================================================");
        System.out.println("       A terceira era - de volta à Terra Média         ");
        System.out.println("=====================================================\n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/Flight to the Ford.wav");

        System.out.println("Muitos séculos passaram desde a queda de Morgoth.");
        System.out.println(heroi.getNome() + " viveu em paz em Valinor por um tempo, contemplando os jardins de Lórien e as estrelas de Varda.");
        System.out.println("Mas o mal nunca dorme eternamente.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Quando os ecos de uma nova sombra começaram a surgir na Terra-média, os Valar olharam novamente para o Oeste.");
        System.out.println("E mais uma vez, como Glorfindel antes dele, " + heroi.getNome() + " foi enviado de volta aos reinos dos Homens e Elfos.");
        System.out.println("Não como guerreiro comum — mas como um guardião, um sinal de que a luz ainda resistia.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Estabeleceu-se em Imladris, o Vale Escondido conhecido pelos Homens como Rivendell.");
        System.out.println("Lá, foi acolhido por Elrond Peredhel, Senhor de Rivendell, filho de Eärendil — o próprio que fora salvo pelos feitos heroicos de Gondolin.");
        System.out.println(heroi.getNome() + " tornou-se conselheiro, mestre de história e defensor do norte, sempre atento às sombras que se moviam a leste.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println();
        System.out.println("Estamos agora no ano 3018 da Terceira Era.\n");
        System.out.println();

        Audio.stopMusic();

        Vendedor vendedor14 = new Vendedor("Cirdan");
        vendedor14.vender(heroi, vendedor14.criarStock(heroi));

        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("As florestas tremem com presságios antigos. Criaturas das trevas percorrem as estradas sob disfarce.");
        System.out.println("O Um Anel foi encontrado. A sombra cresce em Mordor.");
        System.out.println("Um novo Senhor do Escuro tomou o lugar de Morgoth.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/The Lord of the Rings - MordorSaurons Theme.wav");

        System.out.println();
        System.out.println("O seu nome é Sauron — o antigo tenente de Angband, o artífice dos Anéis de Poder.");
        System.out.println("Ele ergueu a Torre Negra de Barad-dûr, reuniu exércitos imensos, e agora procura dominar tudo o que ainda resiste.");

        System.out.println();
        System.out.println("E assim, o mal continua na Terra-média.");
        System.out.println("Mas enquanto houver um nome como " + heroi.getNome() + " nos contos dos justos...");
        System.out.println("...há esperança e " + heroi.getNome() + " saiu para caçar todas as criaturas que encontrar que prestam devoção a Sauron");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        Audio.stopMusic();
        sleep(2000);
        Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack \uD83C\uDF32.wav");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());
        System.out.println();

        Audio.stopMusic();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/The House of Elrond.wav");

        System.out.println(heroi.getNome() + " regressa a Rivendell após semanas a caçar orcs nas montanhas e florestas do norte.");
        System.out.println("O seu manto está sujo, a sua lâmina ainda brilha com o sangue dos servos de Sauron.");
        System.out.println("Mas assim que atravessa os portões da Última Casa Amiga do Oeste, um mensageiro élfico aproxima-se apressadamente.");

        System.out.println("\"Elrond deseja falar contigo imediatamente,\" diz ele com urgência.");
        System.out.println(heroi.getNome() + " segue pelos corredores de mármore e salões cheios de canto, até o grande salão de audiências.");

        System.out.println();
        System.out.println("Elrond ergue-se da cadeira alta, com um olhar solene e distante.");
        System.out.println("Ele fala com voz grave, carregada de séculos de sabedoria:");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Elrond: \"Recebi um sinal. Um pressentimento vindo de muito além das montanhas — talvez dos próprios Valar.\"");
        System.out.println("Elrond: \"O destino da Terra-média está prestes a ser selado. E Rivendell... tem um papel a cumprir.\"");
        System.out.println("Elrond: \"Há um pequeno povo, os Hobbits, que vivem pacificamente no oeste, no Shire. Poucos fora conhecem a sua terra.\"");

        System.out.println();
        System.out.println("Elrond: \"Mas um deles carrega agora um fardo maior do que qualquer guerreiro. E forças negras já o procuram.\"");
        System.out.println("Elrond: \"Preciso que vás ao seu encontro. Protege-o. Guia-o até aqui — até Rivendell.\"");
        System.out.println("Elrond: \"Este hobbit deve chegar em segurança, pois com ele... caminha o destino de todos os povos livres.\"");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println();
        System.out.println(heroi.getNome() + " inclina a cabeça em sinal de respeito. Ele não faz perguntas.");
        System.out.println("As palavras de Elrond são claras, e o seu dever está traçado.\n");

        Audio.stopMusic();


        Vendedor vendedor15 = new Vendedor("Elladan");
        vendedor15.vender(heroi, vendedor15.criarStock(heroi));

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();


        System.out.println("Sem demora, o herói parte novamente — desta vez, rumo ao Shire, rumo ao centro de uma história maior do que qualquer outra.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack \uD83C\uDF32.wav");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateNormal(FabricaPersonagens.inimigoAleatorio());
        System.out.println();


        Audio.stopMusic();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("\n=====================================================");
        System.out.println("                O encontro em Amon Sûl                 ");
        System.out.println("=====================================================\n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Vendedor vendedor16 = new Vendedor("Elrohir");
        vendedor16.vender(heroi, vendedor16.criarStock(heroi));


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/The Revelation of the Ringwraiths.wav");

        System.out.println();

        System.out.println("Após dias de caminhos sinuosos e perigos inesperados, " + heroi.getNome() + " chega às ruínas antigas de Amon Sûl, também conhecida como Weathertop.");
        System.out.println("Ali, oculto pelas sombras, ele avista um grupo de viajantes — um Homem e quatro pequenos hobbits, acampados precariamente sob as pedras partidas da antiga torre.");
        System.out.println("Mas algo mais se move nas redondezas... formas escuras e silenciosas. Sete Nazgûl percorrem os vales próximos, em busca da presa.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println(heroi.getNome() + " não hesita. Mantendo-se invisível aos olhos dos inimigos, aproxima-se do acampamento silenciosamente.");
        System.out.println("Ao chegar, depara-se com um dos hobbits ferido, respirando com dificuldade, pálido como a morte.");

        System.out.println("A lâmina que o feriu — uma Morgul blade. O veneno já começa a tomar o seu espírito.");
        System.out.println(heroi.getNome() + " tenta estabilizá-lo, aplicar ervas e cânticos élficos... mas sente que a escuridão cresce dentro da ferida.");
        System.out.println("Só Elrond, Senhor de Rivendell, tem poder suficiente para salvá-lo.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Mas um pensamento atravessa-lhe a mente: \"Qual deles é o hobbit que devo proteger? Quem é o portador?\"");
        System.out.println("Antes que possa decidir, o Homem aproxima-se — imponente, olhos como aço sob o capuz.");

        System.out.println("Homem: \"Paz, meu amigo. Sou Aragorn, filho de Arathorn. E tu não és estranho para mim.\"");
        System.out.println("Aragorn: \"Elrond falou-me da tua missão. E sei quem procuras.\"");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Aragorn aponta para o ferido: \"Este é Frodo, do Shire. Ele carrega mais do que ferimentos — carrega o destino do mundo.\"");

        System.out.println(heroi.getNome() + " reconhece a verdade no olhar do homem que cresceu como irmão em Rivendell. Não há mais dúvida.");
        System.out.println("Sem perder tempo, prepara o cavalo, envolve Frodo num manto élfico e monta com ele à frente da sela.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Mas mal começa a descer a encosta, um grito agudo corta os céus — os Nazgûl sentiram o movimento.");
        System.out.println("As sombras começam a persegui-lo, vozes espectrais ecoam pela noite.");
        System.out.println("Por sorte, 3 espectros perseguem Aragorn e os restantes Hobbits e apenas 4 espectros do anel estão em perseguição de " + heroi.getNome() + ", determinados a recuperar o seu alvo a qualquer custo.");

        System.out.println();
        System.out.println("A corrida desesperada começa. Os ventos fustigam, a estrada torna-se traiçoeira, e Frodo delira entre a vida e a morte.");

        System.out.println("Conseguirá " + heroi.getNome() + " cumprir a sua missão?");
        System.out.println("Ou cairá nas mãos dos espectros, como tantos antes dele?");
        System.out.println("O destino da Terra-média cavalga pela noite...");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("A cavalgada foi longa e desesperada. Os Nazgûl aproximavam-se cada vez mais, os seus gritos gelavam o sangue, e Frodo gemia entre o delírio e o silêncio da morte iminente.");

        System.out.println(heroi.getNome() + " sabia que não podia chegar a Rivendell com os espectros à sua sombra.");
        System.out.println("Então, nas colinas junto ao Bruinen, virou-se para enfrentar o destino.");

        System.out.println();
        System.out.println("Com coragem inabalável, desembainhou a sua lâmina — forjada com bênçãos de Valinor — e ergueu a voz num antigo cântico de poder élfico.");
        System.out.println("As sombras hesitaram... mas atacaram.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Durante o calvagar pela noite, um Nazgul aproxima-se demasiado e um combate começa");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateBoss(FabricaPersonagens.criarNazgul());
        System.out.println();

        System.out.println("Com o atraso da batalha, estás a ser mais fácil de alcançar. Outro Nazgul aproveita");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateBoss(FabricaPersonagens.criarNazgul());
        System.out.println();

        System.out.println("Estás exausto, mas eles não podem vencer. Não enquanto o teu sangue fluir. Estás quase a conseguir chegar a Rivendell");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateBoss(FabricaPersonagens.criarNazgul());
        System.out.println();

        System.out.println("No desespero, não havia outro plano senão este, para os espectros. A última cartada e mais poderosa. O rei bruxo de Angmar é o teu próximo oponente");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateBoss(FabricaPersonagens.criarWitchKing());
        System.out.println();


        Audio.stopMusic();


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("O confronto foi feroz. Raios cruzavam os céus e a terra tremia com a presença dos Nazgûl.");
        System.out.println("Mas " + heroi.getNome() + " era mais do que um guerreiro. Era um enviado dos Valar. Um defensor da luz em tempos de trevas.");
        System.out.println("Com golpes certeiros, coragem feroz e a proteção dos Valar, derrotou os espectros, dispersando-os temporariamente para as sombras de onde vieram.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Frodo, ainda inconsciente, tremia nos seus braços.");
        System.out.println("Sem tempo a perder, montou novamente e correu pelos últimos caminhos escondidos, atravessando o Bruinen quando as águas já começavam a cantar os feitiços de proteção de Elrond.");

        System.out.println();
        System.out.println("Em segurança, finalmente atravessou os portões de Rivendell.");
        System.out.println("Elfos correram ao seu encontro, levando Frodo às câmaras de cura, onde Elrond o esperava.");
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Elrond: \"Fizeste mais do que cumprir o teu dever. Salvaste a esperança do nosso mundo.\"");
        System.out.println(heroi.getNome() + " nada disse. Apenas assentiu, com o coração pesado mas aliviado. A primeira batalha estava vencida.");
        System.out.println("Mas a guerra... ainda estava por começar.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("\n=====================================================");
        System.out.println("        Conselho de Elrond e a Irmandade do Anel       ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        Audio.playMusic("audioFiles/The Fellowship of the Ring Soundtrack-09-Many Meetings.wav");

        System.out.println("Nas câmaras mais antigas de Rivendell, reuniram-se representantes de todos os povos livres: Elfos, Homens, Anões e Hobbits.");
        System.out.println("Ali, foi decidido que o Um Anel, forjado por Sauron no coração de Mordor, deveria ser destruído.");
        System.out.println("Nas chamas da Montanha da Perdição, onde fora criado, seria também o seu fim.");
        System.out.println("Foi formada uma Irmandade: nove companheiros, para se opor aos nove Nazgûl. E juntos partiram para a longa jornada até à Terra Negra.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        Audio.stopMusic();

        System.out.println();
        System.out.println("Meses se passaram. As sombras cresceram. As esperanças diminuíram.");
        System.out.println("Até que, certo dia, um mensageiro vindo de Lothlórien chegou a Rivendell, esgotado e ferido.");
        System.out.println("O seu rosto estava pálido e as palavras, tremendo:");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println();
        System.out.println("Mensageiro: \"O pior aconteceu. Sauron não planeia apenas atacar Gondor e Minas Tirith.\"");
        System.out.println("Mensageiro: \"Ele convocou vastos exércitos de Orcs, Homens do Leste e criaturas das trevas para atacar as cidades do norte: Erebor, Mirkwood... e Lothlórien.\"");
        System.out.println("Mensageiro: \"Quer enfraquecer os povos livres. Impedi-los de enviar reforços a Gondor.\"");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println();
        System.out.println("Elrond ergue-se. O seu rosto permanece sereno, mas os seus olhos ardem com a antiga luz de Valinor.");
        System.out.println("Elrond: \"Então chegou a hora. As florestas sagradas de Lothlórien não cairão sem resposta. Galadriel, filha de Finarfin (irmão de Fingolfin e Feanor, precisa de nós.\"");

        System.out.println();
        System.out.println("Sem demora, " + heroi.getNome() + " prepara as suas armas.");
        System.out.println("Centenas de Elfos do Vale de Imladris respondem ao chamado. Armados com espadas, arcos e canções de guerra antigas, montam os seus cavalos.");
        System.out.println();

        Vendedor vendedor17 = new Vendedor("Celebrian");
        vendedor17.vender(heroi, vendedor17.criarStock(heroi));

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("O estandarte de Rivendell tremula ao vento, com a estrela de Elrond brilhando sob o céu cinzento.");
        System.out.println(heroi.getNome() + " lidera uma das vanguardas. Os seus olhos estão fixos na direção sul — rumo a Lothlórien, rumo ao combate contra as trevas de Dol Guldur.");

        System.out.println();
        System.out.println("O destino chama novamente. E desta vez, a floresta dourada precisa dos seus defensores.\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println();

        System.out.println(heroi.getNome() + " cavalga sem descanso, guiado por urgência e esperança.");
        System.out.println("Quando finalmente alcança os limites de Lothlórien, o que vê corta-lhe o fôlego.");


        Audio.playMusic("audioFiles/The Lord of the Rings - MordorSaurons Theme.wav");


        System.out.println();
        System.out.println("A floresta outrora dourada está envolta em fumo e sombras.");
        System.out.println("As árvores antigas — mallorn dourados — ardem em chamas prateadas, resistindo à escuridão como tochas de esperança.");
        System.out.println("O ar cheira a resina, a ferro e a morte. O som do rio Celebrant mistura-se com os gritos de guerra dos inimigos.");
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Orcs escalam as encostas como uma maré negra, enquanto Wargs avançam aos saltos, sedentos de sangue élfico.");
        System.out.println("Flechas silvavam como serpentes pelos céus, tanto dos invasores quanto dos defensores.");
        System.out.println("Luzes élficas dançam entre os galhos — feitiços, canções de proteção, gritos de comando.");


        Audio.stopMusic();
        sleep(2000);
        Audio.playMusic("audioFiles/Forth Eorlingas.wav");

        System.out.println();
        System.out.println(heroi.getNome() + " ergue a sua lâmina ao céu nublado e grita:");
        System.out.println("\"Por Galadriel! Por a Luz das Duas Árvores! Não deixaremos a floresta cair!\"");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println();
        System.out.println("As tropas de Rivendell seguem-no, lançando-se no combate como uma torrente de prata contra a maré negra.");
        System.out.println("Ali, sob o céu de guerra, entre raízes ancestrais e sombras antigas, começa mais uma batalha pela alma da Terra Média.");

        System.out.println();
        System.out.println();

        System.out.println("Encontras um orc e decides atacar\n");
        heroi.combateBoss(FabricaPersonagens.criarOrc());

        System.out.println("Um Goblin separa-se do seu bando. Atacas?\n");
        heroi.combateBoss(FabricaPersonagens.criarGoblin());

        System.out.println("Um Troll está a impedir uma vida de Paz na Terra Média\n");
        heroi.combateBoss(FabricaPersonagens.criarTroll());

        System.out.println("Um Ward aparece rapidamente e ataca o teu flanco\n");
        heroi.combateBoss(FabricaPersonagens.criarWarg());

        System.out.println("Outro Troll. Haverá vitória possível?\n");
        heroi.combateBoss(FabricaPersonagens.criarTroll());

        System.out.println("Já exausto e com o inimigo a ganhar terreno, um Nazgul encara-te. É khamul, braço direito de Witch King de Angmar. Muitos acreditam que é um antigo rei de região de Rhun. Não tens escolha senão derrotá-lo\n");
        heroi.combateBoss(FabricaPersonagens.criarNazgul());

        Audio.stopMusic();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\n=====================================================");
        System.out.println("                        O fim!!!                       ");
        System.out.println("=====================================================\n");

        System.out.println("=== O Fim da Guerra. A Vitória da Luz. ===");

        System.out.println("A Batalha de Lothlórien rugia como um trovão sobre a floresta dourada.");
        System.out.println("As folhas cantavam em agonia, banhadas em sangue élfico.");
        System.out.println("Os defensores da Luz, embora corajosos, estavam a ser empurrados para trás.");
        System.out.println("Os muros naturais da floresta ressoavam com o choro dos que tombavam.");
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        Audio.playMusic("audioFiles/Lord of the Rings The Return of the King (2003) - Destroying the Ring Scene  Movieclips.wav");


        System.out.println("Mesmo " + heroi.getNome() + ", filho dos Valar, via a esperança esvair-se a cada golpe perdido.");
        System.out.println("As forças de Dol Guldur eram muitas. O aço negro e o fogo das trevas cresciam como tempestade.");
        System.out.println();

        System.out.println("Mas então... veio o silêncio.");
        System.out.println("Um silêncio estranho, profundo, quase sagrado.");

        sleep(3000);

        System.out.println("E de súbito — um uivo de terror cortou os ventos.");
        System.out.println("As criaturas de Sauron — orcs, trolls, sombras — largaram as armas e fugiram como folhas ao vento de tempestade.");
        System.out.println("Gritavam em desespero, olhos abertos como se vissem o fim do mundo.");
        System.out.println();


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Pouco depois, chegou a notícia. Vinda de mil léguas, levada por corvos, vento e esperança:");
        System.out.println("Frodo. O pequeno hobbit. O portador do fardo.");
        System.out.println("Ele chegara ao coração de Mordor. À Montanha da Perdição.");
        System.out.println("O ANEL fora destruído.");
        System.out.println();

        System.out.println("As trevas desvaneceram.");
        System.out.println("A torre negra desabou.");
        System.out.println("E com ela, caiu Sauron — último senhor do medo.");
        System.out.println();


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("A Terra Média respirou. Pela primeira vez em três eras, ela respirou em paz.");
        System.out.println("Seis mil anos de guerra chegaram ao fim.");
        System.out.println("O sol pôde nascer sem temor, e as estrelas voltaram a brilhar sem véu de sombras.");
        System.out.println();

        System.out.println("Lágrimas caíram. Não de dor, mas de alívio.");
        System.out.println("Aqueles que sobreviveram caíram de joelhos entre os campos devastados e abraçaram-se em silêncio.");
        System.out.println();


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("E " + heroi.getNome() + ", banhado pela luz dourada da floresta que tanto defendera, olhou para os céus.");
        System.out.println("E no sussurro do vento ouviu o eco dos Valar:");
        System.out.println("\"Foste fiel até ao fim. E agora... o mundo é livre.\"");


        System.out.println();
        System.out.println("A paz comanda agora a Terra Média.");
        System.out.println("Os corvos já não anunciam guerra, mas cantam canções antigas de vitória.");
        System.out.println("E mesmo que o tempo leve os nomes e os feitos, o coração do mundo lembrará... que houve um herói.");
        System.out.println("Um guardião da esperança.");
        System.out.println(heroi.getNome() + ". Filho das estrelas. Escudo da paz. Último eco de Valinor.");


        Audio.stopMusic();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\n=====================================================");
        System.out.println("                         Epílogo                       ");
        System.out.println("=====================================================\n");


        System.out.println("A história deste jogo é livremente inspirada na figura lendária de Glorfindel, com quase todos os acontecimentos pertencentes ao Lore escrito por J. R. R. Tolkien.");

        System.out.println();
        System.out.println("Glorfindel foi um dos grandes senhores élficos da Primeira Era, nascido na luz de Valinor.");
        System.out.println("Durante a Queda de Gondolin, lutou bravamente contra as forças de Morgoth, enfrentando o próprio Gothmog, Senhor dos Balrogs.");
        System.out.println("Ambos caíram num abismo mortal — mas os Valar, em honra ao seu sacrifício, devolveram-lhe a vida nos Reinos Eternos.");

        System.out.println();
        System.out.println("Milénios depois, na Terceira Era, Glorfindel caminhava novamente entre os povos livres.");
        System.out.println("Foi ele quem resgatou Frodo das mãos dos Nazgûl e ajudou a levá-lo em segurança até Rivendell.");
        System.out.println("Sábio, poderoso e fiel, Glorfindel é símbolo da coragem imortal e da luz que nunca se apaga.");

        System.out.println();
        System.out.println("O teu herói, " + heroi.getNome() + ", é uma homenagem direta a essa figura lendária.");
        System.out.println("Uma ponte entre eras, entre lenda e jogo, entre sacrifício e esperança.");
        System.out.println("Que o seu espírito guie sempre os defensores da Terra Média.");
    }


    /**
     * Função onde se desenvolve toda a aventura quando a classe escolhida é Arqueiro ou Feiticeiro
     * @param heroi escolhido
     * @throws InterruptedException
     */
    public static void AventuraArqFeiti(Heroi heroi) throws InterruptedException, IOException {

        Scanner input = new Scanner(System.in);




        System.out.println("=====================================================");
        System.out.println("                    O INÍCIO DOS TEMPOS              ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        Audio.playMusic("audioFiles/Valinor.wav");

        System.out.println("No princípio, existia apenas Eru, o Único, chamado também de Ilúvatar.");
        System.out.println("De seu pensamento nasceram os Ainur, os Espíritos Sagrados, os primeiros filhos de sua mente.");
        System.out.println("Entre eles estavam os mais poderosos e sábios: Manwë, Varda, Ulmo, Aulë... e Melkor.");

        System.out.println("\nIlúvatar propôs aos Ainur um grande tema musical. Assim nasceu a Música dos Ainur,");
        System.out.println("uma sinfonia cósmica que daria origem ao mundo: Arda.");
        System.out.println("Cada Ainur contribuiu com a sua parte, mas Melkor começou a inserir notas dissonantes na melodia.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\nMelkor desejava criar por si próprio, não apenas seguir os desígnios de Ilúvatar, seu Pai.");
        System.out.println("Ansiava por poder, por domínio, e desejava o Fogo Secreto — a centelha da verdadeira Criação.");
        System.out.println("Mas esse Fogo habitava apenas em Ilúvatar, e Melkor, frustrado, começou a se encher de inveja e orgulho.");

        System.out.println("\nPor isso, mesmo antes da criação do mundo físico, Melkor já se afastava do propósito de Ilúvatar.");
        System.out.println("E assim, quando Arda foi formada, Melkor desceu até ela. Não para proteger mas para corromper.");
        System.out.println("Tornou-se o primeiro Mestre das Trevas, e os seus atos lançariam caos sobre toda a existência...");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\n=====================================================");
        System.out.println("               MUITOS MILÉNIOS PASSARAM...             ");
        System.out.println("=====================================================\n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\n=====================================================");
        System.out.println("              O DESPERTAR DOS PRIMEIROS FILHOS       ");
        System.out.println("=====================================================\n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Muito tempo se passou desde que Arda foi formada. As estrelas brilhavam no céu, mas o Sol e a Lua ainda não existiam.");
        System.out.println("Foi sob essa luz prateada que, à beira do lago Cuiviénen, os Primeiros Filhos de Ilúvatar despertaram.");
        System.out.println("Eram os Quendi — os Elfos — belos, imortais e profundamente ligados à música da criação.");

        System.out.println("\nOs Valar, espíritos guardiões de Arda, ficaram maravilhados com os Elfos.");
        System.out.println("Mas Melkor, sempre invejoso, começou a corrompê-los em segredo.");
        System.out.println("Ele capturou alguns dos Elfos e os transformou em horrores chamados Orcs — uma profanação da criação de Ilúvatar.");

        System.out.println("\nTemendo pelo destino dos Elfos, os Valar marcharam contra Melkor e o aprisionaram.");
        System.out.println("Então, enviaram emissários aos Quendi, convidando-os a viajar para o Oeste, para Valinor, a Terra Abençoada.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\nMas nem todos os Elfos aceitaram o chamamento");
        System.out.println("Alguns temeram a longa viagem, outros encantaram-se com as estrelas e preferiram permanecer em Cuiviénen.");
        System.out.println("Os que aceitaram partir foram guiados numa grande jornada por Oromë, o caçador dos Valar.");

        System.out.println("\nEntre eles estavam três grandes casas de Elfos: os Vanyar, os Noldor e os Teleri.");
        System.out.println("A viagem foi longa e cheia de provações — montanhas, rios e sombras os aguardavam.");
        System.out.println("Mas os que chegaram a Valinor contemplaram as Duas Árvores, fontes de luz pura, e viveram sob a proteção dos Valar.");
        System.out.println("E todos aqueles que contemplaram a luz das Duas Árvores foram para sempre transformados — tornaram-se mais sábios, mais belos e poderosos do que quaisquer outros que jamais viriam a existir em Arda.");
        System.out.println("Pois a luz das Duas Árvores não apenas iluminava Valinor — ela penetrava a alma de quem a via, enchendo-os de poder, sabedoria e uma memória que jamais se apagaria.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\n=====================================================");
        System.out.println("              A criação das Silmarils         ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Entre os Noldor, os mais sábios e habilidosos dos Elfos, surgiu Fëanor, o mais talentoso artífice de toda Arda.");
        System.out.println("Filho de Finwë, o Alto Rei dos Noldor, Fëanor era de espírito ardente, dotado de uma mente brilhante e uma paixão incomparável por criar.");
        System.out.println("Na sua ânsia por capturar e preservar a beleza da luz das Duas Árvores de Valinor, Laurelin e Telperion, Fëanor criou as Silmarils.");


        Audio.stopMusic();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/Morgoth and the High King of Noldor [Tolkien Elvish Tale - Music]  The Silmarillion  LOTR.wav");


        System.out.println("As Silmarils eram três jóias sagradas, forjadas com um poder que nem os próprios Valar conseguiam desvendar.");
        System.out.println("Dentro delas, Fëanor prendeu a pura luz das Árvores, e as pedras resplandeciam com uma beleza que superava tudo o que existia.");
        System.out.println("Nenhuma mão impura podia tocá-las sem ser queimada, pois as Silmarils estavam santificadas pelo poder de Eru Ilúvatar.");
        System.out.println("A fama das jóias espalhou-se por Valinor e além-mar, e até os Valar maravilhavam-se com a sua criação.");
        System.out.println("Mas com tamanha beleza e poder, veio também a inveja... e Melkor, que há muito planeava nas sombras, voltou o seu olhar para as Silmarils e para a vingança contra os Valar.");



        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\n=====================================================");
        System.out.println("                  O ataque de Morgoth                  ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("As Silmarils, forjadas por Fëanor com habilidade jamais vista, eram consideradas tesouros inigualáveis.");
        System.out.println("Nem os próprios Valar ousaram tocá-las sem permissão, tal era a sua santidade.");
        System.out.println("Mas Morgoth, consumido pela inveja e pelo desejo de possuí-las, planeou o seu ataque.\n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("Aliou-se a Ungoliant, uma criatura monstruosa em forma de aranha, tecedora de escuridão e devoradora de luz.");
        System.out.println("Juntos atravessaram secretamente as fronteiras de Aman e alcançaram as Duas Árvores — Telperion e Laurelin.");
        System.out.println("Ungoliant envolveu-as nas suas teias de trevas e sugou-lhes toda a seiva luminosa.");
        System.out.println("Morgoth, empunhando a sua lança negra, trespassou os troncos sagrados.");
        System.out.println("Telperion murchou e Laurelin queimou-se por dentro — e assim a Luz dos Valar extinguiu-se.\n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("Aproveitando o caos e a escuridão que se seguiram, Morgoth rumou à fortaleza onde estavam guardadas as Silmarils.");
        System.out.println("Ali, assassinou Finwë, pai de Fëanor, o guardião das joias, sem piedade.");
        System.out.println("Roubou-as do cofre sagrado e fugiu apressadamente para o norte, atravessando as montanhas geladas do norte até à Terra Média.\n");

        System.out.println("As Silmarils, agora corrompidas pelo toque de Morgoth, tornaram-se símbolo de guerra e tragédia.");
        System.out.println("E os Noldor, liderados por Fëanor, juraram persegui-lo até ao fim do mundo.\n");


        Audio.stopMusic();


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

        System.out.println("Após o roubo das Silmarils, duas grandes forças de Elfos partiram para a Terra Média, cada uma com um propósito e destino distintos.");

        System.out.println("O primeiro grupo eram os seguidores de Fëanor, movidos pela paixão e juramento feroz de recuperar as preciosas Silmarils a qualquer custo.");
        System.out.println("Esta Casa era conhecida pela sua determinação implacável e por estar disposta a enfrentar qualquer perigo para vingar o roubo e honrar o juramento de Fëanor.");

        System.out.println("O segundo grupo era formado pelos Elfos liderados por Fingolfin, irmão de Fëanor, e pelos irmãos de Galadriel.");
        System.out.println("Este grupo buscava proteger o seu povo, estabelecer novas terras seguras e lutar contra as forças sombrias de Morgoth, mesmo que não compartilhassem a mesma sede de vingança. \n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Tens uma escolha importante para fazer. Foste convidade por Feanor e por Fingolfin para te juntares aos seus grupos.");
        System.out.println("Que escolha queres fazer? Arrancar imediatamente com Feanor ou aguardar todo o exército do Fingolfin esteja preparado e cavalgar com eles? \n");
        int opcao;
        do {

            System.out.println("1. Jurar lealdade a Feanor e arrancar imediatamente");
            System.out.println("2. Jurar lealdade a Fingolfin e arrancar mais tarde");
            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n=====================================================");
                    System.out.println("                  O início da Aventura                 ");
                    System.out.println("=====================================================\n");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Vendedor vendedor = new Vendedor("Mablung");
                    vendedor.vender(heroi, vendedor.criarStock(heroi));


                    System.out.println();

                    System.out.println("Assim, os Elfos dividiram-se em dois caminhos, iniciando uma era de conflito e esperança na Terra Média, onde o destino das Silmarils e do próprio mundo seria decidido.");

                    System.out.println("O teu herói, movido pelo fogo da vingança e pelo juramento de Fëanor, decide juntar-se ao seu grupo. Sabia que esta jornada não seria apenas pela honra, mas também pelo destino das Silmarils e da sua própria alma.");

                    System.out.println("Depois de uma viagem longa e cheia de obstáculos, finalmente chegaram à Terra Média.");
                    System.out.println("O grupo liderado por Fëanor chegou mais cedo, pois era menos numeroso e movia-se com mais velocidade.\n");

                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Morgoth and the High King of Noldor [Tolkien Elvish Tale - Music]  The Silmarillion  LOTR.wav");

                    System.out.println("Ao chegarem ao seu destino, Fëanor não hesitou — decidiu dirigir-se imediatamente para Angband, a grande fortaleza de escuridão onde Morgoth residia.");
                    System.out.println("Mas Morgoth já conhecia os planos de Fëanor e ordenou um ataque preventivo, tentando travar o grupo antes mesmo de chegar aos portões da fortaleza.");

                    System.out.println(heroi.getNome() + ", na tentativa de alcançar Angband, foram embuscados por um exército numeroso enviado por Morgoth\n");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("No entanto, o grupo de Fëanor, assim como o grupo de Fingolfin, era formado por Elfos que tinham vislumbrado a luz das Duas Árvores — os Light Elves — e por isso eram incrivelmente poderosos.");
                    System.out.println("Com coragem e fúria, esmagaram rapidamente o bando de Orcs e Trolls enviado por Morgoth, continuando a sua marcha determinada rumo a Angband.\n");

                    System.out.println("Após derrotarem o exército de Orcs e Trolls enviado para os travar, Fëanor, tomado pela fúria e impaciência, não quis esperar que o resto do seu exército procurasse os caídos ou curasse os feridos.");
                    System.out.println("Num gesto precipitado, avançou sozinho com os seus sete filhos em direção aos portões de Angband.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Quando lá chegaram, perceberam que tinham sido atraídos para um destino sombrio...");
                    System.out.println("Os enormes portões de Angband abriram-se lentamente e, envoltos em sombras e fogo, sete Balrogs surgiram da escuridão para os enfrentar.");

                    System.out.println("A batalha que se seguiu foi brutal.");
                    System.out.println("Fëanor e os seus filhos, Elfos poderosos tocados pela luz das Árvores, lutaram com valentia e resistiram durante horas aos demónios flamejantes.");
                    System.out.println("Mas o cansaço abateu-se sobre eles, as forças esmoreceram, e um a um foram imobilizados.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("No fim, diante dos olhos dos seus filhos e sob as chamas da desolação, Fëanor, o Rei dos Grandes Elfos, foi escolhido por Gothmog, o Senhor dos Balrogs, para ser o único a cair.");
                    System.out.println("Com um golpe mortal, Gothmog assassinou Fëanor, pondo fim à chama mais ardente dos Noldor. \n");

                    System.out.println("Uma tragédia para os Elfos. Os membros do grupo de Feanor reparam que ajuda não chegou do grupo de Fingolfin e, enviando batedores para os procurar, ficaram a saber que tinham sido emboscados por um exército enviado por Morgoth");
                    System.out.println("No entanto, a maior parte prosseguiu para Angband quando estavam aptos e um sentimento nunca antes conhecido por qualquer elfo assombrou-os para sempre ao saber o que tinha acontecido");

                    Audio.stopMusic();
                    break;
                case 2:

                    System.out.println();
                    Vendedor vendedor2 = new Vendedor("Elu Thingol");
                    vendedor2.vender(heroi, vendedor2.criarStock(heroi));

                    System.out.println();


                    System.out.println("Assim, os Elfos dividiram-se em dois caminhos, iniciando uma era de conflito e esperança na Terra Média, onde o destino das Silmarils e do próprio mundo seria decidido.");
                    System.out.println("Depois de uma viagem longa e cheia de obstáculos, finalmente chegaram à terra Média. ");
                    System.out.println("O grupo liderado por Feanor chegou mais cedo pois era um grupo menos numeroso e movia-se com mais velocidade. \n");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Ao chegarem ao seu destino, Feanor decidiu dirigir-se imediatamente para Angband, a grande fortaleza de escuridão, onde Morgoth residia.");
                    System.out.println("Mas Morgoth sabia dos planos de Feanor e ordenou um ataque, não deixando sequer o grupo de Feanor chegar aos portões de Angband.");
                    System.out.println("Tratando-se de elfos que tinham vislumbrado a luz das árvores (Light Elfs), eram demasiado poderosos e derrotaram rapidamente o bando de Orcs e Trolls enviados por Morgoth e então seguiram para Angband. \n");


                    Audio.stopMusic();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Morgoth and the High King of Noldor [Tolkien Elvish Tale - Music]  The Silmarillion  LOTR.wav");


                    System.out.println("Mas isto foi o suficiente para Morgoth, através de espiões que estavam colocados em toda a Terra Média, " +
                            "perceber que este grupo de Feanor é pouco numeroso e que estão sedentos de vingança pelo roubo das silmarils e pelo assassinato de Finwe (pai de Feanor e de Fingolfin), " +
                            "estava muito longe do outro grupo de Elfos que eram 4 vezes mais e estavam mais calmos e com capacidade de decidir com sabedoria");
                    System.out.println("Então, enviou outro grupo de Orcs, Trolls e Goblins para atacar o grupo que estava mais longe, não para os derrotar, mas para os segurar tempo suficiente para...");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("\n=====================================================");
                    System.out.println("                  O início da Aventura                 ");
                    System.out.println("=====================================================\n");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println(heroi.getNome() + ", na tentativa de alcançar Feanor, foram embuscados por um exército numeroso enviado por Morgoth");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("Enquanto isso, o grupo de Fingolfin, após um combate árduo contra as forças enviadas por Morgoth, finalmente conseguiu derrotar os Orcs, Trolls e Goblins que tentavam atrasá-los.");
                    System.out.println("Exaustos, mas determinados, retomaram a sua marcha em direção a Angband, guiados pela esperança de se juntarem a Fëanor e aos seus filhos.");

                    System.out.println("Ao aproximarem-se da fortaleza envolta em sombras, o silêncio era estranho... opressivo.");
                    System.out.println("Não havia sinais de batalha, nem gritos de vitória, apenas o eco distante do vento nas montanhas de ferro.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("Foi então que encontraram os primeiros sinais do massacre.");
                    System.out.println("Armas partidas, vestígios de combate intenso, e por fim... os corpos de alguns dos filhos de Fëanor, gravemente feridos mas ainda vivos, incapazes de continuar a luta.");

                    System.out.println("Um deles, com as últimas forças, contou o que tinha acontecido.");
                    System.out.println("Fëanor, impaciente e consumido pela fúria, tinha avançado com os seus filhos até Angband sem esperar reforços.");
                    System.out.println("Lá, foram apanhados numa emboscada traiçoeira, enfrentando sete Balrogs liderados por Gothmog.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Os elfos de Fingolfin, outrora cheios de esperança, caíram num profundo silêncio.");
                    System.out.println("O destino de Fëanor, o mais ardente e orgulhoso dos Noldor, agora selado pelo senhor dos Balrogs, era uma ferida aberta na alma dos Elfos.");
                    System.out.println("O caminho para recuperar as Silmarils estava agora ainda mais manchado de dor, perda e sacrifício.");

                    Audio.stopMusic();
                    break;
                default:
                    System.out.println("Opção inválida, tenta outra vez.");
                    break;


            }
        } while (opcao != 1 && opcao != 2);

        System.out.println("\n=====================================================");
        System.out.println("                  A vida na Terra Média                ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        Audio.playMusic("audioFiles/Flight to the Ford.wav");

        System.out.println("Após a trágica queda de Fëanor, o teu herói, profundamente marcado pela perda e pelo caos da guerra, procurava agora um novo propósito.");
        System.out.println("Foi então que se aproximou de Turgon, filho do sábio rei Fingolfin, cuja liderança prudente e visão para o futuro começavam a inspirar esperança entre os Noldor sobreviventes.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Com o coração carregado de memórias, mas a vontade renovada, o herói ajoelhou-se perante Turgon e jurou-lhe lealdade eterna.");
        System.out.println("Turgon aceitou o juramento com gratidão e honra, reconhecendo no herói um espírito valente, digno dos maiores feitos da antiga linhagem dos Elfos.");

        System.out.println("Guiados por visões enviadas pelo próprio Vala Ulmo, Turgon conduziu o seu povo em segredo pelas vastas regiões da Terra Média até encontrarem o vale escondido de Tumladen.");
        System.out.println("Ali, rodeada por montanhas intransponíveis, ergueu-se aquela que viria a ser a mais magnífica cidade élfica alguma vez construída: Gondolin, a Cidade Oculta.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Gondolin foi erguida em segredo absoluto, protegida por encantamentos e pelas Montanhas Circundantes, invisível aos olhos dos inimigos.");
        System.out.println("Era uma joia de luz em tempos de trevas, um eco de Valinor na Terra Média, e tornou-se a esperança silenciosa dos Noldor contra o poder crescente de Morgoth.");

        System.out.println(heroi.getNome() + " agora braço-direito de Turgon, participou ativamente na construção da cidade, defendendo os trabalhadores, patrulhando os caminhos secretos e ajudando a transformar Tumladen num santuário de esplendor e segurança.");
        System.out.println("Mas, mesmo nas muralhas sagradas de Gondolin, os ventos do destino sussurravam que a paz não duraria para sempre...\n");

        int escolha;
        Audio.stopMusic();

        do {

            System.out.println("Foste convocado à presença do teu líder Turgon e tens uma escolha a fazer \n");
            System.out.println("Escolhe uma das missões\n");



            System.out.println("=== Missão 1: Caça às Sombras de Morgoth ===");
            System.out.println("Rumores chegam a Gondolin sobre bandos de Orcs, Goblins e Trolls que estão a aterrorizar as aldeias próximas.");
            System.out.println(heroi.getNome() + " é convocado para caçar estas criaturas e proteger o povo.");
            System.out.println("Prepara-te para enfrentar inimigos ferozes e garantir a segurança das terras élficas.\n");


            System.out.println();

            System.out.println("=== Missão 2: A Canção Perdida de Nevrast ===");
            System.out.println("Ulmo (um dos Valar) envia um pressentimento a Turgon: algo antigo foi deixado para trás em Vinyamar, a antiga morada costeira antes da construção de Gondolin.");
            System.out.println(heroi.getNome() + " é escolhido para uma missão secreta: retornar a Nevrast e recuperar um artefacto sagrado — um instrumento élfico que guarda a última canção das ondas, capaz de comunicar com Ulmo.");
            System.out.println("Objetivos:");
            System.out.println("- Viajar até às ruínas de Vinyamar.");
            System.out.println("- Evitar patrulhas inimigas ao longo da costa.");
            System.out.println("- Recuperar o artefacto e regressar em segurança. \n");

            System.out.println();


            System.out.println("=== Missão 3: Os Segredos de Amon Ereb ===");
            System.out.println("Mensageiros captaram rumores de que Amon Ereb é ponto de encontro de Elfos dissidentes conspirando com espiões de Morgoth.");
            System.out.println(heroi.getNome() + " deverá infiltrar-se secretamente na colina, reunir provas da traição e decidir o que fazer: reportar, confrontar ou tentar persuadir.");
            System.out.println("A missão exige furtividade, inteligência e coragem, pois serás confrontado por irmãos de sangue e enfrentarás dilemas morais profundos.\n");

            System.out.println();
            System.out.println();
            System.out.println("Pressiona enter para continuar");
            input.nextLine();


            System.out.println("1. Para escolher a 1ª missão");
            System.out.println("2. Para escolher a 2ª missão");
            System.out.println("3. Para escolher a 3ª missão");

            System.out.println();
            System.out.println();

            escolha = input.nextInt();
            switch (escolha) {
                case 1:

                    Vendedor vendedor3 = new Vendedor("Finrod Felagund");
                    vendedor3.vender(heroi, vendedor3.criarStock(heroi));

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    System.out.println("E então, " + heroi.getNome() + " saiu e dirigiu-se para norte, em direção a Dor Daedeloth. Apenas as motanhas separam esta lugar recheado de inimigos de Gondolin");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");


                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());


                    Audio.stopMusic();
                    sleep(2000);
                    Audio.playMusic("audioFiles/Morgoth and the High King of Noldor [Tolkien Elvish Tale - Music]  The Silmarillion  LOTR.wav");

                    System.out.println();

                    System.out.println("\nApós a vitória, enquanto recupera o fôlego, um mensageiro élfico aproxima-se a cavalo.");
                    System.out.println("Mensageiro de Turgon: \"Valente " + heroi.getNome() + ", tenho ordens urgentes de Gondolin!\"");
                    System.out.println("\"O Senhor Turgon convoca-te imediatamente. Abandona esta missão e regressa sem demora!\"\n");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println(heroi.getNome() + " parte a galope de volta para Gondolin, intrigado com a urgência do chamado.");

                    System.out.println("\nAo chegar a Gondolin, " + heroi.getNome() + " é levado imediatamente ao salão de Turgon, onde uma atmosfera tensa paira no ar.");
                    System.out.println("Guardas estão em alerta, conselheiros murmuram e o próprio Rei parece abalado.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("\nTurgon: \"" + heroi.getNome() + ", algo terrível aconteceu na tua ausência.\"");
                    System.out.println("Turgon: \"Descobrimos que há um traidor entre nós. Um que conhece os nossos segredos... e os revelou.\"");

                    System.out.println("\nO salão silencia-se quando o nome é pronunciado.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Turgon: \"Maeglin. O meu sobrinho. Ele desapareceu no mesmo dia em que anunciei o casamento da minha filha, Idril, com Tuor — um Homem.\"\n");

                    System.out.println("Turgon: \"Maeglin estava apaixonado por Idril... Mas ela nunca lhe correspondeu. O seu coração pertence a Tuor.\"");
                    System.out.println("Turgon: \"Envenenado pelo ciúme, Maeglin fugiu e foi capturado pelos servos de Morgoth. Levaram-no até ao próprio Senhor do Escuro.\"\n");

                    System.out.println("Turgon: \"E ali, diante do Inimigo, Maeglin traiu-nos. Revelou o que era sagrado: a localização de Gondolin.\"\n");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Turgon: \"Morgoth prometeu-lhe o impensável: que faria dele Rei de Gondolin... e que Idril seria sua.\"\n");

                    System.out.println("Todos os rostos em Gondolin estão mergulhados em choque e medo. Pela primeira vez em séculos, a cidade sagrada está em verdadeiro perigo.\n");

                    System.out.println("Turgon: \"Temos de nos preparar. A guerra aproxima-se das nossas muralhas. E tu, " + heroi.getNome() + ", serás essencial para a defesa da nossa casa.\"");
                    System.out.println("Não há tempo a perder, Temos de preparar as nossas defesas!\n");


                    Audio.stopMusic();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("\n=====================================================");
                    System.out.println("                   O cerco de Gondolin                 ");
                    System.out.println("=====================================================\n");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

                    System.out.println("O sol ainda mal nascera quando os primeiros gritos ecoaram pelas torres mais altas da cidade.");
                    System.out.println("Os sentinelas nos portões ocidentais tocaram os cornos élficos — um som agudo, rasgado pelo vento das montanhas.");

                    System.out.println("\nNos terraços, nas varandas, nos jardins suspensos — os habitantes de Gondolin reuniram-se.");
                    System.out.println("Pais agarraram os filhos, mães oraram aos Valar. Os anciãos, com olhos cheios de lágrimas, reconheciam a forma das sombras no horizonte.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("\nNo vale abaixo da cidade, uma escuridão se movia como um manto vivo. Milhares de tochas, bandeiras negras com o emblema do Olho Flamejante.");
                    System.out.println("Orcs armados, Trolls de guerra, Wargs uivantes, e até dragões avançavam em formação, liderados por capitães sombrios de Angband.");
                    System.out.println("Era o exército de Morgoth. O fim de Gondolin chegara.\n");

                    System.out.println("O medo era um veneno nos corações. Mas havia também fogo. Fogo nos olhos dos soldados, nos arcos dos arqueiros, nos cânticos élficos de coragem.");
                    System.out.println("Gondolin podia cair, mas cairia com honra.\n");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Vendedor vendedor4 = new Vendedor("Gwindor");
                    vendedor4.vender(heroi, vendedor4.criarStock(heroi));

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println(heroi.getNome() + " estava já totalmente armado, com a sua capa a esvoaçar no vento das muralhas.");
                    System.out.println("Tuor, agora general dos exércitos, ergueu a sua lança e falou aos guerreiros:");
                    System.out.println("\"Hoje, lutamos não só por uma cidade, mas pelo que ela representa. Pelo amor, pela liberdade, pela beleza que Morgoth jamais compreenderá.\"");

                    System.out.println("\nAs muralhas tremiam. As catapultas foram ativadas. Os portões trancados. Os arqueiros assumiram posição.");
                    System.out.println("E então... com um grito de guerra que rasgou os céus, os tambores de Angband rugiram. E começou a batalha por Gondolin.");


                    Audio.stopMusic();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println();
                    System.out.println();

                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Vendedor vendedor5 = new Vendedor("Caranthir");
                    vendedor5.vender(heroi, vendedor5.criarStock(heroi));


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("As ruas de Gondolin ardem. Torres desabam. O céu está coberto de cinzas.");
                    System.out.println("Crianças choram, guerreiros tombam, e a esperança parece um fio de luz prestes a apagar-se.");

                    System.out.println();
                    System.out.println("No cume de uma escadaria destruída, à saída do Túnel das Águias, onde muitos civis tentam fugir da cidade em ruínas...");
                    System.out.println("...ele surge.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Glorfindel and Balrog  - The Silmarillion Soundtrack by Bugra Gokce  No Copyright Music.wav");

                    System.out.println("Gothmog, Senhor dos Balrogs. Com chamas por pele e ódio por alma.");
                    System.out.println("O arauto da destruição de Morgoth, o assassino de Fëanor e de Fingon.");
                    System.out.println("Empunha um machado negro e um chicote ardente que crepita com o sangue dos Valar.");

                    System.out.println();
                    System.out.println("As hostes élficas recuam. O medo paralisa até os mais bravos. Mas " + heroi.getNome() + " permanece.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Turgon já tombou. Idril e Tuor lideram os refugiados. E o caminho de fuga será perdido se Gothmog avançar.");
                    System.out.println("Sem hesitar, " + heroi.getNome() + " interpõe-se diante do monstro. A sua espada brilha como uma estrela caída.\n");
                    System.out.println("O combate começa. Fogo contra luz. Sombra contra coragem.");
                    System.out.println("Gothmog ruge e investe, a sua lâmina quebra pedras e o seu chicote devora ar e terra.");

                    System.out.println(heroi.getNome() + " esquiva, fere, recua, ataca. Ambos se enfrentam como tempestades em colisão.");
                    System.out.println("A batalha dura como se o tempo estivesse suspenso, e o mundo observasse, em silêncio.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateBossArqFeiti(FabricaPersonagens.criarBalrog());
                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Por fim, ambos estão feridos. A escada sobre o abismo começa a ruir.");
                    System.out.println("Num último ato de bravura, " + heroi.getNome() + " finca a espada no peito de Gothmog e avança com ele, num abraço final de destruição.");

                    System.out.println();
                    System.out.println("Ambos tombam no abismo. Fogo e luz desaparecem no vazio.");

                    System.out.println();
                    System.out.println("Silêncio.");

                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Valinor.wav");

                    System.out.println("E então — das alturas — as Grandes Águias surgem, em lamento e glória.");
                    System.out.println("Elas recuperam o corpo de " + heroi.getNome() + " e levam-no para os céus, envolto em honra e luz.");

                    System.out.println();
                    System.out.println("Ele caiu... mas salvou Gondolin.");
                    System.out.println("O seu nome será lembrado enquanto as estrelas cantarem.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    break;

                case 2:


                    System.out.println();
                    Vendedor vendedor6 = new Vendedor("Curufin");
                    vendedor6.vender(heroi, vendedor6.criarStock(heroi));

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    System.out.println();

                    System.out.println("E então, " + heroi.getNome() + " saiu e dirigiu-se para Oeste, em direção a Vinyamar. O caminho é longo e " + heroi.getNome() + " decidiu parar em Dor-lómin para passar a noite. Noite essa, que de pacífico, nada teve");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());
                    System.out.println();

                    Audio.stopMusic();
                    sleep(2000);
                    Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

                    System.out.println(heroi.getNome() + " finalmente chega às ruínas silenciosas de Vinyamar.");
                    System.out.println("Ao tocar nas cordas do antigo instrumento élfico, uma melodia etérea ecoa, e uma mensagem mágica, enviada por Ulmo, se revela, destinada a Turgon:");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Ulmo (na mensagem): \"Turgon, meu aliado e rei de Gondolin, ouve minha palavra urgente.\"");
                    System.out.println("Ulmo: \"Maeglin, teu sobrinho, caiu na sombra da traição.\"");
                    System.out.println("Ulmo: \"Seu coração, consumido pelo ciúme por Idril, que ama Tuor, levou-o a entregar os segredos sagrados do teu reino a Morgoth.\"");
                    System.out.println("Ulmo: \"Enfeitiçado pelas promessas de Morgoth, ele revelou o esconderijo de Gondolin, pondo em perigo toda a tua gente.\"");
                    System.out.println("Ulmo: \"Agora, mais do que nunca, precisas ser avisado. É dever deste mensageiro, "
                            + heroi.getNome() + ", partir imediatamente para Gondolin e alertar-te para que prepareis a defesa.\"");
                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.stopMusic();

                    System.out.println("A canção termina e " + heroi.getNome() + " sente o peso da urgência — o destino de Gondolin está nas suas mãos.\n");

                    Vendedor vendedor7 = new Vendedor("Lúthien Tinuviel");
                    vendedor7.vender(heroi, vendedor7.criarStock(heroi));


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("O regresso a Gondolin foi tão complicado como a viagem até Vinyamar");

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());
                    System.out.println();


                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

                    System.out.println(heroi.getNome() + " chega finalmente a Gondolin e encontra Turgon.");
                    System.out.println(heroi.getNome() + " relata com urgência tudo o que descobriu em Vinyamar:");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println(heroi.getNome() + ": \"Majestade, Ulmo enviou-me uma mensagem através do antigo instrumento élfico. Maeglin traiu-vos, entregando os segredos de Gondolin a Morgoth por ciúmes de Idril.\"");
                    System.out.println(heroi.getNome() + ": \"Ele foi seduzido pelo poder e promessas do Senhor do Escuro, e agora a segurança da cidade está ameaçada.\"");

                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Turgon, com semblante grave, responde:");
                    System.out.println("Turgon: \"Agradeço-te, bravo " + heroi.getNome() + ". Este aviso chega em tempo crucial.\"");
                    System.out.println("Turgon: \"Graças à tua coragem e rapidez, podemos reforçar as defesas e preparar Gondolin para a tempestade que se aproxima.\"");
                    System.out.println("Turgon: \"Que os Valar guiem os teus passos nesta batalha que decidirá o nosso destino e de toda a Terra Média.\"");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("\n=====================================================");
                    System.out.println("                   O cerco de Gondolin                 ");
                    System.out.println("=====================================================\n");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("O sol ainda mal nascera quando os primeiros gritos ecoaram pelas torres mais altas da cidade.");
                    System.out.println("Os sentinelas nos portões ocidentais tocaram os cornos élficos — um som agudo, rasgado pelo vento das montanhas.");

                    System.out.println("\nNos terraços, nas varandas, nos jardins suspensos — os habitantes de Gondolin reuniram-se.");
                    System.out.println("Pais agarraram os filhos, mães oraram aos Valar. Os anciãos, com olhos cheios de lágrimas, reconheciam a forma das sombras no horizonte.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("\nNo vale abaixo da cidade, uma escuridão se movia como um manto vivo. Milhares de tochas, bandeiras negras com o emblema do Olho Flamejante.");
                    System.out.println("Orcs armados, Trolls de guerra, Wargs uivantes, e até dragões avançavam em formação, liderados por capitães sombrios de Angband.");
                    System.out.println("Era o exército de Morgoth. O fim de Gondolin chegara.\n");

                    System.out.println("O medo era um veneno nos corações. Mas havia também fogo. Fogo nos olhos dos soldados, nos arcos dos arqueiros, nos cânticos élficos de coragem.");
                    System.out.println("Gondolin podia cair, mas cairia com honra.\n");

                    Vendedor vendedor8 = new Vendedor("Beleg Cuthalion");
                    vendedor8.vender(heroi, vendedor8.criarStock(heroi));


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println();

                    System.out.println(heroi.getNome() + " estava já totalmente armado, com a sua capa a esvoaçar no vento das muralhas.");
                    System.out.println("Tuor, agora general dos exércitos, ergueu a sua lança e falou aos guerreiros:");
                    System.out.println("\"Hoje, lutamos não só por uma cidade, mas pelo que ela representa. Pelo amor, pela liberdade, pela beleza que Morgoth jamais compreenderá.\"");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("\nAs muralhas tremiam. As catapultas foram ativadas. Os portões trancados. Os arqueiros assumiram posição.");
                    System.out.println("E então... com um grito de guerra que rasgou os céus, os tambores de Angband rugiram. E começou a batalha por Gondolin.");

                    Audio.stopMusic();
                    sleep(2000);

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());
                    System.out.println();


                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("As ruas de Gondolin ardem. Torres desabam. O céu está coberto de cinzas.");
                    System.out.println("Crianças choram, guerreiros tombam, e a esperança parece um fio de luz prestes a apagar-se.\n");

                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Vendedor vendedor9 = new Vendedor("Ecthelion");
                    vendedor9.vender(heroi, vendedor9.criarStock(heroi));

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("No cume de uma escadaria destruída, à saída do Túnel das Águias, onde muitos civis tentam fugir da cidade em ruínas...");
                    System.out.println("...ele surge.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Audio.playMusic("audioFiles/Glorfindel and Balrog  - The Silmarillion Soundtrack by Bugra Gokce  No Copyright Music.wav");

                    System.out.println("Gothmog, Senhor dos Balrogs. Com chamas por pele e ódio por alma.");
                    System.out.println("O arauto da destruição de Morgoth, o assassino de Fëanor e de Fingon.");
                    System.out.println("Empunha um machado negro e um chicote ardente que crepita com o sangue dos Valar.");

                    System.out.println();
                    System.out.println("As hostes élficas recuam. O medo paralisa até os mais bravos. Mas " + heroi.getNome() + " permanece.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Turgon já tombou. Idril e Tuor lideram os refugiados. E o caminho de fuga será perdido se Gothmog avançar.");
                    System.out.println("Sem hesitar, " + heroi.getNome() + " interpõe-se diante do monstro. A sua espada brilha como uma estrela caída.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("O combate começa. Fogo contra luz. Sombra contra coragem.");
                    System.out.println("Gothmog ruge e investe, a sua lâmina quebra pedras e o seu chicote devora ar e terra.");
                    System.out.println(heroi.getNome() + " esquiva, fere, recua, ataca. Ambos se enfrentam como tempestades em colisão.");
                    System.out.println("A batalha dura como se o tempo estivesse suspenso, e o mundo observasse, em silêncio.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateBossArqFeiti(FabricaPersonagens.criarBalrog());
                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Por fim, ambos estão feridos. A escada sobre o abismo começa a ruir.");
                    System.out.println("Num último ato de bravura, " + heroi.getNome() + " finca a espada no peito de Gothmog e avança com ele, num abraço final de destruição.");

                    System.out.println();
                    System.out.println("Ambos tombam no abismo. Fogo e luz desaparecem no vazio.");

                    System.out.println();
                    System.out.println("Silêncio.");


                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Valinor.wav");

                    System.out.println("E então — das alturas — as Grandes Águias surgem, em lamento e glória.");
                    System.out.println("Elas recuperam o corpo de " + heroi.getNome() + " e levam-no para os céus, envolto em honra e luz.");

                    System.out.println();
                    System.out.println("Ele caiu... mas salvou Gondolin.");
                    System.out.println("O seu nome será lembrado enquanto as estrelas cantarem.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    break;

                case 3:


                    System.out.println();
                    Vendedor vendedor10 = new Vendedor("Idril Celebrindal");
                    vendedor10.vender(heroi, vendedor10.criarStock(heroi));

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("E então, " + heroi.getNome() + " saiu e dirigiu-se para Este, em direção a Amon Ereb. O caminho é longo e " + heroi.getNome() + "decidiu atravessar o rio Sirion para chegar ao seu destino mais rápido. Talvez, tenha cometido um erro grave");

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());
                    System.out.println();

                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

                    System.out.println(heroi.getNome() + " chega discretamente a Amon Ereb, oculto pelas sombras da noite.");
                    System.out.println("Após ouvir conversas sussurradas e interceptar uma reunião secreta, uma verdade inquietante vem à tona:");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Alguns dos filhos de Fëanor — ainda consumidos pela sua jura sagrada — acreditam que uma das Silmarils foi roubada de Morgoth e levada para Vinyamar.");
                    System.out.println("Convencidos de que o artefacto sagrado se encontra escondido nas ruínas costeiras, planeiam lançar um ataque imediato.");
                    System.out.println("Não lhes importa quem a possui, nem se o guardião é inocente — a Silmaril deve ser entregue... ou haverá morte.");
                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println(heroi.getNome() + " sabe agora que uma nova ameaça paira sobre o mundo livre — e que as consequências podem ser devastadoras.");


                    System.out.println(heroi.getNome() + " sente o peso da revelação sobre os ombros.\n");

                    Audio.stopMusic();

                    Vendedor vendedor11 = new Vendedor("Angrod");
                    vendedor11.vender(heroi, vendedor11.criarStock(heroi));
                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("A conspiração em Amon Ereb é mais perigosa do que se imaginava — um ataque contra Vinyamar pode pôr em risco os últimos segredos dos elfos e provocar guerra entre irmãos.");
                    System.out.println("Sem tempo a perder, " + heroi.getNome() + " parte imediatamente em direção a Gondolin, atravessando montanhas e vales ocultos pelo véu da noite.");

                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());
                    System.out.println();

                    Audio.stopMusic();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Audio.playMusic("audioFiles/Lind Erebros - Noldor.wav");

                    System.out.println("Ao chegar a Gondolin, é imediatamente conduzido até o trono de Turgon.");

                    System.out.println(heroi.getNome() + ": \"Majestade, trago notícias urgentes de Amon Ereb. Alguns dos filhos de Fëanor acreditam que uma das Silmarils está escondida em Vinyamar.\"");
                    System.out.println(heroi.getNome() + ": \"Eles planeiam atacar, e nada os impedirá — querem recuperar a jóia, custe o que custar.\"");

                    System.out.println();
                    System.out.println("Turgon levanta-se, visivelmente perturbado com a notícia.");

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("Turgon: \"Mesmo entre os nossos, a obsessão pelas Silmarils ainda queima como um fogo insaciável...\"");
                    System.out.println("Turgon: \"Se o que dizes for verdade, Vinyamar corre perigo. Mas mais ainda: a frágil união entre os Noldor poderá ruir.\"");
                    System.out.println("Turgon: \"Agradeço-te, " + heroi.getNome() + ". Mais uma vez, trouxeste-nos aviso em hora oportuna.\"");
                    System.out.println("Turgon: \"Mandaremos vigias às costas e prepararemos uma resposta... mas talvez ainda haja tempo para evitar o confronto.\"");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("O destino agora depende de decisões delicadas... e da coragem de quem ousa interceder entre antigos aliados à beira da guerra.");

                    System.out.println("Turgon convoca os capitães e prepara um exército para marchar até Vinyamar.");
                    System.out.println("A ordem é clara: proteger as antigas ruínas e evitar um conflito com os filhos de Fëanor — ou, se necessário, enfrentá-los.");
                    System.out.println(heroi.getNome() + " acompanha a força expedicionária, ciente de que os ventos da guerra começam a soprar com força sobre Beleriand.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("\n=====================================================");
                    System.out.println("                   O cerco de Gondolin                 ");
                    System.out.println("=====================================================\n");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Mas antes mesmo de partirem... os sinos da cidade soam com urgência.");
                    System.out.println("Sentinelas correm pelas muralhas. O céu escurece com uma névoa densa e antinatural.");
                    System.out.println("Todos se voltam para os portões... e então veem o que ninguém ousava imaginar:");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("O exército de Morgoth, incontável e envolto em sombras, marcha sobre Gondolin.");
                    System.out.println("Tambores de guerra ecoam pelos vales ocultos. Trolls, orcs, lobos e criaturas de ferro avançam como uma maré negra.");
                    System.out.println("Dragões rugem nas alturas, enquanto estandartes do Senhor do Escuro tremulam entre as fileiras inimigas.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println("Turgon, com o rosto endurecido pela dor e pelo destino, murmura:");

                    System.out.println("Turgon: \"Não marcharemos para Vinyamar. O destino veio até nós.\"");
                    System.out.println("Turgon: \"Homens e elfos, preparem-se. Gondolin deve resistir — ou cairá como lenda.\"");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Vendedor vendedor12 = new Vendedor("Orodreth");
                    vendedor12.vender(heroi, vendedor12.criarStock(heroi));

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println();
                    System.out.println(heroi.getNome() + " empunha a sua arma. O tempo de decisões terminou. A batalha pela sobrevivência de Gondolin começou.");

                    Audio.stopMusic();
                    sleep(2000);
                    Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack.wav");


                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");


                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

                    Audio.stopMusic();

                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    Vendedor vendedor13 = new Vendedor("Celegorn");
                    vendedor13.vender(heroi, vendedor13.criarStock(heroi));

                    System.out.println();

                    System.out.println("As ruas de Gondolin ardem. Torres desabam. O céu está coberto de cinzas.");
                    System.out.println("Crianças choram, guerreiros tombam, e a esperança parece um fio de luz prestes a apagar-se.");

                    System.out.println();
                    System.out.println("No cume de uma escadaria destruída, à saída do Túnel das Águias, onde muitos civis tentam fugir da cidade em ruínas...");
                    System.out.println("...ele surge.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Audio.playMusic("audioFiles/Glorfindel and Balrog  - The Silmarillion Soundtrack by Bugra Gokce  No Copyright Music.wav");

                    System.out.println("Gothmog, Senhor dos Balrogs. Com chamas por pele e ódio por alma.");
                    System.out.println("O arauto da destruição de Morgoth, o assassino de Fëanor e de Fingon.");
                    System.out.println("Empunha um machado negro e um chicote ardente que crepita com o sangue dos Valar.");

                    System.out.println();
                    System.out.println("As hostes élficas recuam. O medo paralisa até os mais bravos. Mas " + heroi.getNome() + " permanece.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println();
                    System.out.println("Turgon já tombou. Idril e Tuor lideram os refugiados. E o caminho de fuga será perdido se Gothmog avançar.");
                    System.out.println("Sem hesitar, " + heroi.getNome() + " interpõe-se diante do monstro. A sua espada brilha como uma estrela caída.");


                    System.out.println();
                    System.out.println("O combate começa. Fogo contra luz. Sombra contra coragem.");
                    System.out.println("Gothmog ruge e investe, a sua lâmina quebra pedras e o seu chicote devora ar e terra.");
                    System.out.println(heroi.getNome() + " esquiva, fere, recua, ataca. Ambos se enfrentam como tempestades em colisão.");
                    System.out.println("A batalha dura como se o tempo estivesse suspenso, e o mundo observasse, em silêncio.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

                    heroi.combateBossArqFeiti(FabricaPersonagens.criarBalrog());
                    System.out.println();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    System.out.println();
                    System.out.println("Por fim, ambos estão feridos. A escada sobre o abismo começa a ruir.");
                    System.out.println("Num último ato de bravura, " + heroi.getNome() + " finca a espada no peito de Gothmog e avança com ele, num abraço final de destruição.");

                    System.out.println();
                    System.out.println("Ambos tombam no abismo. Fogo e luz desaparecem no vazio.");

                    System.out.println();
                    System.out.println("Silêncio.");


                    Audio.stopMusic();


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();


                    Audio.playMusic("audioFiles/Valinor.wav");

                    System.out.println("E então — das alturas — as Grandes Águias surgem, em lamento e glória.");
                    System.out.println("Elas recuperam o corpo de " + heroi.getNome() + " e levam-no para os céus, envolto em honra e luz.");

                    System.out.println();
                    System.out.println("Ele caiu... mas salvou Gondolin.");
                    System.out.println("O seu nome será lembrado enquanto as estrelas cantarem.");


                    System.out.println();
                    System.out.println();
                    System.out.println("Pressiona enter para continuar");
                    input.nextLine();

                    break;
                default:
                    System.out.println("Tens de escolher uma destas missões. Ordens de Turgon. tenta outra vez.");
            }

        } while (escolha != 1 && escolha != 2 && escolha != 3);


        System.out.println("Gondolin caiu.");
        System.out.println("As muralhas foram consumidas pelas chamas.");
        System.out.println("As torres douradas, antes símbolo de beleza e resistência, ruíram sob o peso do ódio de Morgoth.");
        System.out.println("Mas... não caiu em vão.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("O sacrifício de " + heroi.getNome() + ", que enfrentou Gothmog e salvou a fuga de Idril, Tuor e seu filho Eärendil, garantiu que a semente da esperança sobrevivesse.");
        System.out.println("Idril guiou os sobreviventes por um caminho secreto até as costas esquecidas de Sirion.");
        System.out.println("E ali, longe das sombras de Angband, nasceu um plano mais antigo que o próprio medo.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Eärendil, filho de Tuor e Idril — herdeiro de Elfos e Homens — cresceu ouvindo as histórias do herói que enfrentou o Balrog.");
        System.out.println("Inspirado por essa coragem, ele embarcará um dia numa jornada até Valinor.");
        System.out.println("Uma jornada impossível, para rogar aos Valar que olhem novamente para a Terra-média... e ajudem contra a escuridão eterna de Morgoth.");

        System.out.println();
        System.out.println("Foi graças à resistência de Gondolin, e ao tempo comprado com sangue e bravura, que Eärendil teve tempo de crescer, aprender... e partir.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("E quando os Valar finalmente escutarem o seu apelo, lançarão a Guerra da Ira.");
        System.out.println("Será o fim de Morgoth, o Senhor do Escuro.");
        System.out.println("Mas tudo começou ali — nas ruínas de Gondolin, na coragem de um herói, e no último grito de luz contra a escuridão.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("O nome de " + heroi.getNome() + " será sussurrado pelas ondas, gravado nas estrelas, e cantado em todas as línguas livres.");
        System.out.println("Pois ele não salvou apenas uma cidade.");
        System.out.println("Ele deu ao mundo... tempo suficiente para a esperança vencer.\n");

        Audio.stopMusic();
        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("\n=====================================================");
        System.out.println("                  O fim da primeira Era                ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("E assim terminou a Primeira Era da Terra-média.");
        System.out.println("A Guerra da Ira, liderada pelos exércitos dos Valar, pelos Vanyar, pelos Maiar e pelos elfos exilados, esmagou as legiões de Morgoth.");
        System.out.println("Angband foi destruída, e Morgoth, acorrentado com grilhões de eterna humilhação, foi lançado para fora dos círculos do mundo.");
        System.out.println("A Terra-média sofreu, mas sobreviveu.");
        System.out.println("Tudo isso — por causa do tempo ganho pela coragem de Gondolin... e pelo sacrifício de um herói.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("\n=====================================================");
        System.out.println("                   O Retorno do Herói                  ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("Muito tempo depois, nas sagradas terras de Valinor, entre os salões de Mandos, ecoa um nome há muito silenciado.");
        System.out.println("Os Valar reúnem-se. Ulmo fala em sua defesa. Varda recorda-lhe a luz que carregava no coração. Manwë ouve, em silêncio.");

        System.out.println();
        System.out.println("E então, por decreto dos Valar, e por graça de Eru, o espírito de " + heroi.getNome() + " é libertado dos Salões do Silêncio.");
        System.out.println("Não como castigo, mas como recompensa.");
        System.out.println("Pois sua alma enfrentou as trevas sem cair na tentação, e o seu coração ardeu mais puro do que o fogo do Inimigo.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("O herói desperta em paz, sob a luz dourada de Aman.");
        System.out.println("O seu corpo é restaurado, purificado da dor e das chamas.");
        System.out.println("Ele vive novamente — não como apenas um guerreiro, mas como um ser de nobreza imortal.");

        System.out.println();
        System.out.println("As águias sobrevoam as planícies verdes. Os elfos cantam o seu nome.");
        System.out.println("E os próprios Valar, em honra rara, inclinam a cabeça àquele que tombou por todos.");

        System.out.println();
        System.out.println("O tempo dos contos antigos terminou... mas o destino de " + heroi.getNome() + " ainda está por ser escrito.");
        System.out.println("Pois na Terra-média, outras sombras um dia virão — e ele poderá ser chamado... mais uma vez.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        Audio.stopMusic();


        System.out.println("\n=====================================================");
        System.out.println("       A terceira era - de volta à Terra Média         ");
        System.out.println("=====================================================\n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/Flight to the Ford.wav");

        System.out.println("Muitos séculos passaram desde a queda de Morgoth.");
        System.out.println(heroi.getNome() + " viveu em paz em Valinor por um tempo, contemplando os jardins de Lórien e as estrelas de Varda.");
        System.out.println("Mas o mal nunca dorme eternamente.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Quando os ecos de uma nova sombra começaram a surgir na Terra-média, os Valar olharam novamente para o Oeste.");
        System.out.println("E mais uma vez, como Glorfindel antes dele, " + heroi.getNome() + " foi enviado de volta aos reinos dos Homens e Elfos.");
        System.out.println("Não como guerreiro comum — mas como um guardião, um sinal de que a luz ainda resistia.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Estabeleceu-se em Imladris, o Vale Escondido conhecido pelos Homens como Rivendell.");
        System.out.println("Lá, foi acolhido por Elrond Peredhel, Senhor de Rivendell, filho de Eärendil — o próprio que fora salvo pelos feitos heroicos de Gondolin.");
        System.out.println(heroi.getNome() + " tornou-se conselheiro, mestre de história e defensor do norte, sempre atento às sombras que se moviam a leste.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println();
        System.out.println("Estamos agora no ano 3018 da Terceira Era.\n");
        System.out.println();

        Audio.stopMusic();

        Vendedor vendedor14 = new Vendedor("Cirdan");
        vendedor14.vender(heroi, vendedor14.criarStock(heroi));

        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("As florestas tremem com presságios antigos. Criaturas das trevas percorrem as estradas sob disfarce.");
        System.out.println("O Um Anel foi encontrado. A sombra cresce em Mordor.");
        System.out.println("Um novo Senhor do Escuro tomou o lugar de Morgoth.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/The Lord of the Rings - MordorSaurons Theme.wav");

        System.out.println();
        System.out.println("O seu nome é Sauron — o antigo tenente de Angband, o artífice dos Anéis de Poder.");
        System.out.println("Ele ergueu a Torre Negra de Barad-dûr, reuniu exércitos imensos, e agora procura dominar tudo o que ainda resiste.");

        System.out.println();
        System.out.println("E assim, o mal continua na Terra-média.");
        System.out.println("Mas enquanto houver um nome como " + heroi.getNome() + " nos contos dos justos...");
        System.out.println("...há esperança e " + heroi.getNome() + " saiu para caçar todas as criaturas que encontrar que prestam devoção a Sauron");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        Audio.stopMusic();
        sleep(2000);
        Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack \uD83C\uDF32.wav");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());
        System.out.println();

        Audio.stopMusic();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/The House of Elrond.wav");

        System.out.println(heroi.getNome() + " regressa a Rivendell após semanas a caçar orcs nas montanhas e florestas do norte.");
        System.out.println("O seu manto está sujo, a sua lâmina ainda brilha com o sangue dos servos de Sauron.");
        System.out.println("Mas assim que atravessa os portões da Última Casa Amiga do Oeste, um mensageiro élfico aproxima-se apressadamente.");

        System.out.println("\"Elrond deseja falar contigo imediatamente,\" diz ele com urgência.");
        System.out.println(heroi.getNome() + " segue pelos corredores de mármore e salões cheios de canto, até o grande salão de audiências.");

        System.out.println();
        System.out.println("Elrond ergue-se da cadeira alta, com um olhar solene e distante.");
        System.out.println("Ele fala com voz grave, carregada de séculos de sabedoria:");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Elrond: \"Recebi um sinal. Um pressentimento vindo de muito além das montanhas — talvez dos próprios Valar.\"");
        System.out.println("Elrond: \"O destino da Terra-média está prestes a ser selado. E Rivendell... tem um papel a cumprir.\"");
        System.out.println("Elrond: \"Há um pequeno povo, os Hobbits, que vivem pacificamente no oeste, no Shire. Poucos fora conhecem a sua terra.\"");

        System.out.println();
        System.out.println("Elrond: \"Mas um deles carrega agora um fardo maior do que qualquer guerreiro. E forças negras já o procuram.\"");
        System.out.println("Elrond: \"Preciso que vás ao seu encontro. Protege-o. Guia-o até aqui — até Rivendell.\"");
        System.out.println("Elrond: \"Este hobbit deve chegar em segurança, pois com ele... caminha o destino de todos os povos livres.\"");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println();
        System.out.println(heroi.getNome() + " inclina a cabeça em sinal de respeito. Ele não faz perguntas.");
        System.out.println("As palavras de Elrond são claras, e o seu dever está traçado.\n");

        Audio.stopMusic();


        Vendedor vendedor15 = new Vendedor("Elladan");
        vendedor15.vender(heroi, vendedor15.criarStock(heroi));

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();


        System.out.println("Sem demora, o herói parte novamente — desta vez, rumo ao Shire, rumo ao centro de uma história maior do que qualquer outra.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/Pendor Noldor Battle Theme  Epic Fantasy Order Soundtrack \uD83C\uDF32.wav");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateNormalArqFeiti(FabricaPersonagens.inimigoAleatorio());
        System.out.println();


        Audio.stopMusic();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("\n=====================================================");
        System.out.println("                O encontro em Amon Sûl                 ");
        System.out.println("=====================================================\n");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Vendedor vendedor16 = new Vendedor("Elrohir");
        vendedor16.vender(heroi, vendedor16.criarStock(heroi));


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        Audio.playMusic("audioFiles/The Revelation of the Ringwraiths.wav");

        System.out.println();

        System.out.println("Após dias de caminhos sinuosos e perigos inesperados, " + heroi.getNome() + " chega às ruínas antigas de Amon Sûl, também conhecida como Weathertop.");
        System.out.println("Ali, oculto pelas sombras, ele avista um grupo de viajantes — um Homem e quatro pequenos hobbits, acampados precariamente sob as pedras partidas da antiga torre.");
        System.out.println("Mas algo mais se move nas redondezas... formas escuras e silenciosas. Sete Nazgûl percorrem os vales próximos, em busca da presa.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println(heroi.getNome() + " não hesita. Mantendo-se invisível aos olhos dos inimigos, aproxima-se do acampamento silenciosamente.");
        System.out.println("Ao chegar, depara-se com um dos hobbits ferido, respirando com dificuldade, pálido como a morte.");

        System.out.println("A lâmina que o feriu — uma Morgul blade. O veneno já começa a tomar o seu espírito.");
        System.out.println(heroi.getNome() + " tenta estabilizá-lo, aplicar ervas e cânticos élficos... mas sente que a escuridão cresce dentro da ferida.");
        System.out.println("Só Elrond, Senhor de Rivendell, tem poder suficiente para salvá-lo.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Mas um pensamento atravessa-lhe a mente: \"Qual deles é o hobbit que devo proteger? Quem é o portador?\"");
        System.out.println("Antes que possa decidir, o Homem aproxima-se — imponente, olhos como aço sob o capuz.");

        System.out.println("Homem: \"Paz, meu amigo. Sou Aragorn, filho de Arathorn. E tu não és estranho para mim.\"");
        System.out.println("Aragorn: \"Elrond falou-me da tua missão. E sei quem procuras.\"");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Aragorn aponta para o ferido: \"Este é Frodo, do Shire. Ele carrega mais do que ferimentos — carrega o destino do mundo.\"");

        System.out.println(heroi.getNome() + " reconhece a verdade no olhar do homem que cresceu como irmão em Rivendell. Não há mais dúvida.");
        System.out.println("Sem perder tempo, prepara o cavalo, envolve Frodo num manto élfico e monta com ele à frente da sela.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Mas mal começa a descer a encosta, um grito agudo corta os céus — os Nazgûl sentiram o movimento.");
        System.out.println("As sombras começam a persegui-lo, vozes espectrais ecoam pela noite.");
        System.out.println("Por sorte, 3 espectros perseguem Aragorn e os restantes Hobbits e apenas 4 espectros do anel estão em perseguição de " + heroi.getNome() + ", determinados a recuperar o seu alvo a qualquer custo.");

        System.out.println();
        System.out.println("A corrida desesperada começa. Os ventos fustigam, a estrada torna-se traiçoeira, e Frodo delira entre a vida e a morte.");

        System.out.println("Conseguirá " + heroi.getNome() + " cumprir a sua missão?");
        System.out.println("Ou cairá nas mãos dos espectros, como tantos antes dele?");
        System.out.println("O destino da Terra-média cavalga pela noite...");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("A cavalgada foi longa e desesperada. Os Nazgûl aproximavam-se cada vez mais, os seus gritos gelavam o sangue, e Frodo gemia entre o delírio e o silêncio da morte iminente.");

        System.out.println(heroi.getNome() + " sabia que não podia chegar a Rivendell com os espectros à sua sombra.");
        System.out.println("Então, nas colinas junto ao Bruinen, virou-se para enfrentar o destino.");

        System.out.println();
        System.out.println("Com coragem inabalável, desembainhou a sua lâmina — forjada com bênçãos de Valinor — e ergueu a voz num antigo cântico de poder élfico.");
        System.out.println("As sombras hesitaram... mas atacaram.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Durante o calvagar pela noite, um Nazgul aproxima-se demasiado e um combate começa");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateBossArqFeiti(FabricaPersonagens.criarNazgul());
        System.out.println();

        System.out.println("Com o atraso da batalha, estás a ser mais fácil de alcançar. Outro Nazgul aproveita");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateBossArqFeiti(FabricaPersonagens.criarNazgul());
        System.out.println();

        System.out.println("Estás exausto, mas eles não podem vencer. Não enquanto o teu sangue fluir. Estás quase a conseguir chegar a Rivendell");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateBossArqFeiti(FabricaPersonagens.criarNazgul());
        System.out.println();

        System.out.println("No desespero, não havia outro plano senão este, para os espectros. A última cartada e mais poderosa. O rei bruxo de Angmar é o teu próximo oponente");

        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");

        heroi.combateBossArqFeiti(FabricaPersonagens.criarWitchKing());
        System.out.println();


        Audio.stopMusic();


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("O confronto foi feroz. Raios cruzavam os céus e a terra tremia com a presença dos Nazgûl.");
        System.out.println("Mas " + heroi.getNome() + " era mais do que um guerreiro. Era um enviado dos Valar. Um defensor da luz em tempos de trevas.");
        System.out.println("Com golpes certeiros, coragem feroz e a proteção dos Valar, derrotou os espectros, dispersando-os temporariamente para as sombras de onde vieram.");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println();
        System.out.println("Frodo, ainda inconsciente, tremia nos seus braços.");
        System.out.println("Sem tempo a perder, montou novamente e correu pelos últimos caminhos escondidos, atravessando o Bruinen quando as águas já começavam a cantar os feitiços de proteção de Elrond.");

        Audio.playMusic("audioFiles/The Fellowship of the Ring Soundtrack-09-Many Meetings.wav");

        System.out.println();
        System.out.println("Em segurança, finalmente atravessou os portões de Rivendell.");
        System.out.println("Elfos correram ao seu encontro, levando Frodo às câmaras de cura, onde Elrond o esperava.");
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Elrond: \"Fizeste mais do que cumprir o teu dever. Salvaste a esperança do nosso mundo.\"");
        System.out.println(heroi.getNome() + " nada disse. Apenas assentiu, com o coração pesado mas aliviado. A primeira batalha estava vencida.");
        System.out.println("Mas a guerra... ainda estava por começar.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();


        System.out.println("\n=====================================================");
        System.out.println("        Conselho de Elrond e a Irmandade do Anel       ");
        System.out.println("=====================================================\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();



        System.out.println("Nas câmaras mais antigas de Rivendell, reuniram-se representantes de todos os povos livres: Elfos, Homens, Anões e Hobbits.");
        System.out.println("Ali, foi decidido que o Um Anel, forjado por Sauron no coração de Mordor, deveria ser destruído.");
        System.out.println("Nas chamas da Montanha da Perdição, onde fora criado, seria também o seu fim.");
        System.out.println("Foi formada uma Irmandade: nove companheiros, para se opor aos nove Nazgûl. E juntos partiram para a longa jornada até à Terra Negra.");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        Audio.stopMusic();

        System.out.println();
        System.out.println("Meses se passaram. As sombras cresceram. As esperanças diminuíram.");
        System.out.println("Até que, certo dia, um mensageiro vindo de Lothlórien chegou a Rivendell, esgotado e ferido.");
        System.out.println("O seu rosto estava pálido e as palavras, tremendo:");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println();
        System.out.println("Mensageiro: \"O pior aconteceu. Sauron não planeia apenas atacar Gondor e Minas Tirith.\"");
        System.out.println("Mensageiro: \"Ele convocou vastos exércitos de Orcs, Homens do Leste e criaturas das trevas para atacar as cidades do norte: Erebor, Mirkwood... e Lothlórien.\"");
        System.out.println("Mensageiro: \"Quer enfraquecer os povos livres. Impedi-los de enviar reforços a Gondor.\"");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println();
        System.out.println("Elrond ergue-se. O seu rosto permanece sereno, mas os seus olhos ardem com a antiga luz de Valinor.");
        System.out.println("Elrond: \"Então chegou a hora. As florestas sagradas de Lothlórien não cairão sem resposta. Galadriel, filha de Finarfin (irmão de Fingolfin e Feanor, precisa de nós.\"");

        System.out.println();
        System.out.println("Sem demora, " + heroi.getNome() + " prepara as suas armas.");
        System.out.println("Centenas de Elfos do Vale de Imladris respondem ao chamado. Armados com espadas, arcos e canções de guerra antigas, montam os seus cavalos.");
        System.out.println();

        Vendedor vendedor17 = new Vendedor("Celebrian");
        vendedor17.vender(heroi, vendedor17.criarStock(heroi));

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("O estandarte de Rivendell tremula ao vento, com a estrela de Elrond brilhando sob o céu cinzento.");
        System.out.println(heroi.getNome() + " lidera uma das vanguardas. Os seus olhos estão fixos na direção sul — rumo a Lothlórien, rumo ao combate contra as trevas de Dol Guldur.");

        System.out.println();
        System.out.println("O destino chama novamente. E desta vez, a floresta dourada precisa dos seus defensores.\n");


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println();

        System.out.println(heroi.getNome() + " cavalga sem descanso, guiado por urgência e esperança.");
        System.out.println("Quando finalmente alcança os limites de Lothlórien, o que vê corta-lhe o fôlego.");





        System.out.println();
        System.out.println("A floresta outrora dourada está envolta em fumo e sombras.");
        System.out.println("As árvores antigas — mallorn dourados — ardem em chamas prateadas, resistindo à escuridão como tochas de esperança.");
        System.out.println("O ar cheira a resina, a ferro e a morte. O som do rio Celebrant mistura-se com os gritos de guerra dos inimigos.");
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Orcs escalam as encostas como uma maré negra, enquanto Wargs avançam aos saltos, sedentos de sangue élfico.");
        System.out.println("Flechas silvavam como serpentes pelos céus, tanto dos invasores quanto dos defensores.");
        System.out.println("Luzes élficas dançam entre os galhos — feitiços, canções de proteção, gritos de comando.");


        Audio.stopMusic();
        sleep(2000);
        Audio.playMusic("audioFiles/Forth Eorlingas.wav");

        System.out.println();
        System.out.println(heroi.getNome() + " ergue a sua lâmina ao céu nublado e grita:");
        System.out.println("\"Por Galadriel! Por a Luz das Duas Árvores! Não deixaremos a floresta cair!\"");

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println();
        System.out.println("As tropas de Rivendell seguem-no, lançando-se no combate como uma torrente de prata contra a maré negra.");
        System.out.println("Ali, sob o céu de guerra, entre raízes ancestrais e sombras antigas, começa mais uma batalha pela alma da Terra Média.");

        System.out.println();
        System.out.println();

        System.out.println("Encontras um orc e decides atacar\n");
        heroi.combateBossArqFeiti(FabricaPersonagens.criarOrc());

        System.out.println("Um Goblin separa-se do seu bando. Atacas?\n");
        heroi.combateBossArqFeiti(FabricaPersonagens.criarGoblin());

        System.out.println("Um Troll está a impedir uma vida de Paz na Terra Média\n");
        heroi.combateBossArqFeiti(FabricaPersonagens.criarTroll());

        System.out.println("Um Ward aparece rapidamente e ataca o teu flanco\n");
        heroi.combateBossArqFeiti(FabricaPersonagens.criarWarg());

        System.out.println("Outro Troll. Haverá vitória possível?\n");
        heroi.combateBossArqFeiti(FabricaPersonagens.criarTroll());

        System.out.println("Já exausto e com o inimigo a ganhar terreno, um Nazgul encara-te. É khamul, braço direito de Witch King de Angmar. Muitos acreditam que é um antigo rei de região de Rhun. Não tens escolha senão derrotá-lo\n");
        heroi.combateBossArqFeiti(FabricaPersonagens.criarNazgul());

        Audio.stopMusic();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\n=====================================================");
        System.out.println("                        O fim!!!                       ");
        System.out.println("=====================================================\n");

        System.out.println("=== O Fim da Guerra. A Vitória da Luz. ===");

        System.out.println("A Batalha de Lothlórien rugia como um trovão sobre a floresta dourada.");
        System.out.println("As folhas cantavam em agonia, banhadas em sangue élfico.");
        System.out.println("Os defensores da Luz, embora corajosos, estavam a ser empurrados para trás.");
        System.out.println("Os muros naturais da floresta ressoavam com o choro dos que tombavam.");
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        Audio.playMusic("audioFiles/Lord of the Rings The Return of the King (2003) - Destroying the Ring Scene  Movieclips.wav");


        System.out.println("Mesmo " + heroi.getNome() + ", filho dos Valar, via a esperança esvair-se a cada golpe perdido.");
        System.out.println("As forças de Dol Guldur eram muitas. O aço negro e o fogo das trevas cresciam como tempestade.");
        System.out.println();

        System.out.println("Mas então... veio o silêncio.");
        System.out.println("Um silêncio estranho, profundo, quase sagrado.");

        sleep(3000);

        System.out.println("E de súbito — um uivo de terror cortou os ventos.");
        System.out.println("As criaturas de Sauron — orcs, trolls, sombras — largaram as armas e fugiram como folhas ao vento de tempestade.");
        System.out.println("Gritavam em desespero, olhos abertos como se vissem o fim do mundo.");
        System.out.println();


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("Pouco depois, chegou a notícia. Vinda de mil léguas, levada por corvos, vento e esperança:");
        System.out.println("Frodo. O pequeno hobbit. O portador do fardo.");
        System.out.println("Ele chegara ao coração de Mordor. À Montanha da Perdição.");
        System.out.println("O ANEL fora destruído.");
        System.out.println();

        System.out.println("As trevas desvaneceram.");
        System.out.println("A torre negra desabou.");
        System.out.println("E com ela, caiu Sauron — último senhor do medo.");
        System.out.println();


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("A Terra Média respirou. Pela primeira vez em três eras, ela respirou em paz.");
        System.out.println("Seis mil anos de guerra chegaram ao fim.");
        System.out.println("O sol pôde nascer sem temor, e as estrelas voltaram a brilhar sem véu de sombras.");
        System.out.println();

        System.out.println("Lágrimas caíram. Não de dor, mas de alívio.");
        System.out.println("Aqueles que sobreviveram caíram de joelhos entre os campos devastados e abraçaram-se em silêncio.");
        System.out.println();


        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("E " + heroi.getNome() + ", banhado pela luz dourada da floresta que tanto defendera, olhou para os céus.");
        System.out.println("E no sussurro do vento ouviu o eco dos Valar:");
        System.out.println("\"Foste fiel até ao fim. E agora... o mundo é livre.\"");


        System.out.println();
        System.out.println("A paz comanda agora a Terra Média.");
        System.out.println("Os corvos já não anunciam guerra, mas cantam canções antigas de vitória.");
        System.out.println("E mesmo que o tempo leve os nomes e os feitos, o coração do mundo lembrará... que houve um herói.");
        System.out.println("Um guardião da esperança.");
        System.out.println(heroi.getNome() + ". Filho das estrelas. Escudo da paz. Último eco de Valinor.");


        Audio.stopMusic();

        System.out.println();
        System.out.println();
        System.out.println("Pressiona enter para continuar");
        input.nextLine();

        System.out.println("\n=====================================================");
        System.out.println("                         Epílogo                       ");
        System.out.println("=====================================================\n");


        System.out.println("A história deste jogo é livremente inspirada na figura lendária de Glorfindel, com quase todos os acontecimentos pertencentes ao Lore escrito por J. R. R. Tolkien.");

        System.out.println();
        System.out.println("Glorfindel foi um dos grandes senhores élficos da Primeira Era, nascido na luz de Valinor.");
        System.out.println("Durante a Queda de Gondolin, lutou bravamente contra as forças de Morgoth, enfrentando o próprio Gothmog, Senhor dos Balrogs.");
        System.out.println("Ambos caíram num abismo mortal — mas os Valar, em honra ao seu sacrifício, devolveram-lhe a vida nos Reinos Eternos.");

        System.out.println();
        System.out.println("Milénios depois, na Terceira Era, Glorfindel caminhava novamente entre os povos livres.");
        System.out.println("Foi ele quem resgatou Frodo das mãos dos Nazgûl e ajudou a levá-lo em segurança até Rivendell.");
        System.out.println("Sábio, poderoso e fiel, Glorfindel é símbolo da coragem imortal e da luz que nunca se apaga.");

        System.out.println();
        System.out.println("O teu herói, " + heroi.getNome() + ", é uma homenagem direta a essa figura lendária.");
        System.out.println("Uma ponte entre eras, entre lenda e jogo, entre sacrifício e esperança.");
        System.out.println("Que o seu espírito guie sempre os defensores da Terra Média.");
    }

}

