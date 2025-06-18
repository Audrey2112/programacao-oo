package ed04.view;

import ed04.entidade.Contato;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ContatoSwingView {

    private final JFrame frame;

    public ContatoSwingView() {
        frame = new JFrame("Gerenciador de Contatos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
    }

    public int exibirMenu() {
        String[] options = {"Listar Contatos", "Adicionar Pessoa Física", "Adicionar Pessoa Jurídica", "Remover Contato", "Sair"};
        return JOptionPane.showOptionDialog(
                frame,
                "Escolha uma opção:",
                "Menu Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );
    }

    public void exibirMensagemDeErro(String mensagem) {
        JOptionPane.showMessageDialog(frame, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public void exibirListarContatos(List<Contato> contatos) {
        StringBuilder sb = new StringBuilder();
        for (Contato contato : contatos) {
            sb.append(contato).append("\n");
        }
        JOptionPane.showMessageDialog(frame, sb.toString(), "Lista de Contatos", JOptionPane.INFORMATION_MESSAGE);
    }

    public Contato exibirAdicionarPessoaFisica() {
        String nome = JOptionPane.showInputDialog(frame, "Nome:");
        String email = JOptionPane.showInputDialog(frame, "Email:");
        String telefone = JOptionPane.showInputDialog(frame, "Telefone:");
        String cpf = JOptionPane.showInputDialog(frame, "CPF:");
        return new aula13.entidade.PessoaFisica(0, nome, email, telefone, cpf);
    }

    public Contato exibirAdicionarPessoaJuridica() {
        String nome = JOptionPane.showInputDialog(frame, "Nome:");
        String email = JOptionPane.showInputDialog(frame, "Email:");
        String telefone = JOptionPane.showInputDialog(frame, "Telefone:");
        String cnpj = JOptionPane.showInputDialog(frame, "CNPJ:");
        return new aula13.entidade.PessoaJuridica(0, nome, email, telefone, cnpj);
    }
}
