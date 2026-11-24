public class Feitico {
    private String nome;
    private int dano;
    private int quantidadeUsos;
    private boolean maldicao;

    public Feitico(String nome, int dano, int quantidadeUsos, boolean maldicao) {
        this.nome = nome;
        this.dano = dano;
        this.quantidadeUsos = quantidadeUsos;
        this.maldicao = maldicao;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    public int getQuantidadeUsos() {
        return quantidadeUsos;
    }

    public boolean isMaldicao() {
        return maldicao;
    }

    public void consumirUso() {
        if (quantidadeUsos > 0) {
            quantidadeUsos--;
        }
    }
}