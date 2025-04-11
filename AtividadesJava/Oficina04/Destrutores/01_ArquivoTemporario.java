/*
Exercício 1 - Sobrescrita do método finalize()
    - Crie uma classe ArquivoTemporario que sobrescreva o método finalize() 
    - para simular a liberação de um arquivo temporário. 
    - Crie dois objetos e depois torne-os nulos. 
    - Solicite a coleta de lixo com System.gc().
*/


// - Criando a classe ArquivoTemporario
    public class ArquivoTemporario{
    
    
// - Atributos da classe
        private String nome;
  
    
// - Construtor da classe
    public ArquivoTemporario (String nome) {
        this.nome = nome;
    }
    
    
// - Primeiro Método da classe: usar()
    public void usar() {
        System.out.printf("Arquivo que está em uso: %s\n", nome);
    }
    
    
// - Outro método da classe: finalize()
    protected void finalize() throws Throwable { // A palavra-chave protected limita o acesso a finalize().
        try {
            System.out.printf("Arquivo que está sendo liberado: %s\n", nome);
        } finally {
            super.finalize();
        }
    }
}

/*
A classe pode realizar a finalização simplesmente definindo e implementando um método nela chamado finalize(). 
O método finalize() deve ser declarado da seguinte forma:
    protected void finalize () throws throwable


O que se reume em:
protected void finalize() throws Throwable {   
    // limpe o código para esta classe aqui
    super.finalize();
}
*/
