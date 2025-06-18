package ed04.entidade;

public class ContatoBase implements Contato {
    private int id;
    private String nome;
    private String email;
    private String telefone;

    public ContatoBase(int id, String nome, String email, String telefone) {
        this(nome, email, telefone);
        this.id = id;
    }

    public ContatoBase(String nome, String email, String telefone) {
        this.id = 0;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public ContatoBase() {
        this("", "", "");
    }

    @Override
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
