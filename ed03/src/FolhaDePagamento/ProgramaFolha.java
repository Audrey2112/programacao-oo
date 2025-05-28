package FolhaDePagamento;

/* - ProgramaFolha com metodo main:
- Criar uma Instância de FuncionarioCLT com nome "Carlos" e salário base R$ 2000,00.
- Criar uma Instância de FuncionarioTemporario com nome "Ana" e salário base R$ 2000,00.
- Para cada instância:
    - Chamar o metodo exibirDados().
    - Exibir o salário calculado com base na chamada de calcularSalario().
*/

public class ProgramaFolha { // - Sendo utilizado aqui como o Main (classe principal que executa o programa)
    public static void main(String[] args) {
        Funcionario funcionario1 = new FuncionarioCLT("Carlos", 2000.0); // - Cria um funcionário (Carlos) CLT com nome e salário base
        Funcionario funcionario2 = new FuncionarioTemporario("Ana", 2000.0); // - Cria uma funcionária Temporária com nome (Ana) e salário base

        funcionario1.exibirDados();
        System.out.println("Salário Final: " + funcionario1.calcularSalario());  // - Vai Exibir os dados e o salário final do funcionário CLT

        System.out.println(); // - Essa linha aqui foi colocada apenas para separar as informaçõesLinha
        funcionario2.exibirDados();
        System.out.println("Salário Final: " + funcionario2.calcularSalario());
    }
}
