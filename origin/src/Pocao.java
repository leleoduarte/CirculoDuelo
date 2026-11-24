public class Pocao {
    private String nome;
    private int recuperacao;
    private int quantidadeUsos;

    public Pocao(String nome, int recuperacao, int quantidadeUsos) {
        this.nome = nome;
        this.recuperacao = recuperacao;
        this.quantidadeUsos = quantidadeUsos;
    }

    public String getNome() {
        return nome;
    }

    public int getRecuperacao() {
        return recuperacao;
    }

    public int getQuantidadeUsos() {
        return quantidadeUsos;
    }

    public void consumirUso() {
        if (quantidadeUsos > 0) {
            quantidadeUsos--;
        }
    }
}