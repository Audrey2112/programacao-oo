package SistemaDeLogin;

/*
 - Etapa 6: Classe Administrador:
        - Herda de Usuario.
        - Implementa as interfaces Autenticavel, Gerenciavel e Logavel.
        - A autenticação é considerada bem-sucedida se a senha fornecida for igual à armazenada.
        - O método alterarSenha() altera a senha armazenada.
        - O método bloquearUsuario() exibe a mensagem "Usuário bloqueado com sucesso."
        - O método registrarLog() imprime a operação registrada com a seguinte estrutura:
            - "Log registrado: <operacao>"
*/

// - Criando a subclasse Administrador
public class Administrador extends Usuario implements Autenticavel, Gerenciavel, Logavel { // - Indica que herda elementos de usuário e utiliza as interfaces apontadas


    // - Construtor da subclasse
    public Administrador(String login, String senha) {
        super(login, senha); // Chamada para o construtor default da classe pai - "super"
    }


    // - Métodos da subclasse:
// - Autenticar - Vai comparar se a senha digitada é igual a senha armazenada
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    // - alterarSenha - Altera a senha armazenada
    @Override
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }

    // - bloquearUsuario - Simula o bloqueio de um usuário
    @Override
    public void bloquearUsuario() {
        System.out.println("Usuário bloqueado com sucesso.");
    }

    // - registrarLog - Registra um log de operação
    @Override
    public void registrarLog(String operacao) {
        System.out.println("Log registrado: " + operacao);
    }
}
