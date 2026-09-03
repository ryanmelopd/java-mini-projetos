package poo.RankingJogadores;

public abstract class JogadorBase {
    private int id;
    private String nome;
    private int pontuacao;

    public JogadorBase(int id, String nome, int pontuacao) {
        this.id = id;
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void adicionarPontos(int pontos) {
        if (pontos > 0) {
            pontuacao += pontos;
        }
    }

    public void removerPontos(int pontos) {
        if (pontos > 0 && pontos <= pontuacao) {
            pontuacao -= pontos;
        } else {
            System.out.println("Quantidade de pontos inválida.");
        }
    }

    public abstract void mostraPerfil();
}