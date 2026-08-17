package SistemaBancario;

public enum TipoConta {
    CONTA_CORRENTE ("Conta Corrente"),
    CONTA_POUPANCA ("Conta Poupança");

    private String tipoDeConta;

    TipoConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

}
