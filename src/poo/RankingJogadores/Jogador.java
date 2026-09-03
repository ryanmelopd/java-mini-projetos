package poo.RankingJogadores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Jogador extends JogadorBase {
    private List<Integer> historicoPontuacoes = new ArrayList<>();
    private HashSet<String> conquistas = new HashSet<>();

    public Jogador(int id, String nome, int pontuacao, List<Integer> historicoPontuacoes, HashSet<String> conquistas) {
        super(id, nome, pontuacao);
        this.historicoPontuacoes = historicoPontuacoes;
        this.conquistas = conquistas;
    }

    @Override
    public void adicionarPontos(int pontos) {
        super.adicionarPontos(pontos);
        historicoPontuacoes.add(pontos);
    }

    @Override
    public void removerPontos(int pontos) {
        if (pontos > 0 && pontos <= getPontuacao()) {
            super.removerPontos(pontos);
            historicoPontuacoes.add(-pontos);
        } else {
            System.out.println("Quantidade de pontos inválida.");
        }
    }

    public void adicionarConquista(String conquista) {
        conquistas.add(conquista);
    }

    public void removerConquista(String conquista) {
        conquistas.remove(conquista);
    }

    public boolean possuiConquista() {
        return !conquistas.isEmpty();
    }

    public void mostrarConquistas() {
        if (conquistas.isEmpty()) {
            System.out.println("O jogador não possui conquistas.");
        } else {
            System.out.println("Conquistas: " + conquistas);
        }
    }

    @Override
    public void mostraPerfil() {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Pontuação: " + getPontuacao());
        System.out.println("Histórico de pontuação: " + historicoPontuacoes);
        System.out.println("Conquistas: " + conquistas);
    }

}
