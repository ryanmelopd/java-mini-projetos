package SistemaDeRPG;

public class Main {
    public static void main(String[] args) {
        Personagem player1 = new Personagem("Leandro","Bruiser",12,101,100,30);
        Personagem player2 = new Personagem("Ana","Maga",99,102,75,38);

        Monstro monstro1 = new Monstro("Drogoz","Dragão-Atirador",201,95,29,35);

        String nomePersonagem1 = player1.getNome();
        int danoPersonagem1 = player1.getAtaque();

        String nomeMonstro1 = monstro1.getNome();

        System.out.println(nomePersonagem1 + " Atacou " + nomeMonstro1 + ".");
        player1.atacar(monstro1);
        System.out.println(nomeMonstro1 + " recebeu " + danoPersonagem1 + " de dano e está com " + monstro1.getVida() + " de vida.");
    }
}
