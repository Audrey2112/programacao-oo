//Código feito/realizado em Java Online

/*
Exercício 1 - Construtor com parâmetros
    - Criar a classe Pessoa com os atributos nome e idade;
    - O construtor deve receber esses dois dados;
    - Implemente o método exibir() para imprimir os dados da pessoa.
*/


// - Criando a Classe Pessoa
// - Nome de classes começam com maiúsculo
    public class Pessoa {
        
        
// - Atributos
// - São sempre privados;
// - Nome de variáveis sempre começam com minúsculo
        private String nome;
        private int idade;
    
    
// - Construtor
// - Usado para instanciar os objetos
// - Mesmo nome da classe
// - Sem retorno
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
 
// - Método 
// - Define as ações que os objetos realizam
    public void exibir() {
        System.out.printf("Nome da Pessoa: %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
    }
}
