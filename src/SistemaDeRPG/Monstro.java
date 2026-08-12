package SistemaDeRPG;

public class Monstro {
    private String nome;
    private String classe;
    private int id;
    private int vida;
    private int ataque;

    public Monstro(String nome, String classe, int id, int vida, int ataque) {
        this.nome = nome;
        this.classe = classe;
        this.id = id;
        this.vida = vida;
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void atacar(Personagem personagem) {
        personagem.receberDano(ataque);
    }

    public void receberDano(int dano) {
        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("ID: " + id);
        System.out.println("Vida: " + vida);
        System.out.println("Dano de ataque: " + ataque);
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}