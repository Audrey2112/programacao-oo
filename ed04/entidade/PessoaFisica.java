package ed04.entidade;

public class PessoaFisica extends ContatoBase {
    private String cpf;

    public PessoaFisica(int id, String nome, String email, String telefone, String cpf) {
        super(id, nome, email, telefone);
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String email, String telefone, String cpf) {
        super(nome, email, telefone);
        this.cpf = cpf;
    }

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
