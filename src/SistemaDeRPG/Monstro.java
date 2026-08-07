package SistemaDeRPG;

public class Monstro {
    private String nome;
    private String classe;
    private int id;
    private int vida;
    public int ataque;
    private int xp;

    public Monstro(String nome,String classe,int id,int vida,int ataque,int xp) {
        this.nome = nome;
        this.classe = classe;
        this.id = id;
        this.vida = vida;
        this.ataque = ataque;
        this.xp = xp;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("ID: " + id);
        System.out.println("Vida: " + vida);
        System.out.println("Dano de ataque: " + ataque);
    }

    public int getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public void receberDano(int dano) {
        vida -= dano;
    }
}


