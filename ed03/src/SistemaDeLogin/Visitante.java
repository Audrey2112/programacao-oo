package SistemaDeLogin;

/*
 - Etapa 7: Classe Visitante
    - Herda de Usuario.
    - Não implementa nenhuma interface.
    - Sobrescreve o método exibirLogin() para imprimir a mensagem:
        - "Visitante - acesso restrito ao sistema."
*/

// - Criando a subclasse Visitante - Pois herda de Usuario
public class Visitante extends Usuario {


    // - Construtor da subclasse
    public Visitante(String login, String senha) {
        super(login, senha);
    }

// - Sobrescrita de Método (@Override)
// - Sobrescreve o metodo exibirLogin com uma mensagem específica - Fornece uma nova implementação
    @Override
    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}
