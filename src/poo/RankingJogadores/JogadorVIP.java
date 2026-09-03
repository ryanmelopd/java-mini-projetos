package poo.RankingJogadores;

import java.util.HashSet;
import java.util.List;

public class JogadorVIP extends Jogador {
    private HashSet<String> beneficios = new HashSet<>();

    public JogadorVIP(int id, String nome, int pontuacao, List<Integer> historicoPontuacoes, HashSet<String> conquistas, HashSet<String> beneficios) {
        super(id, nome, pontuacao, historicoPontuacoes, conquistas);
        this.beneficios = beneficios;
    }

    public void adicionarBeneficio(String beneficio) {
        beneficios.add(beneficio);
    }

    public void removerBeneficio(String beneficio) {
        beneficios.remove(beneficio);
    }

    public boolean possuiBeneficio() {
        return !beneficios.isEmpty();
    }

    @Override
    public void mostraPerfil() {
        super.mostraPerfil();
        System.out.println("Benefícios: " + beneficios);
    }
}