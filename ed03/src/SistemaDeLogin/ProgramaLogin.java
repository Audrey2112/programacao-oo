package SistemaDeLogin;

/*
 - Etapa 9: Criar a classe ProgramaLogin com metodo main:
     - Um Administrador com login "admin" e senha "admin123".
     - Um Visitante com login "guest" e senha "qualquer".
     - Um Cliente com login "joao" e senha "segredo123".

 - Etapa 10: Para cada objeto:
     - Chame o metodo exibirLogin().
     - Para os que implementam Autenticavel, execute o metodo autenticar() com uma senha correta e uma senha incorreta.
     - Nos casos aplicáveis, utilize também os métodos de Gerenciavel e Logavel.
*/


// - Criando a classe ProgramaLogin - Metodo Main
public class ProgramaLogin {
    public static void main(String[] args) {


// - Criando um novo administrador
        Administrador admin = new Administrador("admin", "admin123");
        admin.exibirLogin(); // - Vai exibir o login
        System.out.println("Autenticação com 'admin123': " + admin.autenticar("admin123"));
        System.out.println("Autenticação com 'errada': " + admin.autenticar("errada"));
        admin.alterarSenha("novaSenha123"); // - Altera a senha
        admin.bloquearUsuario(); // - Simula um bloqueio
        admin.registrarLog("Exclusão de conta"); // - Registra o log

        System.out.println(); // - Linha para separar


// - Criando um novo visitante
        Visitante visitante = new Visitante("guest", "qualquer");
        visitante.exibirLogin(); // - Exibe mensagem de visitante

        System.out.println(); // - Linha para separar novamente

// - Criando um novo cliente
        Cliente cliente = new Cliente("joao", "segredo123");
        cliente.exibirLogin(); // - Exibe login do cliente
        System.out.println("Autenticação com 'segredo123': " + cliente.autenticar("segredo123"));
        System.out.println("Autenticação com '12345': " + cliente.autenticar("12345")); // senha inválida
    }
}
