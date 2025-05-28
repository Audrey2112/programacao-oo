package GraficaOnline;
/*
Etapa 4 p1 - Adicionar implementação da interface:
    - Classe GraficoEstatistico com os atributos:
        - titulo (String)
        - tipoGrafico (String) — Ex: "pizza", "barra"
        - imprimir() deve exibir o tipo de gráfico seguido do título em caixa alta.
*/

// - Criando a classe GraficoEstatistico
public class GraficoEstatistico implements Imprimivel {


    // - Atributos da classe
    private String titulo;
    private String tipoGrafico;


    // - Construtor da classe - vai inicializar o título e tipo
    public GraficoEstatistico(String titulo, String tipoGrafico) {
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    // - Implementação do metodo imprimir
    @Override
    public void imprimir() {
        System.out.println("Gráfico do tipo: " + tipoGrafico.toUpperCase()); // - Exibe o tipo de gráfico em maiúsculas
        System.out.println("Título: " + titulo.toUpperCase()); // - Exibe o título em letras maiúsculas
        System.out.println();
    }
}