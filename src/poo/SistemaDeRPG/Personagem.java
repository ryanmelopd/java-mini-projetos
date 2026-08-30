package poo.SistemaDeRPG;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private final int id;
    private int vida;
    private int acao;

    public Personagem(String nome, String classe, int nivel, int id, int vida, int acao) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.id = id;
        this.vida = vida;
        this.acao = acao;
    }

    public int getAcao() {
        return acao;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("ID: " + id);
        System.out.println("Vida: " + vida);
        if (classe.equals("Curandeira")) {
            System.out.println("Cura: " + acao);
        } else {
            System.out.println("Dano de ataque: " + acao);
        }
    }

    public void atacarMonstro(Monstro monstro) {
        monstro.receberDano(acao);
    }

    public void receberDano(int dano) {
        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }
    }

    public void curar(Personagem personagem) {
        personagem.vida += acao;
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}