package SistemaDeRPG;

public class Main {
    public static void main(String[] args) {
        Personagem player1 = new Personagem("Leandro","Ninja",12,101);
        Personagem player2 = new Personagem("Ana","Maga",99,102);

        player1.mostrarInformacoes();
        player2.mostrarInformacoes();
    }
}
