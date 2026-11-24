import java.util.InputMismatchException;
import java.util.Scanner;

public class CDuelos {

    private Scanner teclado = new Scanner(System.in);
    private boolean jogadoresSelecionados = false;
    private Jogador jogador1;
    private Jogador jogador2;
    
    public void iniciarJogo(){
        int opc;

        do {
            exibirMenu();
            try {
                System.out.println("Escolha uma opção: ");
                opc = teclado.nextInt();

                switch (opc) {
                    case 1:
                        if(jogadoresSelecionados == true){
                            System.out.println("Iniciando duelo...");

                        }
                        else{
                            System.out.println("\nOs dois jogadores precisam ser selecionados primeiro!");
                            System.out.println("Prepare os participantes antes de iniciar.");
                        }
                        break;

                    case 2:
                        exibirDuelistas();
                        break;

                    case 3:
                        exibirRegras();
                        break;

                    case 0:
                        System.out.println("Encerrando o Circulo de Duelo...");
                        break;

                    default:
                        System.out.println("\nOpção invalida! Tente novamente.");
                }
            }catch(InputMismatchException e){
                System.out.println("\nEntrada inválida! Digite apenas números");
                teclado.nextLine();
                opc = -1;
            }

        } while(opc != 0);
    }

    private void exibirMenu(){
        System.out.println("\n========================================");
        System.out.println("           CIRCULO DE DUELOS");
        System.out.println("========================================");
        System.out.println("  1 - Iniciar duelo");
        System.out.println("  2 - Apresentar duelistas");
        System.out.println("  3 - Consultar regras");
        System.out.println("  0 - Sair");
        System.out.println("========================================");
    }

    private void exibirDuelistas(){
        System.out.println("\nAqui serão apresentados os personagens de duelo...");
    }

    private void exibirRegras(){
        System.out.println("\nLista de regras...");
    }

    @Override
    public void jogarTurno(Jogador jogador){
        //Jogador da vez executa alguma ação...
    }

    @Override
    public boolean jogoAcabou(){
        //Verificar condição de jogo...
    }
}
