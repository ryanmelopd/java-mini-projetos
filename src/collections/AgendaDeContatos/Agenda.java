package collections.AgendaDeContatos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso.");
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Não existem contatos cadastrados.");
            return;
        }
        System.out.println("===== CONTATOS =====");
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public Contato buscarContatoPorId(long id) {
        for (Contato contato : contatos) {
            if (id == contato.getId()) {
                return contato;
            }
        }
        return null;
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato contato : contatos) {
            if (nome.equalsIgnoreCase(contato.getNome())) {
                return contato;
            }
        }
        return null;
    }

    public void removerContato(long id) {
        Contato contato = buscarContatoPorId(id);
        if (contato != null) {
            contatos.remove(contato);
            System.out.println("Contato removido com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void atualizarContato(long id, String nome, String telefone, String email) {
        Contato contato = buscarContatoPorId(id);
        if (contato == null) {
            System.out.println("Contato não encontrado.");
            return;
        }
        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);
        System.out.println("Contato atualizado com sucesso.");
    }
}