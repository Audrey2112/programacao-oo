/*
Exercício 2 - Criar muitos objetos para forçar o GC
    - Crie uma classe Item que imprime uma mensagem em seu finalize(). 
    - No main(), crie vários objetos Item em um loop sem guardar suas referências. 
    - Observe a execução do GC.
*/


// - Criando a classe Item
public class Item {
  
    
// - Atributos da classe Item
    private int numero;
    

// - Construtor da classe Item   
public Item(int numero) {
    this.numero = numero;
}


// - Criando o método finalize()
 protected void finalize() throws Throwable {
   try {
            System.out.println("Item coletado pelo GC: " + numero);
        } finally {
            super.finalize();
        }
}
}
