package poo.GerenciamentoDeBiblioteca;

public class Livro {
    String titulo;
    String autor;
    int ano;
    int paginas;

    public Livro(String titulo,String autor,int ano,int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public void mostrarDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Páginas: " + paginas);
    }

}

