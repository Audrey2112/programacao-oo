package FolhaDePagamento;

/* - Classe concreta FuncionarioCLT
- Herda de Funcionario:
- Este tipo de funcionário recebe um adicional fixo de R$ 300,00.
- O metodo calcularSalario() deve retornar salarioBase + 300
*/

// - Criando a subclasse funcionarioCLT
public class FuncionarioCLT extends Funcionario {


    // - Construtor da subclasse
// - Observação: Construtores não são herdados
// - Devem chamar o construtor da classe pai (primeira operacao)
    public FuncionarioCLT(String nome, double salarioBase){
        super(nome, salarioBase); // Chamada para o construtor default da classe pai
    }


    // - Sobrescrita de métodos - @Override
    @Override
    public double calcularSalario(){
        return salarioBase + 300; // - Vai retornar o salario base dele + o valor de R$300,00
    }
}