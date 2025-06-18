package ed04.entidade;

public class PessoaJuridica extends ContatoBase {
    private String cnpj;

    public PessoaJuridica(int id, String nome, String email, String telefone, String cnpj) {
        super(id, nome, email, telefone);
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String email, String telefone, String cnpj) {
        super(nome, email, telefone);
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica() {
        this.cnpj = "";
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
