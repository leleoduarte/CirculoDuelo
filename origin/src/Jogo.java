import java.util.ArrayList;

public interface Jogo {
    ArrayList<Jogador> iniciarJogo();

    void jogarTurno(Jogador jogador);

    boolean jogoAcabou();

    static int criarNumeroAleatorio() {
        return (int) (Math.random() * 100) + 1;
    }
}
