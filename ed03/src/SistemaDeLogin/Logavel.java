package SistemaDeLogin;

/*
 - Etapa 3: Criar uma interface Logavel com o metodo:
        - registrarLog(String operacao);
            - Este metodo simula a gravação de um log de auditoria
*/

// - Criando a interface Logavel
public interface Logavel {
    void registrarLog(String operacao); // - Metodo para registrar logs de operações
}

