package poo.SistemaDeNotificacoes;

public class SMS implements Notificacao {
    private long numero;
    private String mensagem;

    public SMS(long numero, String mensagem) {
        this.numero = numero;
        this.mensagem = mensagem;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void enviar() {
        System.out.println("Notificação em " + numero + ": " + mensagem);
    }

}
