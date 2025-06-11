/* Classe ContatoView:
     - responsável pela entrada e exibição de dados no console.
*/

import java.util.List;
import java.util.Scanner;

// - Criando a classe ContatoView
public class ContatoView {

    // - Metodo
    public void exibirMenu() {
        System.out.println("=== Agenda ===");
        System.out.println("1. Listar contatos");
        System.out.println("2. Adicionar contato PF");
        System.out.println("3. Adicionar contato PJ");
        System.out.println("4. Remover contato");
        System.out.println("5. Sair");
        System.out.println();
    }

    public int lerOpcao() {
        Scanner teclado = new Scanner(System.in);

        System.out.print(">: ");
        return teclado.nextInt();
    }

    public Contato exibirAdicionarPessoaFisica() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Novo Contato ===");
        System.out.print("Nome........: ");
        String nome = teclado.nextLine();

        System.out.print("Email.......: ");
        String email = teclado.nextLine();

        System.out.print("Telefone....: ");
        String telefone = teclado.nextLine();

        System.out.print("CPF.........: ");
        String cpf = teclado.nextLine();

        return new PessoaFisica(nome, email, telefone, cpf);
    }

    public Contato exibirAdicionarPessoaJuridica() {
        Scanner teclado = new Scanner(System.in);
        PessoaJuridica contato = new PessoaJuridica();

        System.out.println("=== Novo Contato ===");
        System.out.print("Nome........: ");
        contato.setNome(teclado.nextLine());

        System.out.print("Email.......: ");
        contato.setEmail(teclado.nextLine());

        System.out.print("Telefone....: ");
        contato.setTelefone(teclado.nextLine());

        System.out.print("CNPJ........: ");
        contato.setCnpj(teclado.nextLine());

        return contato;
    }

    public void exibirListarContatos(final List<Contato> contatos) {
        System.out.println("=== Contatos ===");

        for (Contato contato : contatos) {
            System.out.printf("| %10s | %10s | %10s |\n", contato.getNome(),
                    contato.getEmail(),
                    contato.getTelefone());
        }
        System.out.println();
    }

    public String exibirRemoverContato() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== Remover Contato ===");
        System.out.print("Digite o CPF ou CNPJ do contato a ser removido: ");
        return teclado.nextLine();
    }
}
