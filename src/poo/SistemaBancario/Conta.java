package poo.SistemaBancario;

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

    protected void diminuirSaldo(double valor) {
        this.saldo -= valor;
    }

    protected void aumentarSaldo(double valor) {
        this.saldo += valor;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

}
