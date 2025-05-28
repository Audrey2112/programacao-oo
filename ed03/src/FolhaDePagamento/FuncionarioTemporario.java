package FolhaDePagamento;

/* - Classe concreta FuncionarioTemporario
- Este tipo de funcionário tem um desconto fixo de R$ 100,00.
- O metodo calcularSalario() deve retornar salarioBase - 100.
*/

// -Criando a subclasse FuncionarioTemporario
public class FuncionarioTemporario extends Funcionario {


    // - Construtor da subclasse
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase); // Chamada para o construtor default da classe pai (super)
    }


    // - Sobrescrita de métodos - @Override
    @Override
    public double calcularSalario() {
        return salarioBase - 100; // Vai retornar como valor o salario base dele - R$100,00
    }
}