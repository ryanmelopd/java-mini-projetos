package poo.SistemaDeNotificacoes;

public class Email implements Notificacao, Agendavel {
    private String email;
    private String mensagem;

    public Email(String email, String mensagem) {
        this.email = email;
        this.mensagem = mensagem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void enviar() {
        System.out.println("Notificação em " + email + ": " + mensagem);
    }

    @Override
    public void agendar() {
        System.out.println("Email agendado para " + email);
    }
}
