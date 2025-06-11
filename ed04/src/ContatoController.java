/* Classe ContatoController:
     - Orquestra a lógica da aplicação, manipulando a lista de contatos
        (armazenamento em memória)
*/

import java.util.ArrayList;
import java.util.List;

// - Criando a classe ContatoController
public class ContatoController {

    // - Metodo
    public void executar() { // - Cria uma lista de contatos
        List<Contato> contatos = new ArrayList<>();

// - Cria a view responsável pela tela
        ContatoView view = new ContatoView();

        boolean saida = false; // - Se saída for = falso, ele faz o seguinte:
        do {

            view.exibirMenu(); // - Exibe o menu de opções

            int opt = view.lerOpcao(); // - Usuário escolhe a opção

            switch (opt) { // - Opcao SE
                case 1:
                    view.exibirListarContatos(contatos); // - Se opção 1 -> exibe a tela de listar
                    break;

                case 2:
                    Contato contatoPF = view.exibirAdicionarPessoaFisica();  // - Se opção 2 -> exibe a tela de adicionar
                    contatos.add(contatoPF);
                    break;

                case 3:
                    Contato contatoPJ = view.exibirAdicionarPessoaJuridica(); // - Se opção 3 -> exibe a tela de adicionar
                    contatos.add(contatoPJ);
                    break;

                case 4: // - Se opção 4 -> exibe a tela de remover
                    String identificador = view.exibirRemoverContato(); // - Vai ler o CPF ou CNPJ que o usuário digitar
                    boolean removido = false;

                    for (Contato c : contatos) { // - Vai percorrer a lista de contatos

                        if (c instanceof PessoaFisica && ((PessoaFisica) c).getCpf().equals(identificador)) {  // - Se for Pessoa Física e CPF for igual ao informado
                            contatos.remove(c); // - Remove o contato
                            removido = true;
                            break; // - Encerra aqui (o loop no caso)
                        }

                        else if (c instanceof PessoaJuridica && ((PessoaJuridica) c).getCnpj().equals(identificador)) { // - Se for Pessoa Jurídica e CNPJ for igual ao informado
                            contatos.remove(c); // - Remove o contato
                            removido = true;
                            break; // - Encerra o loop aqui
                        }
                    }

                    if (removido) { // - Se for removido, exibe o resultado
                        System.out.println("Contato removido com sucesso!");
                    } else { // - Se não
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    saida = true; // Se opção 5 -> termina o programa
                    break;

                default: // Senão erro
                    //view.exibirMensagemErro();
            }

        } while (!saida);
    }
}