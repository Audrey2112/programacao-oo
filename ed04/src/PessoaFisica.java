/* Classes concreta
    - PessoaFisica: possui o atributo cpf.
*/

// - Criando a classe PessoaFisica
public class PessoaFisica extends ContatoBase {

    // - Atributo da classe
    private String cpf;

    // - Construtor da classe
    public PessoaFisica(String nome, String email, String telefone, String cpf) {
        super(nome, email, telefone);
        this.cpf = cpf;
    }

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    // - Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}