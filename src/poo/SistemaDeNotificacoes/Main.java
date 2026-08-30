package poo.SistemaDeNotificacoes;

public class Main {
    public static void main(String[] args) {
        Notificacao[] notificacoes = {
                new Email("ryanmelopedro190@gmail.com","Prezado Ryan..."),
                new SMS(43996606479L,"PLANO GRÁTIS PARA VOCÊ! ACESSE AGORA..."),
                new Whatsapp(43996606479L,"Olá, boa tarde!"),
                new NotificacaoPush("Ryan","NOVO VÍDEO DE LIRIK!")
        };

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar();
            if (notificacao instanceof Agendavel) {
                ((Agendavel) notificacao).agendar();
            }
        }

    }
}
