package collections.StreamGenerics;

public class Filme {
    private String nome;
    private String genero;
    private double nota;

    public Filme(String nome, String genero, double nota) {
        this.nome = nome;
        this.genero = genero;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nome + " - " + genero + " - " + nota;
    }

}