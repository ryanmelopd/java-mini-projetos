package poo.SistemaDeRPG;

public class Main {
    public static void main(String[] args) {

        Personagem player1 = new Personagem("Leandro","Bruiser",10,101,80,30);
        Personagem player2 = new Personagem("Ana","Curandeira",10,102,75,25);

        Monstro monstro1 = new Monstro("Drogoz","Dragão-Atirador",201,100,29);

        System.out.println("Informações do primeiro personagem:");
        player1.mostrarInformacoes();
        System.out.println();
        System.out.println("Informações do segundo personagem:");
        player2.mostrarInformacoes();
        System.out.println();
        System.out.println("Informações do monstro:");
        monstro1.mostrarInformacoes();
        System.out.println();
        System.out.println("Começou um combate entre " + player1.getNome() + " e " + player2.getNome() + " contra " + monstro1.getNome() + "!");

        // Turno do Leandro
        System.out.println("\nTurno de " + player1.getNome() + ":");
        player1.atacarMonstro(monstro1);
        System.out.println(player1.getNome() + " atacou " + monstro1.getNome() + ".");
        System.out.println(monstro1.getNome() + " está com " + monstro1.getVida() + " de vida.");

        // Turno do monstro
        System.out.println("\nTurno de " + monstro1.getNome() + ":");
        monstro1.atacar(player1);
        System.out.println(monstro1.getNome() + " atacou " + player1.getNome() + ".");
        System.out.println(player1.getNome() + " está com " + player1.getVida() + " de vida.");

        // Cura da Ana
        System.out.println("\nTurno de " + player2.getNome() + ":");
        player2.curar(player1);
        System.out.println(player2.getNome() + " curou " + player1.getNome() + ".");
        System.out.println(player1.getNome() + " está com " + player1.getVida() + " de vida.");

        // Verificação de derrota
        if (!monstro1.estaVivo()) {
            System.out.println(monstro1.getNome() + " foi derrotado!");
        }
        if (!player1.estaVivo()) {
            System.out.println(player1.getNome() + " foi derrotado!");
        }
        if (!player2.estaVivo()) {
            System.out.println(player2.getNome() + " foi derrotada!");
        }
    }
}