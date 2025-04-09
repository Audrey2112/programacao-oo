// CLASSE
// - Nome das classes começam com maiúsculo
public class ContaBancaria {

    // ATRIBUTOS
    // - Atributos são sempre privados
    // - Nome de variáveis sempre começam com minúsculo

    private String nomeTitular;
    private String numero;
    private double saldo;
    private double limiteSaqueDiario;
    private double valorSaqueDiario;

    // CONSTRUTORES
    // - Usado para instanciar os objetos
    // - Mesmo nome da classe
    // - Sem retorno

    // Construtor default
    // - Criado implicitamente se nenhum outro for declarado
    // public ContaBancaria() {}

    // Construtor com inicialização
    public ContaBancaria(String nomeTitular, String numero) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.saldo = 0.0;
        this.limiteSaqueDiario = 1000.0;
        this.valorSaqueDiario = 0.0;
    }

    // MÉTODOS
    // - Definem as ações que os objetos realizam

    /**
     * Adiciona o valor ao saldo.
     * Só pode ser usado se o valor for positivo.
     */
     public boolean depositar(double valor) {
         if (valor > 0) {
             this.saldo += valor;
             return true;
         }

         return false;
     }

    /**
     * Subtrai o valor do saldo. Só pode ser feito se:
     *   - Valor for positivo
     *   - Valor não ultrapassar o limite diário
     *   - Saldo suficiente
     */
    public boolean sacar(double valor) {
        if (valor > 0
                && (valor + valorSaqueDiario) <= limiteSaqueDiario
                && valor <= saldo) {
            saldo -= valor;
            valorSaqueDiario += valor;
            return true;
        }
        return false;
    }

    /**
     * Exibe o saldo atual.
     */
    public void consultarSaldo() {
        System.out.printf("Conta.......: %s\n", numero);
        System.out.printf("Titular.....: %s\n", nomeTitular);
        System.out.printf("Saldo.......: %.2f\n", saldo);
        System.out.printf("Limite......: %.2f\n\n", limiteSaqueDiario - valorSaqueDiario);
    }

    /**
     * Zera o valor sacado no dia (simulando virada de dia).
     */
    public void resetarLimiteDiario() {
        valorSaqueDiario = 0.0;
    }

}
