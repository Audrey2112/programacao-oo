/* ContaSalario
    - não aplica juros ao dia.
    - imprimirExtrato() para incluir o tipo da conta.
    - aplicarJurosDiarios() com o percentual adequado.
 */


// - Criando a subclasse ContaSalario
public class ContaSalario extends Conta {


// - Construtor da subclasse usando o super()
    public ContaSalario (String cliente, double saldo) {
        super (cliente, saldo);
    }


// - Sobrescrita de métodos - @Override
    @Override
    public void aplicarJurosDiarios(){
        // - não se aplica juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Salário: ");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("-----------------------------------------");
    }
}