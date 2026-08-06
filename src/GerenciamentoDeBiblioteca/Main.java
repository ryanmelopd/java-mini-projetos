package GerenciamentoDeBiblioteca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Livro[] livros = new Livro[10];
        int opcao = 0;
        int quantidadeLivros = 0;

        while (opcao != 5) {

            System.out.println("------BIBLIOTECA------");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Buscar livro pelo título");
            System.out.println("4. Mostrar livro mais antigo");
            System.out.println("5. Sair");

            System.out.print("Insira sua opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1: quantidadeLivros = cadastrarLivros(input, livros, quantidadeLivros);
                    break;
                case 2: listarLivros(livros,quantidadeLivros);
                    break;
                case 3: buscarLivro(livros,quantidadeLivros,input);
                    break;
                case 4: buscarLivroAntigo(livros,quantidadeLivros);
                    break;
                case 5: System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        input.close();
    }

    public static int cadastrarLivros(Scanner input,Livro[] livros,int quantidadeDeLivros) {
        if (quantidadeDeLivros >= livros.length) {
            System.out.println("Biblioteca cheia!");
            return quantidadeDeLivros;
        }

        input.nextLine();
        System.out.print("Digite o título do livro: ");
        String titulo = input.nextLine();
        System.out.print("Digite o autor(a) do livro: ");
        String autor = input.nextLine();
        System.out.print("Digite o ano do livro: ");
        int ano = input.nextInt();
        System.out.print("Digite o número de páginas do livro: ");
        int paginas = input.nextInt();

        Livro novoLivro = new Livro(titulo,autor,ano,paginas);
        livros[quantidadeDeLivros] = novoLivro;
        System.out.println("Livro cadastrado com sucesso!");
        return quantidadeDeLivros + 1;
    }

    public static void listarLivros(Livro[] livros,int quantidadeDeLivros) {
        if (quantidadeDeLivros == 0) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for(int i = 0; i < quantidadeDeLivros; i++) {
            livros[i].mostrarDados();
            System.out.println("---------------");
        }
    }

    public static void buscarLivro(Livro[] livros,int quantidadeDeLivros,Scanner input) {
        input.nextLine();
        System.out.print("Digite o título do livro: ");
        String tituloBusca = input.nextLine();
        boolean encontrado = false;
        for(int i = 0; i < quantidadeDeLivros; i++) {

            if(livros[i].getTitulo().equalsIgnoreCase(tituloBusca)) {
                System.out.println("Livro encontrado!");
                livros[i].mostrarDados();
                encontrado = true;
                break;
            }
        }
        if(!encontrado) {
            System.out.println("Livro não encontrado.");
        }
    }

    public static void buscarLivroAntigo(Livro[] livros,int quantidadeDeLivros) {
        if (quantidadeDeLivros == 0) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        Livro maisAntigo = livros[0];
        for (int i = 1; i < quantidadeDeLivros; i++) {
            if (livros[i].getAno() < maisAntigo.getAno()) {
                maisAntigo = livros[i];
            }
        }
        System.out.println("Livro mais antigo:");
        maisAntigo.mostrarDados();
    }
}
