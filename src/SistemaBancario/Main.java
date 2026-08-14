package SistemaBancario;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Crie sua conta do banco.");
        System.out.print("Insira seu nome: ");
        String nome = input.nextLine();
        System.out.print("Conta PJ ou Física: ");
        String opcaoConta = input.nextLine().toLowerCase();

        if (opcaoConta.equals("pj")) {
            ContaPj contaP1 = new ContaPj(nome,517490,0,"12.345.678/0001-95");
            contaP1.mostrarDados();
        } else {
            ContaFisica contaF1 = new ContaFisica(nome,567890,0,"529.982.247-25");
            contaF1.mostrarDados();
        }
    }
}
