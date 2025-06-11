/* Classe abstrata ContatoBase:
   - Contém atributos comuns como nome, telefone e email.
*/

// - Criando a classe abstrata ContatoBase
public class ContatoBase implements Contato{

    // - Atributos da classe
    private String nome;
    private String email;
    private String telefone;

    // - Construtor da classe
    public ContatoBase(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    // - Passagem de strings vazias com valores padrão, podendo se criar um objeto sem precisar passar argumentos imediatamente
    public ContatoBase() {
        this("", "", "");
    }

    // - Getter s Setter da classe (usados para controlar o acesso a atributos privados)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toCSV() {
        return nome + "," + telefone + "," + email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
