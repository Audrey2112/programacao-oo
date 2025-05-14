/* ContaPoupanca
    - aplica 0.08% de juros ao dia.
    - imprimirExtrato() para incluir o tipo da conta.
    - aplicarJurosDiarios() com o percentual adequado.
 */


// - Criando a subclasse ContaPoupanca
public class ContaPoupanca extends Conta {


// - Construtor da subclasse usando o super()
    public ContaPoupanca (String cliente, double saldo) {
        super (cliente, saldo);
    }


// - Sobrescrita de métodos - @Override
    @Override
    public void aplicarJurosDiarios(){
        saldo += saldo * 0.0008; // 0,08% ao dia é igual a: 0,08 / 100 = 0.0008.
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Poupança: ");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("-----------------------------------------");
    }
}