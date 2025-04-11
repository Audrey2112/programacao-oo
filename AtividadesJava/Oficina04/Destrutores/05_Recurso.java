/*
Exercício 3 - Objeto fora de escopo
    - Crie uma classe Recurso com um método finalize() que imprime "Recurso coletado". 
    - No main(), crie o objeto dentro de um bloco {} e depois fora do bloco, chame System.gc().
*/

// - Criando a classe Recurso
public class Recurso {
    

// - Não terá atributos para a classe Recurso


// - Construtor da classe
    public Recurso() {
        System.out.println("Recurso criado!");
    }


// - Criando o Método finalize()
    protected void finalize() throws Throwable {
        try {
            System.out.println("Recurso coletado");
        } finally {
            super.finalize();
        }
  }
}
