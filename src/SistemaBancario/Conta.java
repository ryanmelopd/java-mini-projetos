package SistemaBancario;

public abstract class Conta {
    private String nome;
    private int numero;
    private double saldo;

    public Conta(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void diminuirSaldo(double valor) {
        this.saldo -= valor;
    }

    protected void aumentarSaldo(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Erro: valor de saque excede o saldo.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado.");
        } else {
            System.out.println("Erro: valor de depósito inválido.");
        }
    }

}
