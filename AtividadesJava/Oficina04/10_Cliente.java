// - Continuação do código anterior (Endereco.java)

// - Criando a classe Cliente 
public class Cliente {

  
// - Criando os atributos da classe Cliente
    private String nome;
    private Endereco endereco; // Indica que Cliente tem um Endereco
 

// - Criando o Construtor para Cliente, que recebe um objeto (Endereco)
    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

  
  // Método para exibir todas as informações (Endereco e Cliente)
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco.rua);
        System.out.println("Cidade: " + endereco.cidade);
    }
}
