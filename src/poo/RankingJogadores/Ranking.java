package poo.RankingJogadores;

import java.util.HashMap;
import java.util.Map;

public class Ranking {
    private HashMap<Integer, JogadorBase> jogadores = new HashMap<>();
    private int proximoId = 1;

    public int getProximoId() {
        return proximoId;
    }

    public void adicionarJogador(JogadorBase jogador) {
        jogadores.put(jogador.getId(), jogador);
        proximoId++;
    }

    public void removeJogador(int id) {
        if (jogadores.containsKey(id)) {
            jogadores.remove(id);
            System.out.println("Jogador removido com sucesso!");
        } else {
            System.out.println("Jogador não encontrado.");
        }
    }

    public void buscarJogador(String nome) {
        for (JogadorBase jogador : jogadores.values()) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Jogador encontrado:");
                jogador.mostraPerfil();
                return;
            }
        }
        System.out.println("Jogador não encontrado.");
    }

    public void listarJogadores() {
        if (jogadores.isEmpty()) {
            System.out.println("Não existem jogadores cadastrados.");
            return;
        }
        System.out.println("====== RANKING ======");
        for (Map.Entry<Integer, JogadorBase> entrada : jogadores.entrySet()) {
            System.out.println("ID: " + entrada.getKey());
            System.out.println("Nome: " + entrada.getValue().getNome());
            System.out.println("Pontuação: " + entrada.getValue().getPontuacao());
            System.out.println("---------------------");
        }
    }

    public void buscarMaiorPontuacao() {
        if (jogadores.isEmpty()) {
            System.out.println("Não existem jogadores cadastrados.");
            return;
        }
        JogadorBase maior = null;
        for (JogadorBase jogador : jogadores.values()) {
            if (maior == null || jogador.getPontuacao() > maior.getPontuacao()) {
                maior = jogador;
            }
        }
        System.out.println("====== MAIOR PONTUAÇÃO ======");
        maior.mostraPerfil();
    }

    public void adicionarPontuacao(String nome, int pontos) {
        for (JogadorBase jogador : jogadores.values()) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                jogador.adicionarPontos(pontos);
                System.out.println("Pontuação adicionada!");
                return;
            }
        }
        System.out.println("Jogador não encontrado.");
    }

    public void removerPontuacao(String nome, int pontos) {
        for (JogadorBase jogador : jogadores.values()) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                jogador.removerPontos(pontos);
                return;
            }
        }
        System.out.println("Jogador não encontrado.");
    }

    public void adicionarConquista(String nome, String conquista) {
        for (JogadorBase jogador : jogadores.values()) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                if (jogador instanceof Jogador) {
                    Jogador jogadorComum = (Jogador) jogador;
                    jogadorComum.adicionarConquista(conquista);
                    System.out.println("Conquista adicionada!");
                }
                return;
            }
        }

        System.out.println("Jogador não encontrado.");
    }

    public void mostrarConquistas(String nome) {
        for (JogadorBase jogador : jogadores.values()) {
            if (jogador.getNome().equalsIgnoreCase(nome)) {
                if (jogador instanceof Jogador) {
                    Jogador jogadorComum = (Jogador) jogador;
                    jogadorComum.mostrarConquistas();
                }
                return;
            }
        }
        System.out.println("Jogador não encontrado.");
    }
}