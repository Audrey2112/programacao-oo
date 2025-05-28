package GraficaOnline;

/*
Etapa 4 p2 - Adicionar implementação da interface:
    - Classe RelatorioPDF com os atributos:
        - autor (String)
        - numeroPaginas (int)
        - imprimir() deve exibir o nome do autor e o número total de páginas.
*/

// - Criando a classe RelatorioPDF
public class RelatorioPDF implements Imprimivel {


    // - Atributos da classe
    private String autor;
    private int numeroPaginas;


    // - Construtor usado pra inicializar os valores
    public RelatorioPDF(String autor, int numeroPaginas) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // - Implementação do método imprimir
    @Override
    public void imprimir() {
        System.out.println("Autor: " + autor); // - Vai exibir o nome do autor
        System.out.println("Total de páginas: " + numeroPaginas); // - Vai exibir o total de páginas
        System.out.println();
    }
}