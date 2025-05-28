package SistemaDeLogin;

/*
 - Etapa 4: Criar uma classe abstrata Usuario com os atributos:
    - login (String)
    - senha (String)

 - Etapa 5 : A classe Usuario deve fornecer o método concreto:
    - void exibirLogin() que imprime o valor de login.
*/

// - Criando a classe abstrata Usuario (superclasse - base)
public abstract class Usuario {


    // - Atributos da classe
    protected String login; // - Atributo protegidos (protected) para permitir serem acessado nas subclasses
    protected String senha;


    // - Construtor da classe pai - Inicializa valores
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }


    // - Método da classe
    public void exibirLogin() {
        System.out.println("Login: " + login);
    }
}
