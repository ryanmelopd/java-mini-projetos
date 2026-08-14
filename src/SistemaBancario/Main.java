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
        System.out.print("Conta corrente ou poupança: ");
        String opcaoTipoDeConta = input.nextLine().toLowerCase();
        System.out.println();

        TipoConta tipoConta;

        if (opcaoTipoDeConta.equals("corrente")) {
            tipoConta = TipoConta.CONTA_CORRENTE;
        } else if (opcaoTipoDeConta.equals("poupanca") || opcaoTipoDeConta.equals("poupança")) {
            tipoConta = TipoConta.CONTA_POUPANCA;
        } else {
            System.out.println("Tipo de conta inválido.");
            return;
        }

        if (opcaoConta.equals("pj")) {
            ContaPj contaPj = new ContaPj(nome, 517490, 0, "12.345.678/0001-95", tipoConta);
            contaPj.mostrarDados();
        } else if (opcaoConta.equals("fisica") || opcaoConta.equals("física")) {
            ContaFisica contaFisica = new ContaFisica(nome, 523123, 0, "111.444.777-35", tipoConta);
            contaFisica.mostrarDados();
        } else {
            System.out.println("Conta inválida");
        }
        input.close();
    }
}

