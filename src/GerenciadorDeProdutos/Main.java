package GerenciadorDeProdutos;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtosList = new ArrayList<>();
        Set<Produto> produtosSet = new HashSet<>();

        produtosList.add(new Produto(101,"Garrafa",42));
        produtosList.add(new Produto(102,"Mouse",120));
        produtosList.add(new Produto(103,"Teclado",250));
        produtosList.add(new Produto(104,"Headset",200));
        produtosList.add(new Produto(105,"Abacate",7.99));

        System.out.println(produtosList);
        System.out.println("Quantidade de produtos: " + produtosList.size());
        produtosList.set(0,new Produto(101,"Mochila",50));
        produtosList.remove(3);

        produtosSet.add(new Produto(101,"Garrafa",42));
        produtosSet.add(new Produto(102,"Mouse",120));
        produtosSet.add(new Produto(103,"Teclado",250));
        produtosSet.add(new Produto(104,"Headset",200));
        produtosSet.add(new Produto(105,"Abacate",7.99));
        produtosSet.add(new Produto(105,"Cenoura",3.99));

        System.out.println(produtosSet);
        System.out.println(produtosSet.contains(new Produto(105,"Cenoura",3.99)));


    }

}
