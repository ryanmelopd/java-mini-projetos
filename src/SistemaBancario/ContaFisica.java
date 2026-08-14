package SistemaBancario;

public class ContaFisica extends Conta {
    private String cpf;
    private TipoConta tipoConta;

    public ContaFisica(String nome, int numero, double saldo, String cpf, TipoConta tipoConta) {
        super(nome, numero, saldo);
        this.cpf = cpf;
        this.tipoConta = tipoConta;
    }

    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrarDados () {
        System.out.println("Nome: " + getNome());
        System.out.println("Número da conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("CPF: " + cpf);
        System.out.println("Tipo de conta: " + tipoConta.getTipoDeConta());
    }
}
