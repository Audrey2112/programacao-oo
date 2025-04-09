/*
Exercício 4 - Construtor com validação de dados
    - Crie a classe Conta com os atributos numero e saldoInicial. 
    - No construtor, valide que o saldo inicial não seja negativo. 
    - Caso seja, atribua zero. Implemente o método exibir().
*/

// - Criando a classe Conta
    public class Conta {
    
    
// - Atributos da classe Conta
    private String numero;
    private double saldoInicial;


// - Criando o Construtor, validando para que o saldo não seja negativo
    public Conta (String numero, double saldoInicial){
        this.numero = numero;
        if(saldoInicial >= 0) {
            this.saldoInicial = saldoInicial;
        }else {
            this.saldoInicial = 0;
        }
    }
// - Criando o Método para exibir as informações da conta
        public void exibir () {
        System.out.printf("Numero: %s\n", numero);
        System.out.printf("Saldo Inicial: %.2f\n", saldoInicial);
    }
}
