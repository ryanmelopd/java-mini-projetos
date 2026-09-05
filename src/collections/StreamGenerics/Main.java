package collections.StreamGenerics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criação da List de Filmes
        List<Filme> filmes = new ArrayList<>();

        // Adicionamos alguns filmes à lista.
        filmes.add(new Filme("Interestelar", "Ficção", 8.7));
        filmes.add(new Filme("O Poderoso Chefão", "Drama", 9.2));
        filmes.add(new Filme("Homem-Aranha", "Ação", 8.0));
        filmes.add(new Filme("Parasita", "Drama", 8.5));
        filmes.add(new Filme("Duna", "Ficção", 8.0));

        // STREAM API

        // Utilização do filter() para filmes bem avaliados
        List<Filme> filmesBemAvaliados = filmes.stream().filter(filme -> filme.getNota() >= 8.5).toList();

        System.out.println("Filmes bem avaliados:");
        System.out.println(filmesBemAvaliados);

        //Utilização do sorted() para ordenar os elementos de ordem decrescente pela nota
        List<Filme> filmesOrdenados = filmes.stream().sorted(Comparator.comparing(Filme::getNota).reversed()).toList();

        System.out.println("\nFilmes ordenados por nota:");
        System.out.println(filmesOrdenados);

        // Utilização do map() para transformar o objeto Filme em String
        List<String> nomes = filmes.stream().map(Filme::getNome).toList();

        System.out.println("\nNomes dos filmes:");
        System.out.println(nomes);

        // Utilização do mapToDouble() para calcular a média das notas dos filmes, se a lista estiver vazia retornará zero
        double media = filmes.stream().mapToDouble(Filme::getNota).average().orElse(0);

        System.out.println("\nMédia das notas: " + media);

        // Generics

        // Utilização do método genérico, que tem como parâmetro o T, que aceita qualquer tipo, e não só um tipo
        Filme primeiro = primeiroElemento(filmes);

        System.out.println("\nPrimeiro filme:");
        System.out.println(primeiro);
    }

    public static <T> T primeiroElemento(List<T> lista) {
        if (lista.isEmpty()) {
            return null;
        }
        return lista.get(0);
    }
}