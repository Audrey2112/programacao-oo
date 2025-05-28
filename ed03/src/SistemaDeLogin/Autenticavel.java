package SistemaDeLogin;

/* - Sistema de Login
 - Desenvolver um modelo que represente usuários de um sistema computacional,
 - distinguindo aqueles que podem autenticar-se de acordo com regras específicas,
 - e outros que possuem acessos limitados ou funcionalidades administrativas.

 - Etapa 1: Criar a interface Autenticavel com o metodo:
        - autenticar(String senha);
            - Este metodo verifica se a senha fornecida é válida segundo alguma regra.

*/

// - Criando a interface Autenticavel
public interface Autenticavel { // - Garante que várias classes diferentes tenham métodos com o mesmo nome e propósito.
    boolean autenticar(String senha); // - Metodo que verifica se a senha fornecida é válida
}
