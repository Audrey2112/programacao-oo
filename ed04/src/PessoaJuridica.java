/* Classes concreta
     - PessoaJuridica: possui o atributo cnpj.
*/

// - Criando a classe PessoaJuridica
public class PessoaJuridica extends ContatoBase {

    // - Atributo da classe
    private String cnpj;

    // - Construtor da classe
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

    // - Getter e Setter
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}