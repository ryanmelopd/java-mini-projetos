package poo.GerenciadorDeProdutos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // List - ArrayList
        List<Produto> produtosList = new ArrayList<>();

        produtosList.add(new Produto(101, "Garrafa", 42));
        produtosList.add(new Produto(102, "Mouse", 120));
        produtosList.add(new Produto(103, "Teclado", 250));
        produtosList.add(new Produto(104, "Headset", 200));
        produtosList.add(new Produto(105, "Abacate", 7.99));

        System.out.println("========== LIST ==========");
        System.out.println("Produtos:");
        for (Produto produto : produtosList) {
            System.out.println(produto);
        }

        System.out.println("\nQuantidade de produtos: " + produtosList.size());

        // Alterando um produto
        produtosList.set(0, new Produto(101, "Mochila", 50));

        // Removendo um produto
        produtosList.remove(3);

        System.out.println("\nLista após alterações:");
        for (Produto produto : produtosList) {
            System.out.println(produto);
        }

        // Set - HashSet
        Set<Produto> produtosSet = new HashSet<>();

        produtosSet.add(new Produto(101, "Garrafa", 42));
        produtosSet.add(new Produto(102, "Mouse", 120));
        produtosSet.add(new Produto(103, "Teclado", 250));
        produtosSet.add(new Produto(104, "Headset", 200));
        produtosSet.add(new Produto(105, "Abacate", 7.99));

        // Produto com ID repetido
        produtosSet.add(new Produto(105, "Cenoura", 3.99));

        System.out.println("\n========== SET ==========");
        System.out.println("Produtos únicos:");
        for (Produto produto : produtosSet) {
            System.out.println(produto);
        }

        System.out.println("\nQuantidade de produtos: " + produtosSet.size());

        System.out.println("Produto com ID 105 existe: "
                + produtosSet.contains(new Produto(105, "Cenoura", 3.99)));

        // Map - HashMap
        Map<Integer, Produto> produtosMap = new HashMap<>();

        produtosMap.put(101, new Produto(101, "Garrafa", 42));
        produtosMap.put(102, new Produto(102, "Mouse", 120));
        produtosMap.put(103, new Produto(103, "Teclado", 250));
        produtosMap.put(104, new Produto(104, "Headset", 200));
        produtosMap.put(105, new Produto(105, "Abacate", 7.99));

        System.out.println("\n========== MAP ==========");

        // Buscando produto pela chave
        System.out.println("Produto com ID 101:");
        System.out.println(produtosMap.get(101));

        // Verificando se uma chave existe
        System.out.println("\nID 103 existe: " + produtosMap.containsKey(103));

        // Removendo produto pela chave
        produtosMap.remove(102);
        System.out.println("\nQuantidade após remover o ID 102: " + produtosMap.size());

        // Percorrendo o Map
        System.out.println("\nProdutos cadastrados no Map:");
        for (Map.Entry<Integer, Produto> entrada : produtosMap.entrySet()) {
            System.out.println("ID: " + entrada.getKey() + " | " + entrada.getValue());
        }
    }
}