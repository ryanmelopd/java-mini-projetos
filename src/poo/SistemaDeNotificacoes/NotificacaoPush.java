package poo.SistemaDeNotificacoes;

public class NotificacaoPush implements Notificacao {
    private String usuario;
    private String mensagem;

    public NotificacaoPush(String usuario, String mensagem) {
        this.usuario = usuario;
        this.mensagem = mensagem;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void enviar() {
        System.out.println("Notificação Push para " + usuario + ": " + mensagem);
    }

}
