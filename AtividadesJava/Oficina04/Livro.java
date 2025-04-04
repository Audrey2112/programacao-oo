/*
Exercício 2  - Construtor padrão e com sobrecarga
    - Implemente a classe Livro com os atributos titulo, autor e anoPublicacao; 
    - Crie dois construtores: um padrão que define valores genéricos e outro 
    que recebe todos os atributos.
*/
 
// Criando a classe Livro
    public class Livro {
        
        
// - Atributos da classe livro 
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    
// - Criando o Construtor padrão com valores genéricos
// - Inicializa com valor padrão
// - Este construtor é chamado quando o objeto Livro é criado sem parâmetros
    public Livro (){
        this.titulo = "Titulo não definido";
        this.autor = "autor desconhecido";
        this.anoPublicacao = 0;
    }

// - Criando o construtor normal, com parâmetros
// - Inicializa com valores específicos
    public Livro (String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

// - Criando o Método
    public void exibir(){
        System.out.printf("titulo do Livro: %s\n", titulo);
        System.out.printf("Nome do autor: %s\n", autor);
        System.out.printf("Ano de Publicação: %d\n", anoPublicacao);
    }
}
