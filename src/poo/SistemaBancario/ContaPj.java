package poo.SistemaBancario;

public class ContaPj extends Conta {
    private String cnpj;
    private TipoConta tipoConta;

    public ContaPj(String nome, int numero, double saldo, String cnpj, TipoConta tipoConta) {
        super(nome, numero, saldo);
        this.cnpj = cnpj;
        this.tipoConta = tipoConta;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void mostrarDados () {
        System.out.println("Nome: " + getNome());
        System.out.println("Número da conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("CPF: " + cnpj);
        System.out.println("Tipo de conta: " + tipoConta.getTipoDeConta());
    }

    @Override
    public void sacar(double valor) {
        double taxa = 5;
        if (valor <= 0) {
            System.out.println("Erro: valor de saque inválido.");
        } else if (valor > 2000) {
            System.out.println("Erro: o saque excede o limite de R$2000.");
        } else if (valor + taxa > getSaldo()) {
            System.out.println("Erro: saldo insuficiente para realizar o saque e pagar a taxa de R$5.");
        } else {
            diminuirSaldo(valor);
            diminuirSaldo(taxa);
            System.out.println("Saque realizado.");
            System.out.println("Taxa de saque: R$5,00");
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor de depósito inválido.");
        } else if (valor > 4000) {
            System.out.println("Erro: o depósito excede o limite de R$4000.");
        } else {
            aumentarSaldo(valor);
            System.out.println("Depósito realizado.");
        }
    }

}
