package poo.SistemaBancario;

public class ContaFisica extends Conta {
    private String cpf;
    private TipoConta tipoConta;

    public ContaFisica(String nome, int numero, double saldo, String cpf, TipoConta tipoConta) {
        super(nome, numero, saldo);
        this.cpf = cpf;
        this.tipoConta = tipoConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrarDados () {
        System.out.println("Nome: " + getNome());
        System.out.println("Número da conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("CPF: " + cpf);
        System.out.println("Tipo de conta: " + tipoConta.getTipoDeConta());
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor de saque inválido.");
        } else if (valor > 1000) {
            System.out.println("Erro: o saque excede o limite de R$1000.");
        } else if (valor > getSaldo()) {
            System.out.println("Erro: saldo insuficiente.");
        } else {
            diminuirSaldo(valor);
            System.out.println("Saque realizado.");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor de depósito inválido.");
        } else if (valor > 2000) {
            System.out.println("Erro: o depósito excede o limite de R$2000.");
        } else {
            aumentarSaldo(valor);
            System.out.println("Depósito realizado.");
        }
    }

}
