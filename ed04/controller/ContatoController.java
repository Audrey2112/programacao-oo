package ed04.controller;

import ed04.dao.ContatoDAO;
import ed04.dao.ContatoDbDAO;
import ed04.entidade.Contato;
import ed04.dao.ContatoCsvDAO;
import ed04.view.ContatoView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContatoController {

    // Cria a nossa view responsável pela tela
    private final ContatoView view = new ContatoView();

    // Cria a classe DAO para acessar os dados dos contatos
    //private final ContatoDAO dao = new ContatoCsvDAO();
    private final ContatoDAO dao = new ContatoDbDAO();

    public void executar() {
        // Cria uma lista de contatos
        List<Contato> contatos = new ArrayList<>();

        boolean saida = false;
        do {

            // Exibe o menu de opções
            view.exibirMenu();

            // Usuário escolhe a opção
            int opt = view.lerOpcao();

            switch (opt) {
                // Se opção 1 -> exibe a tela de listar
                case 1:
                    consultarContatos();
                    break;

                // Se opção 2 -> exibe a tela de adicionar
                case 2:
                    adicionarPessoaFisica(contatos);
                    break;

                // Se opção 3 -> exibe a tela de adicionar
                case 3:
                    adicionarPessoaJuridica(contatos);
                    break;

                // Se opção 4 -> exibe a tela de remover
                case 4:
                    //view.exibirRemover();
                    break;

                // Se opção 5 -> termina o programa
                case 5:
                    saida = true;
                    break;

                // Senão erro
                default:
                    view.exibirMensagemDeErro("Opção inválida");
            }

        } while (!saida);
    }

    private void consultarContatos() {
        try {
            List<Contato> contatos = dao.getContatos();
            view.exibirListarContatos(contatos);
        }
        catch (SecurityException ex) {
            view.exibirMensagemDeErro("Impossível acessar arquivo: " + ex);
        }
        catch (IOException ex) {
            view.exibirMensagemDeErro("Erro ao abrir o arquivo: " + ex);
        } catch (Exception ex) {
            view.exibirMensagemDeErro("Erro ao acessar os dados: " + ex);
        } finally {
            // Sempre chamado - em caso de sucesso ou falha
        }
    }

    private void adicionarPessoaFisica(List<Contato> contatos) {
        try {
            // Cenário feliz
            Contato contatoPF = view.exibirAdicionarPessoaFisica();
            contatos.add(contatoPF);
            dao.inserir(contatoPF);
        }
        catch (Exception ex) {
            view.exibirMensagemDeErro("Erro ao abrir o arquivo: " + ex.toString());
        }
    }

    private void adicionarPessoaJuridica(List<Contato> contatos) {
        try {
            // Cenário feliz
            Contato contatoPJ = view.exibirAdicionarPessoaJuridica();
            contatos.add(contatoPJ);
            dao.inserir(contatoPJ);
        }
        catch (Exception ex) {
            view.exibirMensagemDeErro("Erro ao abrir o arquivo: " + ex.toString());
        }
    }

}
