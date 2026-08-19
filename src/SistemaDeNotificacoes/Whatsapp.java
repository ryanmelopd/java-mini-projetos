package SistemaDeNotificacoes;

public class Whatsapp implements Notificacao, Agendavel {
    private long numero;
    private String mensagem;

    public Whatsapp(long numero, String mensagem) {
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
        System.out.println("Notificação no Whatsapp no número " + numero + ": " + mensagem);
    }

    @Override
    public void agendar() {
        System.out.println("Mensagem agendada para o número " + numero);
    }
}
