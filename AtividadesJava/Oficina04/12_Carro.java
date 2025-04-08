/*
 Exercício 6
    - Construtor com uso de this para diferenciar variáveis
    - Crie a classe Carro com atributos modelo e ano. 
    - O construtor deve utilizar this para diferenciar parâmetros dos atributos da instância. 
    - Implemente o método exibir().
*/

// - Criandoa classe Carro
    public class Carro {
    

// - Criando os atributos da classe Carro
	private String modelo;
	private int ano;
 
 
// - Criando o construtor com o uso de this ()
    public Carro (String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;

    }

      
// - Criando o Método
    public void exibir() {
        System.out.printf("Modelo do carro: %s\n", modelo);
        System.out.printf("Ano do modelo: %d\n", ano);
    }
}
