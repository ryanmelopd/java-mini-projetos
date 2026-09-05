package collections.AgendaDeContatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== AGENDA DE CONTATOS =====");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("5 - Atualizar contato");
            System.out.println("0 - Sair");
            System.out.print("Insira sua opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira o ID do contato: ");
                    long id = scanner.nextLong();
                    System.out.print("Insira o nome do contato: ");
                    String nome = scanner.next();
                    System.out.print("Insira o telefone do contato: ");
                    String telefone = scanner.next();
                    System.out.print("Insira o email do contato: ");
                    String email = scanner.next();
                    Contato contato = new Contato(id, nome, telefone, email);
                    agenda.adicionarContato(contato);
                    break;
                case 2:
                    agenda.listarContatos();
                    break;
                case 3:
                    System.out.print("Buscar contato pelo ID ou pelo Nome? ");
                    String tipoBusca = scanner.next().toLowerCase();
                    if (tipoBusca.equals("id")) {
                        System.out.print("Insira o ID para buscar: ");
                        long idBusca = scanner.nextLong();
                        Contato contatoEncontrado = agenda.buscarContatoPorId(idBusca);
                        if (contatoEncontrado != null) {
                            System.out.println("Contato encontrado:");
                            System.out.println(contatoEncontrado);
                        } else {
                            System.out.println("Contato não encontrado.");
                        }
                    } else if (tipoBusca.equals("nome")) {
                        System.out.print("Insira o nome para buscar: ");
                        String nomeBusca = scanner.next();
                        Contato contatoEncontrado = agenda.buscarContatoPorNome(nomeBusca);
                        if (contatoEncontrado != null) {
                            System.out.println("Contato encontrado:");
                            System.out.println(contatoEncontrado);
                        } else {
                            System.out.println("Contato não encontrado.");
                        }
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 4:
                    System.out.print("Insira o ID do contato que deseja remover: ");
                    long idRemover = scanner.nextLong();
                    agenda.removerContato(idRemover);
                    break;
                case 5:
                    System.out.print("Insira o ID do contato que deseja atualizar: ");
                    long idAtualizar = scanner.nextLong();
                    System.out.print("Insira o novo nome: ");
                    String novoNome = scanner.next();
                    System.out.print("Insira o novo telefone: ");
                    String novoTelefone = scanner.next();
                    System.out.print("Insira o novo email: ");
                    String novoEmail = scanner.next();
                    agenda.atualizarContato(idAtualizar, novoNome, novoTelefone, novoEmail);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }
}