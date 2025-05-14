/* - ContaCorrente
    - aplica 0.1% de juros ao dia
    - imprimirExtrato() para incluir o tipo da conta.
    - aplicarJurosDiarios() com o percentual adequado.
*/


// - Criando a subclasse ContaCorrente
public class ContaCorrente extends Conta {


// - Construtor da subclasse
// - Observação: Construtores não são herdados
// - Devem chamar o construtor da classe pai (primeira operacao)
    public ContaCorrente (String cliente, double saldo) {
        super(cliente, saldo); // Chamada para o construtor default da classe pai
    }


// - Sobrescrita de métodos - @Override
    @Override
    public void aplicarJurosDiarios(){
        saldo += saldo * 0.001; // 0,1% ao dia é igual a: 0,1 / 100 = 0.001.
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Corrente: ");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("-----------------------------------------");
    }
}