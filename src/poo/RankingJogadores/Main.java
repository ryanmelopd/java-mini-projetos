package poo.RankingJogadores;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ranking ranking = new Ranking();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n====== RANKING DE JOGADORES ======");
            System.out.println("1 - Adicionar jogador");
            System.out.println("2 - Remover jogador");
            System.out.println("3 - Buscar jogador");
            System.out.println("4 - Listar jogadores");
            System.out.println("5 - Ver maior pontuação");
            System.out.println("6 - Adicionar pontuação");
            System.out.println("7 - Remover pontuação");
            System.out.println("8 - Adicionar conquista");
            System.out.println("9 - Ver conquistas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do jogador: ");
                        String nome = scanner.nextLine();
                        System.out.print("Tipo de jogador (1 - Comum | 2 - VIP): ");
                        int tipo = scanner.nextInt();
                        JogadorBase jogador;

                        if (tipo == 1) {
                            jogador = new Jogador(ranking.getProximoId(), nome, 0, new ArrayList<>(), new HashSet<>());
                        } else if (tipo == 2) {
                            jogador = new JogadorVIP(ranking.getProximoId(), nome, 0, new ArrayList<>(), new HashSet<>(), new HashSet<>());
                        } else {
                            System.out.println("Tipo de jogador inválido.");
                            break;
                        }

                        ranking.adicionarJogador(jogador);
                        System.out.println("Jogador cadastrado com sucesso!");
                        break;

                    case 2:
                        System.out.print("Digite o ID do jogador: ");
                        int id = scanner.nextInt();
                        ranking.removeJogador(id);
                        break;

                    case 3:
                        System.out.print("Digite o nome do jogador: ");
                        String nomeBusca = scanner.nextLine();
                        ranking.buscarJogador(nomeBusca);
                        break;

                    case 4:
                        ranking.listarJogadores();
                        break;

                    case 5:
                        ranking.buscarMaiorPontuacao();
                        break;

                    case 6:
                        System.out.print("Digite o nome do jogador: ");
                        String nomePontos = scanner.nextLine();
                        System.out.print("Digite a quantidade de pontos: ");
                        int pontos = scanner.nextInt();
                        ranking.adicionarPontuacao(nomePontos, pontos);
                        break;

                    case 7:
                        System.out.print("Digite o nome do jogador: ");
                        String nomeRemoverPontos = scanner.nextLine();
                        System.out.print("Digite a quantidade de pontos: ");
                        int pontosRemover = scanner.nextInt();
                        ranking.removerPontuacao(nomeRemoverPontos, pontosRemover);
                        break;

                    case 8:
                        System.out.print("Digite o nome do jogador: ");
                        String nomeConquista = scanner.nextLine();
                        System.out.print("Digite a conquista: ");
                        String conquista = scanner.nextLine();
                        ranking.adicionarConquista(nomeConquista, conquista);
                        break;

                    case 9:
                        System.out.print("Digite o nome do jogador: ");
                        String nomeConquistas = scanner.nextLine();
                        ranking.mostrarConquistas(nomeConquistas);
                        break;

                    case 0:
                        System.out.println("Programa encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}

