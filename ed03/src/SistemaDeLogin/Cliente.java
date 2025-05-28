package SistemaDeLogin;

/*
 - Etapa 8: Classe Cliente
    - Herda de Usuario.
    - Implementa apenas a interface Autenticavel.
    - A autenticação considera válida a senha armazenada apenas se a senha tiver mais de 6 caracteres e corresponder exatamente à senha atual.
    - Herda o metodo exibirLogin() diretamente da classe Usuario
*/

// - Criando a subclasse Cliente
public class Cliente extends Usuario implements Autenticavel { // - Implementa apenas a interface Autenticavel


    // - Construtor da subclasse
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    // - Metodo da subclasse
// - Autenticação só é bem-sucedida se a senha for igual e tiver mais de 6 caracteres
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha) && senha.length() > 6;
    }
// - Herda o metodo exibirLogin da classe Usuario
}

