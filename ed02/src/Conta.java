/*
- Sistema Bancário
- Implementar um sistema bancário com uma classe base chamada Conta e três subclasses:
    1 - ContaCorrente;
    2 - ContaPoupanca;
    3 - ContaSalario.
- O sistema deve permitir as operações básicas de depósito, saque, transferência,
- aplicação de juros diários e impressão de extrato.
- As regras de aplicação de juros devem variar conforme o tipo de conta.
*/


// - Criando a classe Conta (Superclasse)
public abstract class Conta { // - serve apenas como uma base para as subclasses (por isso é declarada como abstrata)


// - Atributos da classe - protected (protegido)
    protected String cliente;   // atributos/métodos são privados para mundo externo
    protected double saldo;     // mas visíveis na estrutura hierárquica de herança


// - Construtor da classe
    public Conta (String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }


// - Criando os Métodos da classe Conta

    public void depositar(double valor){
        saldo += valor; // - adiciona o valor depositado ao saldo do cliente
    }

    public void sacar(double valor){
        if (saldo >= valor) {   // - verifica se tem saldo suficiente
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!!!!"); // - Emite essa mensagem caso não haja saldo suficiente
        }
    }

    public void transferir(Conta destino, double valor) {
        if (saldo >= valor){ // - verifica se tem saldo suficiente para realizar tranferencia
            this.saldo -= valor;
            destino.depositar(valor); // - onde o valor será depositado
        } else {
            System.out.println("Falha na Tranferência!"); // - Emite essa mensagem caso não haja saldo suficiente
        }
    }

    public double getSaldo() {
        return saldo;   // - vai retornar o saldo atual da conta
    }


// - Métodos abstratos que serão usados pelas subclasses
    public abstract void imprimirExtrato();

    public abstract void aplicarJurosDiarios();
}