package poo.SistemaBancario;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====== Criação de conta do banco ======");
        String nome = lerNome(input);
        String opcaoConta = lerTipoPessoa(input);
        String documento = lerDocumento(input, opcaoConta);
        TipoConta tipoConta = lerTipoConta(input);
        criarConta(nome, opcaoConta, documento, tipoConta);
        input.close();
    }

    public static String lerNome(Scanner input) {
        System.out.print("Insira seu nome: ");
        return input.nextLine();
    }

    public static String lerTipoPessoa(Scanner input) {
        System.out.print("Conta PJ ou Física: ");
        return input.nextLine().toLowerCase();
    }

    public static String lerDocumento(Scanner input, String opcaoConta) {
        if (opcaoConta.equals("fisica") || opcaoConta.equals("física")) {
            System.out.print("Insira seu CPF: ");
            return input.nextLine();
        } else if (opcaoConta.equals("pj")) {
            System.out.print("Insira seu CNPJ: ");
            return input.nextLine();
        } else {
            System.out.println("Tipo de conta inválido.");
            return null;
        }
    }

    public static TipoConta lerTipoConta(Scanner input) {
        System.out.print("Conta corrente ou poupança: ");
        String opcaoTipoDeConta = input.nextLine().toLowerCase();

        if (opcaoTipoDeConta.equals("corrente")) {
            return TipoConta.CONTA_CORRENTE;
        } else if (opcaoTipoDeConta.equals("poupanca") || opcaoTipoDeConta.equals("poupança")) {
            return TipoConta.CONTA_POUPANCA;
        } else {
            System.out.println("Tipo de conta inválido.");
            return null;
        }
    }

    public static void criarConta(String nome, String opcaoConta, String documento, TipoConta tipoConta) {
        if (documento == null || tipoConta == null) {
            return;
        }
        if (opcaoConta.equals("pj")) {
            ContaPj conta = new ContaPj(nome, 517490, 0, documento, tipoConta);
            conta.mostrarDados();
        } else if (opcaoConta.equals("fisica") || opcaoConta.equals("física")) {
            ContaFisica conta = new ContaFisica(nome, 523123, 0, documento, tipoConta);
            conta.mostrarDados();
        } else {
            System.out.println("Conta inválida.");
        }
    }

}