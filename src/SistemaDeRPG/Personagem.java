package SistemaDeRPG;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private final int id;

    public Personagem(String nome,String classe,int nivel,int id) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.id = id;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("ID: " + id);
        System.out.println();
    }
}
