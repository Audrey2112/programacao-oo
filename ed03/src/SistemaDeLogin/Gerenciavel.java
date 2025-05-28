package SistemaDeLogin;

/*
 - Etapa 2: Criar uma interface Gerenciavel com os métodos:
        - void alterarSenha(String novaSenha);
        - void bloquearUsuario();
*/

// - Criando a interface Gerenciavel
public interface Gerenciavel {
    void alterarSenha(String novaSenha); // - Metodo a ser usado para alterar a senha
    void bloquearUsuario(); // - Metodo para simular um "bloqueio do usuário"
}

// Obs: as interfaces estão em arquivos separados para melhor organização do código e visualização
