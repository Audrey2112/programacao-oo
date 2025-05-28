package FolhaDePagamento;

/*
- Folha de pagamento
- Modelar um sistema de folha de pagamento simplificado.
- O ponto central é a existência de diferentes tipos de funcionários,
- cada um com sua própria forma de cálculo de salário final.
- Para isso, será criada uma classe abstrata que define uma estrutura comum, e classes
- concretas que especializam o comportamento do cálculo salarial por meio da sobrescrita de metodo.
*/

// - Criando a classe Funcionario (superclasse)
public abstract class Funcionario {  // - serve apenas como uma base para as subclasses (por isso é declarada como abstrata)


    // - Atributos da classe - protected (protegido)
    protected String nome;
    protected double salarioBase;


    // - Construtor da classe- inicializa valores
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }


    // - Criando os métodos da Classe Funcionario
    public void exibirDados(){
        System.out.println("Nome: " + nome); // - Vai exibir o nome do cliente
        System.out.println("Salário Base: " + salarioBase); // - vai exibir seu salario base
    }

    public abstract double calcularSalario(); // - Metodo abstrato da classe, que será usado pelas subclasses
}

