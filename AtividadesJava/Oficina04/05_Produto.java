/*
Exercício 3 - Encadeamento de construtores (this())
     - Crie a classe Produto com sobrecarga de construtores.
     - O construtor com apenas o nome deve assumir valores padrão para preço e quantidade
    chamando outro construtor com this().
*/
 
// - Criando a classe Produto
    public class Produto {
        

// - Atributos da classe Produto
    private String nome;
    private double preco;
    private int quantidade;
    
    
// - Criando o Construtor com apenas o nome e, após ele, recebe valores padrão
    public Produto (String nome){
        this(nome, 0.0,0);
    }

// - Criando o construtor normal que recebe todos os parâmetros
    public Produto (String nome, double preco, int quantidade){
        this.nome = nome;
        
// - Verificar se valor é valido - se for colocado um numero negativo, será atribuido o valor 0        
        if (preco >= 0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }

// - Verificar se quantidade é valida - se for colocado um numero negativo, será atribuido o valor 0
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;  
        }
    }

// - Criando o Método
    public void exibir(){
        System.out.printf("Nome do produto: %s\n", nome);
        System.out.printf("Valor do produto: %.2f\n", preco);
        System.out.printf("Quantidade: %d\n", quantidade);
    }
}
