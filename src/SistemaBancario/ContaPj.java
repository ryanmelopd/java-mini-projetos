package SistemaBancario;

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
}
