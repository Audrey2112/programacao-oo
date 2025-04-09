/*
Exercício 5 - Construtor com composição de objetos
  - Implemente a classe Endereco e a classe Cliente. 
  - O construtor de Cliente deve receber um objeto Endereco. 
  - Use composição e exiba as informações completas.
*/

// - Criando a classe Endereco
public class Endereco {

  
// - Criando os atributos da classe Endereco
    public String rua; // Tornando eles públicos para serem acessados diretamente pela classe criada depois (Cliente)
    public String cidade;

  
// - Criando o Construtor para a classe Endereco
    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }
}

/*
O código também poderia ser feito utilizando getters, ficando assim:

public class Endereco {
    private String rua; // - Não seriam declarados como públicos
    private String cidade;
    
public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }
    
// Métodos para acessar os dados do endereço (getters)
    public String getRua() {
        return rua;
    }
    public String getCidade() {
        return cidade;
    }
}
 */
