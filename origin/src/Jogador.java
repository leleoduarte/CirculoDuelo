import java.util.ArrayList;
public abstract class Jogador {
    private String nome;
    private int vida;

    private ArrayList<Feitico> feiticos;
    private ArrayList<Pocao> pocoes;//tem q criar essas duas classes ainda gg


    protected Jogador(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.feiticos = new ArrayList<>();
        this.pocoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }




    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        if (dano >= 0) {
            vida = vida - dano;

            if (vida < 0) {
                vida = 0;
            }
        }
    }

    public void recuperarVida(int quantidade) {
        if (quantidade >= 0) {
            vida = vida + quantidade;

            if (vida > 100) {
                vida = 100;
            }
        }
    }
}
